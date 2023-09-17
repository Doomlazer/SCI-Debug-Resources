;;; Sierra Script 1.0 - (do not remove this comment)
(script# 937)
(include sci.sh)
(use Main)
(use Class_255_0)
(use User)
(use Obj)


(class IconI of Obj
	(properties
		view -1
		loop -1
		cel -1
		nsLeft 0
		nsTop -1
		nsRight 0
		nsBottom 0
		state $0000
		cursor -1
		type $4000
		message -1
		modifiers $0000
		signal $0001
		helpStr 0
		maskView 0
		maskLoop 0
		maskCel 0
		highlightColor 0
		lowlightColor 0
	)
	
	(method (show theNsLeft theNsTop &tmp [temp0 7])
		(= signal (| signal $0020))
		(if argc
			(= nsRight
				(+ (= nsLeft theNsLeft) (CelWide view loop cel))
			)
			(= nsBottom
				(+ (= nsTop theNsTop) (CelHigh view loop cel))
			)
		else
			(= nsRight (+ nsLeft (CelWide view loop cel)))
			(= nsBottom (+ nsTop (CelHigh view loop cel)))
		)
		(DrawCel view loop cel nsLeft nsTop -1)
		(if (& signal $0004) (self mask:))
		(if
		(and gPseudoMouse (gPseudoMouse respondsTo: #stop))
			(gPseudoMouse stop:)
		)
	)
	
	(method (select param1 &tmp newEvent temp1)
		(return
			(cond 
				((& signal $0004) 0)
				((and argc param1 (& signal notUpd))
					(DrawCel view loop (= temp1 1) nsLeft nsTop -1)
					(Graph grUPDATE_BOX nsTop nsLeft nsBottom nsRight 1)
					(while (!= ((= newEvent (Event new:)) type?) 2)
						(newEvent localize:)
						(cond 
							((self onMe: newEvent)
								(if (not temp1)
									(DrawCel view loop (= temp1 1) nsLeft nsTop -1)
									(Graph grUPDATE_BOX nsTop nsLeft nsBottom nsRight 1)
								)
							)
							(temp1
								(DrawCel view loop (= temp1 0) nsLeft nsTop -1)
								(Graph grUPDATE_BOX nsTop nsLeft nsBottom nsRight 1)
							)
						)
						(newEvent dispose:)
					)
					(newEvent dispose:)
					(if (== temp1 1)
						(DrawCel view loop 0 nsLeft nsTop -1)
						(Graph grUPDATE_BOX nsTop nsLeft nsBottom nsRight 1)
					)
					temp1
				)
				(else 1)
			)
		)
	)
	
	(method (highlight param1 &tmp temp0 temp1 temp2 temp3 temp4)
		(if
		(or (not (& signal $0020)) (== highlightColor -1))
			(return)
		)
		(= temp4
			(if (and argc param1) highlightColor else lowlightColor)
		)
		(= temp0 (+ nsTop 2))
		(= temp1 (+ nsLeft 2))
		(= temp2 (- nsBottom 3))
		(= temp3 (- nsRight 4))
		(Graph grDRAW_LINE temp0 temp1 temp0 temp3 temp4 -1 -1)
		(Graph grDRAW_LINE temp0 temp3 temp2 temp3 temp4 -1 -1)
		(Graph grDRAW_LINE temp2 temp3 temp2 temp1 temp4 -1 -1)
		(Graph grDRAW_LINE temp2 temp1 temp0 temp1 temp4 -1 -1)
		(Graph
			grUPDATE_BOX
			(- nsTop 2)
			(- nsLeft 2)
			nsBottom
			(+ nsRight 3)
			1
		)
	)
	
	(method (onMe param1)
		(return
			(if
				(and
					(>= (param1 x?) nsLeft)
					(>= (param1 y?) nsTop)
					(<= (param1 x?) nsRight)
				)
				(<= (param1 y?) nsBottom)
			else
				0
			)
		)
	)
	
	(method (mask)
		(DrawCel
			maskView
			maskLoop
			maskCel
			(+
				nsLeft
				(/
					(-
						(CelWide view loop cel)
						(CelWide maskView maskLoop maskCel)
					)
					2
				)
			)
			(+
				nsTop
				(/
					(-
						(CelHigh view loop cel)
						(CelHigh maskView maskLoop maskCel)
					)
					2
				)
			)
			-1
		)
	)
)

(class IconBar of Set
	(properties
		elements 0
		size 0
		height 0
		underBits 0
		oldMouseX 0
		oldMouseY 0
		curIcon 0
		highlightedIcon 0
		prevIcon 0
		curInvIcon 0
		useIconItem 0
		helpIconItem 0
		port 0
		window 0
		state $0400
		activateHeight 0
		y 0
	)
	
	(method (doit &tmp newEvent)
		(while
		(and (= newEvent (Event new:)) (& state $0020))
			(Wait 1)
			(if (== (newEvent type?) 256)
				(newEvent
					type: 4
					message: (if (& (newEvent modifiers?) $0003) 27 else 13)
					modifiers: 0
				)
			)
			(newEvent localize:)
			(if
				(and
					(or
						(== (newEvent type?) 1)
						(and
							(== (newEvent type?) 4)
							(== (newEvent message?) 13)
						)
					)
					(IsObject helpIconItem)
					(& (helpIconItem signal?) $0010)
				)
				(newEvent type: 16384 message: (helpIconItem message?))
			)
			(MapKeyToDir newEvent)
			(if (self dispatchEvent: newEvent) (break))
		)
		(if (IsObject newEvent) (newEvent dispose:))
	)
	
	(method (handleEvent pEvent &tmp temp0 pEventType theGCursorNumber theCurIcon temp4 theCurInvIcon newEvent)
		(pEvent localize:)
		(cond 
			((& state $0004))
			(
				(or
					(and
						(not (= pEventType (pEvent type?)))
						(& state $0400)
						(<= -10 (pEvent y?))
						(<= (pEvent y?) height)
						(<= 0 (pEvent x?))
						(<= (pEvent x?) 320)
						(not (= temp0 0))
					)
					(and
						(== pEventType evKEYBOARD)
						(or
							(== (pEvent message?) KEY_ESCAPE)
							(== (pEvent message?) KEY_DELETE)
						)
						(= temp0 1)
					)
				)
				(pEvent globalize:)
				(= oldMouseX (pEvent x?))
				(= oldMouseY (pEvent y?))
				(= theGCursorNumber gCursorNumber)
				(= theCurIcon curIcon)
				(= theCurInvIcon curInvIcon)
				(self show:)
				(if temp0
					(gGame setCursor: gCursorNumber 1)
					(Intersections
						(+
							(curIcon nsLeft?)
							(/ (- (curIcon nsRight?) (curIcon nsLeft?)) 2)
						)
						(- (curIcon nsBottom?) 3)
					)
				)
				(self doit:)
				(= temp4
					(if
						(and
							(== theCurIcon curIcon)
							(== theCurInvIcon curInvIcon)
						)
						theGCursorNumber
					else
						(curIcon cursor?)
					)
				)
				(gGame setCursor: temp4 1)
				(if temp0
					(Intersections oldMouseX oldMouseY)
				else
					(Intersections
						((= newEvent (Event new:)) x?)
						(proc999_3 (newEvent y?) (+ 1 height))
					)
					(newEvent dispose:)
				)
				(self hide:)
			)
			((& pEventType evKEYBOARD)
				(switch (pEvent message?)
					(KEY_RETURN
						(if (IsObject curIcon)
							(pEvent
								type: (curIcon type?)
								message: (curIcon message?)
							)
						)
					)
					(KEY_NUMPAD0
						(self swapCurIcon:)
						(pEvent claimed: 1)
					)
					(JOY_NULL
						(if (& (pEvent type?) evJOYSTICK)
							(self advanceCurIcon:)
							(pEvent claimed: 1)
						)
					)
				)
			)
			((& pEventType evMOUSEBUTTON)
				(cond 
					((& (pEvent modifiers?) emSHIFT) (self advanceCurIcon:) (pEvent claimed: 1))
					((and (& (pEvent modifiers?) emCTRL) (User canControl:))
						(if (== (pEvent modifiers?) 12)
							((ScriptID 800) handleEvent: pEvent)
						else
							(self swapCurIcon:)
						)
						(pEvent claimed: 1)
					)
					((IsObject curIcon)
						(pEvent
							type: (curIcon type?)
							message: (curIcon message?)
						)
					)
				)
			)
		)
	)
	
	(method (show &tmp temp0 temp1 temp2 temp3 theY temp5 temp6 temp7)
		(gSounds pause:)
		(= state (| state $0020))
		(gGame setCursor: 8 1)
		(= height
			(CelHigh
				((= temp0 (self at: 0)) view?)
				(temp0 loop?)
				(temp0 cel?)
			)
		)
		(= port (GetPort))
		(SetPort -1)
		(= underBits (Graph grSAVE_BOX y 0 (+ y height) 320 1))
		(= temp1 (PicNotValid))
		(PicNotValid 1)
		(= temp3 0)
		(= theY y)
		(= temp5 (FirstNode elements))
		(while temp5
			(= temp6 (NextNode temp5))
			(if (not (IsObject (= temp7 (NodeValue temp5))))
				(return)
			)
			(if (<= (temp7 nsRight?) 0)
				(temp7 show: temp3 theY)
				(= temp3 (temp7 nsRight?))
			else
				(temp7 show:)
			)
			(= temp5 temp6)
		)
		(if curInvIcon
			(if (gEgo has: (gInv indexOf: curInvIcon))
				(= temp3
					(+
						(/
							(-
								(- (useIconItem nsRight?) (useIconItem nsLeft?))
								(CelWide
									(curInvIcon view?)
									(+ (curInvIcon loop?) 1)
									(curInvIcon cel?)
								)
							)
							2
						)
						(useIconItem nsLeft?)
					)
				)
				(= theY
					(+
						y
						(/
							(-
								(- (useIconItem nsBottom?) (useIconItem nsTop?))
								(CelHigh
									(curInvIcon view?)
									(+ (curInvIcon loop?) 1)
									(curInvIcon cel?)
								)
							)
							2
						)
						(useIconItem nsTop?)
					)
				)
				(DrawCel
					(curInvIcon view?)
					(+ (curInvIcon loop?) 1)
					(curInvIcon cel?)
					temp3
					theY
					-1
				)
				(if (& (useIconItem signal?) $0004)
					(useIconItem mask:)
				)
			else
				(= curInvIcon 0)
			)
		)
		(PicNotValid temp1)
		(Graph grUPDATE_BOX y 0 (+ y height) 320 1)
		(self highlight: curIcon)
		(gGame
			setCursor:
				gCursorNumber
				(+
					(curIcon nsLeft?)
					(/ (- (curIcon nsLeft?) (curIcon nsRight?)) 2)
				)
		)
	)
	
	(method (hide &tmp temp0 temp1 temp2)
		(if (& state $0020)
			(gSounds pause: 0)
			(= state (& state $ffdf))
			(= temp0 (FirstNode elements))
			(while temp0
				(= temp1 (NextNode temp0))
				(if (not (IsObject (= temp2 (NodeValue temp0))))
					(return)
				)
				((= temp2 (NodeValue temp0))
					signal: (& (temp2 signal?) $ffdf)
				)
				(= temp0 temp1)
			)
			(Graph grRESTORE_BOX underBits)
			(Graph grUPDATE_BOX y 0 (+ y height) 320 1)
			(Graph grREDRAW_BOX y 0 (+ y height) 320)
			(SetPort port)
			(= height activateHeight)
		)
	)
	
	(method (advance &tmp temp0 temp1)
		(= temp1 1)
		(while (<= temp1 size)
			(= temp0
				(self
					at: (mod (+ temp1 (self indexOf: highlightedIcon)) size)
				)
			)
			(if (not (IsObject temp0))
				(= temp0 (NodeValue (self first:)))
			)
			(breakif (not (& (temp0 signal?) $0004)))
			(= temp1 (mod (+ temp1 1) size))
		)
		(self highlight: temp0 (& state $0020))
	)
	
	(method (retreat &tmp temp0 temp1)
		(= temp1 1)
		(while (<= temp1 size)
			(= temp0
				(self
					at: (mod (- (self indexOf: highlightedIcon) temp1) size)
				)
			)
			(if (not (IsObject temp0))
				(= temp0 (NodeValue (self last:)))
			)
			(breakif (not (& (temp0 signal?) $0004)))
			(= temp1 (mod (+ temp1 1) size))
		)
		(self highlight: temp0 (& state $0020))
	)
	
	(method (select theCurIcon param2)
		(return
			(if (theCurIcon select: (if (>= argc 2) param2))
				(if (not (& (theCurIcon signal?) $0002))
					(= curIcon theCurIcon)
				)
				1
			else
				0
			)
		)
	)
	
	(method (highlight theHighlightedIcon param2 &tmp temp0)
		(if (not (& (theHighlightedIcon signal?) $0004))
			(if (IsObject highlightedIcon)
				(highlightedIcon highlight: 0)
			)
			((= highlightedIcon theHighlightedIcon) highlight: 1)
		)
		(if (and (>= argc 2) param2)
			(gGame setCursor: gCursorNumber 1)
			(Intersections
				(+
					(theHighlightedIcon nsLeft?)
					(/
						(-
							(theHighlightedIcon nsRight?)
							(theHighlightedIcon nsLeft?)
						)
						2
					)
				)
				(- (theHighlightedIcon nsBottom?) 3)
			)
		)
	)
	
	(method (swapCurIcon &tmp temp0)
		(cond 
			((& state $0004) (return))
			(
				(and
					(!= curIcon (= temp0 (NodeValue (self first:))))
					(not (& (temp0 signal?) $0004))
				)
				(= prevIcon curIcon)
				(= curIcon (NodeValue (self first:)))
			)
			(
			(and prevIcon (not (& (prevIcon signal?) $0004))) (= curIcon prevIcon))
		)
		(gGame setCursor: (curIcon cursor?) 1)
	)
	
	(method (advanceCurIcon &tmp theCurIcon temp1)
		(if (& state $0004) (return))
		(= theCurIcon curIcon)
		(= temp1 0)
		(while
			(&
				((= theCurIcon
					(self at: (mod (+ (self indexOf: theCurIcon) 1) size))
				)
					signal?
				)
				$0006
			)
			(if (> temp1 (+ 1 size)) (return) else (++ temp1))
		)
		(= curIcon theCurIcon)
		(gGame setCursor: (curIcon cursor?) 1)
	)
	
	(method (dispatchEvent pEvent &tmp pEventY pEventX pEventType pEventMessage theHighlightedIcon pEventClaimed temp6 [temp7 100])
		(= pEventX (pEvent x?))
		(= pEventY (pEvent y?))
		(= pEventType (pEvent type?))
		(= pEventMessage (pEvent message?))
		(= pEventClaimed (pEvent claimed?))
		(= theHighlightedIcon (self firstTrue: #onMe pEvent))
		(pEvent dispose:)
		(if (& pEventType evJOYSTICK)
			(switch pEventMessage
				(JOY_RIGHT (self advance:))
				(JOY_LEFT (self retreat:))
			)
		else
			(switch pEventType
				(evNULL
					(cond 
						(
							(not
								(if
									(and
										(<= 0 pEventY)
										(<= pEventY (+ y height))
										(<= 0 pEventX)
									)
									(<= pEventX 320)
								)
							)
							(if
								(and
									(& state $0400)
									(or
										(not (IsObject helpIconItem))
										(not (& (helpIconItem signal?) $0010))
									)
								)
								(= oldMouseY 0)
								(= pEventClaimed 1)
							)
						)
						(
							(and
								theHighlightedIcon
								(!= theHighlightedIcon highlightedIcon)
							)
							(= oldMouseY 0)
							(self highlight: theHighlightedIcon)
						)
					)
				)
				(evMOUSEBUTTON
					(if
						(and
							theHighlightedIcon
							(self select: theHighlightedIcon 1)
						)
						(if (== theHighlightedIcon helpIconItem)
							(if (theHighlightedIcon cursor?)
								(gGame setCursor: (theHighlightedIcon cursor?))
							)
							(if (& state $0800)
								(self noClickHelp:)
							else
								(helpIconItem signal: (| (helpIconItem signal?) $0010))
							)
						else
							(= pEventClaimed (& (theHighlightedIcon signal?) $0040))
						)
					)
				)
				(evKEYBOARD
					(switch pEventMessage
						(KEY_ESCAPE (= pEventClaimed 1))
						(KEY_RETURN
							(if (not theHighlightedIcon)
								(= theHighlightedIcon highlightedIcon)
							)
							(cond 
								(
									(and
										theHighlightedIcon
										(== theHighlightedIcon helpIconItem)
									)
									(if (!= (theHighlightedIcon cursor?) -1)
										(gGame setCursor: (theHighlightedIcon cursor?))
									)
									(if helpIconItem
										(helpIconItem signal: (| (helpIconItem signal?) $0010))
									)
								)
								((IsObject theHighlightedIcon)
									(self select: theHighlightedIcon)
									(= pEventClaimed (& (theHighlightedIcon signal?) $0040))
								)
							)
						)
						(KEY_SHIFTTAB (self retreat:))
						(KEY_TAB (self advance:))
					)
				)
				(evVERB
					(if (== pEventMessage JOY_DOWNLEFT)
						(if
						(and theHighlightedIcon (theHighlightedIcon helpStr?))
							(= temp6 (GetPort))
							(kernel_124 98 0 (theHighlightedIcon helpStr?) @temp7)
							(proc255_0 @temp7 82 813 0 0)
							(SetPort temp6)
						)
						(if helpIconItem
							(helpIconItem signal: (& (helpIconItem signal?) $ffef))
						)
						(gGame setCursor: 8)
					)
				)
			)
		)
		(return pEventClaimed)
	)
	
	(method (disable param1 &tmp temp0 temp1)
		(if argc
			(= temp0 0)
			(while (< temp0 argc)
				(= temp1
					(if (IsObject [param1 temp0])
						[param1 temp0]
					else
						(self at: [param1 temp0])
					)
				)
				(temp1 signal: (| (temp1 signal?) $0004))
				(cond 
					((== temp1 curIcon) (self advanceCurIcon:))
					((== temp1 highlightedIcon) (self advance:))
				)
				(++ temp0)
			)
		else
			(= state (| state $0004))
		)
	)
	
	(method (enable param1 &tmp temp0 temp1)
		(if argc
			(= temp0 0)
			(while (< temp0 argc)
				(= temp1
					(if (IsObject [param1 temp0])
						[param1 temp0]
					else
						(self at: [param1 temp0])
					)
				)
				(temp1 signal: (& (temp1 signal?) $fffb))
				(++ temp0)
			)
		else
			(= state (& state $fffb))
		)
	)
	
	(method (noClickHelp &tmp newEvent temp1 temp2 [temp3 100] temp103)
		(= temp1 (= temp2 0))
		(= temp103 (GetPort))
		(while (not ((= newEvent (Event new:)) type?))
			(if (not (self isMemberOf: IconBar))
				(newEvent localize:)
			)
			(cond 
				((= temp2 (self firstTrue: #onMe newEvent))
					(if (and (!= temp2 temp1) (temp2 helpStr?))
						(= temp1 temp2)
						(kernel_124 98 0 (temp2 helpStr?) @temp3)
						(proc255_0 @temp3 108 82 813 0 0)
						(SetPort temp103)
					)
				)
				(gTheNewDialog (gTheNewDialog dispose:))
				(else (= temp1 0))
			)
			(newEvent dispose:)
		)
		(gGame setCursor: 8 1)
		(if gTheNewDialog (gTheNewDialog dispose:))
		(SetPort temp103)
		(if (helpIconItem onMe: newEvent)
			(if (IsObject newEvent) (newEvent dispose:))
		else
			(self dispatchEvent: newEvent)
		)
	)
)

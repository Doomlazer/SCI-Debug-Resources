;;; Sierra Script 1.0 - (do not remove this comment)
(script# 800)
(include sci.sh)
(use Main)
;(use EcoI)
(use Class_255_0)
;(use Print)
;(use DIcon)
(use ClickMenu)
;(use Class_948_0)
(use CueObj)
(use SysWindow)
(use InvI)
(use User)
(use Obj)
(use Game)
;added
;(use DItem)
(use n819)

(public
	debugRm 0
)

(local
	newDButton_2
	newDButton
)
;;;(procedure (localproc_005e)
;;;	(Print
;;;		addText: {Flag Object?} 0 0
;;;		addButton: 1 {yes} 10 20
;;;		addButton: 0 {no} 10 40
;;;		init:
;;;	)
;;;)

(instance debugRm of Feature
	(properties)
	
	(method (init)
		(super init:)
		(gEcoKeyDownHandler add: self)
		(gEcoMouseDownHandler add: self)
	)
	
	(method (dispose)
		(gEcoKeyDownHandler delete: self)
		(gEcoMouseDownHandler delete: self)
		(super dispose:)
	)
	
	(method (handleEvent pEvent &tmp newEvent temp1 [temp2 4] [temp6 200] temp206 gNewMyListFirst temp208 temp209 temp210 temp211 temp212 temp213 temp214 temp215 temp216 temp217)
		;(if (pEvent claimed?) (return)) ;move to evKEYBOARD to allow passthrough to mouse
		(switch (pEvent type?)
			(evKEYBOARD
				(if (pEvent claimed?) (return)) ;moved here
				(pEvent claimed: 1)
				(switch (pEvent message?)
					(KEY_QUESTION
						(proc255_0 {ALT-A - show cast\nALT-B - show flag value\nALT-C - show Control screen\nALT-E - show Ego\nALT-F - show Features\nALT-G - set Global\nALT-I - get Inventory Item\nALT-K - set flag\nALT-L - clear flag\nALT-M - show Memory} #font 999 )
						(proc255_0
							{ALT-O - create Obstacles\nALT-P - show Priority screen\nALT-R - show Room info\nALT-T - Teleport\nALT-U - HandsOn\nALT-V - show Visual screen\nALT-X - eXit the game\nALT-Y - show pallete\nALT-LeftClick - Move Adam to mouse x/y\nCTRL-ALT-LeftClick - Show mouse x/y}
						)
					)
					(KEY_ALT_a
						(= gNewMyListFirst (gCast first:))
						(while gNewMyListFirst
							(= temp1 (NodeValue gNewMyListFirst))
							(= temp215
								(CelHigh (temp1 view?) (temp1 loop?) (temp1 cel?))
							)
							(Format
								@temp6
								{NAME: %s\n\nview: %d\nloop: %d\ncel: %d\nposn: %d %d %d\nheading: %d\npriority: %d\nsignal: $%x\n}
								(temp1 name?)
								(temp1 view?)
								(temp1 loop?)
								(temp1 cel?)
								(temp1 x?)
								(temp1 y?)
								(temp1 z?)
								(temp1 heading?)
								(temp1 priority?)
								(temp1 signal?)
							)
							(proc255_0
								@temp6 0 (+ temp215 5)
								;window: SysWindow
								;addIcon: (temp1 view?) (temp1 loop?) (temp1 cel?) 0 0
								#icon (temp1 view?) (temp1 loop?) (temp1 cel?) 0 0
								;addText: @temp6 0 (+ temp215 5)
								;init:
							)
							(= gNewMyListFirst (gCast next: gNewMyListFirst))
						)
						;(Print window: gEcoWin)
					)
					(KEY_ALT_b
						(= temp6 0)
						(proc255_2 @temp6 4 {Flag No?})
						(= gNewMyListFirst (ReadNumber @temp6))
						(if (proc819_5 gNewMyListFirst)
							(proc255_0 {TRUE})
						else
							(proc255_0 {FALSE})			
						)
;;;						(cond 
;;;							((localproc_005e)
;;;								(if (gDockFlags test: gNewMyListFirst)
;;;									(proc921_0 {TRUE})
;;;								else
;;;									(proc921_0 {FALSE})
;;;								)
;;;							)
;;;							((proc0_2 gNewMyListFirst) (proc921_0 {TRUE}))
;;;							(else (proc921_0 {FALSE}))
;;;						)
					)
					(KEY_ALT_c (Show 4))
					(KEY_ALT_d
						(proc0_4 1)
					)
					(KEY_ALT_e
						(= temp217 (User alterEgo?))
;;;							(if gTheNewDButton_2Value else (User alterEgo?))
;;;						)
						(proc255_0
							(Format
								@temp6
								{name: %s\nview: %d\nloop: %d\ncel: %d\nposn: %d %d %d\nheading: %d\npri: %d\nsignal: $%x\nillBits: $%x\nonControl: $%x\norigin on: $%x_}
								(temp217 name?)
								(temp217 view?)
								(temp217 loop?)
								(temp217 cel?)
								(temp217 x?)
								(temp217 y?)
								(temp217 z?)
								(temp217 heading?)
								(temp217 priority?)
								(temp217 signal?)
								(if (temp217 respondsTo: #onControl)
									(temp217 illegalBits?)
								else
									-1
								)
								(if (temp217 respondsTo: #onControl)
									(temp217 onControl:)
								else
									-1
								)
								(if (temp217 respondsTo: #onControl)
									(temp217 onControl: 1)
								else
									-1
								)
							)
							;79
							#icon
							(temp217 view?)
							(temp217 loop?)
							(temp217 cel?)
						)
					)
					(KEY_ALT_f
						(gFeatures eachElementDo: #perform showFeatureCode)
						(NameFeatureCode init:)
					)
					(KEY_ALT_g
						(= temp6 0)
						(proc255_2 @temp6 4 {Global No?})
						(= gNewMyListFirst (ReadNumber @temp6))
						(= temp6 0)
						(if (>= [gEgo gNewMyListFirst] 1000)
							(proc255_0
								(Format
									@temp6
									{Global %d's value is $%x.}
									gNewMyListFirst
									[gEgo gNewMyListFirst]
								)
							)
						else
							(proc255_0
								(Format
									@temp6
									{Global %d's value is %d.}
									gNewMyListFirst
									[gEgo gNewMyListFirst]
								)
							)
						)
						(= temp6 0)
						(if (proc255_2 @temp6 4 {New Value?})
							(= [gEgo gNewMyListFirst] (ReadNumber @temp6))
						)
					)
					(KEY_ALT_i
						(gGame setCursor: 999)
						(dInvD doit:)
						(gGame setCursor: ((gIconBar curIcon?) cursor?))
					)
					(KEY_ALT_k
						(= temp6 0)
						(proc255_2 @temp6 4 {Flag No?})
						(= gNewMyListFirst (ReadNumber @temp6))
						(proc819_3 gNewMyListFirst)
;;;						(if (localproc_005e)
;;;							(gDockFlags set: gNewMyListFirst)
;;;						else
;;;							(proc0_3 gNewMyListFirst)
;;;						)
					)
					(KEY_ALT_l
						(= temp6 0)
						(proc255_2 @temp6 4 {Flag No?})
						(= gNewMyListFirst (ReadNumber @temp6))
						(proc819_4 gNewMyListFirst)
;;;						(if (localproc_005e)
;;;							(gDockFlags clear: gNewMyListFirst)
;;;						else
;;;							(proc0_4 gNewMyListFirst)
;;;						)
					)
					(KEY_ALT_m (gGame showMem:))
					(KEY_ALT_o (PolyEdit doit:))
					(KEY_ALT_p (Show 2))
					(KEY_ALT_r
						(proc255_0
							(Format 
								@temp6
								{name: %s\nnumber: %d\ncurrent pic: %d\nstyle: %d\nhorizon: %d\nnorth: %d\nsouth: %d\neast: %d\nwest: %d\nscript: %s_}
								(global2 name?)
								gNumber
								(global2 curPic?)
								(global2 style?)
								(global2 horizon?)
								(global2 north?)
								(global2 south?)
								(global2 east?)
								(global2 west?)
								(if (IsObject (global2 script?))
									((global2 script?) name?)
								else
									{..none..}
								)
							
							67
							120
							)
						)
						(gGame showMem:)
					)
					;(KEY_ALT_s (dCastD doit:))
					(KEY_ALT_t
						;(if gDialog (gDialog dispose:))
						;(if gTheNewEcoDialog (gTheNewEcoDialog dispose:))
						(if
							(>
								(= gNewMyListFirst (proc255_3 {Which room number?}))
								0
							)
							(global2 newRoom: gNewMyListFirst)
						)
					)
					(KEY_ALT_u
						(User canInput: 1 canControl: 1)
						(gIconBar enable: 0 1 2 3 7 5 6)
					)
					(KEY_ALT_v (Show 1))
					;(KEY_ALT_w (Class_948_0 doit:)) write feature remove?
					(KEY_ALT_x (= global4 1))
					(KEY_ALT_y
						(= temp206 (GetPort))
						(SetPort 0)
						(= temp215 5)
						(= temp216 16)
						(= temp211 15)
						(= temp212 80)
						(= temp214 (+ temp211 (* 34 temp215)))
						(= temp213 (+ temp212 (* 10 temp216)))
						(= temp209
							(Graph grSAVE_BOX temp211 temp212 temp214 temp213 1)
						)
						(Graph grFILL_BOX temp211 temp212 temp214 temp213 1 255)
						(= temp210 0)
						(while (< temp210 256)
							(Graph
								grFILL_BOX
								(+ temp211 temp215 (* temp215 (/ temp210 8)))
								(+ temp212 temp216 (* 16 (mod temp210 8)))
								(+ temp211 temp215 temp215 (* temp215 (/ temp210 8)))
								(+ temp212 temp216 temp216 (* temp216 (mod temp210 8)))
								1
								temp210
							)
							(++ temp210)
						)
						(Graph grUPDATE_BOX temp211 temp212 temp214 temp213 1)
						(repeat
							(if
								(or
									(== ((= newEvent (Event new:)) type?) 1)
									(== (newEvent type?) 4)
								)
								(break)
							)
							(newEvent dispose:)
						)
						(newEvent dispose:)
						(Graph grRESTORE_BOX temp209)
						(Graph grUPDATE_BOX temp211 temp212 temp214 temp213 1)
						(SetPort temp206)
					)
					(else  (pEvent claimed: 0))
				)
			)
			(evMOUSEBUTTON
				(switch (pEvent modifiers?)
					(13 0)
					(14 0)
					(12
						(pEvent claimed: 1)
						(= temp206
;;;							(proc255_3
;;;								{%d/%d}
;;;								(pEvent x?)
;;;								(pEvent y?)
;;;								64
;;;								160
;;;								10
;;;								30
;;;								999
;;;								111
;;;							)
							(proc255_0
								(Format
									@temp6
									{%d/%d}
									(pEvent x?)
									(pEvent y?)
								)
							)
						)
						(while (!= 2 ((= newEvent (Event new:)) type?))
							(newEvent dispose:)
						)
						(newEvent dispose:)
					)
					(5
						(pEvent type: 4 message: 4864)
						(self handleEvent: pEvent)
					)
					(6
						(pEvent type: 4 message: 4608)
						(self handleEvent: pEvent)
					)
					(9 0)
					(10 0)
					(emRIGHT_SHIFT 0)
					(emLEFT_SHIFT 0)
					(emCTRL 0)
					(emALT
						(pEvent claimed: 1)
						(= temp217 (User alterEgo?)) ;hacked look into gthenewdbutton
							;(if gTheNewDButton_2Value else (User alterEgo?))
						;)
						(gEgo setMotion: 0)
						(while (!= 2 ((= newEvent (Event new:)) type?))
							(temp217
								x: (newEvent x?)
								y: (- (newEvent y?) 10)
								startUpd:
							)
							(Animate (gCast elements?) 0)
							(newEvent dispose:)
						)
						(newEvent dispose:)
					)
				)
			)
		)
	)
)

(class NameFeatureCode of Code
	(properties)
	
	(method (init)
		(gEcoKeyDownHandler addToFront: self)
		(gTheDoits add: self)
	)
	
	(method (doit &tmp onMeAndLowYTheObj [temp1 40])
		(OnMeAndLowY init:)
		(gFeatures
			eachElementDo: #perform OnMeAndLowY (User curEvent?)
		)
		(if (= onMeAndLowYTheObj (OnMeAndLowY theObj?))
			(Format
				@temp1
				{%d, %d______%s}
				((User curEvent?) x?)
				((User curEvent?) y?)
				(onMeAndLowYTheObj name?)
			)
			(DrawStatus @temp1 67 0)
		)
	)
	
	(method (dispose)
		(DrawStatus 0)
		(DrawStatus {_} 0 0)
		(gEcoKeyDownHandler delete: self)
		(gTheDoits delete: self)
	)
	
	(method (handleEvent pEvent &tmp [temp0 50])
		(if
			(and
				(== (pEvent type?) evKEYBOARD)
				(== (pEvent message?) KEY_ESCAPE)
			)
			(pEvent claimed: 1)
			(self dispose:)
		)
	)
)

(instance showFeatureCode of Code
	(properties)
	
	(method (doit param1 &tmp temp0 temp1 temp2 temp3)
		(= temp0 (param1 nsTop?))
		(= temp1 (param1 nsLeft?))
		(= temp3 (param1 nsBottom?))
		(= temp2 (param1 nsRight?))
		(Graph grDRAW_LINE temp0 temp1 temp0 temp2 1 8)
		(Graph grDRAW_LINE temp3 temp1 temp3 temp2 1 8)
		(Graph grDRAW_LINE temp0 temp1 temp3 temp1 1 8)
		(Graph grDRAW_LINE temp0 temp2 temp3 temp2 1 8)
		(Graph
			grUPDATE_BOX
			temp0
			temp1
			(+ temp3 1)
			(+ temp2 1)
			1
		)
	)
)

(instance dInvD of Dialog
	(properties
		size 200
	)
	
	(method (init &tmp temp0 temp1 temp2 temp3 newDText gInvFirst temp6)
		(= temp2 (= temp0 (= temp1 4)))
		(= temp3 0)
		(= gInvFirst (gInv first:))
		(while gInvFirst
			(= temp6 (NodeValue gInvFirst))
			(++ temp3)
			(if (temp6 isKindOf: InvI)
				(self
					add:
						((= newDText (DText new:))
							value: temp6
							text: (temp6 name?)
							nsLeft: temp0
							nsTop: temp1
							state: 3
							font: global23
							setSize:
							yourself:
						)
				)
			)
			(if
			(< temp2 (- (newDText nsRight?) (newDText nsLeft?)))
				(= temp2 (- (newDText nsRight?) (newDText nsLeft?)))
			)
			(if
				(>
					(= temp1
						(+ temp1 (- (newDText nsBottom?) (newDText nsTop?)) 1)
					)
					130
				)
				(= temp1 4)
				(= temp0 (+ temp0 temp2 10))
				(= temp2 0)
			)
			(= gInvFirst (gInv next: gInvFirst))
		)
		(= window gEcoWin)
		(self setSize:)
		(= newDButton (DButton new:))
		(newDButton
			text: {I want it ALL!}
			setSize:
			moveTo: (- nsRight (+ 4 (newDButton nsRight?))) nsBottom
		)
		(newDButton
			move: (- (newDButton nsLeft?) (newDButton nsRight?)) 0
		)
		(self add: newDButton setSize: center:)
		(self setSize:)
		(= newDButton_2 (DButton new:))
		(newDButton_2
			text: {Outta here!}
			setSize:
			moveTo: (- nsRight (+ 4 (newDButton_2 nsRight?))) nsBottom
		)
		(newDButton_2
			move: (- (newDButton_2 nsLeft?) (newDButton_2 nsRight?)) 0
		)
		(self add: newDButton_2 setSize: center:)
		(return temp3)
	)
	
	(method (doit &tmp theNewDButton_2 temp1)
		(self init:)
		(self open: 4 15)
		(= theNewDButton_2 newDButton_2)
		(repeat
			(if
				(or
					(not (= theNewDButton_2 (super doit: theNewDButton_2)))
					(== theNewDButton_2 -1)
					(== theNewDButton_2 newDButton)
					(== theNewDButton_2 newDButton_2)
				)
				(break)
			)
			(gEgo get: (gInv indexOf: (theNewDButton_2 value?)))
		)
		(if (== theNewDButton_2 newDButton)
			(= temp1 0)
			(while (< temp1 (gInv size?))
				(if ((gInv at: temp1) isKindOf: InvI)
					(gEgo get: temp1)
				)
				(++ temp1)
			)
		)
		(self eachElementDo: #dispose 1 dispose:)
	)
	
	(method (handleEvent pEvent &tmp pEventMessage pEventType)
		(= pEventMessage (pEvent message?))
		(switch (= pEventType (pEvent type?))
			(4
				(switch pEventMessage
					(KEY_UP (= pEventMessage 3840))
					(KEY_NUMPAD2
						(= pEventMessage 9)
					)
				)
			)
			(64
				(switch pEventMessage
					(JOY_UP
						(= pEventMessage 3840)
						(= pEventType 4)
					)
					(JOY_DOWN
						(= pEventMessage 9)
						(= pEventType 4)
					)
				)
			)
		)
		(pEvent type: pEventType message: pEventMessage)
		(super handleEvent: pEvent)
	)
)

;;;(instance dCastD of Dialog
;;;	(properties)
;;;	
;;;	(method (init &tmp temp0 temp1 temp2 temp3 newDText gNewMyListFirst temp6)
;;;		(= temp2 (= temp0 (= temp1 4)))
;;;		(= temp3 0)
;;;		(= gNewMyListFirst (gNewMyList first:))
;;;		(while gNewMyListFirst
;;;			(= temp6 (NodeValue gNewMyListFirst))
;;;			(++ temp3)
;;;			(self
;;;				add:
;;;					((= newDText (DText new:))
;;;						value: temp6
;;;						text: (temp6 name?)
;;;						nsLeft: temp0
;;;						nsTop: temp1
;;;						state: 3
;;;						font: global23
;;;						setSize:
;;;						yourself:
;;;					)
;;;			)
;;;			(if
;;;			(< temp2 (- (newDText nsRight?) (newDText nsLeft?)))
;;;				(= temp2 (- (newDText nsRight?) (newDText nsLeft?)))
;;;			)
;;;			(if
;;;				(>
;;;					(= temp1
;;;						(+ temp1 (- (newDText nsBottom?) (newDText nsTop?)) 1)
;;;					)
;;;					100
;;;				)
;;;				(= temp1 4)
;;;				(= temp0 (+ temp0 temp2 10))
;;;				(= temp2 0)
;;;			)
;;;			(= gNewMyListFirst (gNewMyList next: gNewMyListFirst))
;;;		)
;;;		(= window gEcoWin)
;;;		(self setSize:)
;;;		(= newDButton_2 (DButton new:))
;;;		(newDButton_2
;;;			text: {exit}
;;;			setSize:
;;;			moveTo: (- nsRight (+ 4 (newDButton_2 nsRight?))) nsBottom
;;;		)
;;;		(newDButton_2
;;;			move: (- (newDButton_2 nsLeft?) (newDButton_2 nsRight?)) 0
;;;		)
;;;		(self add: newDButton_2 setSize: center:)
;;;		(return temp3)
;;;	)
;;;	
;;;	(method (doit &tmp theNewDButton_2 temp1)
;;;		(self init:)
;;;		(self open: 4 15)
;;;		(= theNewDButton_2 newDButton_2)
;;;		(repeat
;;;			(if
;;;				(or
;;;					(not (= theNewDButton_2 (super doit: theNewDButton_2)))
;;;					(== theNewDButton_2 -1)
;;;					(== theNewDButton_2 newDButton_2)
;;;				)
;;;				(break)
;;;			)
;;;			(= gTheNewDButton_2Value (theNewDButton_2 value?))
;;;		)
;;;		(self eachElementDo: #dispose 1 dispose:)
;;;	)
;;;	
;;;	(method (handleEvent pEvent &tmp pEventMessage pEventType)
;;;		(= pEventMessage (pEvent message?))
;;;		(switch (= pEventType (pEvent type?))
;;;			(4
;;;				(switch pEventMessage
;;;					(KEY_UP (= pEventMessage 3840))
;;;					(KEY_NUMPAD2
;;;						(= pEventMessage 9)
;;;					)
;;;				)
;;;			)
;;;			(64
;;;				(switch pEventMessage
;;;					(JOY_UP
;;;						(= pEventMessage 3840)
;;;						(= pEventType 4)
;;;					)
;;;					(JOY_DOWN
;;;						(= pEventMessage 9)
;;;						(= pEventType 4)
;;;					)
;;;				)
;;;			)
;;;		)
;;;		(pEvent type: pEventType message: pEventMessage)
;;;		(super handleEvent: pEvent)
;;;	)
;;;)

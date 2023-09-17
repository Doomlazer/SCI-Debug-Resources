;;; Sierra Script 1.0 - (do not remove this comment)
(script# 996)
(include sci.sh)
(use Main)
(use PolyPath)
(use Cycle)
(use PicView)
(use Obj)


(local
	[local0 23]
	local23
)
(instance uEvt of Event
	(properties)
)

(class User of Obj
	(properties
		alterEgo 0
		input 0
		controls 0
		echo 32
		prevDir 0
		prompt {Enter input}
		inputLineAddr 0
		x -1
		y -1
		mapKeyToDir 1
		curEvent 0
		verbMessager 0
	)
	
	(method (init param1 param2)
		(= inputLineAddr (if argc param1 else @local0))
		(= local23 (if (== argc 2) param2 else 45))
		(= curEvent uEvt)
	)
	
	(method (doit)
		(curEvent
			type: 0
			message: 0
			modifiers: 0
			y: 0
			x: 0
			claimed: 0
			port: 0
		)
		(GetEvent 32767 curEvent)
		(self handleEvent: curEvent)
	)
	
	(method (canControl theControls)
		(if argc (= controls theControls) (= prevDir 0))
		(return controls)
	)
	
	(method (getInput &tmp temp0)
	)
	
	(method (said &tmp temp0)
	)
	
	(method (handleEvent pEvent &tmp pEventType temp1)
		(= gPEventX (pEvent x?))
		(= gPEventY (pEvent y?))
		(if (pEvent type?)
			(= gPEvent pEvent)
			(if mapKeyToDir (MapKeyToDir pEvent))
			(if (== (pEvent type?) evJOYDOWN)
				(pEvent
					type: 4
					message: (if (& (pEvent modifiers?) emSHIFT) 27 else 13)
					modifiers: 0
				)
			)
			(= pEventType (pEvent type?))
			(if global68 (global68 handleEvent: pEvent pEventType))
			(pEvent localize:)
			(cond 
				((& (pEvent type?) evJOYSTICK)
					(cond 
						(
							(or
								(and
									gEcoDirectionHandler
									(gEcoDirectionHandler handleEvent: pEvent)
								)
								(and gPseudoMouse (gPseudoMouse handleEvent: pEvent))
								(and alterEgo controls (alterEgo handleEvent: pEvent))
							)
						)
						(gIconBar (gIconBar handleEvent: pEvent))
					)
				)
				((== pEventType evKEYBOARD)
					(if gEcoKeyDownHandler
						(gEcoKeyDownHandler handleEvent: pEvent)
					)
				)
				(
				(and (== pEventType evMOUSEBUTTON) gEcoMouseDownHandler) (gEcoMouseDownHandler handleEvent: pEvent))
			)
		)
		(if (not (pEvent claimed?))
			(if gIconBar (gIconBar handleEvent: pEvent))
			(if (and (== (pEvent type?) evVERB) input)
				(cond 
					(
						(and
							(== (pEvent message?) JOY_UP)
							controls
							(alterEgo handleEvent: pEvent)
						)
						1
					)
					(global34
						(OnMeAndLowY init:)
						(gCast eachElementDo: #perform OnMeAndLowY pEvent)
						(gFeatures eachElementDo: #perform OnMeAndLowY pEvent)
						(if (OnMeAndLowY theObj?)
							((OnMeAndLowY theObj?) handleEvent: pEvent)
						)
					)
					((gCast handleEvent: pEvent) 1)
					((gFeatures handleEvent: pEvent) 1)
				)
				(cond 
					((pEvent claimed?) 1)
					((gRegions handleEvent: pEvent) 1)
				)
			)
			(if (and (pEvent type?) (not (pEvent claimed?)))
				(gGame handleEvent: pEvent)
			)
		)
	)
	
	(method (canInput theInput)
		(if argc (= input theInput))
		(return input)
	)
)

(class Ego of Actor
	(properties
		x 0
		y 0
		z 0
		heading 0
		noun 0
		nsTop 0
		nsLeft 0
		nsBottom 0
		nsRight 0
		description 0
		sightAngle 26505
		actions 0
		onMeCheck $6789
		approachX 0
		approachY 0
		approachDist 0
		_approachVerbs 26505
		lookStr 0
		yStep 2
		view 0
		loop 0
		cel 0
		priority 0
		underBits 0
		signal $2000
		lsTop 0
		lsLeft 0
		lsBottom 0
		lsRight 0
		brTop 0
		brLeft 0
		brBottom 0
		brRight 0
		palette 0
		cycleSpeed 6
		script 0
		cycler 0
		timer 0
		detailLevel 0
		illegalBits $8000
		xLast 0
		yLast 0
		xStep 3
		moveSpeed 6
		blocks 0
		baseSetter 0
		mover 0
		looper 0
		viewer 0
		avoider 0
		code 0
		edgeHit 0
	)
	
	(method (init)
		(super init:)
		(if (not cycler) (self setCycle: Walk))
	)
	
	(method (doit)
		(super doit:)
		(= edgeHit
			(cond 
				((<= x 0) 4)
				((>= x 319) 2)
				((>= y 189) 3)
				((<= y (global2 horizon?)) 1)
				(else 0)
			)
		)
	)
	
	(method (handleEvent pEvent &tmp pEventMessage)
		(if script (script handleEvent: pEvent))
		(cond 
			(
			(or (pEvent claimed?) (not (gCast contains: self))) 1)
			(
			(and (& (pEvent type?) evJOYSTICK) (gUser controls?))
				(if
					(and
						(== (= pEventMessage (pEvent message?)) 0)
						(& (pEvent type?) evKEYBOARD)
					)
					(pEvent claimed?)
					(return)
				)
				(if
					(and
						(== pEventMessage (gUser prevDir?))
						(IsObject mover)
					)
					(= pEventMessage 0)
				)
				(gUser prevDir: pEventMessage)
				(self setDirection: pEventMessage)
				(pEvent claimed: 1)
			)
			(
				(or
					(== (pEvent type?) evVERB)
					(== (pEvent type?) evMOUSEBUTTON)
				)
				(if
					(and
						(or
							(== (pEvent message?) JOY_UP)
							(== (pEvent type?) evMOUSEBUTTON)
						)
						(gUser controls?)
					)
					(if (== (pEvent modifiers?) emALT) ;send to Debug script
						(pEvent type: 1 modifiers: 8)
						((ScriptID 800) handleEvent: pEvent)
					else
						(switch global67
							(0
								(self setMotion: MoveTo (pEvent x?) (+ (pEvent y?) z))
							)
							(1
								(self
									setMotion: PolyPath (pEvent x?) (+ (pEvent y?) z)
								)
							)
							(2
								(self
									setMotion: PolyPath (pEvent x?) (+ (pEvent y?) z) 0 0
								)
							)
						)
						(gUser prevDir: 0)
					)
					(pEvent claimed: 1)
				else
					(super handleEvent: pEvent)
				)
			)
			(else (super handleEvent: pEvent))
		)
		(pEvent claimed?)
	)
	
	(method (get param1 &tmp temp0)
		(= temp0 0)
		(while (< temp0 argc)
			((gInv at: [param1 temp0]) moveTo: self)
			(++ temp0)
		)
	)
	
	(method (put param1 param2 &tmp temp0)
		(if (self has: param1)
			((= temp0 (gInv at: param1))
				moveTo: (if (== argc 1) -1 else param2)
			)
			(if
			(and gIconBar (== (gIconBar curInvIcon?) temp0))
				(gIconBar
					curInvIcon: 0
					disable: ((gIconBar useIconItem?) cursor: 8 yourself:)
				)
			)
		)
	)
	
	(method (has param1 &tmp temp0)
		(if (= temp0 (gInv at: param1)) (temp0 ownedBy: self))
	)
)

(class OnMeAndLowY of Code
	(properties
		theObj 0
		lastY -1
	)
	
	(method (init)
		(= theObj 0)
		(= lastY -1)
	)
	
	(method (doit theTheObj param2)
		(if
		(and (theTheObj onMe: param2) (> (theTheObj y?) lastY))
			(= lastY ((= theObj theTheObj) y?))
		)
	)
)

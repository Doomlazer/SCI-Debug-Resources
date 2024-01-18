;;; Sierra Script 1.0 - (do not remove this comment)
(script# 803)
(include sci.sh)
(use Main)
(use EcoFeature)
(use Cycle)
(use Game)
(use Obj)
(use Print)

(public
	speedTest 0
)

(local
	local0
	local1
	local2
	local3
)
(instance fred of EcoActor
	(properties)
)

(instance speedTest of Rm
	(properties
		picture 901
		style $0064
	)
	
	(method (init)
		(= local1 (FileIO fiOPEN {version} 1))
		(FileIO fiREAD_STRING global27 6 local1)
		(FileIO fiCLOSE local1)
		(super init:)
		(gSounds eachElementDo: #stop)
		(while (u> (GetTime) -1024)
		)
		(fred
			view: 901
			setLoop: 0
			illegalBits: 0
			posn: 20 99
			setStep: 1 1
			setMotion: MoveTo 300 100
			setCycle: Fwd
			init:
		)
		(= global111 0)
		(= local3 (if (> global102 16) 110 else 50))
		(= local2 (if (> global102 16) 65 else 30))
	)
	
	(method (doit)
		(super doit:)
		(if (== (++ global111) 1)
			(= local0 (+ 60 (GetTime)))
		)
		(if
		(and (u< local0 (GetTime)) (not (self script?)))
			(cond 
				((< global111 local2) (= global87 0) (gGame detailLevel: 1))
				((< global111 local3) (= global87 1) (gGame detailLevel: 2))
				(else (= global87 2) (gGame detailLevel: 3))
			)
			(self setScript: speedScript)
		)
	)
	
	(method (dispose)
		(super dispose:)
	)
)

(instance speedScript of Script
	(properties)
	
	(method (changeState newState &tmp temp0 [temp2 5])
		(switch (= state newState)
			(0
				(= cycles 1)
			)
			(1
				(= temp2 0)
				(= temp0
					(Print
						font: 999 ;gSmallFont
						addText: {Where to, Adam?} 0 0
						addEdit: @temp2 5 115 0
						addButton: 360 {INTRO} 0 16
						addButton: 400 {Dad's Lab} 0 32
						addButton: 380 {Pool} 0 48
						addButton: 100 {Outside Eluria} 0 64
						addButton: 440 {Reef} 0 80
						addButton: 540 {Cave} 0 96
						addButton: 580 {Boat} 0 112
						addButton: 640 {Cetus} 0 128
						addButton: -100 {RESTORE} 0 144
						init:
					)
				)
				(if (> temp2 0)
					(= temp0 (ReadNumber @temp2))
				)
				
				(cond
					((> temp0 0)
						(gIconBar enable:)
						(global2 newRoom: temp0)
					)
					((< temp0 0)
						(gGame restore:)
						(gIconBar enable:)
						(global2 newRoom: global104)
					)
					(else
						(gIconBar enable:)
						(global2 newRoom: global104)
					)
				)
				;(gIconBar enable:)
				;(global2 newRoom: global104)
			)
		)
	)
)

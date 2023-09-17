;;; Sierra Script 1.0 - (do not remove this comment)
(script# 803)
(include sci.sh)
(use Main)
(use Cycle)
(use Game)
(use PicView)
(use Obj)
(use n940)

(public
	speedTest 0
)

(local
	local0
	local1
	local2
	local3
)
(instance fred of Actor
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
		(= gNewSpeed 0)
		(= global111 0)
		(= local3
			(if (not (if (<= 2 global102) (<= global102 16)))
				110
			else
				50
			)
		)
		(= local2
			(if (not (if (<= 2 global102) (<= global102 16)))
				65
			else
				30
			)
		)
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
			(0 (= cycles 1))
			(1
				(= gNewSpeed 1)
				(= cycles 1)
			)
			(2
				;(gIconBar enable:)
				;(global2 newRoom: global104)
				(= temp2 0)
				(= temp0
					(proc940_0
						{Where to, Adam?}
						#edit @temp2 5 106
						#button {INTRO} 360 106
						#button {Dad's Lab} 400 106
						#button {Pool} 380 106
						#button {Outside Eluria} 100 106
						#button {Reef} 440 106
						#button {Cave} 540 106
						#button {Boat} 580 106
						#button {Cetus} 640 106
						#button {RESTORE} -100
					)
				)
				(if (> temp2 0)
					(= temp0 (ReadNumber @temp2))
				)
				
				(cond
					((> temp0 0)
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
			)
		)
	)
)

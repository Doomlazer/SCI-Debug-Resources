;;; Sierra Script 1.0 - (do not remove this comment)
(script# 0)
(include sci.sh)
(use Class_255_0)
(use n804)
(use EcoRoom)
(use Smopper)
(use EcoWindow)
(use n819)
(use Cursor)
(use RTRandCycle)
(use PseudoMouse)
(use Slider)
(use BorderWindow)
(use IconI)
(use RandCycle)
(use PolyPath)
(use Polygon)
(use StopWalk)
(use Grooper)
(use SysWindow)
(use Sound)
(use Game)
(use InvI)
(use User)
(use PicView)
(use Obj)

(public
	eco 0
	proc0_1 1
	proc0_2 2
	proc0_3 3
	proc0_4 4
	proc0_5 5
)

(local
	gEgo
	gGame
	global2
	gNewSpeed =  6
	global4
	gCast
	gRegions
	gTimers
	gSounds
	gInv
	gAddToPics
	gNumber
	gSouth
	gNewRoomNumber
	global14
	global15
	global16
	global17 =  7
	global18
	gCursorNumber
	gArrowC =  999
	gWaitC =  20
	global22 =  1
	global23 =  4
	gPEvent
	gTheNewDialog
	global26 =  1
	global27
	gLocales
	global29
	global30 =  10
	gPicAngle
	gFeatures
	gSFeatures
	global34
	global35
	gPicNumber =  -1
	global37
	gEcoWin
	global39 =  3
	global40
	global41
	global42
	global43
	global44
	global45
	global46
	global47
	global48
	global49
	global50
	global51
	global52
	global53
	global54
	global55
	global56
	global57
	global58
	global59
	global60
	global61
	global62
	global63
	gEcoFtrInit
	gEcoDoVerbCode
	global66
	global67 =  1
	global68
	gIconBar
	gPEventX
	gPEventY
	gEcoKeyDownHandler
	gEcoMouseDownHandler
	gEcoDirectionHandler
	global75
	global76
	gPseudoMouse
	gTheDoits
	global79 =  60
	gUser
	global81
	global82
	global83
	gNewEventHandler
	gFont
	global86
	global87
	gB_moveCnt
	global89
	global90
	global91
	global92
	global93
	global94
	global95
	global96
	global97
	global98
	global99
	gLongSong
	global101 =  4
	global102
	global103
	global104
	global105
	global106
	gProphesyScrollY
	gStopGroop
	global109
	global110
	global111
	global112
	global113
	global114
	global115
	global116
	gSoundEffects
	global118 =  1
	global119
	global120
	global121
	global122
	global123
	global124
	global125
	global126
	global127
	global128
	global129
	global130
	global131
	global132
	global133
	global134
	global135
	global136
	global137
	global138
	global139
	global140
	global141
	global142
	global143
	global144
	global145
	global146
	global147
	global148
	global149
	global150
	global151
	global152
	global153
	global154
	global155
	global156
	global157
	global158
	global159
	global160
	global161
	global162
	global163
	global164
	global165
	global166
	global167
	global168
	global169
	global170
	global171
	global172
	global173
	global174
	global175
	global176
	global177
	global178
	global179
	global180
	global181
	global182
	global183
	gTheTilePieceCorrectPosn
	global185
	global186
	global187
	global188
	global189
	global190
	global191
	global192
	global193
	global194
	global195
	global196
	global197
	global198
	global199
	global200
	global201
	global202
	global203
	global204
	global205
	global206
	global207
	global208
	global209
	global210
	global211
	global212
	global213
	global214
	global215
	global216
	global217
	global218
	global219
	global220
	global221
	global222
	global223
	global224
	global225
	gDelph
	global227
	global228
	gBelongsTo
	global230
	gLongSong2
	global232
	global233
	global234
	global235
	global236
	global237
	global238
	global239
	global240
	global241
	global242
	global243 =  100
	global244
	global245
	global246 =  1
	global247 =  1
	global248
	global249 =  42
)
(procedure (proc0_1 &tmp gIconBarCurIcon)
	(User canControl: 0 canInput: 0)
	(gEgo setMotion: 0)
	(= gIconBarCurIcon (gIconBar curIcon?))
	(gIconBar disable: 5 0 1 2 3 4 6 5)
	(gIconBar curIcon: gIconBarCurIcon)
	(if gPseudoMouse (gPseudoMouse stop:))
	(if (not (HaveMouse))
		(= global105 ((User curEvent?) x?))
		(= global106 ((User curEvent?) y?))
		(gGame setCursor: gWaitC 1)
		(Intersections 310 180)
	else
		(gGame setCursor: gWaitC 1)
	)
)

(procedure (proc0_2)
	(User canControl: 1 canInput: 1)
	(gIconBar enable: 5 0 1 2 3 5)
	(if (gIconBar curInvIcon?) (gIconBar enable: 4))
	(if (proc819_5 15) (gIconBar enable: 6))
	(gEgo
		moveSpeed: (gGame egoMoveSpeed?)
		cycleSpeed: (gGame egoMoveSpeed?)
	)
	(if (not (gIconBar curInvIcon?)) (gIconBar disable: 4))
	(if (not (HaveMouse))
		(gGame setCursor: ((gIconBar curIcon?) cursor?) 1)
		(Intersections global105 global106)
	else
		(gGame setCursor: ((gIconBar curIcon?) cursor?))
	)
)

(procedure (proc0_3)
	((= gIconBar IconBar)
		add:
			(icon0 cursor: travelC yourself:)
			(icon2 cursor: eyeC yourself:)
			(icon1 cursor: handC yourself:)
			(icon6 cursor: talkC yourself:)
			(icon4 cursor: invC yourself:)
			(icon5 cursor: arrowC yourself:)
			(icon3 cursor: bagC yourself:)
			(icon7 cursor: arrowC yourself:)
			(icon9 cursor: helpC yourself:)
		eachElementDo: #init
		eachElementDo: #highlightColor 0
		eachElementDo: #lowlightColor (proc819_8 global216 global216)
		curIcon: icon0
		useIconItem: icon4
		helpIconItem: icon9
		disable:
	)
	(icon5 message: (if (HaveMouse) 3840 else 9))
)

(procedure (proc0_4 param1 param2)
	(if (not (proc819_5 param2))
		(gGame changeScore: param1)
		(ecoStatusLine doit:)
		(proc819_3 param2)
		(pointsSound play:)
	)
)

(procedure (proc0_5 param1)
	(gIconBar
		curIcon: (gIconBar at: 4)
		curInvIcon: (Inv at: param1)
	)
	((gIconBar at: 4) cursor: ((Inv at: param1) cursor?))
	(invC
		loop: ((gIconBar curInvIcon?) cursorLoop?)
		cel: ((gIconBar curInvIcon?) cursorCel?)
	)
	(if (User canInput:)
		((gIconBar at: 4)
			signal: (& ((gIconBar at: 4) signal?) $fffb)
		)
		(gGame setCursor: invC 1)
	else
		(gGame setCursor: gCursorNumber 1)
	)
)

(procedure (localproc_41ec param1 &tmp [temp0 300])
	(kernel_124
		99
		(cond 
			((< param1 100) 3)
			((< param1 200) 4)
			(else 5)
		)
		param1
		@temp0
	)
	(proc255_0 @temp0 67 -1 115)
)

(instance arrowC of Cursor
	(properties
		view 957
		cel 8
	)
)

(instance nonC of Cursor
	(properties
		view 957
		cel 9
	)
)

(instance eyeC of Cursor
	(properties
		view 957
	)
)

(instance travelC of Cursor
	(properties
		view 957
		cel 1
	)
)

(instance handC of Cursor
	(properties
		view 957
		cel 3
	)
)

(instance bagC of Cursor
	(properties
		view 957
		cel 4
	)
)

(instance talkC of Cursor
	(properties
		view 957
		cel 5
	)
)

(instance helpC of Cursor
	(properties
		view 957
		cel 6
	)
)

(instance waitC of Cursor
	(properties
		view 957
		cel 7
	)
)

(instance invC of Cursor
	(properties
		view 958
	)
)

(instance ego of Ego
	(properties
		sightAngle 180
		view 800
	)
	
	(method (doVerb theVerb param2)
		(switch theVerb
			(2 (Narrator init: 1 0 3))
			(5
				((ScriptID 2 1) init: 1 1 0 1)
			)
			(3 (Narrator init: 2 0 3))
			(10 (Narrator init: 54 0 3))
			(4
				(switch param2
					(8
						(if (proc999_5 gNumber 380 381)
							(global2 notify:)
						else
							(Narrator init: 151 0 4)
						)
					)
					(9
						(if (proc819_5 68)
							(proc819_4 68)
							(global2 notify: 68)
						else
							(Narrator init: 55 0 3)
						)
					)
					(21 (Narrator init: 23 0 3))
					(7
						((ScriptID 2 1) init: 74 1 0 1)
					)
					(else 
						(super doVerb: theVerb param2)
					)
				)
			)
			(else  (super doVerb: theVerb))
		)
	)
	
	(method (get param1)
		(cond 
			((== param1 23)
				(switch global233
					(1
						(jar loop: 4 cel: 11 cursorCel: 8)
					)
					(2
						(jar loop: 6 cel: 1 cursorCel: 9)
					)
				)
			)
			((and (== param1 4) (== global232 3))
				(rag loop: 2)
				(rag cel: 9)
				(rag cursorLoop: 0)
				(rag cursorCel: 2)
			)
		)
		(super get: param1 &rest)
		(proc0_5 param1)
	)
	
	(method (put param1 &tmp temp0)
		(super put: param1 &rest)
		(if (not (gIconBar curInvIcon?)) (gIconBar disable: 4))
		(gIconBar curIcon: (gIconBar at: 0) advanceCurIcon:)
	)
)

(class Delph of Actor
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
		signal $0000
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
		talkScript 0
	)
)

(instance delph of Delph
	(properties)
		(method (doVerb theVerb invItem)
		(switch theVerb
			(3 ; Do
				(Narrator init: 8 0 3) ; "Delphineus will "offer his fin" to Adam when he wants to take him for a ride."
			)
			(2 ; Look
				(if lookStr
					(super doVerb: theVerb invItem &rest)
				else
					(Narrator init: 7 0 3) ; "Adam's dolphin pal, Delphineus, always looks like he's grinning."
				)
			)
			(4 ; Inventory
				((ScriptID 2 0) ; Delphineus
					init:
						(switch invItem
							(12 85) ; trident
							(11 86) ; conchShell
							(22 87) ; hermetShell
							(21 88) ; healingPotion
							(10 89) ; bikeCage
							(20 90) ; starFish
							(else 91)
						)
						1
						0
						1
				)
			)
			(10 ; Recycle
				((ScriptID 2 0) init: 2 1 0 1) ; Delphineus, "Phew. Don't put that garbage bag near me!"
			)
			(5 ; Talk
				(cond
					((global2 script:)
						(Narrator init: 56 0 3) ; "There's no time to talk to Delphineus now."
					)
					((and talkScript (IsObject talkScript))
						(global2 setScript: talkScript)
					)
					((proc819_4 107)
						(global2 setScript: (ScriptID 1 0)) ; jokeScript
					)
					(
						(and
							(proc819_4 143)
							(not (proc819_4 334))
							(or
								(not (or (gEgo has: 26) (proc819_4 332))) ; steelCable
								(not (or (gEgo has: 27) (proc819_4 331))) ; float
							)
						)
						((ScriptID 2 0) init: (Random 79 81) 1 0 1) ; Delphineus
					)
					(else
						((ScriptID 2 0) init: (Random 3 5) 1 0 1) ; Delphineus
					)
				)
			)
			(else
				(super doVerb: theVerb invItem &rest)
			)
		)
	)
	
;;;	(method (doVerb theVerb param2 param3)
;;;		(asm
;;;			lsp      theVerb
;;;			dup     
;;;			ldi      3
;;;			eq?     
;;;			bnt      code_058f
;;;			pushi    #init
;;;			pushi    3
;;;			pushi    8
;;;			pushi    0
;;;			pushi    3
;;;			class    Narrator
;;;			send     10
;;;			jmp      code_072a
;;;code_058f:
;;;			dup     
;;;			ldi      2
;;;			eq?     
;;;			bnt      code_05bb
;;;			pToa     lookStr
;;;			bnt      code_05ab
;;;			pushi    #doVerb
;;;			pushi    2
;;;			lsp      theVerb
;;;			lsp      param2
;;;			&rest    param3
;;;			super    Delph,  8
;;;			jmp      code_072a
;;;code_05ab:
;;;			pushi    #init
;;;			pushi    3
;;;			pushi    7
;;;			pushi    0
;;;			pushi    3
;;;			class    Narrator
;;;			send     10
;;;			jmp      code_072a
;;;code_05bb:
;;;			dup     
;;;			ldi      4
;;;			eq?     
;;;			bnt      code_0622
;;;			pushi    107
;;;			pushi    4
;;;			lsp      param2
;;;			dup     
;;;			ldi      12
;;;			eq?     
;;;			bnt      code_05d4
;;;			ldi      85
;;;			jmp      code_0612
;;;code_05d4:
;;;			dup     
;;;			ldi      11
;;;			eq?     
;;;			bnt      code_05e0
;;;			ldi      86
;;;			jmp      code_0612
;;;code_05e0:
;;;			dup     
;;;			ldi      22
;;;			eq?     
;;;			bnt      code_05ec
;;;			ldi      87
;;;			jmp      code_0612
;;;code_05ec:
;;;			dup     
;;;			ldi      21
;;;			eq?     
;;;			bnt      code_05f8
;;;			ldi      88
;;;			jmp      code_0612
;;;code_05f8:
;;;			dup     
;;;			ldi      10
;;;			eq?     
;;;			bnt      code_0604
;;;			ldi      89
;;;			jmp      code_0612
;;;code_0604:
;;;			dup     
;;;			ldi      20
;;;			eq?     
;;;			bnt      code_0610
;;;			ldi      90
;;;			jmp      code_0612
;;;code_0610:
;;;			ldi      91
;;;code_0612:
;;;			toss    
;;;			push    
;;;			pushi    1
;;;			pushi    0
;;;			pushi    1
;;;			pushi    2
;;;			pushi    2
;;;			pushi    0
;;;			callk    ScriptID,  4
;;;			send     12
;;;			jmp      code_072a
;;;code_0622:
;;;			dup     
;;;			ldi      10
;;;			eq?     
;;;			bnt      code_063c
;;;			pushi    #init
;;;			pushi    4
;;;			pushi    2
;;;			pushi    1
;;;			pushi    0
;;;			pushi    1
;;;			pushi    2
;;;			pushi    2
;;;			pushi    0
;;;			callk    ScriptID,  4
;;;			send     12
;;;			jmp      code_072a
;;;code_063c:
;;;			dup     
;;;			ldi      5
;;;			eq?     
;;;			bnt      code_071d
;;;			pushi    #script
;;;			pushi    0
;;;			lag      global2
;;;			send     4
;;;			bnt      code_065e
;;;			pushi    #init
;;;			pushi    3
;;;			pushi    56
;;;			pushi    0
;;;			pushi    3
;;;			class    Narrator
;;;			send     10
;;;			jmp      code_072a
;;;code_065e:
;;;			pToa     talkScript
;;;			bnt      code_0678
;;;			pushi    1
;;;			push    
;;;			callk    IsObject,  2
;;;			bnt      code_0678
;;;			pushi    #setScript
;;;			pushi    1
;;;			pTos     talkScript
;;;			lag      global2
;;;			send     6
;;;			jmp      code_072a
;;;code_0678:
;;;			pushi    1
;;;			pushi    107
;;;			calle    proc819_5,  2
;;;			bnt      code_0696
;;;			pushi    #setScript
;;;			pushi    1
;;;			pushi    2
;;;			pushi    1
;;;			pushi    0
;;;			callk    ScriptID,  4
;;;			push    
;;;			lag      global2
;;;			send     6
;;;			jmp      code_072a
;;;code_0696:
;;;			pushi    1
;;;			pushi    143
;;;			calle    proc819_5,  2
;;;			bnt      code_0702
;;;			pushi    1
;;;			pushi    334
;;;			calle    proc819_5,  2
;;;			not     
;;;			bnt      code_0702
;;;			pushi    #has
;;;			pushi    1
;;;			pushi    26
;;;			lag      gEgo
;;;			send     6
;;;			bt       code_06c8
;;;			pushi    1
;;;			pushi    332
;;;			calle    proc819_5,  2
;;;code_06c8:
;;;			not     
;;;			bt       code_06e7
;;;			pushi    #has
;;;			pushi    1
;;;			pushi    27
;;;			lag      gEgo
;;;			send     6
;;;			bt       code_06e3
;;;			pushi    1
;;;			pushi    331
;;;			calle    proc819_5,  2
;;;code_06e3:
;;;			not     
;;;			bnt      code_0702
;;;code_06e7:
;;;			pushi    #init
;;;			pushi    4
;;;			pushi    2
;;;			pushi    79
;;;			pushi    81
;;;			callk    Random,  4
;;;			push    
;;;			pushi    1
;;;			pushi    0
;;;			pushi    1
;;;			pushi    2
;;;			pushi    2
;;;			pushi    0
;;;			callk    ScriptID,  4
;;;			send     12
;;;			jmp      code_072a
;;;code_0702:
;;;			pushi    #init
;;;			pushi    4
;;;			pushi    2
;;;			pushi    3
;;;			pushi    5
;;;			callk    Random,  4
;;;			push    
;;;			pushi    1
;;;			pushi    0
;;;			pushi    1
;;;			pushi    2
;;;			pushi    2
;;;			pushi    0
;;;			callk    ScriptID,  4
;;;			send     12
;;;			jmp      code_072a
;;;code_071d:
;;;			pushi    #doVerb
;;;			pushi    2
;;;			lsp      theVerb
;;;			lsp      param2
;;;			&rest    param3
;;;			super    Delph,  8
;;;code_072a:
;;;			toss    
;;;			ret     
;;;		)
;;;	)
	
	(method (setHeading param1)
		(return
			(if (!= heading param1)
				(super setHeading: param1 &rest)
			else
				(return heading)
			)
		)
	)
)

(instance stopGroop of Grooper
	(properties)
	
	(method (doit)
		(if
			(and
				(IsObject (gEgo cycler?))
				((gEgo cycler?) isKindOf: StopWalk)
			)
			(gEgo view: ((gEgo cycler?) vStopped?))
		)
		(super doit: &rest)
	)
)

(instance longSong of Sound
	(properties)
)

(instance longSong2 of Sound
	(properties)
)

(instance soundEffects of Sound
	(properties)
	
	(method (check)
		(DoSound sndUPDATE_CUES self)
		(if (self signal?)
			(self prevSignal: (self signal?) signal: 0)
			(cond 
				((> (self loop?) 1)
					(self loop: (- (self loop?) 1))
					(DoSound sndPLAY self 0)
				)
				((IsObject client) (client cue: self))
			)
		)
	)
)

(instance pointsSound of Sound
	(properties
		flags $0001
		number 900
		priority 15
	)
)

(instance ecoKeyDownHandler of EventHandler
	(properties)
)

(instance ecoMouseDownHandler of EventHandler
	(properties)
)

(instance ecoDirectionHandler of EventHandler
	(properties)
)

(instance eco of Game
	(properties)
	
	(method (init &tmp temp0)
		(= global227 1)
		(= global15 0)
		(= global16 725)
		(= gEcoWin ecoWin)
		(proc804_3)
		(= gDelph delph)
		(= gStopGroop stopGroop)
		(= global34 1)
		Smopper
		Polygon
		PolyPath
		EcoRoom
		IconBar
		Inv
		(ScriptID 982)
		RandCycle
		(super init:)
		(StrCpy @global42 {})
		(= gEcoDoVerbCode ecoDoVerbCode)
		(= gEcoFtrInit ecoFtrInit)
		((= gEcoKeyDownHandler ecoKeyDownHandler) add:)
		((= gEcoMouseDownHandler ecoMouseDownHandler) add:)
		((= gEcoDirectionHandler ecoDirectionHandler) add:)
		(= gPseudoMouse PseudoMouse)
		(self egoMoveSpeed: 3 setSpeed: 0)
		((= gEgo ego)
			moveSpeed: (self egoMoveSpeed?)
			cycleSpeed: (self egoMoveSpeed?)
		)
		(User canControl: 0 canInput: 0 alterEgo: gEgo)
		((= gLongSong longSong) owner: self init: flags: 1)
		((= gLongSong2 longSong2) owner: self init:)
		(= gSoundEffects soundEffects)
		(= global27 {x.yyy})
		(= gWaitC waitC)
		(= gArrowC arrowC)
		(= global22 4)
		(= global103 (DoSound sndGET_POLYPHONY))
		(= global102 (Graph grGET_COLOURS))
		(ecoWin
			color: 24
			back: 25
			innerBordColor: 15
			midBordColor: 7
			outerBordColor: 20
		)
		(gcWin
			color: (proc819_8 global224 global211)
			back: (proc819_8 global224 global211)
		)
		(invWin
			topBordHgt: 5
			botBordHgt: 26
			color: 0
			priority: -1
			back: (proc819_8 global210 global210)
			topBordColor: (proc819_8 global217 global201)
			lftBordColor: (proc819_8 global217 global216)
			rgtBordColor: (proc819_8 global216 global216)
			botBordColor: (proc819_8 global213 global213)
			insideColor: (proc819_8 global215 global215)
			topBordColor2: (proc819_8 global213 global213)
			lftBordColor2: (proc819_8 global216 global220)
			botBordColor2: (proc819_8 global217 global201)
			botBordColor2: (proc819_8 global217 global201)
			rgtBordColor2: (proc819_8 global217 global218)
		)
		(proc0_3)
		(Inv
			init:
			add:
				sodaCan
				certificate
				card
				beaker
				rag
				dishSoap
				frisbee
				mackeral
				scubaGear
				airTanks
				bikeCage
				conchShell
				trident
				sharpShell
				tweezers
				urchins
				waterPump
				spine
				screws
				goldMask
				starFish
				healingPotion
				hermetShell
				jar
				mirror
				boxKey
				steelCable
				float
				sawFishHead
				fishLure
				hackSaw
				sixPackRing
				transmitter
				scroll
				waterBottle
			eachElementDo: #highlightColor global207
			eachElementDo: #lowlightColor (invWin insideColor?)
			add: invLook invHand invSelect invHelp ok
			eachElementDo: #init
			window: invWin
			helpIconItem: invHelp
			selectIcon: invSelect
			okButton: ok
		)
		(GameControls
			window: gcWin
			add:
				iconOk
				(detailSlider
					theObj: self
					selector: 293
					topValue: 3
					yStep: (- 3 global87)
					bottomValue: 0
					yourself:
				)
				(volumeSlider
					theObj: self
					selector: 383
					topValue: (if (> global103 1) 15 else 1)
					bottomValue: 0
					yStep: (- 3 global87)
					yourself:
				)
				(speedSlider
					theObj: speedORama
					selector: 60
					yStep: (- 3 global87)
					yourself:
				)
				(iconSave theObj: self selector: 78 yourself:)
				(iconRestore theObj: self selector: 79 yourself:)
				(iconRestart theObj: self selector: 104 yourself:)
				(iconQuit theObj: self selector: 103 yourself:)
				(iconAbout
					theObj: (ScriptID 810 0)
					selector: 60
					yourself:
				)
				(iconHelp cursor: helpC)
			eachElementDo: #highlightColor -1
			eachElementDo: #lowlightColor -1
			helpIconItem: iconHelp
			curIcon: iconRestore
		)
		(= global104 (if (GameIsRestarting) 400 else 360))
		(self newRoom: 803)
	)
	
	(method (replay)
		(Palette palSET_INTENSITY 0 255 100)
		(if (== gNumber 540) (global2 notify: 1))
		(ecoStatusLine doit:)
		(if (User canControl:)
			(self setCursor: gCursorNumber)
		else
			(waitC init:)
		)
		(super replay:)
	)
	
	(method (startRoom param1 &tmp temp0 [temp1 20])
		(if gPseudoMouse (gPseudoMouse stop:))
		(if
			(and
				(gLongSong2 number?)
				(== (gLongSong2 prevSignal?) -1)
			)
			(gLongSong2 number: 0)
		)
		((ScriptID 806) doit: param1)
		(Format @temp1 0 0 98) ;800)
		(if
			(and
				(= temp0 (if global227 (FileIO fiEXISTS @temp1)))
				(!= (- (MemoryInfo 1) 2) (MemoryInfo 0))
				(proc255_0 0 1 81 {Who cares} 0 81 {Debug} 1)
			)
			(SetDebug)
		)
		(if temp0 ((ScriptID 800) init:))
		(if (== param1 320)
			(travelC cel: 2)
			(gGame setCursor: travelC)
		)
		(if (== param1 381)
			(travelC cel: 1)
			(gGame setCursor: travelC)
		)
		(super startRoom: param1)
		(if (proc999_5 param1 803 360)
			(ecoStatusLine disable:)
			(gIconBar disable:)
		else
			(ecoStatusLine enable:)
			(gIconBar enable:)
		)
	)
	
	(method (restart &tmp [temp0 30] [temp30 30] [temp60 30])
		(kernel_124 98 0 9 @temp0)
		(kernel_124 98 0 10 @temp30)
		(kernel_124 98 0 8 @temp60)
		(if
		(proc255_0 @temp0 81 @temp30 1 81 @temp60 0 82 813 0 0)
			(Palette palSET_INTENSITY 0 255 100)
			(ecoStatusLine doit:)
			(super restart:)
		)
	)
	
	(method (handleEvent pEvent &tmp pEventType pEventMessage temp2 [temp3 20])
		(super handleEvent: pEvent)
		((ScriptID 800) handleEvent: pEvent)
		(if (pEvent claimed?) (return 1))
		(pEvent claimed: 1)
		(Format @temp3 0 0 800)
		(= temp2 (if global227 (FileIO fiEXISTS @temp3) else 0))
		(= pEventType (pEvent type?))
		(= pEventMessage (pEvent message?))
		(return
			(cond 
				(
					(and
						(== pEventType evKEYBOARD)
						(== pEventMessage KEY_CONTROL)
					)
					(gGame quitGame:)
				)
				(
					(and
						(== pEventType evKEYBOARD)
						(== pEventMessage KEY_F2)
					)
					(cond 
						((gGame masterVolume:) (gGame masterVolume: 0))
						((> global103 1) (gGame masterVolume: 15))
						(else (gGame masterVolume: 1))
					)
				)
				(
				(or (not (User controls?)) (& (icon7 signal?) $0004)) 1)
				((== pEventType evKEYBOARD)
					(switch (pEvent message?)
						(KEY_TAB
							(if (not (& (icon5 signal?) $0004))
								(Inv showSelf: gEgo)
							)
						)
						(KEY_SHIFTTAB
							(if (not (& (icon5 signal?) $0004))
								(Inv showSelf: gEgo)
							)
						)
						(KEY_F1 (GameControls show:))
						(KEY_F5 (gGame save:))
						(KEY_F7 (gGame restore:))
						(KEY_F9 (gGame restart:))
						(KEY_ALT_n
							(if temp2
								(if (proc804_1 1536)
									((ScriptID 952) doit: @global42 0)
								else
									(proc255_0 0 2)
								)
							)
						)
						(else 
							(if temp2
								(pEvent claimed: 0)
								((ScriptID 800) handleEvent: pEvent)
							)
						)
					)
				)
				((and (== pEventType evMOUSEBUTTON) temp2) (pEvent claimed: 0) ((ScriptID 800) handleEvent: pEvent))
			)
		)
	)
	
	(method (setCursor cursorNumber &tmp theGCursorNumber)
		(= theGCursorNumber gCursorNumber)
		(= gCursorNumber cursorNumber)
		(if (IsObject cursorNumber)
			(cursorNumber init:)
		else
			(arrowC init:)
		)
		(return theGCursorNumber)
	)
	
	(method (quitGame &tmp [temp0 30] [temp30 30] [temp60 30])
		(kernel_124 98 0 6 @temp0)
		(kernel_124 98 0 7 @temp30)
		(kernel_124 98 0 8 @temp60)
		(super
			quitGame: (proc255_0 @temp0 81 @temp30 1 81 @temp60 0 82 813 0 0)
		)
	)
)

(instance soundReset of Code
	(properties)
	
	(method (doit param1)
		(if
		(and (== (param1 prevSignal?) -1) (param1 number?))
			(param1 number: 0)
		)
	)
)

(instance speedORama of Code
	(properties)
	
	(method (doit param1)
		(if argc
			(gGame egoMoveSpeed: param1)
			(gEgo
				moveSpeed: (gGame egoMoveSpeed?)
				cycleSpeed: (gGame egoMoveSpeed?)
			)
		)
		(gGame egoMoveSpeed?)
	)
)

(instance ok of IconI
	(properties
		view 951
		loop 4
		cel 0
		nsLeft 40
		signal $0043
		helpStr 11
	)
	
	(method (init)
		(self
			cursor: arrowC
			highlightColor: 0
			lowlightColor: (proc819_8 global216 global216)
		)
		(super init:)
	)
)

(instance invLook of IconI
	(properties
		view 951
		loop 0
		cel 0
		message 2
		helpStr 12
	)
	
	(method (init)
		(self
			cursor: eyeC
			highlightColor: 0
			lowlightColor: (proc819_8 global216 global216)
		)
		(super init:)
	)
)

(instance invHand of IconI
	(properties
		view 951
		loop 1
		cel 0
		message 3
		helpStr 13
	)
	
	(method (init)
		(self
			cursor: handC
			highlightColor: 0
			lowlightColor: (proc819_8 global216 global216)
		)
		(super init:)
	)
)

(instance invHelp of IconI
	(properties
		view 951
		loop 3
		cel 0
		message 6
	)
	
	(method (init)
		(self
			cursor: helpC
			highlightColor: 0
			lowlightColor: (proc819_8 global216 global216)
		)
		(super init:)
	)
)

(instance invSelect of IconI
	(properties
		view 951
		loop 2
		cel 0
		helpStr 14
	)
	
	(method (init)
		(self
			cursor: arrowC
			highlightColor: 0
			lowlightColor: (proc819_8 global216 global216)
		)
		(super init:)
	)
)

(class RInvItem of InvI
	(properties
		view 900
		loop 0
		cel 0
		nsLeft 0
		nsTop 0
		nsRight 0
		nsBottom 0
		state $0000
		cursor 8
		type $4000
		message 4
		modifiers $0000
		signal $0002
		helpStr 0
		maskView 0
		maskLoop 0
		maskCel 0
		highlightColor 0
		lowlightColor 0
		description 0
		owner 0
		script 0
		value 0
		cursorLoop 0
		cursorCel 0
	)
	
	(method (init)
		(= cursor invC)
		(super init: &rest)
	)
	
	(method (select)
		(if (super select: &rest)
			(invC cel: cursorCel)
			(invC loop: cursorLoop)
		)
	)
	
	(method (doVerb theVerb param2 &tmp temp0 temp1)
		(if (== theVerb 4)
			(= temp1
				(cond 
					(
						(<
							(= temp0
								(if (== param2 (gInv indexOf: self))
									220
								else
									(switch param2
										(10 10)
										(20 14)
										(19 11)
										(21 27)
										(18 25)
										(16 30)
										(14 32)
										(15 35)
										(13 38)
										(11 28)
										(0 153)
										(1 173)
										(2 171)
										(3 152)
										(34 165)
										(6 160)
										(7 161)
										(8 164)
										(5 154)
										(9 163)
										(12 189)
										(17 193)
										(22 196)
										(24 197)
										(25 198)
										(33 212)
										(28 204)
										(29 205)
										(30 207)
										(32 209)
										(27
											(if (== (float cel?) 6) 203 else 215)
										)
										(26
											(if (== (steelCable cel?) 11) 219 else 51)
										)
										(23
											(switch global233
												(0 155)
												(1 156)
												(else  157)
											)
										)
										(4
											(switch global232
												(2 169)
												(0 167)
												(else  6)
											)
										)
										(else  42)
									)
								)
							)
							100
						)
						3
					)
					((< temp0 200) 4)
					(else 5)
				)
			)
			(Narrator init: temp0 0 temp1)
		else
			(super doVerb: theVerb param2 &rest)
		)
	)
)

(instance sodaCan of RInvItem
	(properties)
	
	(method (doVerb theVerb)
		(switch theVerb
			(2 (Narrator init: 67 0 3))
			(3 (Narrator init: 68 0 3))
			(else 
				(super doVerb: theVerb &rest)
			)
		)
	)
)

(instance certificate of RInvItem
	(properties
		cel 1
		owner 400
		cursorLoop 1
		cursorCel 10
	)
	
	(method (doVerb theVerb)
		(switch theVerb
			(2 (Narrator init: 147 0 4))
			(3 (Narrator init: 172 0 4))
			(else 
				(super doVerb: theVerb &rest)
			)
		)
	)
)

(instance card of RInvItem
	(properties
		cel 2
		cursorLoop 1
		cursorCel 11
	)
	
	(method (doVerb theVerb)
		(switch theVerb
			(2 (Narrator init: 146 0 4))
			(3 (Narrator init: 170 0 4))
			(else 
				(super doVerb: theVerb &rest)
			)
		)
	)
)

(instance beaker of RInvItem
	(properties
		cel 4
		owner 400
		cursorCel 1
	)
	
	(method (doVerb theVerb)
		(switch theVerb
			(3 (Narrator init: 158 0 4))
			(2
				(if (proc819_5 8)
					(Narrator init: 19 0 3)
				else
					(Narrator init: 213 0 5)
				)
			)
			(else 
				(super doVerb: theVerb &rest)
			)
		)
	)
)

(instance rag of RInvItem
	(properties
		cel 6
		owner 400
		cursorCel 2
	)
	
	(method (show)
		(switch global232
			(1 (= loop 2) (= cel 3))
			(2 (= loop 0) (= cel 11))
			(3 (= loop 2) (= cel 9))
			(4 (= loop 2) (= cel 3))
			(else  (= loop 0) (= cel 6))
		)
		(if (== global232 2)
			(= cursorLoop 2)
			(= cursorCel 4)
		else
			(= cursorLoop 0)
			(= cursorCel 2)
		)
		(super show: &rest)
	)
	
	(method (doVerb theVerb param2 &tmp temp0 temp1)
		(switch theVerb
			(2
				(= temp1
					(cond 
						(
							(<
								(= temp0
									(switch global232
										(1 3)
										(2 143)
										(3 142)
										(4 3)
										(else  142)
									)
								)
								100
							)
							3
						)
						((< temp0 200) 4)
						(else 5)
					)
				)
				(Narrator init: temp0 0 temp1)
			)
			(3
				(switch global232
					(2 (Narrator init: 168 0 4))
					(0 (Narrator init: 166 0 4))
					(else  (Narrator init: 4 0 3))
				)
			)
			(4
				(switch param2
					(5
						(if (== global232 0)
							(Inv hide:)
							(= global232 2)
							(proc0_4 5 202)
							(localproc_41ec 187)
							(gEgo put: 5)
							(Inv showSelf: gEgo)
						)
					)
					(22
						(if (proc819_5 273)
							(Narrator init: 141 0 4)
						else
							(Inv hide:)
							(= global232 4)
							(proc0_4 5 273)
							(localproc_41ec 5)
							(Inv showSelf: gEgo)
						)
					)
					(25 (Narrator init: 57 0 3))
					(else 
						(super doVerb: theVerb param2 &rest)
					)
				)
			)
			(else 
				(super doVerb: theVerb param2 &rest)
			)
		)
	)
)

(instance dishSoap of RInvItem
	(properties
		cel 7
		cursorCel 3
	)
	
	(method (doVerb theVerb param2)
		(switch theVerb
			(2 (Narrator init: 144 0 4))
			(3 (Narrator init: 159 0 4))
			(4
				(if (== param2 4)
					(proc0_4 5 202)
					(if (== global232 0)
						(Inv highlightedIcon: rag hide: gEgo)
						(= global232 2)
						(gEgo put: 5)
						(localproc_41ec 187)
						(Inv showSelf: gEgo)
					)
				else
					(super doVerb: theVerb param2 &rest)
				)
			)
			(else 
				(super doVerb: theVerb param2 &rest)
			)
		)
	)
)

(instance frisbee of RInvItem
	(properties
		cel 8
		cursorCel 4
	)
	
	(method (doVerb theVerb)
		(switch theVerb
			(2 (Narrator init: 70 0 3))
			(3 (Narrator init: 71 0 3))
			(else 
				(super doVerb: theVerb &rest)
			)
		)
	)
)

(instance mackeral of RInvItem
	(properties
		cel 9
		cursorCel 5
	)
	
	(method (doVerb theVerb)
		(switch theVerb
			(2 (Narrator init: 72 0 3))
			(3 (Narrator init: 73 0 3))
			(else 
				(super doVerb: theVerb &rest)
			)
		)
	)
)

(instance scubaGear of RInvItem
	(properties
		loop 2
		cursorLoop 3
		cursorCel 6
	)
	
	(method (doVerb theVerb)
		(switch theVerb
			(2 (Narrator init: 109 0 4))
			(3
				(if (== gNumber 381)
					(Narrator init: 110 0 4)
				else
					(Narrator init: 111 0 4)
				)
			)
			(else 
				(super doVerb: theVerb &rest)
			)
		)
	)
)

(instance airTanks of RInvItem
	(properties
		loop 2
		cel 1
		cursorCel 8
	)
	
	(method (doVerb theVerb param2)
		(switch theVerb
			(2 (Narrator init: 78 0 3))
			(3 (Narrator init: 81 0 3))
			(else 
				(super doVerb: theVerb param2)
			)
		)
	)
)

(instance bikeCage of RInvItem
	(properties
		loop 2
		cel 4
		owner 180
		cursorCel 9
	)
	
	(method (doVerb theVerb param2)
		(switch theVerb
			(2
				(if (proc819_5 298)
					(Narrator init: 15 0 5)
				else
					(Narrator init: 15 0 3)
				)
			)
			(3 (Narrator init: 13 0 3))
			(4
				(switch param2
					(18
						(gEgo put: 18)
						(proc819_3 42)
						(Inv hide:)
						(localproc_41ec 48)
						(proc0_4 5 298)
						(Inv showSelf: gEgo)
						(proc0_5 10)
					)
					(else 
						(super doVerb: theVerb param2 &rest)
					)
				)
			)
			(else 
				(super doVerb: theVerb param2 &rest)
			)
		)
	)
)

(instance conchShell of RInvItem
	(properties
		loop 2
		cel 5
		owner 140
		cursorCel 10
	)
	
	(method (doVerb theVerb)
		(switch theVerb
			(2 (Narrator init: 20 0 3))
			(3 (Narrator init: 21 0 3))
			(else 
				(super doVerb: theVerb &rest)
			)
		)
	)
)

(instance trident of RInvItem
	(properties
		loop 2
		cel 6
		owner 120
		cursorCel 11
	)
	
	(method (doVerb theVerb)
		(switch theVerb
			(2 (Narrator init: 16 0 3))
			(3 (Narrator init: 17 0 3))
			(else 
				(super doVerb: theVerb &rest)
			)
		)
	)
)

(instance sharpShell of RInvItem
	(properties
		loop 2
		cel 7
		owner 222
		cursorCel 12
	)
	
	(method (doVerb theVerb param2)
		(switch theVerb
			(2 (Narrator init: 37 0 3))
			(3 (Narrator init: 39 0 3))
			(4
				(if (== param2 31)
					(proc0_4 5 289)
					(gEgo put: 31)
					(Inv hide:)
					(localproc_41ec 192)
					(gInv showSelf: gEgo)
					(proc0_5 13)
				else
					(super doVerb: theVerb param2 &rest)
				)
			)
			(else 
				(super doVerb: theVerb param2 &rest)
			)
		)
	)
)

(instance tweezers of RInvItem
	(properties
		loop 2
		cel 8
		owner 223
		cursorCel 13
	)
	
	(method (doVerb theVerb)
		(switch theVerb
			(2 (Narrator init: 31 0 3))
			(3 (Narrator init: 33 0 3))
			(else 
				(super doVerb: theVerb &rest)
			)
		)
	)
)

(instance urchins of RInvItem
	(properties
		loop 4
		owner 221
		cursorCel 14
	)
	
	(method (doVerb theVerb)
		(switch theVerb
			(2 (Narrator init: 34 0 3))
			(3 (Narrator init: 36 0 3))
			(else 
				(super doVerb: theVerb &rest)
			)
		)
	)
)

(instance waterPump of RInvItem
	(properties
		loop 4
		cel 1
		owner 335
		cursorCel 15
	)
	
	(method (doVerb theVerb)
		(switch theVerb
			(2 (Narrator init: 29 0 3))
			(3 (Narrator init: 30 0 3))
			(else 
				(super doVerb: theVerb &rest)
			)
		)
	)
)

(instance spine of RInvItem
	(properties
		loop 4
		cel 2
		owner 226
		cursorLoop 1
	)
	
	(method (doVerb theVerb)
		(switch theVerb
			(2 (Narrator init: 40 0 3))
			(3 (Narrator init: 41 0 3))
			(else 
				(super doVerb: theVerb &rest)
			)
		)
	)
)

(instance screws of RInvItem
	(properties
		loop 4
		cel 3
		owner 224
		cursorLoop 1
		cursorCel 1
	)
	
	(method (doVerb theVerb param2)
		(switch theVerb
			(2 (Narrator init: 24 0 3))
			(3 (Narrator init: 26 0 3))
			(4
				(if (== param2 10)
					(gEgo put: 18 0)
					(proc819_3 42)
					(Inv highlightedIcon: bikeCage hide:)
					(localproc_41ec 48)
					(proc0_4 5 298)
					(Inv showSelf: gEgo)
					(proc0_5 10)
				else
					(super doVerb: theVerb param2 &rest)
				)
			)
			(else 
				(super doVerb: theVerb param2 &rest)
			)
		)
	)
)

(instance goldMask of RInvItem
	(properties
		loop 4
		cel 4
		owner 160
		cursorLoop 1
		cursorCel 2
	)
	
	(method (doVerb theVerb)
		(switch theVerb
			(2 (Narrator init: 9 0 3))
			(3 (Narrator init: 194 0 4))
			(else 
				(super doVerb: theVerb &rest)
			)
		)
	)
)

(instance starFish of RInvItem
	(properties
		loop 4
		cel 5
		owner 160
		cursorLoop 1
		cursorCel 3
	)
	
	(method (doVerb theVerb)
		(switch theVerb
			(2 (Narrator init: 12 0 3))
			(3 (Narrator init: 195 0 4))
			(else 
				(super doVerb: theVerb &rest)
			)
		)
	)
)

(instance healingPotion of RInvItem
	(properties
		loop 4
		cel 6
		owner 180
		cursorLoop 1
		cursorCel 4
	)
	
	(method (doVerb theVerb param2)
		(switch theVerb
			(2 (Narrator init: 22 0 3))
			(3 (Narrator init: 23 0 3))
			(else 
				(super doVerb: theVerb param2 &rest)
			)
		)
	)
)

(instance hermetShell of RInvItem
	(properties
		loop 4
		cel 8
		owner 180
		cursorLoop 1
		cursorCel 6
	)
	
	(method (show)
		(switch global232
			(4
				(= loop 4)
				(= cel 7)
				(= cursorCel 5)
			)
			(else  (= loop 4) (= cel 8))
		)
		(super show: &rest)
	)
	
	(method (doVerb theVerb param2)
		(switch theVerb
			(2
				(if (proc819_5 273)
					(Narrator init: 43 0 3 store: 44)
				else
					(Narrator init: 43 0 3 store: 45)
				)
			)
			(3
				(if (proc819_5 273)
					(Narrator init: 47 0 3)
				else
					(Narrator init: 46 0 3)
				)
			)
			(4
				(switch param2
					(4
						(if (proc819_5 273)
							(Narrator init: 141 0 4)
						else
							(Inv hide:)
							(= cel 7)
							(= global232 4)
							(proc0_4 5 273)
							(localproc_41ec 5)
							(Inv showSelf: gEgo)
						)
					)
					(3 (Narrator init: 19 0 3))
					(else 
						(super doVerb: theVerb param2 &rest)
					)
				)
			)
			(else 
				(super doVerb: theVerb param2 &rest)
			)
		)
	)
)

(instance jar of RInvItem
	(properties
		loop 4
		cel 9
		owner 420
		cursorLoop 1
		cursorCel 7
	)
	
	(method (show)
		(switch global233
			(1
				(= loop 4)
				(= cel 11)
				(= cursorCel 8)
			)
			(2
				(= loop 6)
				(= cel 1)
				(= cursorCel 9)
			)
		)
		(super show: &rest)
	)
	
	(method (doVerb theVerb param2)
		(switch theVerb
			(2
				(switch global233
					(1 (Narrator init: 58 0 3))
					(2
						(if (== gNumber 540)
							(Narrator init: 245 0 5)
						else
							(Narrator init: 60 0 3)
						)
					)
					(else  (Narrator init: 61 0 3))
				)
			)
			(3
				(switch global233
					(0 (Narrator init: 66 0 3))
					(2
						(if (== gNumber 540)
							(Inv hide:)
							(global2 notify:)
						else
							(Narrator init: 214 0 5)
						)
					)
					(else  (Narrator init: 62 0 3))
				)
			)
			(else 
				(super doVerb: theVerb param2 &rest)
			)
		)
	)
)

(instance mirror of RInvItem
	(properties
		loop 6
		cel 2
		owner 420
		cursorLoop 1
		cursorCel 13
	)
	
	(method (doVerb theVerb param2)
		(switch theVerb
			(2 (Narrator init: 85 0 3))
			(3 (Narrator init: 86 0 3))
			(else 
				(super doVerb: theVerb param2)
			)
		)
	)
)

(instance boxKey of RInvItem
	(properties
		loop 6
		cel 4
		owner 460
		cursorLoop 1
		cursorCel 14
	)
	
	(method (doVerb theVerb param2)
		(switch theVerb
			(2 (Narrator init: 89 0 3))
			(4
				(switch param2
					(4 (Narrator init: 57 0 3))
					(else 
						(super doVerb: theVerb param2)
					)
				)
			)
			(3 (Narrator init: 90 0 3))
			(else 
				(super doVerb: theVerb param2)
			)
		)
	)
)

(instance steelCable of RInvItem
	(properties
		loop 6
		cel 5
		owner 480
		cursorLoop 1
		cursorCel 15
	)
	
	(method (doVerb theVerb param2)
		(switch theVerb
			(2
				(switch cel
					(11 (Narrator init: 201 0 5))
					(12 (Narrator init: 200 0 5))
					(else  (Narrator init: 91 0 3))
				)
			)
			(3
				(switch cel
					(11 (Narrator init: 216 0 5))
					(12 (Narrator init: 218 0 5))
					(else  (Narrator init: 92 0 3))
				)
			)
			(4
				(if (and (== cel 12) (!= param2 32))
					(Narrator init: 219 0 5)
				else
					(switch param2
						(27
							(Inv hide:)
							(gEgo put: 27)
							(proc0_4 5 331)
							(if (== (float cel?) 10)
								(= cel 11)
								(localproc_41ec 199)
							else
								(= cel 12)
								(localproc_41ec 50)
							)
							(Inv showSelf: gEgo)
						)
						(32
							(if (== cel 12)
								(Inv hide:)
								(= cel 11)
								(proc0_4 5 330)
								(gEgo put: 32)
								(localproc_41ec 210)
								(Inv showSelf: gEgo)
							else
								(Narrator init: 49 0 3)
							)
						)
						(30 (Narrator init: 103 0 4))
						(else 
							(super doVerb: theVerb param2)
						)
					)
				)
			)
			(else 
				(super doVerb: theVerb param2)
			)
		)
	)
)

(instance float of RInvItem
	(properties
		loop 6
		cel 6
		owner 500
		cursorLoop 2
	)
	
	(method (doVerb theVerb param2)
		(switch theVerb
			(2
				(if (== cel 10)
					(Narrator init: 202 0 5)
				else
					(Narrator init: 93 0 3)
				)
			)
			(3
				(if (== cel 10)
					(Narrator init: 217 0 5)
				else
					(Narrator init: 94 0 3)
				)
			)
			(4
				(switch param2
					(26
						(Inv highlightedIcon: steelCable hide:)
						(gEgo put: 27)
						(proc0_4 5 331)
						(if (== cel 10)
							(steelCable cel: 11)
							(localproc_41ec 199)
						else
							(steelCable cel: 12)
							(localproc_41ec 50)
						)
						(Inv showSelf: gEgo)
					)
					(32
						(Inv hide:)
						(= cel 10)
						(proc0_4 5 330)
						(gEgo put: 32)
						(localproc_41ec 52)
						(Inv showSelf: gEgo)
					)
					(else 
						(if (== (float cel?) 6)
							(Narrator init: 203 0 5)
						else
							(Narrator init: 53 0 3)
						)
					)
				)
			)
			(else 
				(super doVerb: theVerb param2)
			)
		)
	)
)

(instance sawFishHead of RInvItem
	(properties
		loop 6
		cel 8
		owner 343
		cursorLoop 2
		cursorCel 1
	)
	
	(method (doVerb theVerb)
		(switch theVerb
			(2
				(Narrator store: 98 init: 97 0 3)
			)
			(3 (Narrator init: 99 0 3))
			(else 
				(super doVerb: theVerb &rest)
			)
		)
	)
)

(instance fishLure of RInvItem
	(properties
		loop 8
		cel 10
		owner 343
		cursorLoop 1
		cursorCel 12
	)
	
	(method (doVerb theVerb)
		(switch theVerb
			(2 (Narrator init: 100 0 4))
			(3 (Narrator init: 101 0 4))
			(else 
				(super doVerb: theVerb &rest)
			)
		)
	)
)

(instance hackSaw of RInvItem
	(properties
		loop 6
		cel 9
		owner 500
		cursorLoop 2
		cursorCel 5
	)
	
	(method (doVerb theVerb param2)
		(switch theVerb
			(2 (Narrator init: 102 0 4))
			(3 (Narrator init: 104 0 4))
			(4
				(if (== param2 31)
					(Narrator init: 208 0 5)
				else
					(super doVerb: theVerb param2 &rest)
				)
			)
			(else 
				(super doVerb: theVerb param2 &rest)
			)
		)
	)
)

(instance sixPackRing of RInvItem
	(properties
		loop 8
		cel 5
		cursorLoop 2
		cursorCel 2
	)
	
	(method (doVerb theVerb param2)
		(switch theVerb
			(2 (Narrator init: 190 0 4))
			(3 (Narrator init: 191 0 4))
			(4
				(switch param2
					(13
						(proc0_4 5 289)
						(Inv highlightedIcon: sharpShell hide:)
						(localproc_41ec 192)
						(gEgo put: 31)
						(gInv showSelf: gEgo)
					)
					(30 (Narrator init: 208 0 5))
					(else 
						(super doVerb: theVerb param2)
					)
				)
			)
			(else 
				(super doVerb: theVerb param2)
			)
		)
	)
)

(instance transmitter of RInvItem
	(properties
		loop 2
		cel 2
		owner 400
		cursorCel 7
	)
	
	(method (doVerb theVerb param2)
		(switch theVerb
			(2 (Narrator init: 105 0 4))
			(3 (Narrator init: 106 0 4))
			(4
				(switch param2
					(26
						(if (== (steelCable cel?) 12)
							(Inv highlightedIcon: steelCable hide:)
							(steelCable cel: 11)
							(proc0_4 5 330)
							(gEgo put: 32)
							(localproc_41ec 210)
							(Inv showSelf: gEgo)
						else
							(Narrator init: 49 0 3)
						)
					)
					(27
						(Inv highlightedIcon: steelCable hide:)
						(float cel: 10)
						(proc0_4 5 330)
						(gEgo put: 32)
						(localproc_41ec 52)
						(Inv showSelf: gEgo)
					)
					(else 
						(super doVerb: theVerb param2)
					)
				)
			)
			(else 
				(super doVerb: theVerb param2)
			)
		)
	)
)

(instance scroll of RInvItem
	(properties
		loop 8
		cel 7
		owner 140
		cursorLoop 2
		cursorCel 3
	)
	
	(method (doVerb theVerb)
		(switch theVerb
			(2
				(cond 
					((or (== gNumber 345) (global2 script?)) (Narrator init: 64 0 3))
					((proc804_1 370) (Inv hide:) (global2 setScript: (ScriptID 816 0)))
					(else (Narrator init: 64 0 3))
				)
			)
			(3 (Narrator init: 211 0 5))
			(else 
				(super doVerb: theVerb &rest)
			)
		)
	)
)

(instance waterBottle of RInvItem
	(properties
		loop 8
		cel 9
		owner 620
		cursorCel 6
	)
	
	(method (doVerb theVerb)
		(switch theVerb
			(2 (Narrator init: 112 0 4))
			(3 (Narrator init: 113 0 4))
			(else 
				(super doVerb: theVerb &rest)
			)
		)
	)
)

(instance icon0 of IconI
	(properties
		view 950
		loop 9
		cel 0
		message 1
		signal $0041
		helpStr 15
		maskView 950
		maskCel 2
	)
)

(instance icon1 of IconI
	(properties
		view 950
		loop 1
		cel 0
		message 3
		signal $0041
		helpStr 16
		maskView 950
		maskLoop 1
		maskCel 2
	)
)

(instance icon2 of IconI
	(properties
		view 950
		loop 2
		cel 0
		message 2
		signal $0041
		helpStr 17
		maskView 950
		maskLoop 2
		maskCel 2
	)
)

(instance icon3 of IconI
	(properties
		view 950
		loop 3
		cel 2
		message 10
		signal $0045
		helpStr 18
		maskView 950
		maskLoop 3
		maskCel 3
	)
	
	(method (show)
		(if (proc819_5 15)
			(self loop: 3 cel: 0 maskLoop: 3 maskCel: 3 helpStr: 18)
			(if (& (icon0 signal?) $0004)
				(gIconBar disable: 6)
			else
				(gIconBar enable: 6)
			)
		else
			(self loop: 3 cel: 2 maskLoop: 3 maskCel: 3 helpStr: 19)
			(gIconBar disable: self)
		)
		(super show: &rest)
	)
)

(instance icon4 of IconI
	(properties
		view 950
		loop 4
		cel 0
		message 4
		signal $0041
		helpStr 20
		maskView 950
		maskLoop 4
		maskCel 2
	)
	
	(method (show)
		(if (not (gIconBar curInvIcon?))
			(gIconBar disable: self)
		)
		(super show: &rest)
	)
)

(instance icon5 of IconI
	(properties
		view 950
		loop 5
		cel 0
		type $0000
		message 0
		signal $0043
		helpStr 21
		maskView 950
		maskLoop 5
		maskCel 2
	)
	
	(method (select)
		(if (super select:) (Inv showSelf: gEgo))
	)
)

(instance icon6 of IconI
	(properties
		view 950
		loop 6
		cel 0
		message 5
		signal $0041
		helpStr 22
		maskView 950
		maskLoop 6
		maskCel 2
	)
)

(instance icon7 of IconI
	(properties
		view 950
		loop 7
		cel 0
		message 7
		signal $0043
		helpStr 23
		maskView 950
		maskLoop 7
		maskCel 2
	)
	
	(method (select)
		(if (super select:)
			(gIconBar hide:)
			(GameControls show:)
		)
	)
)

(instance icon9 of IconI
	(properties
		view 950
		loop 8
		cel 0
		message 6
		signal $0003
		helpStr 24
		maskView 950
		maskLoop 8
		maskCel 2
	)
)

(instance ecoDoVerbCode of Code
	(properties)
	
	(method (doit param1 param2)
		(switch param1
			(2
				(if
				(and (param2 facingMe: gEgo) (param2 lookStr?))
					(Narrator init: (param2 lookStr?))
				)
			)
			(10
				(Narrator init: (Random 121 124) 0 4)
			)
			(5
				(Narrator init: (Random 130 134) 0 4)
			)
			(3
				(if (and (== gNumber 380) (proc819_5 111))
					((ScriptID 2 1) init: 73 1 0 1)
				else
					(Narrator init: (Random 125 129) 0 4)
				)
			)
			(4
				(Narrator init: (Random 135 139) 0 4)
			)
		)
	)
)

(instance ecoFtrInit of Code
	(properties)
	
	(method (doit param1)
		(if (== (param1 sightAngle?) 26505)
			(param1 sightAngle: 90)
		)
		(if (== (param1 actions?) 26505) (param1 actions: 0))
	)
)

(instance ecoWin of EcoWindow
	(properties)
)

(instance invWin of InsetWindow
	(properties)
)

(instance gcWin of SysWindow
	(properties)
	
	(method (open &tmp [temp0 22])
		(self
			top: 39
			left: 64
			bottom: 140
			right: 253
			priority: 15
		)
		(super open:)
		(DrawCel 952 8 0 0 0 15)
	)
)

(instance detailSlider of Slider
	(properties
		view 952
		loop 7
		cel 0
		nsLeft 142
		nsTop 37
		signal $0080
		helpStr 25
		sliderView 952
		sliderLoop 7
		sliderCel 1
		topValue 3
	)
)

(instance volumeSlider of Slider
	(properties
		view 952
		loop 7
		cel 0
		nsLeft 27
		nsTop 37
		signal $0080
		helpStr 26
		sliderView 952
		sliderLoop 7
		sliderCel 1
		topValue 15
	)
)

(instance speedSlider of Slider
	(properties
		view 952
		loop 7
		cel 0
		nsLeft 88
		nsTop 25
		signal $0080
		helpStr 27
		sliderView 952
		sliderLoop 7
		sliderCel 1
		bottomValue 15
	)
)

(instance iconSave of ControlIcon
	(properties
		view 952
		loop 0
		cel 0
		nsLeft 12
		nsTop 9
		message 8
		signal $01c3
		helpStr 28
	)
)

(instance iconRestore of ControlIcon
	(properties
		view 952
		loop 1
		cel 0
		nsLeft 54
		nsTop 9
		message 8
		signal $01c3
		helpStr 29
	)
)

(instance iconRestart of ControlIcon
	(properties
		view 952
		loop 2
		cel 0
		nsLeft 119
		nsTop 9
		message 8
		signal $01c3
		helpStr 30
	)
)

(instance iconQuit of ControlIcon
	(properties
		view 952
		loop 6
		cel 0
		nsLeft 141
		nsTop 78
		message 8
		signal $01c3
		helpStr 31
	)
)

(instance iconAbout of ControlIcon
	(properties
		view 952
		loop 4
		cel 0
		nsLeft 66
		nsTop 78
		message 8
		signal $01c3
		helpStr 32
	)
)

(instance iconHelp of IconI
	(properties
		view 952
		loop 5
		cel 0
		nsLeft 103
		nsTop 78
		message 6
		signal $0183
	)
	
	(method (init)
		(= cursor helpC)
		(super init: &rest)
	)
)

(instance iconOk of IconI
	(properties
		view 952
		loop 3
		cel 0
		nsLeft 12
		nsTop 78
		message 8
		signal $01c3
		helpStr 33
	)
	
	(method (init)
		(= cursor arrowC)
		(super init: &rest)
	)
)

(instance ecoStatusLine of SL
	(properties)
	
	(method (doit &tmp temp0 [temp1 80])
		(kernel_124 98 0 34 @temp1)
		(= temp0 (Memory memALLOC_CRIT 82))
		(Format temp0 @temp1 global15 global16)
		(DrawStatus (if state temp0 else 0) global217 global210)
		(Memory memFREE temp0)
	)
)

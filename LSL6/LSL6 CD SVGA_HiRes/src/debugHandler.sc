;;; Sierra Script 1.0 - (do not remove this comment)
;;; Decompiled by sluicebox, use with SCICompanion decompile or update var names to match SCI-Scripts
(script# 911)
(include sci.sh)
(use Main)
(use fileScr)
;(use EditablePolygon)
(use Str)
(use Print)
(use CueObj)
(use File)
(use Obj)
(use ClickMenu)

(public
	debugHandler 0
	localproc_0 1
)

(local
	[local0 7]
	local7
	local1
)

(procedure (localproc_0 param1 &tmp temp0 temp1 temp2)
	(= temp2 (Str new: 6))
	(= temp1 0)
	(gLSL6 setCursor: gTheArrowCursor)
	(if
		(==
			(= temp1
;;;				(if (== gGLarryRoom 0) 
;;;					(Print
;;;					font: gPROPERTY_ACCESS_IN_NON_METHOD ;gUserFont
;;;					addText: {Your destination: }
;;;					addEdit: temp2 5 115 0
;;;					addButton: 100 {    Opening     } 19 20
;;;					addButton: 800 { Hotel Exterior } 19 38
;;;					addButton: 200 {     Lobby      } 19 56
;;;					;addButton: -100 {    Restore     } 19 74
;;;					init:
;;;				)
;;;				else
					(Print
						font: gPROPERTY_ACCESS_IN_NON_METHOD ;gUserFont
						addText: {Your destination: }
						addEdit: temp2 5 115 0
						addButton: 100 {    Opening     } 19 20
						addButton: 800 { Hotel Exterior } 19 38
						addButton: 200 {     Lobby      } 19 56
						addButton: -100 {    Restore     } 19 74
						init:
					)
;;;				)
			)
			-100
		)
		(gLSL6 restore:)
		(= temp1 0)
	)
	(if (temp2 size:)
		(= temp1 (temp2 asInteger:))
	)
	(if (or (< temp1 99) (> temp1 900))
		(= temp1 200)
	)
	(temp2 dispose:)
	(gLSL6 handsOff:)
	(if (and argc param1)
		(return temp1)
	else
		(gGLarryRoom newRoom: temp1)
	)
	(gLSL6 setCursor: gTheGameCursor)
)

(procedure (localproc_1 param1 param2 &tmp temp0 temp1) ; UNUSED
	(= temp0 (Str new:))
	(if (> argc 1)
		(temp0 format: {%d} param2)
	)
	(= temp1
		(if (proc64921_2 temp0 10 param1) ;get input
			(temp0 asInteger:)
		else
			-1
		)
	)
	(temp0 dispose:)
	(return temp1)
)

(procedure (localproc_2) ; UNUSED
	(if (proc64999_5 (gGLarryRoom style:) 16 15 17 18)
		(gGLarryRoom drawPic: (gGLarryRoom picture:) 0 style: 0)
	)
)

(instance debugHandler of Feature
	(properties
		y -1
	)

	(method (handleEvent event &tmp temp0 [temp1 3] temp4 temp5 [temp6 4] temp10 [temp11 8] temp19 temp20 temp21 temp22 temp23 temp24 temp25 temp26)
		(switch (event type:)
			(evKEYBOARD
				(event claimed: 1)
				(switch (event message:)
					(KEY_ALT_a
						(if (gNewCast size:)
							(= temp0 (Str newWith: 75 {}))
							(for
								((= temp10 (gNewCast first:)))
								temp10
								((= temp10 (gNewCast next: temp10)))
								
								(= temp5 (NodeValue temp10))
								(if (temp5 respondsTo: #cycler)
									(temp0
										format:
											{class: %s\nview: %d\nloop: %d\ncel: %d\nposn: %d %d %d\nheading: %d\npriority: %d\nfixPriority: %d\nsignal: $%x\ncycler: %s\nscript: %s }
											((temp5 -super-:) name:)
											(temp5 view:)
											(temp5 loop:)
											(temp5 cel:)
											(temp5 x:)
											(temp5 y:)
											(temp5 z:)
											(temp5 heading:)
											(temp5 priority:)
											(temp5 fixPriority:)
											(temp5 signal:)
											(and
												(temp5 cycler:)
												((temp5 cycler:) name:)
											)
											(and
												(temp5 script:)
												((temp5 script:) name:)
											)
									)
								else
									(temp0
										format:
											{class: %s\nview: %d\nloop: %d\ncel: %d\nposn: %d %d %d\nheading: %d\npriority: %d\nfixPriority: %d\nsignal: $%x\n}
											((temp5 -super-:) name:)
											(temp5 view:)
											(temp5 loop:)
											(temp5 cel:)
											(temp5 x:)
											(temp5 y:)
											(temp5 z:)
											(temp5 heading:)
											(temp5 priority:)
											(temp5 fixPriority:)
											(temp5 signal:)
									)
								)
								(if
									(not
										(Print
											width: 200
											addText: (temp0 data:)
											addTitle: (temp5 name:)
											addIcon:
												(temp5 view:)
												(temp5 loop:)
												(temp5 cel:)
												(+ (Print x:) 120)
												(+ (Print y:) 85)
											init:
										)
									)
									(break)
								)
							)
							(temp0 dispose:)
						else
							(Print addText: {== (cast size?) 0} init:)
							(return)
						)
					)
;;;					(KEY_ALT_h
;;;						(proc79_1 22) ;setflag
;;;						(gOldFeatures eachElementDo: #perform showFeatures)
;;;					)
;;;					(KEY_ALT_b
;;;						(if (= local1 (gNewCast contains: gEgo))
;;;							(gEgo hide:)
;;;						)
;;;						(PolyEdit doit:)
;;;						(if local1
;;;							(gEgo show:)
;;;						)
;;;					)
					(KEY_ALT_d
						(if (= global14 (not global14))
							(Print addText: {On} init:)
						else
							(Print addText: {Off} init:)
						)
					)
					(KEY_ALT_e
						(= temp5 (gUser alterEgo:))
						(= temp0 (Str newWith: 75 {}))
						(temp0
							format:
								{name: %s\nview: %d\nloop: %d\ncel: %d\nposn: %d %d %d\nheading: %d\npri: %d\nsignal: $%x\nscaleSignal: $%x\nscaleX: %d\nscaleY: %d\nmaxScale: %d\nscaleType: %d\nscript: %s\n}
								(temp5 name:)
								(temp5 view:)
								(temp5 loop:)
								(temp5 cel:)
								(temp5 x:)
								(temp5 y:)
								(temp5 z:)
								(temp5 heading:)
								(temp5 priority:)
								(temp5 signal:)
								(temp5 scaleSignal:)
								(temp5 scaleX:)
								(temp5 scaleY:)
								(temp5 maxScale:)
								(temp5 scaleType:)
								(if (temp5 script:)
									((temp5 script:) name:)
								else
									{..none..}
								)
						)
						(Print
							addText: (temp0 data:)
							addIcon:
								(temp5 view:)
								(temp5 loop:)
								(temp5 cel:)
								(+ (Print x:) 90)
								(+ (Print y:) 80)
							init:
						)
						(temp0 dispose:)
					)
					(KEY_ALT_f
						(= temp0 (Str newWith: 75 {}))
						(Print
							font: gPROPERTY_ACCESS_IN_NON_METHOD ;gUserFont
							y: 100
							addText: {Flag num?}
							addEdit: temp0 3 70 -1
							init:
						)
						(= temp10 (temp0 asInteger:))
						(temp0 dispose:)
						(if (gNewFlags test: temp10)
							(Print addText: {set} init:)
							(proc79_1 temp10) ;SetFlag
						else
							(Print addText: {cleared} init:)
							(proc79_2 temp10) ;ClearFlag
						)
					)
					(KEY_ALT_g
						(= temp0 (Str newWith: 75 {}))
						(Print
							font: gPROPERTY_ACCESS_IN_NON_METHOD
							y: 100
							addText: {Global num?}
							addEdit: temp0 3 70 -1
							init:
						)
						(= temp4 (temp0 asInteger:))
						(temp0 dispose:)
						(if (not temp4)
							(return)
						)
						(= temp0 (Str newWith: 75 {}))
						(Print
							font: gPROPERTY_ACCESS_IN_NON_METHOD
							y: 100
							addText: {Set to?}
							addEdit: temp0 3 70 -1
							init:
						)
						(= [gEgo temp4] (temp0 asInteger:))
						(temp0 dispose:)
					)
					(KEY_ALT_i
						(= temp26 gTheGameCursor)
						(gLSL6 setCursor: gTheGameCursor)
						(repeat
							(= temp22 (gLL6Inv first:))
							(= temp21 (= temp20 (= temp23 (= temp24 0))))
							(Print font: global23)
							(repeat
								(breakif (not temp22))
								(Print
									addButton:
										temp23
										((NodeValue temp22) name:)
										temp20
										temp21
								)
								((Print dialog:) setSize:)
								(if (> temp21 130)
									(= temp24 temp21)
									(= temp21 0)
									(= temp20
										(-
											((Print dialog:) nsRight:)
											((Print dialog:) nsLeft:)
										)
									)
								else
									(+= temp21 15)
								)
								(= temp22 (gLL6Inv next: temp22))
								(++ temp23)
							)
							(Print
								addButton:
									temp23
									{Outta Here}
									temp20
									(if temp24 temp24 else temp21)
							)
							(breakif (== (= temp25 (Print init:)) temp23))
							(if (== temp25 23)
								(switch
									(Print
										addButton: 2 {Empty} 0 0
										addButton: 0 {Full} 0 12
										addButton: 1 {Lit} 0 24
										init:
									)
									(0
										((gLL6Inv at: 23) noun: 13 message: 40) ; lamp
									)
									(1
										((gLL6Inv at: 23) noun: 20 message: 41) ; lamp
									)
									(2
										((gLL6Inv at: 23) noun: 19 message: 39) ; lamp
									)
								)
							)
							(if (== temp25 39)
								(switch
									(Print
										addButton: 0 {Dry} 0 0
										addButton: 1 {Wet} 0 12
										addButton: 2 {Cold} 0 24
										init:
									)
									(0
										((gLL6Inv at: 39) noun: 25 message: 35) ; washcloth
									)
									(1
										((gLL6Inv at: 39) noun: 50 message: 36) ; washcloth
									)
									(2
										((gLL6Inv at: 39) noun: 52 message: 37) ; washcloth
									)
								)
							)
							(gEgo get: temp25)
						)
						(Print font: gPROPERTY_ACCESS_IN_NON_METHOD)
						(gLSL6 setCursor: temp26)
					)
					(KEY_ALT_m
						(Print addTextF:
							{Current free memory: %u kBytes\nMax available: %u kBytes\nmachineSpeed: %d}
							(MemoryInfo 0)
							global260
							global87
						)
					)
					(KEY_ALT_l
						(= temp26 gTheGameCursor)
						(gLSL6 setCursor: gTheGameCursor)
						((ScriptID 64952) doit:) ; sysLogger
						(gLSL6 setCursor: temp26)
					)
					(KEY_ALT_q
						(Print
							font: gPROPERTY_ACCESS_IN_NON_METHOD
							addTextF: {Cur X: %d,Y: %d} (event x:) (event y:)
							init:
						)
					)
					(KEY_ALT_r
						(= temp0 (Str newWith: 75 {}))
						(temp0
							format:
								{name: %s\nscript: %s\nhorizon: %d\nvanishingX: %d\nvanishingY: %d\npicAngle: %d\nnorth: %d\nsouth: %d\neast: %d\nwest: %d\nstyle: %d\ncurPic: %d}
								(gGLarryRoom name:)
								(if (gGLarryRoom script:)
									((gGLarryRoom script:) name:)
								else
									{none}
								)
								(gGLarryRoom horizon:)
								(gGLarryRoom vanishingX:)
								(gGLarryRoom vanishingY:)
								(gGLarryRoom picAngle:)
								(gGLarryRoom north:)
								(gGLarryRoom south:)
								(gGLarryRoom east:)
								(gGLarryRoom west:)
								(gGLarryRoom style:)
								(gGLarryRoom curPic:)
						)
						(Print
							font: gPROPERTY_ACCESS_IN_NON_METHOD
							addText: (temp0 data:) 0 0
							addTitle: {Room info}
							init:
						)
						(temp0 dispose:)
					)
					(KEY_ALT_t
						(localproc_0)
					)
					(KEY_ALT_u
						(gLSL6 handsOn:)
					)
					(KEY_ALT_z
						(= global4 1) ;gQuit
					)
					(KEY_ALT_x
						(= global4 1)
					)
					(KEY_QUESTION
						(Print
							font: gPROPERTY_ACCESS_IN_NON_METHOD
							addText:
								{Debug Help\n\nALT-A Show Cast\nALT-D DebugOn toggle\nALT-E Ego Information\nALT-F Flag set/clr\nALT-G Global set\nALT-I Inv items\nALT-L Log file\nALT-M Memory\n... }
							init:
						)
						(Print
							font: gPROPERTY_ACCESS_IN_NON_METHOD
							addText:
								{ALT-Q show Cursor Coords\nALT-R Room info\nALT-T Teleport\nALT-U return User control\nALT-X I'm outta here\nALT-Z I'm outta here }
							init:
						)
					)
					($005c ; \
						(= temp0 (Str newWith: 75 {}))
						(Print
							font: gPROPERTY_ACCESS_IN_NON_METHOD
							y: 100
							addText: {Flag num?}
							addEdit: temp0 5 50
							init:
						)
						(= temp10 (temp0 asInteger:))
						(temp0 dispose:)
						(if (gNewFlags test: temp10)
							(Print addText: {Flag Currently Set} init:)
						else
							(Print addText: {Flag Currently Clear} init:)
						)
					)
					(else
						(event claimed: 0)
					)
				)
			)
		)
	)
)

(instance poly_pol of File
	(properties
		name {poly.pol}
	)
)

;;;(instance showFeatures of Code
;;;	(properties)
;;;
;;;	(method (doit param1 &tmp temp0 [temp1 2] temp3 temp4 temp5 temp6 temp7 temp8 temp9 temp10)
;;;		(cond
;;;			((not (param1 isKindOf: Feature)) 0)
;;;			((IsObject (= temp0 (param1 onMeCheck:)))
;;;				(= temp6 -1)
;;;				(= temp7 -1)
;;;				(= temp10 0)
;;;				(for
;;;					((= temp3 (temp0 points:)))
;;;					(< temp10 (temp0 size:))
;;;					((+= temp3 4))
;;;					
;;;					(= temp5 (Memory memPEEK (+ temp3 2)))
;;;					(= temp4 (Memory memPEEK temp3))
;;;					(if (and (!= temp6 -1) (!= temp7 -1))
;;;						(Graph grDRAW_LINE temp7 temp6 temp5 temp4 15 -1)
;;;					else
;;;						(= temp8 temp4)
;;;						(= temp9 temp5)
;;;					)
;;;					(= temp6 temp4)
;;;					(= temp7 temp5)
;;;					(++ temp10)
;;;				)
;;;				(Graph grDRAW_LINE temp9 temp8 temp5 temp4 15 -1)
;;;			)
;;;			((!= (param1 onMeCheck:) 0)
;;;				(Graph
;;;					grDRAW_LINE
;;;					(param1 nsTop:)
;;;					(param1 nsLeft:)
;;;					(param1 nsTop:)
;;;					(param1 nsRight:)
;;;					15
;;;					-1
;;;				)
;;;				(Graph
;;;					grDRAW_LINE
;;;					(param1 nsBottom:)
;;;					(param1 nsLeft:)
;;;					(param1 nsBottom:)
;;;					(param1 nsRight:)
;;;					15
;;;					-1
;;;				)
;;;				(Graph
;;;					grDRAW_LINE
;;;					(param1 nsTop:)
;;;					(param1 nsLeft:)
;;;					(param1 nsBottom:)
;;;					(param1 nsLeft:)
;;;					15
;;;					-1
;;;				)
;;;				(Graph
;;;					grDRAW_LINE
;;;					(param1 nsTop:)
;;;					(param1 nsRight:)
;;;					(param1 nsBottom:)
;;;					(param1 nsRight:)
;;;					15
;;;					-1
;;;				)
;;;			)
;;;		)
;;;		(Graph grUPDATE_BOX 0 0 190 320 1)
;;;	)
;;;)
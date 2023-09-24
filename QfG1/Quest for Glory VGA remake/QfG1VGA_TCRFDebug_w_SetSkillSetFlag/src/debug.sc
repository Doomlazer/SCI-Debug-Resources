;;; Sierra Script 1.0 - (do not remove this comment)
(script# 298)
(include sci.sh)
(use Main)
(use Class_255_0)
(use n814)
(use Print)
(use ClickMenu)
(use Class_948_0)
(use CueObj)
(use SysWindow)
(use User)
(use View)
(use Obj)

(public
	debugHandler 0
)

(local
	[local0 27]
)
(instance debugHandler of Feature
	(properties)
	
	(method (init)
		(super init:)
		(gMH addToFront: self)
		(gKH addToFront: self)
	)
	
	(method (dispose)
		(gMH delete: self)
		(gKH delete: self)
		(super dispose:)
		(DisposeScript 298)
	)
	
	(method (handleEvent pEvent &tmp n [temp0 160] temp160 newEvent gNewCastFirst theGFont temp164 temp165 temp166 temp167 temp168 temp169 temp170 temp171 temp172 temp173 temp174 userAlterEgo temp176 temp177 temp178 temp179 temp180)
		(switch (pEvent type?)
			(evKEYBOARD
				(pEvent claimed: 1)
				(switch (pEvent message?)
					(KEY_ALT_a
						(= gNewCastFirst (gNewCast first:))
						(while gNewCastFirst
							(= temp164 (NodeValue gNewCastFirst))
							(Format
								@temp0
								298
								1
								((temp164 -super-?) name?)
								(temp164 view?)
								(temp164 loop?)
								(temp164 cel?)
								(temp164 x?)
								(temp164 y?)
								(temp164 z?)
								(temp164 heading?)
								(temp164 priority?)
								(temp164 signal?)
								(if (temp164 isKindOf: Actor)
									(temp164 illegalBits?)
								else
									-1
								)
							)
							(if
								(not
									(Print
										addText:
											@temp0
											(CelWide
												(temp164 view?)
												(temp164 loop?)
												(temp164 cel?)
											)
											0
										window: SysWindow
										title: (temp164 name?)
										addIcon: (temp164 view?) (temp164 loop?) (temp164 cel?) 0 0
										init:
									)
								)
								(break)
							)
							(= gNewCastFirst (gNewCast next: gNewCastFirst))
						)
					)
					(KEY_ALT_b
						(proc921_1
							@temp0
							{Our hero has %d silvers and %d gold.}
							((gDropInv at: 0) amount?)
							((gDropInv at: 38) amount?)
						)
						((gDropInv at: 0) amount: (proc255_1 {Enter Silvers:}))
						((gDropInv at: 38) amount: (proc255_1 {Enter Gold:}))
					)
					(KEY_ALT_c (Show 4))
					(KEY_ALT_d
						(= temp0 0)
						(= temp0 (proc255_1 {Day number:}))
						(= global118 temp0)
						(= temp0 0)
						(= temp0 (proc255_1 {Hour: (1 - 24)}))
						(proc814_12 temp0)
					)
					(KEY_ALT_e
						(Format
							@temp0
							298
							2
							(gEgo name?)
							(gEgo view?)
							(gEgo loop?)
							(gEgo cel?)
							(gEgo x?)
							(gEgo y?)
							(gEgo z?)
							(gEgo heading?)
							(gEgo priority?)
							(gEgo signal?)
							(gEgo illegalBits?)
							(gEgo onControl:)
							(gEgo onControl: 1)
						)
						(Print
							addText: @temp0
							addIcon: (gEgo view?) (gEgo loop?) (gEgo cel?)
							init:
						)
					)
					(KEY_ALT_g
						(= temp0 0)
						(proc921_2 @temp0 6 {Variable No.})
						(= gNewCastFirst (ReadNumber @temp0))
						(= temp0 0)
						(proc921_2 @temp0 6 {Value})
						(= [gEgo gNewCastFirst] (ReadNumber @temp0))
						(= temp0 0)
					)
					(KEY_ALT_h
						(= temp0 0)
						(Print
							addText: {Global number:}
							addEdit: @temp0 6 0 12
							init:
						)
						(= gNewCastFirst (ReadNumber @temp0))
						(if (IsObject [gEgo gNewCastFirst])
							(Format
								@temp0
								{ Global %d: %s_}
								gNewCastFirst
								([gEgo gNewCastFirst] name?)
							)
						else
							(Format
								@temp0
								{ Global %d: %d_}
								gNewCastFirst
								[gEgo gNewCastFirst]
							)
						)
						(proc921_0 @temp0)
					)
					(KEY_ALT_i
						(= temp0 (proc255_1 {Inventory item #:}))
						(= temp166 (proc255_1 {Item quantity:}))
						(gEgo get: temp0 temp166)
					)
					(KEY_ALT_j
						(= gNewCastFirst 0)
						(while (< gNewCastFirst (gNewCast size?))
							(if
								(not
									(&
										((= temp164 (gNewCast at: gNewCastFirst)) signal?)
										$0004
									)
								)
								(Format
									@temp0
									298
									1
									((temp164 -super-?) name?)
									(temp164 view?)
									(temp164 loop?)
									(temp164 cel?)
									(temp164 x?)
									(temp164 y?)
									(temp164 z?)
									(temp164 heading?)
									(temp164 priority?)
									(temp164 signal?)
									(if (temp164 isKindOf: Actor)
										(temp164 illegalBits?)
									else
										-1
									)
								)
								(Print
									addText:
										@temp0
										(CelWide
											(temp164 view?)
											(temp164 loop?)
											(temp164 cel?)
										)
										0
									window: SysWindow
									title: (temp164 name?)
									addIcon: (temp164 view?) (temp164 loop?) (temp164 cel?) 0 0
									init:
								)
							)
							(++ gNewCastFirst)
						)
					)
					(KEY_ALT_k
						(= temp160 (GetPort))
						(SetPort 0)
						(= temp173 5)
						(= temp174 16)
						(= temp169 15)
						(= temp170 80)
						(= temp172 (+ temp169 (* 34 temp173)))
						(= temp171 (+ temp170 (* 10 temp174)))
						(= temp167
							(Graph grSAVE_BOX temp169 temp170 temp172 temp171 1)
						)
						(Graph grFILL_BOX temp169 temp170 temp172 temp171 1 255)
						(= temp168 0)
						(while (< temp168 256)
							(Graph
								grFILL_BOX
								(+ temp169 temp173 (* temp173 (/ temp168 8)))
								(+ temp170 temp174 (* 16 (mod temp168 8)))
								(+ temp169 temp173 temp173 (* temp173 (/ temp168 8)))
								(+ temp170 temp174 temp174 (* temp174 (mod temp168 8)))
								1
								temp168
							)
							(++ temp168)
						)
						(Graph grUPDATE_BOX temp169 temp170 temp172 temp171 1)
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
						(Graph grRESTORE_BOX temp167)
						(Graph grUPDATE_BOX temp169 temp170 temp172 temp171 1)
						(SetPort temp160)
					)
					(KEY_ALT_l
						(if (not global137)
							(proc921_0 {You don't know how to cast spells.})
						else
							(= temp165 (proc255_1 {Learn which spell?}))
							(if (and (>= temp165 17) (<= temp165 24))
								(gEgo learn: temp165 5)
								(proc921_0 {You've learned a new spell!})
								(proc0_3)
							else
								(proc921_0 {That isn't a spell.})
							)
						)
					)
					(KEY_ALT_m
						(= n (proc255_1 {Change which Stat/Skill?}))
						(= [gStrength n]
							(proc255_1 {Enter new value:} [gStrength n])
						)
					)
					(KEY_ALT_n
						(= gNewCastFirst (proc255_1 {Flag number?}))
						(= n
							(Print
								addText:
									(Format @temp0 {Flag %d is %d} gNewCastFirst (if (proc0_7 gNewCastFirst) 1 else 0))
								addButton: 1 {Set} 0 16
								addButton: 2 {Clear} 40 16
								;window: SysWindow
								init:
							)
						)
						(switch n
							(1
								(proc0_5 gNewCastFirst) ;set
							)
							(2 ;clear
								(proc0_6 gNewCastFirst)
							)
						)
					)
					(KEY_ALT_o
						((ScriptID 952) doit: @global42 0)
					)
					(KEY_ALT_p (Show 2))
					(KEY_ALT_q
						(gGame detailLevel: 1)
					)
					(KEY_ALT_r
						(Format
							@temp0
							298
							3
							(global2 name?)
							gModNum
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
						)
						(Print width: 120 addText: @temp0 init:)
						(gGame showMem:)
					)
					(KEY_ALT_s
						(= temp0 0)
						(if
							(Print
								addText: {Which Format?}
								addButton: 0 {String} 0 12
								addButton: 1 {Message} 50 12
								init:
							)
							(= temp176 (proc255_0 {Noun?} 0))
							(= temp177 (proc255_0 {Verb?} 0))
							(= temp178 (proc255_0 {Case?} 0))
							(= temp179 (proc255_0 {Sequence?} 0))
							(Message msgGET temp176 temp177 temp178 temp179 @temp0)
						else
							(proc921_2 @temp0 50 {String to display?})
						)
						(= temp169 (proc255_0 {Y Parameter?} 0))
						(= temp170 (proc255_0 {X Parameter?} 0))
						(= gNewCastFirst (proc255_0 {Box Width?} 0))
						(if
						(not (= theGFont (proc255_0 {Font Number?} 0)))
							(= theGFont gFont)
						)
						(Print
							posn: temp170 temp169
							width: gNewCastFirst
							font: theGFont
							addText: @temp0
							init:
						)
					)
					(KEY_ALT_t
						(if gDialog (gDialog dispose:))
						(Print
							addText: {Which room do you want?}
							addEdit: @temp0 6 115 35
							init:
						)
						(if
						(and temp0 (> (= gNewCastFirst (ReadNumber @temp0)) 0))
							(global2 newRoom: gNewCastFirst)
						)
					)
					(KEY_ALT_u (proc0_3))
					(KEY_ALT_v (Show 1))
					(KEY_ALT_w (Class_948_0 doit:))
					(KEY_ALT_x
						(= gNewCastFirst (proc255_1 {Set stats to what?}))
						(= temp165 0)
						(while (< temp165 20)
							(= [gStrength temp165] gNewCastFirst)
							(++ temp165)
						)
						(= global138 1900)
						(= global139 (proc814_21))
						(= global140 (proc814_20))
						(= global141 (proc814_22))
						(proc921_0 {Why, you feel better already!})
					)
					(KEY_ALT_y (PolyEdit doit:))
					(KEY_ALT_z (= global4 1))
					(KEY_QUESTION
						(proc921_0
							{Debug options:______(Page 1 of 5)\n\n___A - Show cast\n___B - Set ego's Bucks\n___C - Show control map\n___D - Set Date and time\n___E - Show ego info\n___F - Show feature outlines\n___G - Set global\n}
						)
						(proc921_0
							{Debug options:______(Page 2 of 5)\n\n___H - Show global\n___I - Get inventory item\n___J - Justify text on screen\n___K - Show palette\n___L - Learn a new spell\n___M - Set specific skill\n___N - Set/Clear flag\n}
						)
						(proc921_0
							{Debug options:______(Page 3 of 5)\n\n___O - QA Note Logger\n___P - Show priority map\n___Q - Set Detail to 1\n___R - Show room info/free memory\n___S - Show a string or message\n___T - Teleport\n___U - Give HandsOn\n}
						)
						(proc921_0
							{Debug options:______(Page 4 of 5)\n\n___V - Show visual map\n___W - Feature writer\n___X - make ego eXtra special\n___Y - Polygon Editor\n___Z - Quick quit\n}
						)
						(proc921_0
							{Debug options:______(Page 5 of 5)\n\n__A=Alt, C=Ctrl, L=Left shift, R=Right shift\n\n__Left click:\n____A_______Move ego\n____CL______Show ego\n____CR______Show room\n____CA______Show position\n}
						)
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
						(Format @temp0 298 4 (pEvent x?) (pEvent y?))
						(= temp160
							(Print
								posn: 160 10
								font: 999
								modeless: 1
								addText: @temp0
								init:
							)
						)
						(while (!= 2 ((= newEvent (Event new:)) type?))
							(newEvent dispose:)
						)
						(newEvent dispose:)
						(temp160 dispose:)
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
						(= x (gGame setCursor: 996))
						(= gNewCastFirst
							((= userAlterEgo (User alterEgo?)) signal?)
						)
						(userAlterEgo startUpd:)
						(while (!= 2 ((= newEvent (Event new:)) type?))
							(userAlterEgo x: (newEvent x?) y: (- (newEvent y?) 10))
							(Animate (gNewCast elements?) 0)
							(newEvent dispose:)
						)
						(newEvent dispose:)
						(gGame setCursor: temp180)
						(userAlterEgo signal: gNewCastFirst)
					)
				)
			)
		)
	)
)

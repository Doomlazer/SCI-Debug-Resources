Hero Quest (QfG1EGA) extended debugger commands

Copying the script.298 patch file into your game folder adds two new commands for manipulating game flags:

[Alt-F]		Toggle Flag
[Alt-G]		View Flag

Everything else is identical to the game's default debug script commands listed after the flag info below.

Event Flags
flags are assigned for every room after ego leaves it.
if these aren't set, then ego has never been in the room before.

	fBeenIn10 		;0
	fBeenIn11 		;1
	fBeenIn12 		;2
	fBeenIn13 		;3
	fBeenIn14 		;4
	fBeenIn15		;5
	fBeenIn16		;6
	fBeenIn17		;7
	fBeenIn18 		;8
	fBeenIn19 		;9
	fBeenIn20		;10 ;unused (Room 20 does not exist)
	fBeenIn21		;11
	fBeenIn22		;12
	fBeenIn23		;13
	fBeenIn24		;14
	fBeenIn25		;15
	fBeenIn26		;16
	fBeenIn27		;17
	fBeenIn28 		;18
	fBeenIn29 		;19
	fBeenIn30 		;20
	fBeenIn31 		;21
	fBeenIn32 		;22 ;unused (Room 32 is the Wizard's Game)
	fBeenIn33 		;23
	fBeenIn34 		;24
	fBeenIn35 		;25
	fBeenIn36 		;26
	fBeenIn37 		;27
	fBeenIn38 		;28
	fBeenIn39 		;29 ;unused
	fBeenIn40 		;30 ;unused
	fBeenIn41 		;31
	fBeenIn42 		;32
	fBeenIn43 		;33
	fBeenIn44 		;34
	fBeenIn45 		;35
	fBeenIn46 		;36 ;unused (deleted Goblin Cave scene)
	fBeenIn47 		;37 ;unused (deleted Goblin Cave scene)
	fBeenIn48 		;38 ;unused (deleted Goblin Cave scene)
	fBeenIn49 		;39 ;unused (deleted Goblin Cave scene)
	fBeenIn50 		;40 ;unused (deleted Goblin Cave scene)
	fBeenIn51 		;41
	fBeenIn52 		;42
	fBeenIn53 		;43
	fBeenIn54 		;44
	fBeenIn55 		;45
	fBeenIn56 		;46
	fBeenIn57 		;47
	fBeenIn58 		;48
	fBeenIn59 		;49 ;unused (Room 59 does not exist)
	fBeenIn60 		;50
	fBeenIn61 		;51
	fBeenIn62 		;52
	fBeenIn63 		;53
	fBeenIn64 		;54
	fBeenIn65 		;55
	fBeenIn66 		;56
	fBeenIn67 		;57
	fBeenIn68 		;58
	fBeenIn69 		;59
	fBeenIn70 		;60 ;unused
	fBeenIn71 		;61
	fBeenIn72 		;62
	fBeenIn73 		;63 ;unused
	fBeenIn74 		;64
	fBeenIn75 		;65
	fBeenIn76 		;66
	fBeenIn77 		;67
	fBeenIn78 		;68
	fBeenIn79 		;69
	fBeenIn80 		;70
	fBeenIn81 		;71 ;log crossroads
	fBeenIn82 		;72
	fBeenIn83 		;73
	fBeenIn84 		;74
	fBeenIn85 		;75
	fBeenIn86 		;76
	fBeenIn87 		;77
	fBeenIn88		;78
	fBeenIn89		;79
	fBeenIn90		;80 ;unused
	fBeenIn91		;81
	fBeenIn92 		;82
	fBeenIn93		;83
	fBeenIn94		;84
	fBeenIn95 		;85 ;unused
	fBeenIn96 		;86
	fBeenIn97		;87
	fBeenIn300		;88
	fBeenIn301		;89
	fBeenIn310		;90
	fBeenIn311		;91
	fBeenIn313		;92
	fBeenIn314 		;93
	fBeenIn320		;94
	fBeenIn321 		;95
	fBeenIn322 		;96
	fBeenIn330 		;97
	fBeenIn331 		;98
	fBeenIn332 		;99
	fBeenIn333		;100
	fBeenIn334		;101
)

;These are event flags.  They are used to track certain On/Off actions throughout the game.	
(enum 110
	fWornOut		 	;110
	fHaveOrdered	 		;111
	fShemaBringsOrder 		;112
	fTookBarNote 			;113
	fBeenInGraveyardNight		;114	;NOTE: this VISITED flag is outside of the regular visited flags.
	fMerchantAtInn	 		;115
	fMetMerchant			;116
	fBarThrownOut 			;117
	fBarDrunk 			;118
	fMetShopkeeper			;119
	fPurchasedFromShop 		;120
	fUnused121 			;121 ;unused
	fRentedRoom			;122
	fLearnedThiefPassword 		;123
	fHungry		 		;124
	fStarving	 		;125
	fAmbushedAlley			;126
	fSignedLogbook 			;127
	fSleptAtInn 			;128
	fSaveAllowed 			;129	; game saving is disabled in certain rooms, like during battles.
	fSearchedCouch 			;130
	fSearchedBasket 		;131
	fSearchedPurse 			;132
	fStoleCandles 			;133
	fSearchedDesk 			;134
	fUncoveredCage 			;135
	fGotSeed			;136
	fKilledFlower1 			;137
	fKilledFlower2 			;138
	fKilledFlower3 			;139
	fPickedEranaFlowers 		;140
	fLearnedCalm			;141
	fErasmusWarpOut 		;142
	fWrongAnswer 			;143
	fSearchedDrawer 		;144
	fSearchedSafe 			;145
	fUnused146			;146 ;unused
	fGotKoboldKey		 	;147
	fHaveToadstools		 	;148	; replaced flag 174 in 1.200
	fBearCaveMessage 		;149	; used to trigger the inital entrance message
	fKoboldDead		 	;150
	fKoboldChestUnlocked		;151
	fUnused152			;152 ;unused
	fKoboldAwake 			;153
	fAttackedErasmus 		;154
	fSawRedSign			;155
	fSawGreenSign 			;156
	fUnused157			;157 ;unused	
	fMantrayLeft 			;158
	fMantrayRight 			;159
	fBearFriendly 			;160
	fBearGone 			;161
	fUnused162			;162 ;unused
	fUnused163			;163 ;unused
	fGhostsAttack 			;164
	fTookToadstools 		;165
	fFightingKobold 		;166
	fMetBear			;167
	fGhostOil		 	;168	;protected by Undead Unguent
	fBearDying			;169
	fSavedBarnard			;170
	fMetSkull			;171
	fHutOnGround			;172
	fBabaFlyAway			;173
	fKoboldCastingReversal		;174	; originally used for checking if player has Kobold Toadstools
	fKoboldChestSearched		;175
	fFirstTimeIn67			;176
	fSecondTimeIn67			;177
	fUnused178			;178 ;unused
	fStoleVase 			;179
	fMovedVase 			;180
	fStoleCandelabra 		;181
	fStoleMusicBox 			;182
	fUncoveredSafe 			;183
	fCrackedSafe 			;184
	fUnused185			;185 ;unused
	fMetFairies 			;186
	fDancing 			;187
	fFaeryAttention		 	;188
	fKarlAttention 			;189
	fClimbedSpireaLedge		;190
	fLeftTown			;191
	fFlowersInactive		;192
	fOttoAwakened 			;193
	fOpenMusicBox 			;194
	fOttoClosedMusicBox 		;195
	fWokeUpSheriff 			;196
	fMetDryad 			;197
	fAgreedToHelpDryad 		;198
	fLeftTown2 			;199
	fUnused200			;----------- event 200 is unused
	fLearnedDispel 			;201
	fStagHere 			;202
	fStagHurt 			;203
	fAntwerpInSky 			;204
	fOverloaded			;205
	fAntwerpSplit 			;206
	fMetFox 			;207
	fGotGem 			;208
	fLookedInNest 			;209
	fGotRing 			;210
	fFlag211 			; event 211 is tested outside Healer's house, but is never set
	fNestAbandoned 			;212
	fHitByGiant 			;213
	fUnused214			;214 ;unused
	fBarnardReward			;215
	fKoboldChestKnown		;216
	fStableClean 			;217
	fGaveDust		 	;218
	fGaveFur 			;219
	fGaveFlowers 			;220
	fGaveAcorn 			;221
	fGaveWater 			;222
	fHealerMakingDispel 		;223
	fGotDispel 			;224
	fMetHealer 			;225
	fStolePotions		 	;226	; banned from Healer's hut
	fGotFur 			;227
	fLearnedDetect 			;228
	fMetStableman 			;229
	fReturnedRing 			;230
	fUnused231			;231 ;unused
	fFoundGoblinHideout 		;232
	fMonsterDazzled			;233
	fUnused234			;234 ;unused
	fSpiedOnThieves 		;235
	fLadderKnown 			;236
	fMinotaurDead	 		;237	; He's not actually dead, just unconscious
	fBrigGateOpen	 		;238
	fMasterIsHere			;239
	fDeadlyTP 			;240	; teleported dangerously away by henry.
	fSafeTP 			;241	; teleported away safely by Henry
	fAskedForTrigger 		;242
	fMasterShowedOff 		;243
	fBrigsBehindLog 		;244
	fGotBrutusKey 			;245
	fLakeEasterEgg 			;246
	fHidenGoseke 			;247
	fDiedInBattle		 	;248
	fBeatMaster 			;249
	fBeatFred 			;250
	fBeatFred89 			;251
	fTrollDoorUnlocked 		;252
	fTrollDoorOpen 			;253
	fEgoSitting	 		;254
	fOrderedDrink			;255
; Events 256-260 are related to Yorick's maze
	fFallTrapdoor			;256
	fOpeningDoor			;257
	fFallingOffLedge		;258
	fPulledChain			;259
	fRollingOut			;260
	fBeatBrutus			;261
	fLearnedTrigger			;262
	fGoThruDoorway			;263 (used in Yorrick's room)
	fFakeDoorDown			;264 (used in brigandDoorFall)
	fYorickThrewSomething		;265 (used in Yorrick's room) 
	fErasmusAskedMaze 		;266
	fNoMoreTalking 			;267
	fYorickLikesYou 		;268 ;original Sierra name
	fBallConks			;269 ; set in brigandHappyFace
	fFallTrap4			;270 ; set in brigandFallSideways
	fYorickThrows			;271 (tested in Yorrick's room)
	fClimbedHenryCliff		;272
	fSavedElsa 			;273
	fEgoKnockedOffCliff		;274 used in hermitHits
	fKnockedOnHenryDoor 		;275
	fEgoSquashed			;276 used in hermitHits
	fLeavingCastle			;277 used in healerGetNest
	fClimbedTree			;278
	fHaveFaeryShrooms		;279
	fDartReversed			;280 (set in Kobold Flame Dart)
	fKoboldProtected		;281 (set in Kobold Flame Dart)
	fKoboldChestExploded 		;282
	fDartOnKobold			;283 (cleared in Kobold Flame Dart)
	fUnused284			;284 ;unused
	fUnused285			;285 ;unused
	fUnused286			;286 ;unused
	fUnused287			;287 ;unused
	fUnused288			;288 ;unused
	fUnused289			;289 ;unused
	fUnused290			;290 ;unused
	fUnused291			;291 ;unused
	fUnused292			;292 ;unused
	fUnused293			;293 ;unused
	fUnused294			;294 ;unused
	fUnused295			;295 ;unused
	fUnused296			;296 ;unused
	fUnused297			;297 ;unused
	fUnused298			;298 ;unused
	fSlinkWarned			;299
	fShameenStands	 		;300
	fShemaAsks		 	;301
	fEatenAtInn 			;302
	fSittingAtInn			;303
	fStopFightingMaster	 	;304
	fMetMeepBoss 			;305
	fUnused306			;306 ;unused
	fUnused307			;307 ;unused
	fUnused308			;308 ;unused
	fUnused309			;309 ;unused
	fUnused310			;310 ;unused
	fUnused311			;311 ;unused
	fTalkedToBear			;312
	fUnused313			;313 ;unused
	fUnused314			;314 ;unused
	fUnused315			;315 ;unused
	fUnused316			;316 ;unused
	fUnused317			;317 ;unused
	fUnused318			;318 ;unused
	fUnused319			;319 ;unused
	fUnused320			;320 ;unused
	fOfferedTraining 		;321
	fUnused322			;322 ;unused
	fFarmerIsEast 			;323
	fBrutusWaits			;324
	fBabaFrog 			;325
	fBabaCurse	 		;326
	fAteFaeryShrooms 		;327
	fInMainGame 			;328 ;This flag is set when we're in the game proper.
	fHaveFlyingWater		;329
	fHaveLakeWater 			;330
	fBeatOgre 			;331
	fOpenedOgreChest 		;332
	fSearchedOgreChest	 	;333
	fHealerKnowsDispel		;334
	fSearchedFredTreasure 		;335
	fGaveSkullGem	 		;336
	fStopMaze 			;337
	fFedHenry		 	;338 ;Can sleep at the Hermit's cave with this flag set
	fUnused339			;339 ;unused 
	fShavedFred 			;340
	fOgreGone 			;341	; Ogre disappears day after his death
	fUnused342			;342 ;unused
	fUnused343			;343 ;unused
	fUnused344			;344 ;unused
	fFastEgo			;345 (unused in 1.200)
	fUnused346			;346 ;unused
	fGenerousToMerchant 		;347
	fBrigsUnaware			;348
	fUnused349			;349 ;unused
	fUnused350			;350 ;unused
	fMantrayDies			;351 set in arenaMantrayFight after killing the mantaray
	fHenryDoorOpen 			;352
	fWizKnowsEgoHasMagic		;353
	fMetGargoyle			;354
	fReadBarnardBulletin 		;355


http://sciwiki.sierrahelp.com//index.php?title=SCI_Debug_Modes#Quest_for_Glory_.2F_Hero.27s_Quest

Quest for Glory / Hero's Quest
To activate the debug mode, type: "razzle dazzle root beer"

Command	Action
[ALT + P]	Show priority screen
[ALT + C]	Show control lines
[ALT + V]	Show visual screen
[ALT + S]	Show cast (information about all objects on screen)
[ALT + M]	Show memory
[ALT + T]	Teleport (change room/scene/script)
[ALT + I]	Gives inventory item
[ALT + E]	Show ego information
[ALT + B]	Change amount of silvers
[ALT + X]	Sets all stats to 80
[ALT + K]	Change value of skills
[SHIFT + /]	Help


===============
INVENTORY ITEMS
===============

Silver coin	1
Gold coin 	2
Food Ration	3
Mandrake Root 	4
Large Brass Key	5
Broadsword	6
Dagger		7
Leather Armor	8
Shield		9
Piece of Paper	10
Small Apple	11
Vegetable	12
Glowing Gem	13
Alabaster Vase	14
Candelabra	15
Music Box	16
SilverCandlestick 17
Sting Of Pearls	18
Gold Ring	19
Spirea Seed	20
Small Rock	21
Beautiful Flower 22
Lock Pick	23
Thief's Tool Kit 24
Thief's Guild License 25
Empty Flask	26
Handful of Green Fur 27
Flask of Fairy Dust 28
FLask of Water	29
Mushroom	30
Cheetaur Claw	31
Troll Beard	32
Chainmail Armor	33
Potion of Healing 34
Potion of Magic Power 35
Vigor Potion	36
aa		37
Dispel Potion	38
Flask of Undead Unguent 39
Hand Mirror	40
Magic Acorn	41



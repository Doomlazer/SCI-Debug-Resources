Leisure Suit Larry 3 extended debug commands:

Copying script.020 into the LSL3 game folder enables two additional debugging commands for working with flags:

[ALT + H]	Toggle Flag Number	 
[CTRL + H]	Test Flag Number

Otherwise everything is identical to the existing debug features mentioned below the flag info.

fUnused0		;0
fUnused1		;1
fUnused2		;2
fSaveDisabled		;3
fAutoSaveDisabled	;4
fCursorHidden		;5
fDrankRiverWater	;6
fDrankFountainWater	;7
fNotShower		;8
fMetPatti		;9
fNotUseSoap		;10
fGotSuntan		;11
fLookedInCasinoMirror	;12
fAlAndBill		;13
fQAEnabled		;14 ;this is tested in an alternate debug script (22) but is never set
fFlag15			;15 ;this is tested a few times, but is never set
fLookedInBinoculars	;16
fOpening200		;17
fLookedAtPlaque		;18
fOpening210		;19
fBrokeUp		;20
fBackInLeisureSuit	;21	
fFired			;22
fRolledOut		;23
fCredits200		;24
fCredits210		;25
fCredits213		;26
fCredits216		;27
fCredits220		;28
fCredits250		;29
fCredits253		;30
fCredits230		;31 ;Used in Amiga
fLookedAtTawni		;32
fBeenInLockerRoom	;33
fBeenInTanningRoom	;34
fScrewedCherri		;35
fBeenInChipAndDales	;36
fPassedMaze		;37
fMetSuzi		;38
fDriedWithTowel		;39
fUnlockedLocker		;40
fWoreSweatsuit		;41
fFilledBottleWithWater	;42
fListenedToComedian	;43
fLearnedLockerCombO	;44
fScrewedSuzi		;45
fGaveTicketToMaitreD	;46
fGaveMoneyToMaitreD	;47
fMetCherri		;48
fShowerOn		;49
fWet			;50
fLockerRobbed		;51
fScrewedBambi		;52
fBambiGone		;53 ;if you don't meet her after exercising
fGotOrchide		;54
fMadeLei		;55
fMetDale		;56
fUnused57		;57
fGotPot			;58
fWoreGrassSkirt		;59
fUsedDeodorant		;60
fMetTawni		;61
fNotUseDeodorant	;62
fEnteredElevator	;63
fBillAndJodi		;64
fGaveHeadToDoorman	;65
fGaveWineToPatti	;66
fGotTipJar		;67
fBeatFeralPig		;68
fSkippedLoveScene	;69
fFoundGymKeyAccidentally;70
fMetBambi		;71
fRemovedPantyhose	;72
fRemovedBra		;73
fCoconutsInBra		;74
fBraPoints		;75
fCoconutPoints		;76
fSkippedRafting		;77




To activate the debug mode, type: "ascot backdrop". The debug mode will be activated changing rooms.

Said Commands:
TP		Teleport (change room/scene/script)
PITCH [item]	Drop item *use item names not numbers
GET [item]	Get item *see above
	 
Key Commands:
[ALT + W]	Write to log	 
[ALT + E]	Change ego view	 
[ALT + R]	Show current room number	 
[ALT + T]	Show time ime until orchids wilt
[ALT + P]	Show priority screen	 
[ALT + S]	Change from Larry to Patty or vice versa	 
[ALT + D]	Internal debug mode	 
[ALT + F]	Internal debug on next room change	 
[ALT + G]	Room tester *see notes below
[ALT + M]	Show memory

[ALT + C]	Show control lines
[ALT + V]	Show visual (normal graphics)	 
[ALT + P]	Show Priority 

[ALT + X]	Quit game
[ALT + Z]	Quit game

[CTRL + T]	Teleport
[CTRL + D]	Toggle program control OFF or ON + TELEPORT
[CTRL + E]	Show ego information

Mouse events:
[shift + click]	Show mouse x/y
[CTRL + click] Move ego to mouse x/y

 
Notes: 

Before Room Tester will work, you'll have to place the SCI picture resource of the room you want to test in the game directory and rename it to "PIC.999". That specific picture/room will be shown and can be tested in the game.

The debug mode has some extra effects, for example limiting the actions required at the gym to five times and giving extra debug information at some parts, like the copy-protection sequence in the casino.

It also activates some "game state" modifiers. In the casino, go upstairs and walk to the right, to the room with mirror and bar entrance to use the following commands:

Command	Action
INCREASE BACKSTAGE	Change (increase) state of showroom (Cherri Tart)
INCREASE NEWSPAPER	Change (increase) state of newspaper (messages)
INCREASE LAWYER	Change (increase) state of lawyer (Suzi Cheatem)

Finally, setting flag 14 (using the ExtendedCommands patch) adds two new, but mostly useless debug commands:
[ALT + N] 	write notes to NOTELSL3 in game folder
[ALT + I] 	Set (User canInput: TRUE)

Additional info:
http://sciwiki.sierrahelp.com//index.php?title=SCI_Debug_Modes#Leisure_Suit_Larry_3




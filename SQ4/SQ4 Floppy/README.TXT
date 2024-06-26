Debugger for Space Quest IV Floppy version 1.052

While a leaked beta version of SQ4 included a debugger, it was removed from the floppy version. This is a port of that beta debugger.

Technical Note: For some reason SCICompanion can't compile the SQ4 floppy main script as a patch file, so to allow for this to work, Game::handleEvent passes events to the debug script. Because of this the debugger does not include the traditional "Where to?" at the start of the game - just use TP instead.


============
INSTALLATION 
============

Copy script.800, text.800, and script.994 to your SQ4 game folder and start normally. This patch only works with the Floppy version. 

To uninstall, remove the patch files.

Command	Action	Notes
[ALT + A]	Show cast information	 
[ALT + C]	Show control map	 
[ALT + E]	Show ego information
[ALT + F]	Clear/Set Flag (not in Beta debugger, added 10/8/2022)	 
[ALT + G]	Set global variable
[ALT + H]	show memory (swapped from Alt+F for reasons)
[ALT + I]	Get inventory item
[ALT + K]	show Palette
[ALT + M]	Gives 20 buckazoids/money
[ALT + P]	Show priority map	 
[ALT + R]	Show room info
[ALT + T]	Teleport	 
[ALT + Y]	Adjust vanishing point	 
[ALT + Z]	Exit game


===========
Event Flags
===========
Taken from here:
https://github.com/EricOakford/SCI-Decompilation-Archive/blob/master/sq4cd/src/game.sh 

fPoliceLanded			0
fFindTimepod			1
fTimeTravel			2
fSpOnBelt 			3
fSlugBait			4
fTimepodInArcade		5
fTallGuyBrokeSign		6
fMeltedLock			7
fSocksClosed			8
fArcadeClosed			9	;NOTE: This flag is tested, but never set, so the arcade is never closed.
fBigTallClosed			10
fMonolithBurgerClosed		11
fRadioShockClosed		12
fSoftwareExcessClosed		13
fUnused14			14
fMetBikers			15
fPoliceArrive			16
fBoughtNewPants			17
fExitedSewers			18
fPoliceAtArcade			19
fPoliceAtCeiling		20
fIsVGA				21
fPoliceInSkateORama		22
fPoliceAtMallEntrance		23
fBeenAtSoftwareExcess		24
fFreaksAtSoftwareExcess		25
fFirstTimeTravel		26
fDeletedKQ43			27
fDeletedLL4			28
fFlag29				29	;NOTE: This flag is tested in rm371's doit: and the Monolith Burger minigame warning, but is never set
fPoliceLookForEgo		30
fBoughtHintbook			31
fMeetLatexBabes			32
fATMCardDeclined		33
fFindSecretButton		34
fEnterArcadeTimepod		35
fEscapeMall			36
fSpFellInNest			37
fDeletedDroids			38
fGetRope			39
fGetLaptop			40
fCatchBunny			41
fEnterGrate			42
fHideInCompartment		43
fReturnBomb			44
fAvoidDeathDroid		45
fZapTentacles			46
fGetOxygenTank			47
fKillSlug			48
fBuyDress			49
fWearDress			50
fWorkedAtMonolithBurger		51
fSkippedBurgerMinigame		52	;lose 3 points
fGetJar				53
fSeeProfessorMessage		54
fGetGum				55
fEnterHangarTimepod		56
fUnused57			57
fBeamsRevealed			58
fBeamsAligned			59
fUseLaptopInBrain		60
fDroidsGone			61
fStartFormatting		62
fUnused63			63
fGetDiskette			64
fInsertDiskette			65
fWonGame			66
fGotBattery			67
fOpenComputerDoor		68
fGotBomb			69
fMonolithBurgerFired		70
fPlugInLaptop			71
fBatteryInLaptop		72
fClimbOutManhole		73
fGetSlime			74
fKickBikes			75
fGotMatches			76
fDodgedBikers			77
fUnused78			78
fReachVohaulsChamber		79
fGotATMCard			80
fGotCigar			81
fPayForPants			82
fATMCardAccepted		83
fBuyPlug			84
fPayForHintbook			85
fGoToUlence			86
fStealTimepod			87
fEnterProgrammingChamber	88

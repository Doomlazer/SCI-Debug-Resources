King' Quest IV game specific debugger

KQ4 does not use event flags. Instead, it uses game phases for things like the dwarf house, castle, etc.. 
I plan to add an option to increment these phases in a future version, which will require a patch file.
For now, everything is already in game, no patch required.

From the SCIWIKI:
http://sciwiki.sierrahelp.com//index.php?title=SCI_Debug_Modes#King.27s_Quest_4

King's Quest 4
To activate the debug mode, type: "overtime nosleep". 
An extra menu item will be activated on room change.

The following options are available:

Command	Action
TP		Teleport (change room/scene/script)*
ENTER NIGHT	Changes gamestate into night
GET MEMORY	Show memory
[ALT + E]	Show ego information
[ALT + F]	Show memory
[ALT + R]	Show current room number
[ALT + P]	Show ATPs (Add-To-Pic)
[ALT + S]	Gives inventory item
[ALT + V]	Set global variable
[ALT + G]	Gives all inventory items
[ALT + L]	Log information
[CTRL + D]	Internal debug will pop up when entering a new room
[F4]		Show control lines
[F6]		Show priority screen
[F10]		Show visual screen
[ALT + click]	Show ego information

Most options are also available in the debug menu item. The menu option "Clicks" will (de-)activate the debug options triggered by mouse.

* See the King's Quest IV Room Maps page for room numbers.
http://sciwiki.sierrahelp.com//index.php?title=King%27s_Quest_IV_Room_Maps


================
Inventory Items:
================

iFlute		0
iDiamondPouch	1
iTalisman	2
iLantern	3
iPandorasBox	4
iGoldBall	5
iGlassEye	6
iScarab		7
iFeather	8
iLute		9
iCrown		10
iFrog		11
iRattle		12
iGoldCoins	13
iCupidBow	14
iShovel		15
iAxe		16
iFishingPole	17
iShakespeareBook 18
iWorm		19
iSkeletonKey	20
iGoldenBridle	21
iBoard		22
iBone		23
iFish		24
iMagicFruit	25
iSheetMusic	26
iWhistle	27
iLocket		28
iMedal		29
iToyHorse	30
iBottle		31
iGoldKey	32
iMagicHen	33
iRose		34
iNote		35




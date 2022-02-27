Space Quest III version 1.018 Debug patch

INSTALLATION 
Copy script.000 into your SQ3 game folder and start normally. 

Both GOG and Steam versions should be 1.018
If you have issues, check your game version under "About" in the esc menu.

Enable debugging by typing BACKSTAGE PASS or PUMP SHARK. You don't really need to copy over the script.000. 
Debugging works without it except for SHIFT+ALT+click which is the only command broken without the patch.


Debug commands reference:
http://sciwiki.sierrahelp.com/index.php?title=SCI_Debug_Modes#Space_Quest_3

Command	Action
TP		Teleport (change room/scene/script)
		When using the TP room reference pics, only enter the number (i.e. 14 for n014).
[ALT + E]	Show ego information
[ALT + R]	Show current room number
[ALT + Y]	Assign object (Move Inventory item)
		First enter the "Inv. Object" number. 
		Then enter the "Owner". Type "ego" (must be lowercase) to give it to yourself. Alternately, enter a room/script number. 
[ALT + H]	Show free heap
[ALT + P]	Show priority screen
[ALT + C]	Show control lines
[ALT + V]	Show visual screen
[ALT + Z]	Quit
[ALT + L]	Toggle/swap printLang and subtitleLang (no effect in english version)

Mouse modifiers
[shift+ALT+click]	Jump to mouse pointer (patched debugger only)
[ALT+click]		Display ego information
[CTL+click]		Display mouse pointer X/Y position

Room specificc commands while debugging enabled:

In the starting room (teleport room 2):
Type "QA" to get a selection screen with the choice between various game states (in space, arriving on different planets, ending).

In the circular ScummSoft hallway (teleport room 90):
Typing "Get a life" changes Roger's outfit and gives him the following items:
Keycard, Coveralls, Vaporizer and A Copy of Elmo's Picture.

================
Inventory Items:
================

iGlowingGem		0
iWire			1
iLadder			2
iReactor		3
iOratOnAStick		4
iThermoUnderwear	5
iChickenHat		6
iDecoderRing		7
iBuckazoids		8
iMetalPole		9
iThermalDetonator	10
iKeycard		11
iCoveralls		12
iVaporizer		13
iElmoPicture		14
iElmoPictureCopy	15
iInvisibilityBelt	16
iBagOfFastFood		17


Note: SQ3 does not use "event flags"


What was changed in main.sc?

Orignional SCICompanion decompiled code:

			(evMOUSEBUTTON
				(if global200
					(= pEventX (pEvent x?))
					(= pEventY (pEvent y?))
					(cond 
						(
						(== (= pEventModifiers (pEvent modifiers?)) 10)


Code changed in script.000:

			(evMOUSEBUTTON
				(if global200
					(= pEventX (pEvent x?))
					(= pEventY (pEvent y?))
					(cond 
						(
						(& (= pEventModifiers (pEvent modifiers?)) 10) 


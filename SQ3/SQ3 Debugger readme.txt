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


=========
TP Rooms:
=========
(Thanks Threepwang!)

0 *
1 Intro with title.
2 Junkyard, start of the game.
3 Freighter-scrapyard, ACME rocket.
4 Freighter-scrapyard, bucket elevator.
5 Freighter-scrapyard, tunnel outside left part.
6 Scrapyard, interior left tunnel.
7 Junkloader, head of the Transformers.
8 Freighter-Scrapyard, Aluminum Mallard exterior.
9 Freighter, in the bucket just before falling on the conveyor belt.
10 Freighter, on the conveyor belt.
11 Freighter, in the lift, above the Aluminum Mallard.
12 Freighter, in the freight elevator, just before the CCTV room.
13 Scrapyard, in CCTV room.
14 Scrapship, in the ship.
15 Junkyard, in the rat lair.
16 Ship, systems diagnostic monitor.
17 Ship, ship's on-board computer.
18 Ship, on-board computer, shield and armament.
19 Ship, on-board computer, space map.
20 Space, exit from the scrapyard and direct death!
21 *
22 *
23 *
24 *
25 Monolith Burger, the waiter.
26 *
27 Monolith Burger, docking scene.
28 Monolith Burger, right side.
29 Monolith Burger, left side.
30 *
31 Space, ship of the Arnoid.
32 *
33 *
34 *
35 *
36 *
37 *
38 *
39 *
40 Phleebhut, the Arnoid leaves his ship.
41 Phleebhut, desert.
42 Phleebhut, entrance to the Mog.
43 Phleebhut, in front of Fester's shop.
44 Phleebhut, desert and sign to the right of the Mog.
45 Phleebhut, desert.
46 Phleebhut, desert area with the downhill.
47 Phleebhut, view of the Mog in the distance.
48 Phleebhut, desert and dubious rock.
49 Phleebhut, in front of the Aluminum Mallard.
50 Phleebhut, desert and rocks.
51 Phleebhut, desert and rocks.
52 Phleebhut, the creatures under the vault of the cave.
53 Phleebhut, the giant snake.
54 Phleebhut, desert and volcanoes.
55 *
56 *
57 *
58 *
59 *
60 Ortega, fall into the lava!
61 Ortega, exterior.
62 Ortega exiting the ship.
63 Ortega, exterior.
64 Ortega, exterior.
65 *
66 Ortega, exterior.
67 Ortega, exterior.
68 Ortega, fall into the lava!
69 Ortega, in front of ScumSoft scientists.
70 Ortega, in front of the short range fighter.
71 Ortega, the surroundings of the volcano.
72 Ortega, the crater.
73 Ortega, in the crater, engine room.
74 Ortega, in the crater, engine room, on the platform.
75 Ortega, on the generator dome.
76 *
77 *
78 *
79 *
80 Pestulon, in front of the Aluminum Mallard.
81 Pestulon, hidden outside the entrance to the ScumSoft complex.
82 *
83 *
84 *
85 Pestulon, in front of the entrance to the ScumSoft complex.
86 Pestulon, entrance to the ScumSoft complex, in front of the elevator.
87 *
88 *
89 *
90 ScumSoft, in the circular corridor.
91 ScumSoft, accounting room entrance.
92 ScumSoft, accounting.
93 ScumSoft, Elmo's office.
94 ScumSoft, the spaceport.
95 ScumSoft, the detention room of the two guys from Andromeda.
96 ScumSoft, robotic combat.
97 *
98 End, into the black hole.
99 End, entering the black hole.


Note: SQ3 does not use "event flags"


What was changed in the Main script (script.000)?


Orignional SCICompanion decompiled code:

			(evMOUSEBUTTON
				...
						(== (= pEventModifiers (pEvent modifiers?)) 10)


Code changed in script.000:

			(evMOUSEBUTTON
				...
						(& (= pEventModifiers (pEvent modifiers?)) 10) 

This change allows the mouse click debug commands work. All the text commands work fine in the vanilla version of the game out of the box! 



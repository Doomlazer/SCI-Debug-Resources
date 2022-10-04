KQ6CD Debugger

Installation: 
=============
Minimum installation:
Copy/move 911.scr, 911.hep and 911.txt to your KQ6 game folder and start normally. 
(optionally, copy the 'g' file for additional debug options)
You should see a "Where to, STUD?" prompt immediately.

Extras:
For some reason the Sierra devs decided the debug commands should not work at all in the following rooms: 
270, 280, 440, 450, 470, 480, 490, 670, 750,740

If you prefer to override this restriction, copy 0.src into your KQ6 game folder.

Kawa's interpreter: Included is SCI.EXE and the DBHELP.00x help files which feature a restored interpreter debugger. It enables many additional debugging tools such as breakpoints, stack trace, etc.. SCI.EXE can be renamed to SIERRA.EXE to replace the standard interpreter in the KQ6 game folder. Make sure to copy over the 3 DBHELP.00x files into the KQ6 game folder as well if you're going to use it. 

This additional interpreter debugger is toggled with ALT-D, then changing rooms in-game. 


Additional "g" debug features
=============================
Copying the "g" file to your game folder enables some additional debug features.
Most require teleporting from the the Sierra logo at the start of the game to work:

Room 205 (help): From the title screen click the help button - A Menu with options to skip ahead in the tutorial is show at the start.

Room 470 (dogtree): Gives inv items tomato, teaCup, huntersLamp, skull and dagger. 

Room 480 (brats): Give flute and milk.
Assign potion to room 480.
Sets flag 77.
Set Chapter 4.

Room740 (theGreatEscape): Chose one of the many possible endings.
This also works when teleporting from room 180 to 740, which uses a separate script.

Room750 (continuedWindup): Gives inv item: peppermint, play music.
If Jollo has lamp is chosen: assign newLamp to room 750, Load 'Jollo gives lamp' script (751) and LoadMany: scripts 128, 717, 754.
If Cassima has dagger, assign it to room 870.



Special thanks: 
===============
Thanks to OmerMor for the background info and original 911 patches found here: https://sciprogramming.com/community/index.php?topic=1594.0

Thanks to Kawa for the SCI.EXE interpreter w/ internal debugger. https://sciprogramming.com/community/index.php?topic=1802.msg12040#msg12040

Thanks to Collector and lskovlun for advice and guidance. https://sciprogramming.com/community/index.php?topic=1594.0



Commands:
=========
[ALT-A]		Show Cast
[ALT-B]		Polygon Editor
[ALT-C]		Control map
[ALT-D]		DebugOn Toggle (Crashes on screen change if enabled, use Kawa's interpreter to fix)
[ALT-F]		Flag set/clr
[ALT-G]		Global set
[ALT-I]		Inv items
[ALT-K]		Display Color Palette
[ALT-L]		Log file
[ALT-M]		Memory
[ALT-P]		Priority map
[ALT-Q]		show Cursor Coords
[ALT-R]		Room info
[ALT-S]		Updating cast element
[ALT-T]		Teleport ("where to, Stud" menu)
[ALT-U]		return User control (does nothing)
[ALT-V]		Visual map
[ALT-W]		feature Writer
[ALT-Y]		Vanishing point adj
[ALT-Z]		QUICK QUIT

[ALT-H]		Debug help


Inventory Items:
================
0 map
1 boringBook
2 brick
3 brush
4 hair
5 clothes
6 coal
7 deadMansCoin
8 dagger
9 coin
10 egg
11 skull
12 feather
13 flower
14 flute
15 gauntlet
16 cassimaHair
17 handkerchief
18 holeInTheWall
19 huntersLamp
20 letter
21 lettuce
22 milk
23 mint
24 mirror
25 newLamp
26 nail
27 nightingale
28 ticket
29 participle
30 pearl
31 peppermint
32 note
33 potion
34 rabbitFoot
35 ribbon
36 riddleBook
37 ring
38 rose
39 royalRing
40 sacredWater
41 scarf
42 scythe
43 shield
44 skeletonKey
45 spellBook
46 teaCup
47 poem
48 tinderBox
49 tomato
50 sentence
51 ink

Event Flags (taken from the SCI Decompile Archive)
https://github.com/EricOakford/SCI-Decompilation-Archive/blob/master/kq6cd/src/game.sh
==================================================
fBefriendedClown10
fKingQueenRevived 15
fBeenAtCastleGate 18
fMadeMagicPaint 22
fBeenInBookstore 27
fBeenInPawnshop 28
fFragmented 38
fEgoDead 44
fIsVGA 48
fTeleporting 103
fFoundHair 143
fUsedInk 151
fDrankPotion 153
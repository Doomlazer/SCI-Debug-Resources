KQ6CD Debugger. This is a work in progress.

Installation: 
=============
Copy/move 911.scr, 911.hep and 911.txt to your KQ6 game folder and start normally. 
You should see a "Where to, STUD?" prompt immediately.

Additional debug features
=========================
Copying the "g" file to your game folder enables some additional debug features.
Most require teleporting from the the Sierra logo at the start of the game to work:

Room 205 (help): From the title screen click the help button - A Menu with options to skip ahead in the tutorial is show at the start.

Room 470 (dogtree): Gives inv items tomato, teaCup, huntersLamp, skull and dagger. 

Room 480 (brats): Give flute and milk.
Assign potion to room 480.
Gives Alexander a reason to gather tears in a lamp (flag77).
Set Chapter 4.

Room740 (theGreatEscape): Chose one of the many possible endings.
This also works when teleporting from room 180 to 740, which uses a seprate script.

Room750 (continuedWindup): Gives inv item: peppermint, play music.
If Jollo has lamp is chosen: assign newLamp to room 750, Load 'Jollo gives lamp' script (751) and LoadMany: scripts 128, 717, 754.
If Cassima has dagger, assign it to room 870.



Special thanks: 
===============
Thanks to OmerMor for the background info and original 911 patches. found here: https://sciprogramming.com/community/index.php?topic=1594.0



Commands:
=========
[ALT-A]		Show Cast (does nothing)
[ALT-B]		Polygon Editor (crashes game)
[ALT-C]		Control map
[ALT-D]		DebugOn Toggle (doesn't seem to disable debug)
[ALT-F]		Flag set/clr (appears to work, needs testing)
[ALT-G]		Global set (appears to work, needs testing)
[ALT-I]		Inv items
[ALT-L]		Log file
[ALT-M]		Memory (crashes game)
[ALT-P]		Priority map
[ALT-Q]		show Cursor Coords
[ALT-R]		Room info (crashes game)
[ALT-S]		Updating cast element (does nothing)
[ALT-T]		Teleport ("where to, Stud" menu)
[ALT-U]		return User control (crashes game)
[ALT-V]		Visual map
[ALT-W]		feature Writer (does nothing)
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
giveAlexanderReasonToCollectTears 77
fTeleporting 103
fFoundHair 143
fUsedInk 151
fDrankPotion 153
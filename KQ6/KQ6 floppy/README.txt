KQ6 Floppy Script Debugger 

These are the original debugger patch files for the floppy version of Kings Quest 6 from Dave Lowe's studio.
https://archive.org/details/Lowe_SierraCheatCodeSCIV


Installation: 
=============
Minimum installation:
Copy/move 911.scr, 911.hep and 911.txt to your KQ6 game folder and start normally. 

Commands:
=========
[ALT-A]		Show Cast
[ALT-B]		Polygon Editor
[ALT-C]		Control map
[ALT-D]		DebugOn Toggle
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
[ALT-T]		Teleport
[ALT-U]		return User control
[ALT-V]		Visual map
[ALT-W]		feature Writer
[ALT-Y]		Vanishing point adj
[ALT-Z]		QUICK QUIT

[ALT-H]		Debug help message

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
Quest For Glory III game version 1.1 Debug patch
Exported Feb 25th 2022

INSTALLATION
Copy 18.scr in to your Quest for Glory III game folder and start normally.

This patch was compiled and exported from SCICompanion using the following script:
https://github.com/EricOakford/SCI-Decompilation-Archive/blob/master/qfg3/src/Debug.sc

Key commands:
	ALT-A show cAst
	ALT-O create Obstacles
	ALT-F (vacant)
	ALT-W Write features
	ALT-Y (vacant)
	ALT-R show Room
	ALT-E (vacant)
	ALT-M show Memory
	ALT-T Teleport	When using the TP Rooms reference photos only enter the number (i.e. 11 for n011).
	ALT-V Visual
	ALT-P Priority
	ALT-C Control
	ALT-I get InvItem
	ALT-S (vacant)
	ALT-G Set/Clear flag
	ALT-B set ego's Bucks
	ALT-D toggle debugging
	ALT-H set Hour of day
	ALT-K set one of ego's sKills
	ALT-X make ego eXtra special
	ALT-U return User control and input
	CTRL-L note Logger



Process used to compile and export 18.scr:

1. Make a copy of your QFG3 game folder, so you aren't changing your original game files.
2. Copy the QFG3 src folder and game.ini from this archive into that new QFG3 folder. msg folder and readme.txt are not needed: 
	https://github.com/EricOakford/SCI-Decompilation-Archive/tree/master/qfg3
3. Open the qfg3 resource.map with SCICompanion. Switch to the Scripts tab. Notice there is no script numbered 018.
4. Use Script > Compile All, which will produce a bunch of errors, but there should now be a script called "debug" numbered 018.
5. Right-click debug and select "Export as patch file", which should be named 18.src.
6. Switch to the Heaps tab in SCICompanion. Right-click heap n018 and select "Export as patch file", which should be named 18.hep.
7. Move the resulting 18.src and 18.hep into your original game folder and run QFG normally. Debug should appear on launch.
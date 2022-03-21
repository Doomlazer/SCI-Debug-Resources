http://sciwiki.sierrahelp.com//index.php?title=SCI_Debug_Modes#Leisure_Suit_Larry_3

Leisure Suit Larry 3
To activate the debug mode, type: "ascot backdrop". The debug mode will be activated when entering a new room.

Command	Action	Notes
TP	Teleport (change room/scene/script)	 
[ALT + W]	Write to log	 
[ALT + E]	Change view of ego	 
[ALT + R]	Show current room number	 
[ALT + T]	? (Time until orchids die?)
[ALT + P]	Show priority screen	 
[ALT + S]	Change from Larry to Patty or vice versa	 
[ALT + D]	Internal debug mode	 
[ALT + F]	Internal debug will pop up when entering a new room	 
[ALT + G]	Room tester	Before this will work, you'll have to place the SCI picture resource of the room you want to test in the game directory and rename it to "PIC.999". That specific picture/room will be shown and can be tested in the game.
[ALT + C]	Show control lines	 
[ALT + V]	Show visual screen	 
[ALT + M]	Show memory	
 
The debug mode has some extra effects, for example limiting the actions required at the gym to five times and giving extra debug information at some parts, like the copy-protection sequence in the casino.

It also activates some "game state" modifiers. In the casino, go upstairs and walk to the right, to the room with mirror and bar entrance.

Command	Action
INCREASE BACKSTAGE	Change (increase) state of showroom (Cherri Tart)
INCREASE NEWSPAPER	Change (increase) state of newspaper (messages)
INCREASE LAWYER	Change (increase) state of lawyer (Suzi Cheatem)

Furthermore, the self-running demo of LSL3 has the same debug mode, but also includes a room-selector at the beginning. It can be activated by extracting SCRIPT.000 from the RESOURCE files (the easiest way being SCI DECODER v1.0) and in addition changing the byte at offset 0x64 to "00" (instead of the original "01"). Beware that it's not really worth it, since it's pretty much the same deal and lots of missing resources cause it to crash easily. Fun fact: The phrase to activate the debug mode in the demo (and likely early in development too) is "shit bush".

An additional option is available in the non-English versions of the game, regardless if the debug mode is activated or not. It can be activated by typing "adjust bambi": It toggles (room) information to be displayed on the menu bar. This option doesn't seem work in any of the English versions however.

Also, the self-running demo of LSL3 has the same debug mode, apart from a room-selector on the beginning. It can be activated by extracting SCRIPT.000 from the RESOURCE files (the easiest way being SCI DECODER v1.0) and in addition changing the byte at offset 0x00000064 to "00" (instead of the original "01"). Beware that it's not really worth it, since it's pretty much the same deal and lots of missing resources cause it to crash easily.
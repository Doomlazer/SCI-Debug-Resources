Leisure Suit Larry 3
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
[ALT + C]	Show control lines
[ALT + V]	Show visual (normal graphics)	 
[ALT + P]	Show Priority 
[ALT + M]	Show memory
[ALT + X]	Quit game
[ALT + Z]	Quit game

[CTRL + T]	Teleport
[CTRL + D]	Toggle program control OFF or ON + TELEPORT
[CTRL + E]	Show ego information

Mouse events:
[shift + click]	Show mouse x/y
[CTRL + click] Move ego to mouse x/y

 
Notes: 

See the ExtraCommands folder to add two additional flag commands (test & toggle) that do not exist in the regular script debugger.

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




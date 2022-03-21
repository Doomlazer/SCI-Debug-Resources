http://sciwiki.sierrahelp.com//index.php?title=SCI_Debug_Modes#Leisure_Suit_Larry_2

Leisure Suit Larry 2
There are two ways of activating this debug mode, depending on the version of your copy of the game.

With v1.000.011, the debug mode can be activated by typing: "praise lord" The debug mode will be activated when entering a new room.

Although "praise lord" works too in v1.002.000 (the one included in the Leisure Suit Larry collections), it offers another method. At the copy-protection sequence at the start of the game, a phone number is asked. Enter "555-0724" to pass the copy-protection and get the debug mode activated.

You can also use the internal debugger. Activate the debugger directly after executing the game. Don't try this on anything higher than a 386, but rather use DOSBox with 3000 CPU cycles or so. When the debugger shows up, change global variable 100 into 1 and exit the debugger. The main difference with the other activation methods is that you'll get a room selector at the beginning and the copy-protection is disabled. Both versions support this.

Command	Action	Notes
TP	Teleport (change room/scene/script)	 
GET *object name*	Get object	 
PITCH *object name*	Drop object	 
MAKE NOTE	Log information	 
SHOW TIMER	Show timer	 
SHOW EGO	Show ego information	 
SHOW GRID	Show grid	This option is removed and crashes the game
[ALT + C]	Show control lines	 
[ALT + F]	Show fragmenting	 
[ALT + I]	Regain typing during movies	 
[ALT + M]	Show memory	 
[ALT + D]	Internal debug mode	 
[ALT + R]	Show current room number	 
[ALT + V]	Show visual screen	 
[ALT + Z]	Quit	
 
The debug mode also activates some extra features, mainly in the last scenes of the game. Larry doesn't die after falling in and around the volcano and the items for the final act are given. Earlier in the game, on the ship, a message is displayed when entering your cabin, giving information on the (coming) presence of "Mama".
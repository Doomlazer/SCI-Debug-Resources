King's Quest V Debugger patches

Starting with KQV, debuggers could no longer be activated with a text command.
They generally require exporting and editing a patch file, which is then placed in the game folder.
KQ5 has some big differences between versions, so it's important you are using the correct patch. 

INSTALLATION 

If you are unsure of your game version check the in-game "About" option and match it to the appropriate folder. 
Copy the contents to your KQ5 game folder and start normally.

The information below was taken from the sciwiki:
http://sciwiki.sierrahelp.com/index.php?title=SCI_Debug_Modes#Specific_SCI1_Game_Debug_Modes

King's Quest 5 (Floppy disk versions)
This unusual way of activating the debug mode is only found in game versions BELOW 0.000.062.
I'm currently aware of the following versions:

King's Quest 5 EGA 0.000.055 (interpreter version 1.000.058)
King's Quest 5 VGA 0.000.051 (interpreter version 1.000.060)
To activate the debug mode, perform the following steps, while in the game:

Click on the question mark (located in the icon bar - help function)
Click on "HELP"
Click on "EXIT"

Command	Action	Notes
ALT + C]	Clear flag	 
[ALT + D]	Show free memory	Doesn't seem to do anything
[ALT + I]	Get inventory item	 
[ALT + S]	Set flag	 
[ALT + R]	Show room info	 
[ALT + T]	Teleport (change room/scene/script)
		When using the TP Rooms reference photos only enter the number (i.e. 11 for n011).	 
[ALT + W]	Feature writer	This option is removed and crashes the game
[ALT + X]	Exit game instantly	 
[ALT + Z]	Exit game
	 
Note that the activation procedure has to be repeated for each time you use an option! To overcome this annoying feat,
extract SCRIPT.000 from the RESOURCE files and use the table below to know which byte to change in your version.
While you're at it, you can also change a byte to enable the debug mode from start.

 	Remove deactivation	Enable debug from start
 	offset	org	new	offset	org	new
King's Quest 5 EGA 0.000.055	0xB77	00	01	0x3A6A	00	01
King's Quest 5 VGA 0.000.051	0xB75	00	01	0x3A66	00	01



King's Quest 5 (CD-ROM, GOG and STEAM versions)
Game version 1.000.52

Unlike the diskette version, the CD-ROM version has a debug mode that cannot be activated in-game.
An older 0.SCR in the RESOURCE file reveals that originally the version number was checked in order to activate the debug-
mode (a routine like used in Police Quest 3, but not functioning in this case).
The 0.SCR as used by the game is a newer version, residing outside the RESOURCE file.
Enable the debug mode by editing this script and changing the byte at offset 0x877 to "01" (instead of the original "00").

Command	Action	Notes
[ALT + C]	Clear flag	 
[ALT + F]	Show free memory	 
[ALT + G]	Switch items from inventory?	 
[ALT + I]	Get inventory item	 
[ALT + J]	Playing?	 
[ALT + S]	Set flag	 
[ALT + R]	Show room info	 
[ALT + T]	Teleport (change room/scene/script)
		When using the TP Rooms reference photos only enter the number (i.e. 11 for n011).	 
[ALT + W]	Feature writer	This option is removed and crashes the game
[ALT + X]	Exit game instantly	 
[ALT + Y]	Play sound	 
[ALT + Z]	Exit game?
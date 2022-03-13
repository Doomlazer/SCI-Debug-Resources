Space Quest 5 Debugger 

============
INSTALLATION
============

Copy 0.scr and 880.scr to the SQ5 game folder. Tested on version 1.04


=========
Commands:
=========

Command		Action
[ALT + E]	Show ego information
[ALT + R]	Show room info / free memory
[ALT + O]	QA logger
[ALT + P]	Show priority map
[ALT + H]	Show global variable
[ALT + J]	Show cast (information about all objects on screen)
[ALT + K]	Show palette
[ALT + C]	Show control map
[ALT + V]	Show visual map ;and print version number
[ALT + N]	Show flag


Several additional commands are availalbe if the file 880.scr is present in the game folder. 
880.scr can be a blank text file. The contents aren't checked.

[ALT + A]	Show cast, but addionally shows objects with signal $0004
[ALT + B]	PolyEdit
[ALT + G]	Set global variable
[ALT + I]	Inventory item selector
[ALT + L]	Set flag
[ALT + M]	Clear flag
[ALT + Q]	Set detailLevel: 1
[ALT + S]	Print String/Message
[ALT + T]	Teleport
[ALT + U]	HandsOn
[ALT + W]	Feature Writer
[ALT + X]	Quit 
[ALT + Y]	Mark cast hitbox?
[ALT + Z]	Quit
[?]		Display help	


Mouse debugging (doesn't seem to work but are listed in help)

[ALT + L.Click]			Move ego
[CTRL + L.Shift + L.Click]	Show ego
[CTRL + R.Shift + L.Click]	Show room
[CTRL + ALT + L.Click]		Show position



======================
Code changes in 0.scr:
======================

The debug handler (script 10) from the SQ5 beta was left in the game. 
In fact the global debug variable was left set to 1, they only removed the code that sends events to the debug handler.
In this patch the following code has been changed in SQ5::handleEvent

	;(else  (pEvent claimed: 0))	
	(else 
		(if global105
			((ScriptID 10) handleEvent: pEvent)
			((ScriptID 10) dispose:)
		else
			(pEvent claimed: 0)
		)
	)
 
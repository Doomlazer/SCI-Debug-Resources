Space Quest IV CD Version 1.0 Debugger

While a beta version of SQ4 included a debugger, it was removed from all retail releases. 
Script 800 contains a lot of the debug code, but key components have been removed making it impossible to activate. 
Because of this, I had to write new code in main.sc to export a functional patch file.  

============
INSTALLATION 
============

Copy 0.scr and 0.hep to your SQ4 game folder and start normally. This patch only works with the CD version. 



The information below was taken from the sciwiki:
http://sciwiki.sierrahelp.com//index.php?title=SCI_Debug_Modes#Space_Quest_4_.28beta.29

Space Quest 4 (beta)
Somewhere in 1991, the cracking group The Humble Guys released a beta version of Space Quest 4. I suspect it had version number 1.052 (I found some saves of the beta), but the first sales release had that too, so far for that lead.

However, someone named "Beamer" typed up a list back then describing the functions. The debug mode doesn't need activation, offers a room selector at the beginning

Command	Action	Notes
[ALT + A]	Show cast information (information about all objects on screen)	 
[ALT + B]	Polygon editor (edit walking areas)
[ALT + C]	Show control map	 
[ALT + D]	DebugOn toggle (internal debugger on room change)	Works, but crashes on room change since the debugger is unavailable
[ALT + E]	Show ego information	 
[ALT + F]	Show free memory	 
[ALT + G]	Set global variable	 
[ALT + I]	Get inventory item	 
[ALT + M]	Gives 20 buckazoids/money
[ALT + N]	QA logger	 
[ALT + P]	Show priority map	 
[ALT + R]	Show room info	 
[ALT + T]	Teleport (change room/scene/script)	 
[ALT + W]	Feature writer
[ALT + Y]	Adjust vanishing point	 
[ALT + Z]	Exit game	
[ALT + S]	Change gLongSong/music (added Mar 4th 2022)
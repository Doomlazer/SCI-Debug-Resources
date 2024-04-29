Leisure Suit Larry 6 CD Debugger (HiRes version!)

The HiRes version includes these additional, unique debugging features built-in: http://sciwiki.sierrahelp.com//index.php?title=SCI_Debug_Modes#Leisure_Suit_Larry_6_.28SVGA_CD_version.29

The debugHandler script #911 is missing from the HiRes game files, so several common debug commands and the "Where to?" menu were ported over to this version. 


Installation

Copy 911.scr & 911.hep to the PATCHES folder of your LSL6 game folder. 
If you are using DOSBox you must edit the RESOURCES.CFG file in the LSL6 root folder by changing the line:

 patchDir  = .

to 

 patchDir  = .;./PATCHES

Remove the patch files to uninstall.



Commands ported from lo res version:

Command	Action	Notes
[ALT + A]	Show cast (information about all objects on screen)	 	 
[ALT + D]	DebugOn toggle (internal debugger on room change)
[ALT + E]	Show ego information	 
[ALT + F]	Set flag / clear	 
[ALT + G]	Set global variable	 	 
[ALT + I]	Get inventory item	 
[ALT + L]	Logfile	 
[ALT + M]	Show free memory	 	 
[ALT + Q]	Show cursor coordinates	 
[ALT + R]	Show room info	 	 
[ALT + T]	Teleport (change room/scene/script)	 
[ALT + U]	Give HandsOn (return user control)	 	 
[ALT + X]	Exit game	  
[ALT + Z]	Exit game	 
[SHIFT + /]	Help	 


Commands not ported because of missing features in SCI32 or other issues:
//[ALT + B]	Polygon editor (edit walking areas)	 
//[ALT + C]	Show control map
//[ALT + H]	Show features
//[ALT + P]	Show priority map
//[ALT + S]	Updating cast elements
//[ALT + V]	Show visual map	 
//[ALT + W]	Feature writer
//[ALT + Y]	Adjust vanishing point	


Event flags, borrowed from https://github.com/EricOakford/SCI-Decompilation-Archive/blob/master/lsl6svga/src/game.sh
fFragment 1
fMissileDeath 2
fMerrilyCartoon 8
fRecordPlayerOn	9
fShowingFeatures 22
fEgoNaked 74
fDisableSaveRestore? 86
fTouchedDaryl 91
fThunderbirdCartoon 92
fDarylStopsLarry 95
fWonGame 97
fShamaraAgrees 100
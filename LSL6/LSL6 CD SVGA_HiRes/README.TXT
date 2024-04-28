Leisure Suit Larry 6 CD Debugger (HiRes version!)

Installation

Copy 911.scr, 911.hep and 911.tex to the PATCHES folder of your LSL6 game folder. 
If you are using DOSBox you must edit the RESOURCES.CFG file in the LSL6 root folder by changing the line:

 patchDir  = .

to 

 patchDir  = .;./PATCHES

Remove the patch files to uninstall.

commands ported from lo res version:

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
[ALT + S]	Updating cast elements	 
[ALT + T]	Teleport (change room/scene/script)	 
[ALT + U]	Give HandsOn (return user control)	 	 
[ALT + X]	Exit game	  
[ALT + Z]	Exit game	 
[SHIFT + /]	Help	 


Commands not ported because of missing kernel functions in SCI32 or other reasons:
//[ALT + B]	Polygon editor (edit walking areas)	 
//[ALT + C]	Show control map
//[ALT + H]	Show features
//[ALT + P]	Show priority map
//[ALT + V]	Show visual map	 
//[ALT + W]	Feature writer
//[ALT + Y]	Adjust vanishing point	

The HiRes version includes these additional, unique debugging features built in: http://sciwiki.sierrahelp.com//index.php?title=SCI_Debug_Modes#Leisure_Suit_Larry_6_.28SVGA_CD_version.29

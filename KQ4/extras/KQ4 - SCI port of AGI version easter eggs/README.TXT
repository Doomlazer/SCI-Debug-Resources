# KQ4SCI AGI Egg Port
 
WIP feature complete - testing, then polish

## INSTALLATION

Copy all of the patch files into your KQ4 game folder and start under DOSBox or SCUMMVM. This file and the SRC folder are not required. To uninstall remove the patch files from your game folder.

### EGG PATCH FILES

Required for Pirate - font.605, script.701, script.702, sound.599, view.582, vocab.000

Required for Rap - font.605, pic.703, script.703, script.086, text.703, view.703, view.705, vocab.000

Requred for Beam me - font.605, pic.704, script.704, script.083, text.704, view.581, vocab.000

## EGGS

### PIRATE

Typing PIRATE at the copy protection displays one of two random images, plays a few bars of drunken sailor, and accuses the player of being a pirate before exiting the game. 

In the AGI version you need to press ALT-D at the copy protection to enter the debugger, press Enter twice, then type pirate to see the easter egg. Because this is not possible with the SCI debugger, simply type 'pirate' at the copy protection prompt.  

### RAP KQ

During the end game sequence, return to Lolotte's torture cell and type RAP KQ to see Rosella brakedancing to complaints by the developers about 'berta. 

Notice: When using this patch the first visit to the cell has SCI graphics. Normally, during the SCI endgame, when opening the door you get the following message: 

<code>You wouldn't really want to visit your old cell, would you?</code>

This patch allows you to OPEN DOOR from the hallway and enter an AGI version of the cell with slightly differnt said spec messages from the AGI verison. It copies Rosella's brakedancing animations cel for cel from the CGA graphics. Though, don't expect 100% accuracy here. 

### BEAM ME

From the hallway outside Lolotte's cell type BEAM ME. Rosella is teleported to a room with... you guessed it, devs! The SCI Rosella beam out anmiation is a rough draft and will be updated.

Special thanks to Kawa for the PxPlus CGA font & sq1Window solution, EricOakford for the SCI Decompile Archive, Chris Benshoof for squashing an annoying bug, as well as everyone in the extremely knowledgeable SCIProgramming community. Developed using SCICompanion.com and other tools. 

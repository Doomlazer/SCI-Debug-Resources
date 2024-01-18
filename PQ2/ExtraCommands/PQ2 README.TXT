Police Quest II version 1.002.011 Debug patch

INSTALLATION 
Copy script.801 into your PQ2 game folder and start normally. 

Both GOG and Steam versions should be 1.002.011. Check game version under "About" in the esc menu to verify.


Typing KISS ANGEL OF DEATH will toggle the debugger on and off.
There is no indication debugging has been enabled or disabled.

[ALT + P]	Show priority screen
[ALT + C]	Show control lines
[ALT + V]	Show visual screen
[ALT + S]	Show cast (information about all objects on screen)
[ALT + M]	Show memory
[ALT + T]	Teleport (change room/scene/script)
		When using the TP Rooms reference photos only enter the number (i.e. 11 for n011).
[ALT + I]	Gives inventory item
[ALT + E]	Show ego information
[SHIFT + /]	Help

[ALT + F]	Set or Clear flag (added Feb 26th 2022)

Mouse modifiers
[shift + click]	Show mouse pointer X/Y
[CTL + click]	Move Sonny to mouse pointer X/Y



This patch was based on research from info found here:

http://sciwiki.sierrahelp.com/index.php?title=SCI_Debug_Modes#Police_Quest_2

and here:

https://github.com/EricOakford/SCI-Decompilation-Archive/blob/master/pq2/src/Main.sc

Made using SCICompanion



Code that was added to script.801:

debugRm::handleEvent 

	(KEY_ALT_f ;added flag set and clear
		(= i (proc255_3 {Flag Number:}))
		(if (proc0_18 i)
			(proc255_0 {clearing flag})
			(proc0_17 i)
		else
			(proc255_0 {setting flag})
			(proc0_16 i)
		)
	)

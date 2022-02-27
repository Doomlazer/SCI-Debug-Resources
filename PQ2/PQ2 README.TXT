Police Quest II version 1.002.011 Debug patch

INSTALLATION 
Copy script.000 and script.801 into your PQ2 game folder and start normally. 

Both GOG and Steam versions should be 1.002.011
If you have issues, check your game version under "About" in the esc menu.



Typing KISS ANGEL DEATH will toggle the debugger on and off.
There will be no reply when debugging is enabled or disabled; You have to try commands to be sure.

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

[ALT + F]	Set or Clear flags (addedd Feb 26th 2022)

Mouse modifiers
[shift + click]	Show mouse pointer X/Y
[CTL + click]	Move Sonny to mouse pointer X/Y



This patch was based on researce from info found here:

http://sciwiki.sierrahelp.com/index.php?title=SCI_Debug_Modes#Police_Quest_2

and here:

https://github.com/EricOakford/SCI-Decompilation-Archive/blob/master/pq2/src/Main.sc

Made using SCICompanion


What whas changed in main.sc:

Original code decompiled in SCICompanion 3.2.4.0

	(method (handleEvent pEvent &tmp temp0 [temp1 53])
		(super handleEvent: pEvent)
		(if (pEvent claimed?) (return))
		(switch (pEvent type?)
			(evSAID
				(cond 
					((and (Said 'kiss/angel>') (Said '/death'))
						(pEvent claimed: 1)
						(if (= global101 (^ global101 $0001))
							(global2 setLocales: 801)
						)
					)



The new PQ::handleEvent

	(method (handleEvent pEvent &tmp temp0 [temp1 53])
		(super handleEvent: pEvent)
		(if (pEvent claimed?) (return))
		(switch (pEvent type?)
			(evSAID
				(cond 
					((Said 'kiss/death<angel')
						(pEvent claimed: 1)
						(if (^= global101 $0001)
							(global2 setLocales: 801)
						)
					)





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

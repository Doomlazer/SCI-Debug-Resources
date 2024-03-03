LB2 CD - Dagger of Amon Ra v1.1

Warning: When used in memory intensive rooms this debugger may crash due to heap limitations under DOSBox or retro hardware.


Installation

Copy 10.scr and 29.scr into your LB2 game folder. 

The files in LB2CDCopyProtectionRestore.zip are completely optional. 


Command	Action	Notes
[ALT + A]	Show cast (information about all objects on screen)
[ALT + B]	Polygon editor (edit walking areas)
[ALT + C]	Show control map	 
[ALT + D]	Place an actor (ADD to total trigger event)
[ALT + E]	Show ego information (SUB to total trigger event)
[ALT + F]	Show feature outlines
[ALT + G]	Set global variable	 
[ALT + H]	Show global variable	 
[ALT + I]	Get inventory item
[ALT + J]	Justify text on screen
[ALT + K]	Show palette	 
[ALT + L]	Set flag	 
[ALT + M]	Clear flag	 
[ALT + N]	Show flag	 
[ALT + O]	QA logger
[ALT + P]	Show priority map
[ALT + Q]	Set detail to 1
[ALT + R]	Show room info / free memory
[ALT + S]	Show string or message
[ALT + T]	Teleport (change room/scene/script)	 
[ALT + U]	Give HandsOn (return user control)
[ALT + V]	Show visual map	 
[ALT + W]	Feature writer
[ALT + X]	Exit game	 
[ALT + Y]	Stuff or unstuff a clue	This option is very buggy or will crash the game instantly
[ALT + Z]	Exit game	 
[SHIFT + /]	Help	 
[Left mouse click + ALT]	Instant movement
[Left mouse click + CTRL + LSHIFT]	Show ego
[Left mouse click + CTRL + RSHIFT]	Show room
[Left mouse click + CTRL + ALT]	Show position


Event flags
https://github.com/EricOakford/SCI-Decompilation-Archive/blob/master/lb2/src/game.sh
fIsVGA			0
fFlag25			25
fBeenInDirtyTaxi	26
fGotClaimTicket		27
fTalkedToLuigi		28
fDeskUnlocked		29
fEgoSits		30
fRubbedPad		35
fCountessDead		92
fGetPressPass		128
fEndGame		147
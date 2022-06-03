Space Quest I AGI Debugger 

How to activate the Debugger: 

The debug mode is activated by pressing [ALT + D]. The debug mode will be deactivated on room change. 
Also, activating the debug mode multiple times will generate multiple input/output lines!


AGI2/AGI3 Debug Commands
After the debug mode is activated, the following commands are available:

Room and Ego Commands
Command				Result
ROOM				Displays room number
TP (room number)		Teleport to specified room (change room/scene/script)
SP				Shows position of ego
SHOW POSITION or POSITION	Show ego's current screen coordinates
POSITION + (new coordinates)	Change egos position
SHOW PRIORITY			Displays the current rooms priority bands and control lines
SET PRIORITY			Set the priority of ego
RELEASE PRIORITY		Release the last priority that ego was set to


Flag and Variable Commands
Command				Result
SHOW FLAG			Displays a specified flag (one of 256 flags)
SET FLAG			Sets a specified flag (one of 256 flags)
RESET FLAG			Clears specified flag (one of 256 flags)
SHOW VAR or SHOW VARIABLE	Displays one of the 256 variables
SET VAR or SET VARIABLE		Change the value of one of the 256 variables

Object/Inventory Debug Commands
Command				Result
OBJECT NUMBER			Displays list of all the objects and their object numbers
OBJECT ROOM			Displays which room an object is found in
GET OBJECT			Get specified object and adds to inventory
GIMME GIMME			Get all inventory items
* There are 256 variables and 256 flags

Misc Debug Commands
Command	Result
QUIT				Quit game (locks up with most later games)
[SCROLL LOCK]			Trace mode*
* Only works with AGI v2

Debug Mode Teleportation Room Numbers:

33 Aboard Skimmer
6 Arcada Central Control Area
11 Arcada Star Generator Room
42 Asteroid Field
36 Behind Bar
38 Behind Droids R Us
58 Corridor outside of Storage Room
13 Crash on Kerona (You will drift into space if you activate this from area 12)
1 Data Archive
73 Daventry Moat (Death by gators)
51 Deltaur Armory
55 Deltaur Corridor
59 Deltaur Corridor
54 Deltaur Elevator Room
48 Deltaur Hallway Floor Junction
49 Deltaur Hallway Outside Star Generator Room
62 Deltaur Shuttle Bay
50 Deltaur Star Generator Room
57 Deltaur Storage Room
83 Desert South of Kerona Mesa
27 Dripping Liquid Chamber
7 Entrance to Flight Prep Room
12 Escape Arcada
63 Escape Exploding Deltaur (Win Game)
9 Flight Prep Room
77 Get Killed In Arcada Explosion
26 Grate Chamber
82 Grell Death
2 Hallway in front of Janitor Closet
4 Hallway in front of Star Generator Room
3 Hallway with Keycard
29 Hologram Chamber
46 In front of Deltaur Turret (Quick Death)
47 In Vent Shaft
60 In Vent Shaft
70 Inside Bar
14 Inside Crashed Escape Pod
61 Inside Deltaur Airlock
71 Inside Droids R Us
10 Inside Escape Pod
19 Kerona Mesa Bridge
16 Kerona Mesa, between trap door and resurface area
18 Kerona Mesa, east of Escape Pod
31 Kerona Underground Facility
28 Laser Chamber
53 Laundry Room
5 Lower Level of Arcada
81 Meteor Death
69 Name Selection Screen
67 Name Selection Screen
0 Name Selection Screen
41 On Board Cruiser
24 Orat's Cave
35 Outside Bar
30 Outside Crashed Escape Pod
37 Outside Cruiser
43 Outside Deltaur
45 Outside Deltaur Airlock
39 Outside Droids R Us
20 Outside Orat's Cave
23 Path leading onto Kerona Mesa
68 Prologue
15 Resurface on Kerona Mesa
78 Skimmer Ride Intro
75 Slot Machine
21 Southwest Edge of Kerona Mesa
65 Star Generator Keypad
34 Tiny's Used Vehicles
17 Trap Door Area
25 Trap Door Cave Entrance
32 Trap Door Elevator Shaft
22 Vegetated Area sout of Mesa Bridge
8 Vehicle Bay
52 Vent Shaft outside of Laundry Room
56 Vent Shaft outside of Storage Room
64 Victory Ceremony

Invetory Item Numbers:

0 Dummy
1 Cartridge
2 Rock
3 Gadget
4 Orat Part
5 Keycard
6 Glass
7 Skimmer Key
8 Beer
9 Jetpack
10 Buckazoid(s)
11 Survival Kit
12 Dehydrated Water
13 Sarien ID card
14 Pulseray
15 Gas Grenade
16 Remote Control
17 ?
18 Plant
19 Xenon Army Knife
20 Own 1 Used Ship
21 Control
22 Survival Kit
23 Pocket Lint
24 nothing
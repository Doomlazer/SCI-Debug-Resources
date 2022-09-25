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

0 This is the screen where you enter your nickname.
1 Arcada, archive room.
2 Arcada, entrance corridor .
3 Arcada, corridor with an elevator on two decks.
4 Arcada, corridor with the door torn off.
5 Arcada, arrival on the lower deck.
6 Arcada, airlock door control room.
7 Arcada, steerage with card reader.
8 Arcada, flight deck with airlock doors open.
9 Arcada, departure lounge.
10 Arcada, in the rescue shuttle.
11 Arcada, Generator Start room.
12 Space, escaping from the Arcada.
13 Space, orbit of Kerona.
14 Kerona, in the rescue shuttle after the crash.
15 Kerona, rocky plateau where Roger resurfaced by the Keronians.
16 Kerona, rocky plateau between the screen where Roger resurfaces and the arch.
17 Kerona, rocky plateau and the ark with access to the basement of the planet.
18 Kerona, west side of the rocky plateau.
19 Kerona, natural bridge.
20 Kerona, rocky gorge in front of the orat cave.
21 Kerona, southwestern end of the Rocky Mountains.
22 Kérona, sunken area with view of the natural bridge.
23 Kérona, path that climbs and entrance to the rocky gorge.
24 Kerona, cave of the orat.
25 Kerona, beginning of the underground cavern.
26 Kerona, part of the cave with the grating and the geyser.
27 Kerona, part of the cave with the purple acid basin.
28 Kerona, part of the cave with the laser barrier.
29 Kerona, portal room with the hologram.
30 Kerona, desert outside the relief shuttle.
31 Kerona, among the Keronians.
32 Kerona, elevator during the descent into the basement of the planet.
33 Kérona, crossing the desert aboard the sand speeder, towards Ulence Flats.
34 Kerona, Ulence Flats, at Tiny's.
35 Kerona, Ulence Flats, in front of the bar.
36 Kerona, Ulence Flats, behind the bar.
37 Kerona, Ulence Flats, in front of the ship Drallion.
38 Kerona, Ulence Flats, left side of Droids-B-Us.
39 Kerona, Ulence Flats, in front of Droids-B-Us.
40*
41 Space, view of the droid pilot aboard the Drallion.
42 Space, asteroid field.
43 Space, opposite the cruiser Deltaur.
44*
45 Space, spacewalk with the jetpack.
46 Space, spacewalk with the jetpack in front of a turret.
47 Deltaur, ventilation system maintenance duct on the ladder.
48 Deltaur, corridor with an elevator on two decks.
49 Deltaur, corridor leading to the Generator Start room.
50 Deltaur, Generator Start room.
51 Deltaur, home of Sainte-Barbe, storage of weapons.
52 Deltaur, ventilation system maintenance duct leading to the laundry room.
53 Deltaur, laundry room.
54 Deltaur, corridor outside the laundry room with the two main elevators.
55 Deltaur, multidirectional corridor with an elevator on two decks.
56 Deltaur, ventilation system maintenance duct leading to the storage room.
57 Deltaur, storage room.
58 Deltaur, corridor outside the storage room.
59 Deltaur, single corridor.
60 Deltaur, ventilation system maintenance duct on the ladder.
61 Deltaur, entrance hall.
62 Deltaur, flight deck.
63 *
64 On Xenon, victory ceremony.
65 Deltaur, Generator Start keypad.
66*
67 Title screen.
68*
69*
70 Kerona, Ulence Flats, in the bar.
71 Kerona, Ulence Flats, at Droids-B-Us.
72*
73 The Daventry Dimension.
74 *
75 Kerona, Ulence Flats, in the bar, slot machine.
76 *
77 Arcada, explosion.
78 *
79 *
80 Arcada, flight deck with airlock doors closed.
81 Kerona, desert with the meteor crashing into Roger.
82 Kérona, desert with the Grell which will swallow Roger.
83 Kerona, desert north of the Rockies.
104 Beginning of the intro, just before the title screen.

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
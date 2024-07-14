Quest for Glory 4 v1.0 Debugger

info taken from:
http://sciwiki.sierrahelp.com//index.php?title=SCI_Debug_Modes#Quest_for_Glory_4_.28Disk_version.29

INSTALLATION

Copy 18.scr and 18.hep into your game folder and start normally.

Command	Action	Notes
[ALT + A]	Show cast (information about all objects on screen)	 
[ALT + B]	Change amount of money	 
[ALT + C]	Learn a new spell	 
[ALT + D]	DebugOn toggle (internal debugger on room change)	Doesn't seem to do anything
[ALT + E]	Show ego information & free memory	 
[ALT + F]	Show features	Doesn't seem to do anything
[ALT + G]	Set flag / clear	 
[ALT + H]	Set hour of the day	 
[ALT + I]	Get inventory item	 
[ALT + K]	Set one of the ego's skills	 
[ALT + M]	Show free memory	 
[ALT + O]	Create obstacles	Doesn't seem to do anything
[ALT + P]	Show priority map	Doesn't seem to do anything
[ALT + R]	Show room info	 
[ALT + S]	Shift user alterego(?)	 
[ALT + T]	Teleport (change room/scene/script)	 
[ALT + U]	Give HandsOn (return user control)	 
[ALT + V]	Show visual map	Doesn't seem to do anything
[ALT + W]	Feature writer	Doesn't seem to do anything
[ALT + X]	Set all of the ego's skills	 
[ALT + Y]	Show palette	Doesn't seem to do anything
[ALT + Z]	Reverse palette	Doesn't seem to do anything
[CTRL + L]	QA logger	 
[CTRL + S]	Sound test	 
[SHIFT + /]	Help	 
[Left mouse click + ALT]	Instant movement	 
[Left mouse click + CTRL + LSHIFT]	Show ego	 
[Left mouse click + CTRL + RSHIFT]	Show room	 
[Left mouse click + CTRL + ALT]	Show position


Inventory item numbers:
https://github.com/EricOakford/SCI-Decompilation-Archive/blob/master/qfg4cd/src/game.sh

	iPurse			;0
	iManaFruit		;1
	iPoisonCure		;2
	iHealingPotion		;3
	iRations		;4
	iThrowdagger		;5
	iRocks			;6
	iCandle			;7
	iCandy			;8
	iFlask			;9
	iWater			;10
	iGruegoo		;11
	iBonemeal		;12
	iLockpick		;13
	iKeyRing		;14
	iOil			;15
	iGrapnel		;16
	iArmor			;17
	iShield			;18
	iSword			;19
	iDagger			;20
	iFlint			;21
	iGarlic			;22
	iGuildcard		;23
	iToolkit		;24
	iDarksign		;25
	iHat			;26
	iCorn			;27
	iPiepan			;28
	iBones			;29
	iBerries		;30
	iHumorbar		;31
	iRehydrator		;32
	iDoll			;33
	iBlackbird		;34
	iCloth			;35
	iChicken		;36
	iAmulet			;37
	iHair			;38
	iBroom			;39
	iFlowers		;40
	iWillowisp		;41
	iLocket			;42
	iStatue			;43
	iTorch			;44
	iJewelry		;45
	iKnob			;46
	iStaff			;47
	iBonsai			;48
	iHammer			;49
	iStake			;50
	iBag			;51
	iBoneRit		;52
	iBloodRit		;53
	iBreathRit		;54
	iSenseRit		;55
	iHeartRit		;56
	iLastInvItem	;57	;this MUST be last except for the keys
	;the remaining below are for the keyring
	iLabKey			;58
	iInnKey			;59	;unused, but has the same message as the crest key.
						;There is actually an unused message for a key for
						;the inn's chest. Maybe this was originally intended for that?
	iCryptKey		;60
	iGuildKey		;61
	iCrestKey		;62
	iBurgoKey		;63


;Skills
	STR			;0
	INT			;1
	AGIL			;2
	VIT			;3
	LUCK			;4
	WEAPON			;5
	PARRY			;6
	DODGE			;7
	STEALTH			;8
	PICK			;9
	THROW			;10
	CLIMB			;11
	MAGIC			;12
	COMM			;13
	HONOR			;14
	ACROBATICS		;15
	EXPER			;16		;Unused
	HEALTH			;17
	STAMINA			;18
	MANA			;19
Magic Spells
	OPEN			;20
	DETMAGIC		;21
	TRIGGER			;22
	DAZZLE			;23
	ZAP			;24
	CALM			;25
	FLAMEDART		;26
	FETCH			;27
	FORCEBOLT		;28
	LEVITATE		;29
	REVERSAL		;30
	JUGGLE			;31
	STAFF			;32
	LIGHTNING		;33
	FROSTBITE		;34
	RITUAL			;35
	INVISIBILITY		;36
	AURA			;37
	PROTECTION		;38
	RESISTANCE		;39
	GLIDE			;40
	HEALING			;41
	ENDSTATS		;42


;Event flags
(enum 1
	fWornOut		;1
	fHungry			;2
	fStarving 		;3
	fUnused4		;4
	fOverloaded		;5
	fInMainGame		;6
	fFlag7			;7
	fReversal		;8
)
(define fGeasWarning	11)
(define fPoisoned		14)
(define fSenseDanger	20)
(define fHonorShield	21)
(define fBabaFrog		22)
(define fWasWizard		29)
(define fMetBurgomeisterToday	32)
(define fIgorMissing	37)
(define fIgorDead		38)
(define fIgorSaved		48)
(define fCantSave		50)
(define fHideCursor		51)
(define fListenedHall	112)	;original Sierra name
(define fInPuzzle		147)
(define fSomeoneTalking	148)
(define fKnowBaba		150)	;original Sierra name
(define fUltimateJoke 	161)	;original Sierra name
(define fFlag165		165)
(define fLeshyName		176)	;original Sierra name
(define fRusalkaName	177)	;original Sierra name
(define fBarrierPhrase	186)	;original Sierra name
(define fGotManaFruit	189)
(define fGotHydration	198)	;original Sierra name
(define fDoneExercisingToday	204)
(define fKissedKatrina	234)
(define fLastDayToSaveIgor	238)
(define fGotCryptKey	268)
(define fMetAnnaTonight	338)
(define fSolvedTomb		361)	;original Sierra name
(define fHoldingTorch	373)
(define fAutoSave		379)
(define fRestartingGame	382)
(define fLearnedFlamingSword	385)
(define fBoughtBlackBird	387)	;flag set from QG3
(define fVoiceOn		400)
(define fRusalkaFriend	444)	;original Sierra name
(define fGotGlide		498)	;original Sierra name
package mage.sets;

import mage.cards.ExpansionSet;
import mage.constants.Rarity;
import mage.constants.SetType;

import java.util.Arrays;
import java.util.List;

/**
 * @author TheElk801
 */
public final class ZendikarRising extends ExpansionSet {

    private static final List<String> unfinished = Arrays.asList(
            "Akoum Warrior",
            "Akoum Teeth",
            "Bala Ged Recovery",
            "Bala Ged Sanctuary",
            "Branchloft Pathway",
            "Boulderloft Pathway",
            "Brightclimb Pathway",
            "Grimclimb Pathway",
            "Clearwater Pathway",
            "Murkwater Pathway",
            "Cragcrown Pathway",
            "Timbercrown Pathway",
            "Emeria's Call",
            "Emeria, Shattered Skyclave",
            "Kabira Takedown",
            "Kabira Plateau",
            "Kazuul's Fury",
            "Kazuul's Cliffs",
            "Khalni Ambush",
            "Khalni Territory",
            "Makindi Stampede",
            "Makindi Mesas",
            "Needleverge Pathway",
            "Pillarverge Pathway",
            "Pelakka Predation",
            "Pelakka Caverns",
            "Riverglide Pathway",
            "Lavaglide Pathway",
            "Sea Gate Restoration",
            "Sea Gate, Reborn",
            "Sejiri Shelter",
            "Sejiri Glacier",
            "Shatterskull Smashing",
            "Shatterskull, the Hammer Pass",
            "Skyclave Cleric",
            "Skyclave Basilica",
            "Song-Mad Treachery",
            "Song-Mad Ruins",
            "Spikefield Hazard",
            "Spikefield Cave",
            "Tangled Florahedron",
            "Tangled Vale",
            "Umara Wizard",
            "Umara Skyfalls",
            "Valakut Awakening",
            "Valakut Stoneforge",
            "Zof Consumption",
            "Zof Bloodbog"
    );

    private static final ZendikarRising instance = new ZendikarRising();

    public static ZendikarRising getInstance() {
        return instance;
    }

    private ZendikarRising() {
        super("Zendikar Rising", "ZNR", ExpansionSet.buildDate(2020, 9, 25), SetType.EXPANSION);
        this.blockName = "Zendikar Rising";
        this.hasBasicLands = true;
        this.hasBoosters = true;
        this.numBoosterLands = 1;
        this.numBoosterCommon = 9;
        this.numBoosterUncommon = 3;
        this.numBoosterRare = 1;
        this.ratioBoosterMythic = 8;
        this.numBoosterDoubleFaced = 1;
        this.maxCardNumberInBooster = 280;

        cards.add(new SetCardInfo("Acquisitions Expert", 89, Rarity.UNCOMMON, mage.cards.a.AcquisitionsExpert.class));
        cards.add(new SetCardInfo("Adventure Awaits", 177, Rarity.COMMON, mage.cards.a.AdventureAwaits.class));
        cards.add(new SetCardInfo("Akoum Hellhound", 133, Rarity.COMMON, mage.cards.a.AkoumHellhound.class));
        cards.add(new SetCardInfo("Akoum Teeth", 134, Rarity.UNCOMMON, mage.cards.a.AkoumTeeth.class));
        cards.add(new SetCardInfo("Akoum Warrior", 134, Rarity.UNCOMMON, mage.cards.a.AkoumWarrior.class));
        cards.add(new SetCardInfo("Angelheart Protector", 3, Rarity.COMMON, mage.cards.a.AngelheartProtector.class));
        cards.add(new SetCardInfo("Anticognition", 45, Rarity.COMMON, mage.cards.a.Anticognition.class));
        cards.add(new SetCardInfo("Archpriest of Iona", 5, Rarity.RARE, mage.cards.a.ArchpriestOfIona.class));
        cards.add(new SetCardInfo("Ardent Electromancer", 135, Rarity.COMMON, mage.cards.a.ArdentElectromancer.class));
        cards.add(new SetCardInfo("Ashaya, Soul of the Wild", 179, Rarity.MYTHIC, mage.cards.a.AshayaSoulOfTheWild.class));
        cards.add(new SetCardInfo("Bala Ged Recovery", 180, Rarity.UNCOMMON, mage.cards.b.BalaGedRecovery.class));
        cards.add(new SetCardInfo("Bala Ged Sanctuary", 180, Rarity.UNCOMMON, mage.cards.b.BalaGedSanctuary.class));
        cards.add(new SetCardInfo("Blood Beckoning", 92, Rarity.COMMON, mage.cards.b.BloodBeckoning.class));
        cards.add(new SetCardInfo("Bloodchief's Thirst", 94, Rarity.UNCOMMON, mage.cards.b.BloodchiefsThirst.class));
        cards.add(new SetCardInfo("Boulderloft Pathway", 258, Rarity.RARE, mage.cards.b.BoulderloftPathway.class));
        cards.add(new SetCardInfo("Branchloft Pathway", 258, Rarity.RARE, mage.cards.b.BranchloftPathway.class));
        cards.add(new SetCardInfo("Brightclimb Pathway", 259, Rarity.RARE, mage.cards.b.BrightclimbPathway.class));
        cards.add(new SetCardInfo("Broken Wings", 181, Rarity.COMMON, mage.cards.b.BrokenWings.class));
        cards.add(new SetCardInfo("Brushfire Elemental", 221, Rarity.UNCOMMON, mage.cards.b.BrushfireElemental.class));
        cards.add(new SetCardInfo("Bubble Snare", 47, Rarity.COMMON, mage.cards.b.BubbleSnare.class));
        cards.add(new SetCardInfo("Canopy Baloth", 182, Rarity.COMMON, mage.cards.c.CanopyBaloth.class));
        cards.add(new SetCardInfo("Cascade Seer", 48, Rarity.COMMON, mage.cards.c.CascadeSeer.class));
        cards.add(new SetCardInfo("Cinderclasm", 136, Rarity.UNCOMMON, mage.cards.c.Cinderclasm.class));
        cards.add(new SetCardInfo("Clearwater Pathway", 260, Rarity.RARE, mage.cards.c.ClearwaterPathway.class));
        cards.add(new SetCardInfo("Cleric of Life's Bond", 222, Rarity.UNCOMMON, mage.cards.c.ClericOfLifesBond.class));
        cards.add(new SetCardInfo("Cliffhaven Sell-Sword", 8, Rarity.COMMON, mage.cards.c.CliffhavenSellSword.class));
        cards.add(new SetCardInfo("Coralhelm Chronicler", 54, Rarity.RARE, mage.cards.c.CoralhelmChronicler.class));
        cards.add(new SetCardInfo("Cragcrown Pathway", 261, Rarity.RARE, mage.cards.c.CragcrownPathway.class));
        cards.add(new SetCardInfo("Cragplate Baloth", 183, Rarity.RARE, mage.cards.c.CragplateBaloth.class));
        cards.add(new SetCardInfo("Cunning Geysermage", 55, Rarity.COMMON, mage.cards.c.CunningGeysermage.class));
        cards.add(new SetCardInfo("Dauntless Survivor", 184, Rarity.COMMON, mage.cards.d.DauntlessSurvivor.class));
        cards.add(new SetCardInfo("Deadly Alliance", 96, Rarity.COMMON, mage.cards.d.DeadlyAlliance.class));
        cards.add(new SetCardInfo("Demon's Disciple", 97, Rarity.UNCOMMON, mage.cards.d.DemonsDisciple.class));
        cards.add(new SetCardInfo("Disenchant", 10, Rarity.COMMON, mage.cards.d.Disenchant.class));
        cards.add(new SetCardInfo("Dreadwurm", 100, Rarity.COMMON, mage.cards.d.Dreadwurm.class));
        cards.add(new SetCardInfo("Emeria Captain", 11, Rarity.UNCOMMON, mage.cards.e.EmeriaCaptain.class));
        cards.add(new SetCardInfo("Expedition Champion", 138, Rarity.COMMON, mage.cards.e.ExpeditionChampion.class));
        cards.add(new SetCardInfo("Expedition Diviner", 57, Rarity.COMMON, mage.cards.e.ExpeditionDiviner.class));
        cards.add(new SetCardInfo("Expedition Skulker", 101, Rarity.COMMON, mage.cards.e.ExpeditionSkulker.class));
        cards.add(new SetCardInfo("Farsight Adept", 14, Rarity.COMMON, mage.cards.f.FarsightAdept.class));
        cards.add(new SetCardInfo("Fearless Fledgling", 15, Rarity.UNCOMMON, mage.cards.f.FearlessFledgling.class));
        cards.add(new SetCardInfo("Feed the Swarm", 102, Rarity.COMMON, mage.cards.f.FeedTheSwarm.class));
        cards.add(new SetCardInfo("Fissure Wizard", 140, Rarity.COMMON, mage.cards.f.FissureWizard.class));
        cards.add(new SetCardInfo("Forest", 278, Rarity.LAND, mage.cards.basiclands.Forest.class, FULL_ART_BFZ_VARIOUS));
        cards.add(new SetCardInfo("Gnarlid Colony", 185, Rarity.COMMON, mage.cards.g.GnarlidColony.class));
        cards.add(new SetCardInfo("Goma Fada Vanguard", 141, Rarity.UNCOMMON, mage.cards.g.GomaFadaVanguard.class));
        cards.add(new SetCardInfo("Grimclimb Pathway", 259, Rarity.RARE, mage.cards.g.GrimclimbPathway.class));
        cards.add(new SetCardInfo("Grotag Bug-Catcher", 142, Rarity.COMMON, mage.cards.g.GrotagBugCatcher.class));
        cards.add(new SetCardInfo("Hagra Constrictor", 105, Rarity.COMMON, mage.cards.h.HagraConstrictor.class));
        cards.add(new SetCardInfo("Highborn Vampire", 107, Rarity.COMMON, mage.cards.h.HighbornVampire.class));
        cards.add(new SetCardInfo("Into the Roil", 62, Rarity.COMMON, mage.cards.i.IntoTheRoil.class));
        cards.add(new SetCardInfo("Island", 269, Rarity.LAND, mage.cards.basiclands.Island.class, FULL_ART_BFZ_VARIOUS));
        cards.add(new SetCardInfo("Jace, Mirror Mage", 63, Rarity.MYTHIC, mage.cards.j.JaceMirrorMage.class));
        cards.add(new SetCardInfo("Joraga Visionary", 188, Rarity.COMMON, mage.cards.j.JoragaVisionary.class));
        cards.add(new SetCardInfo("Kabira Outrider", 18, Rarity.COMMON, mage.cards.k.KabiraOutrider.class));
        cards.add(new SetCardInfo("Kaza, Roil Chaser", 225, Rarity.RARE, mage.cards.k.KazaRoilChaser.class));
        cards.add(new SetCardInfo("Kazuul's Cliffs", 146, Rarity.UNCOMMON, mage.cards.k.KazuulsCliffs.class));
        cards.add(new SetCardInfo("Kazuul's Fury", 146, Rarity.UNCOMMON, mage.cards.k.KazuulsFury.class));
        cards.add(new SetCardInfo("Khalni Ambush", 192, Rarity.UNCOMMON, mage.cards.k.KhalniAmbush.class));
        cards.add(new SetCardInfo("Khalni Territory", 192, Rarity.UNCOMMON, mage.cards.k.KhalniTerritory.class));
        cards.add(new SetCardInfo("Kitesail Cleric", 20, Rarity.UNCOMMON, mage.cards.k.KitesailCleric.class));
        cards.add(new SetCardInfo("Kor Blademaster", 21, Rarity.UNCOMMON, mage.cards.k.KorBlademaster.class));
        cards.add(new SetCardInfo("Lavaglide Pathway", 264, Rarity.RARE, mage.cards.l.LavaglidePathway.class));
        cards.add(new SetCardInfo("Legion Angel", 23, Rarity.RARE, mage.cards.l.LegionAngel.class));
        cards.add(new SetCardInfo("Linvala, Shield of Sea Gate", 226, Rarity.RARE, mage.cards.l.LinvalaShieldOfSeaGate.class));
        cards.add(new SetCardInfo("Lotus Cobra", 193, Rarity.RARE, mage.cards.l.LotusCobra.class));
        cards.add(new SetCardInfo("Lullmage's Familiar", 227, Rarity.UNCOMMON, mage.cards.l.LullmagesFamiliar.class));
        cards.add(new SetCardInfo("Luminarch Aspirant", 24, Rarity.RARE, mage.cards.l.LuminarchAspirant.class));
        cards.add(new SetCardInfo("Makindi Mesas", 26, Rarity.UNCOMMON, mage.cards.m.MakindiMesas.class));
        cards.add(new SetCardInfo("Makindi Ox", 25, Rarity.COMMON, mage.cards.m.MakindiOx.class));
        cards.add(new SetCardInfo("Makindi Stampede", 26, Rarity.UNCOMMON, mage.cards.m.MakindiStampede.class));
        cards.add(new SetCardInfo("Malakir Blood-Priest", 110, Rarity.COMMON, mage.cards.m.MalakirBloodPriest.class));
        cards.add(new SetCardInfo("Maul of the Skyclaves", 27, Rarity.RARE, mage.cards.m.MaulOfTheSkyclaves.class));
        cards.add(new SetCardInfo("Merfolk Falconer", 69, Rarity.UNCOMMON, mage.cards.m.MerfolkFalconer.class));
        cards.add(new SetCardInfo("Merfolk Windrobber", 70, Rarity.UNCOMMON, mage.cards.m.MerfolkWindrobber.class));
        cards.add(new SetCardInfo("Might of Murasa", 194, Rarity.COMMON, mage.cards.m.MightOfMurasa.class));
        cards.add(new SetCardInfo("Mind Carver", 113, Rarity.UNCOMMON, mage.cards.m.MindCarver.class));
        cards.add(new SetCardInfo("Mountain", 275, Rarity.LAND, mage.cards.basiclands.Mountain.class, FULL_ART_BFZ_VARIOUS));
        cards.add(new SetCardInfo("Murasa Brute", 195, Rarity.COMMON, mage.cards.m.MurasaBrute.class));
        cards.add(new SetCardInfo("Murasa Rootgrazer", 229, Rarity.UNCOMMON, mage.cards.m.MurasaRootgrazer.class));
        cards.add(new SetCardInfo("Murkwater Pathway", 260, Rarity.RARE, mage.cards.m.MurkwaterPathway.class));
        cards.add(new SetCardInfo("Nahiri, Heir of the Ancients", 230, Rarity.MYTHIC, mage.cards.n.NahiriHeirOfTheAncients.class));
        cards.add(new SetCardInfo("Needleverge Pathway", 263, Rarity.RARE, mage.cards.n.NeedlevergePathway.class));
        cards.add(new SetCardInfo("Nighthawk Scavenger", 115, Rarity.RARE, mage.cards.n.NighthawkScavenger.class));
        cards.add(new SetCardInfo("Nimana Skitter-Sneak", 116, Rarity.COMMON, mage.cards.n.NimanaSkitterSneak.class));
        cards.add(new SetCardInfo("Omnath, Locus of Creation", 232, Rarity.MYTHIC, mage.cards.o.OmnathLocusOfCreation.class));
        cards.add(new SetCardInfo("Orah, Skyclave Hierophant", 233, Rarity.RARE, mage.cards.o.OrahSkyclaveHierophant.class));
        cards.add(new SetCardInfo("Pelakka Caverns", 120, Rarity.UNCOMMON, mage.cards.p.PelakkaCaverns.class));
        cards.add(new SetCardInfo("Pelakka Predation", 120, Rarity.UNCOMMON, mage.cards.p.PelakkaPredation.class));
        cards.add(new SetCardInfo("Pillarverge Pathway", 263, Rarity.RARE, mage.cards.p.PillarvergePathway.class));
        cards.add(new SetCardInfo("Plains", 266, Rarity.LAND, mage.cards.basiclands.Plains.class, FULL_ART_BFZ_VARIOUS));
        cards.add(new SetCardInfo("Prowling Felidar", 34, Rarity.COMMON, mage.cards.p.ProwlingFelidar.class));
        cards.add(new SetCardInfo("Rabid Bite", 199, Rarity.COMMON, mage.cards.r.RabidBite.class));
        cards.add(new SetCardInfo("Ravager's Mace", 235, Rarity.UNCOMMON, mage.cards.r.RavagersMace.class));
        cards.add(new SetCardInfo("Risen Riptide", 73, Rarity.COMMON, mage.cards.r.RisenRiptide.class));
        cards.add(new SetCardInfo("Riverglide Pathway", 264, Rarity.RARE, mage.cards.r.RiverglidePathway.class));
        cards.add(new SetCardInfo("Rockslide Sorcerer", 154, Rarity.UNCOMMON, mage.cards.r.RockslideSorcerer.class));
        cards.add(new SetCardInfo("Roil Eruption", 155, Rarity.COMMON, mage.cards.r.RoilEruption.class));
        cards.add(new SetCardInfo("Roiling Regrowth", 201, Rarity.UNCOMMON, mage.cards.r.RoilingRegrowth.class));
        cards.add(new SetCardInfo("Ruin Crab", 75, Rarity.UNCOMMON, mage.cards.r.RuinCrab.class));
        cards.add(new SetCardInfo("Scorch Rider", 158, Rarity.COMMON, mage.cards.s.ScorchRider.class));
        cards.add(new SetCardInfo("Sea Gate Banneret", 36, Rarity.COMMON, mage.cards.s.SeaGateBanneret.class));
        cards.add(new SetCardInfo("Sea Gate Colossus", 251, Rarity.COMMON, mage.cards.s.SeaGateColossus.class));
        cards.add(new SetCardInfo("Sejiri Glacier", 37, Rarity.UNCOMMON, mage.cards.s.SejiriGlacier.class));
        cards.add(new SetCardInfo("Sejiri Shelter", 37, Rarity.UNCOMMON, mage.cards.s.SejiriShelter.class));
        cards.add(new SetCardInfo("Shell Shield", 79, Rarity.COMMON, mage.cards.s.ShellShield.class));
        cards.add(new SetCardInfo("Shepherd of Heroes", 38, Rarity.COMMON, mage.cards.s.ShepherdOfHeroes.class));
        cards.add(new SetCardInfo("Skyclave Geopede", 163, Rarity.UNCOMMON, mage.cards.s.SkyclaveGeopede.class));
        cards.add(new SetCardInfo("Sneaking Guide", 164, Rarity.COMMON, mage.cards.s.SneakingGuide.class));
        cards.add(new SetCardInfo("Song-Mad Ruins", 165, Rarity.UNCOMMON, mage.cards.s.SongMadRuins.class));
        cards.add(new SetCardInfo("Song-Mad Treachery", 165, Rarity.UNCOMMON, mage.cards.s.SongMadTreachery.class));
        cards.add(new SetCardInfo("Spare Supplies", 254, Rarity.COMMON, mage.cards.s.SpareSupplies.class));
        cards.add(new SetCardInfo("Spitfire Lagac", 167, Rarity.COMMON, mage.cards.s.SpitfireLagac.class));
        cards.add(new SetCardInfo("Spoils of Adventure", 237, Rarity.UNCOMMON, mage.cards.s.SpoilsOfAdventure.class));
        cards.add(new SetCardInfo("Subtle Strike", 128, Rarity.COMMON, mage.cards.s.SubtleStrike.class));
        cards.add(new SetCardInfo("Swamp", 272, Rarity.LAND, mage.cards.basiclands.Swamp.class, FULL_ART_BFZ_VARIOUS));
        cards.add(new SetCardInfo("Tajuru Blightblade", 208, Rarity.COMMON, mage.cards.t.TajuruBlightblade.class));
        cards.add(new SetCardInfo("Tajuru Snarecaster", 210, Rarity.COMMON, mage.cards.t.TajuruSnarecaster.class));
        cards.add(new SetCardInfo("Tangled Florahedron", 211, Rarity.UNCOMMON, mage.cards.t.TangledFlorahedron.class));
        cards.add(new SetCardInfo("Tangled Vale", 211, Rarity.UNCOMMON, mage.cards.t.TangledVale.class));
        cards.add(new SetCardInfo("Taunting Arbormage", 212, Rarity.UNCOMMON, mage.cards.t.TauntingArbormage.class));
        cards.add(new SetCardInfo("Tazri, Beacon of Unity", 44, Rarity.MYTHIC, mage.cards.t.TazriBeaconOfUnity.class));
        cards.add(new SetCardInfo("Thwart the Grave", 130, Rarity.UNCOMMON, mage.cards.t.ThwartTheGrave.class));
        cards.add(new SetCardInfo("Timbercrown Pathway", 261, Rarity.RARE, mage.cards.t.TimbercrownPathway.class));
        cards.add(new SetCardInfo("Umara Mystic", 238, Rarity.UNCOMMON, mage.cards.u.UmaraMystic.class));
        cards.add(new SetCardInfo("Umara Skyfalls", 86, Rarity.UNCOMMON, mage.cards.u.UmaraSkyfalls.class));
        cards.add(new SetCardInfo("Umara Wizard", 86, Rarity.UNCOMMON, mage.cards.u.UmaraWizard.class));
        cards.add(new SetCardInfo("Utility Knife", 256, Rarity.COMMON, mage.cards.u.UtilityKnife.class));
        cards.add(new SetCardInfo("Windrider Wizard", 87, Rarity.UNCOMMON, mage.cards.w.WindriderWizard.class));
        cards.add(new SetCardInfo("Zulaport Duelist", 88, Rarity.COMMON, mage.cards.z.ZulaportDuelist.class));

        cards.removeIf(setCardInfo -> unfinished.contains(setCardInfo.getName())); // remove when mechanics are fully implemented
    }
}

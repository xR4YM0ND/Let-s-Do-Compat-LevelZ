package net.letsdocompatlevelz.init;

import net.fabricmc.fabric.api.resource.ResourceManagerHelper;
import net.fabricmc.fabric.api.resource.ResourcePackActivationType;
import net.fabricmc.loader.api.FabricLoader;
import net.letsdocompatlevelz.LetsDoCompatLevelZ;
import net.minecraft.util.Identifier;

public class EventInit {

    public static void init() {

        toggleCompat("bakery", ConfigInit.CONFIG.letsdoBakeryFarmCharmLevelzCompat, "lets_do_compat_bakery_fc_levelz");
        toggleCompat("beachparty", ConfigInit.CONFIG.letsdoBeachpartyLevelzCompat, "lets_do_compat_beachparty_levelz");
        toggleCompat("bloomingnature", ConfigInit.CONFIG.letsdoBloomingNatureLevelzCompat, "lets_do_compat_blooming_nature_levelz");
        toggleCompat("brewery", ConfigInit.CONFIG.letsdoBreweryFarmCharmLevelzCompat, "lets_do_compat_brewery_fc_levelz");
        toggleCompat("camping", ConfigInit.CONFIG.letsdoCampingLevelzCompat, "lets_do_compat_camping_levelz");
        toggleCompat("candlelight", ConfigInit.CONFIG.letsdoCandlelightFarmCharmLevelzCompat, "lets_do_compat_candlelight_fc_levelz");
        toggleCompat("farm_and_charm", ConfigInit.CONFIG.letsdoFarmAndCharmLevelzCompat, "lets_do_compat_farm_and_charm_levelz");
        toggleCompat("herbalbrews", ConfigInit.CONFIG.letsdoHerbalBrewsLevelzCompat, "lets_do_compat_herbalbrews_levelz");
        toggleCompat("lilis_lucky_lures", ConfigInit.CONFIG.letsdoLilisLuckyLuresLevelzCompat, "lets_do_compat_lilis_lucky_lures_levelz");
        toggleCompat("meadow", ConfigInit.CONFIG.letsdoMeadowLevelzCompat, "lets_do_compat_meadow_levelz");
        toggleCompat("nethervinery", ConfigInit.CONFIG.letsdoNetherVineryLevelzCompat, "lets_do_compat_nethervinery_levelz");
        toggleCompat("vinery", ConfigInit.CONFIG.letsdoVineryLevelzCompat, "lets_do_compat_vinery_levelz");
        toggleCompat("wildernature", ConfigInit.CONFIG.letsdoWilderNatureLevelzCompat, "lets_do_compat_wildernature_levelz");

    }
    public static void toggleCompat(String externalModId, boolean configEntry, String resourcepackName) {

        if (FabricLoader.getInstance().isModLoaded(externalModId) && configEntry) {
            ResourceManagerHelper.registerBuiltinResourcePack(new Identifier(LetsDoCompatLevelZ.MOD_ID, resourcepackName),FabricLoader.getInstance().getModContainer(LetsDoCompatLevelZ.MOD_ID).orElseThrow(),
                    ResourcePackActivationType.DEFAULT_ENABLED);
        }
    }
}

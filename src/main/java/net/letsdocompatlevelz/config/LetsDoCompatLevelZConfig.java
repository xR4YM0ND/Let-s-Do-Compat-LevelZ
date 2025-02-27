package net.letsdocompatlevelz.config;

import me.shedaniel.autoconfig.ConfigData;
import me.shedaniel.autoconfig.annotation.Config;
import me.shedaniel.autoconfig.annotation.ConfigEntry;
import me.shedaniel.cloth.clothconfig.shadowed.blue.endless.jankson.Comment;

@Config(name = "letsdocompatlevelz")
@Config.Gui.Background("minecraft:textures/block/stone.png")
public class LetsDoCompatLevelZConfig implements ConfigData {
    
    @Comment("Disable various datapacks below")
    @ConfigEntry.Gui.RequiresRestart
    public boolean letsdoBakeryFarmCharmLevelzCompat = true;
    @ConfigEntry.Gui.RequiresRestart
    public boolean letsdoBeachpartyLevelzCompat = true;
    @ConfigEntry.Gui.RequiresRestart
    public boolean letsdoBloomingNatureLevelzCompat = true;
    @ConfigEntry.Gui.RequiresRestart
    public boolean letsdoBreweryFarmCharmLevelzCompat = true;
    @ConfigEntry.Gui.RequiresRestart
    public boolean letsdoCampingLevelzCompat = true;
    @ConfigEntry.Gui.RequiresRestart
    public boolean letsdoCandlelightFarmCharmLevelzCompat = true;
    @ConfigEntry.Gui.RequiresRestart
    public boolean letsdoFarmAndCharmLevelzCompat = true;
    @ConfigEntry.Gui.RequiresRestart
    public boolean letsdoHerbalBrewsLevelzCompat = true;
    @ConfigEntry.Gui.RequiresRestart
    public boolean letsdoLilisLuckyLuresLevelzCompat = true;
    @ConfigEntry.Gui.RequiresRestart
    public boolean letsdoMeadowLevelzCompat = true;
    @ConfigEntry.Gui.RequiresRestart
    public boolean letsdoNetherVineryLevelzCompat = true;
    @ConfigEntry.Gui.RequiresRestart
    public boolean letsdoVineryLevelzCompat = true;
    @ConfigEntry.Gui.RequiresRestart
    public boolean letsdoWilderNatureLevelzCompat = true;
}

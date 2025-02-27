package net.letsdocompatlevelz.init;

import me.shedaniel.autoconfig.AutoConfig;
import me.shedaniel.autoconfig.serializer.JanksonConfigSerializer;
import net.letsdocompatlevelz.config.LetsDoCompatLevelZConfig;

public class ConfigInit {

    public static LetsDoCompatLevelZConfig CONFIG = new LetsDoCompatLevelZConfig();

    public static void init() {
        AutoConfig.register(LetsDoCompatLevelZConfig.class, JanksonConfigSerializer::new);
        CONFIG = AutoConfig.getConfigHolder(LetsDoCompatLevelZConfig.class).getConfig();
    }
}

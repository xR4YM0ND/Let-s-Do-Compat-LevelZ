package net.letsdocompatlevelz;

import net.fabricmc.api.ModInitializer;
import net.letsdocompatlevelz.init.ConfigInit;
import net.letsdocompatlevelz.init.EventInit;

public class LetsDoCompatLevelZ implements ModInitializer {

        public static final String MOD_ID = "letsdocompatlevelz";

    @Override
    public void onInitialize() {
        ConfigInit.init();
        EventInit.init();
    }
}
package com.example.athena.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.example.athena.AthenaGame;

public class DesktopLauncher {
    public static void main(String[] arg) {

        LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();

        config.width = 800;
        config.height = 600;
        config.forceExit = false;

        // Switch for full screen
		// config.fullscreen = true;

        new LwjglApplication(new AthenaGame(), config);
    }
}

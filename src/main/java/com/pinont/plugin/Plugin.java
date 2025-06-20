package com.pinont.plugin;

import com.pinont.lib.plugin.CorePlugin;

public final class Plugin extends CorePlugin {
    @Override
    public void onPluginStart() {
        sendConsoleMessage("Plugin started");
    }

    @Override
    public void onPluginStop() {
        sendConsoleMessage("Plugin stopped");
    }
}

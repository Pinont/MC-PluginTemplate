package com.pinont.plugin.customItem;

import com.pinont.lib.api.annotation.AutoRegister;
import com.pinont.lib.api.items.CustomItem;
import com.pinont.lib.api.items.ItemCreator;
import com.pinont.lib.api.items.ItemInteraction;

@AutoRegister // This annotation indicates that this class should be automatically registered by the plugin
public class CustomSword implements CustomItem {
    @Override
    public ItemInteraction getInteraction() { // This method should return an ItemInteraction instance that defines the behavior of the custom item
        return null;
    }

    @Override
    public ItemCreator register() { // This method should return an ItemCreator instance that creates the custom item
        return null;
    }
}

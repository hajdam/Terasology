/*
 * Copyright 2014 MovingBlocks
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.terasology.rendering.nui.asset;

import org.terasology.assets.Asset;
import org.terasology.assets.AssetType;
import org.terasology.assets.ResourceUrn;
import org.terasology.module.sandbox.API;
import org.terasology.rendering.nui.UIWidget;

/**
 * @author Immortius
 */
@API
public class UIElement extends Asset<UIData> {

    private UIWidget rootWidget;

    public UIElement(ResourceUrn urn, AssetType<?, UIData> assetType, UIData data) {
        super(urn, assetType);
        reload(data);
    }

    @Override
    protected void doReload(UIData data) {
        rootWidget = data.getRootWidget();
    }

    @Override
    protected void doDispose() {
        rootWidget = null;
    }

    public UIWidget getRootWidget() {
        return rootWidget;
    }
}

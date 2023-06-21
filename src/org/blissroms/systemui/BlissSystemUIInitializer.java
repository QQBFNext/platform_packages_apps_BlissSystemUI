/*
 * Copyright (c) 2014-2023 BlissRoms Project
 *
 * SPDX-License-Identifier: Apache-2.0
 */

package org.blissroms.systemui;

import android.content.Context;

import com.android.systemui.SystemUIInitializer;
import com.android.systemui.dagger.GlobalRootComponent;

import org.blissroms.systemui.dagger.DaggerBlissGlobalRootComponent;

public class BlissSystemUIInitializer extends SystemUIInitializer {
    public BlissSystemUIInitializer(Context context) {
        super(context);
    }

    @Override
    protected GlobalRootComponent.Builder getGlobalRootComponentBuilder() {
        return DaggerBlissGlobalRootComponent.builder();
    }
}

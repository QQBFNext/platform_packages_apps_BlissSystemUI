/*
 * Copyright (c) 2014-2023 BlissRoms Project
 *
 * SPDX-License-Identifier: Apache-2.0
 */

package org.blissroms.systemui.dagger;

import com.android.systemui.dagger.GlobalModule;
import com.android.systemui.dagger.GlobalRootComponent;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = {GlobalModule.class})
public interface BlissGlobalRootComponent extends GlobalRootComponent {

    /**
     * Builder for BlissGlobalRootComponent
     */
    @Component.Builder
    interface Builder extends GlobalRootComponent.Builder {
        BlissGlobalRootComponent build();
    }

    @Override
    BlissSysUIComponent.Builder getSysUIComponent();
}

/*
 * Copyright (c) 2014-2023 BlissRoms Project
 *
 * SPDX-License-Identifier: Apache-2.0
 */

package org.blissroms.systemui

import android.content.Context
import com.android.systemui.SystemUIInitializer
import com.android.systemui.dagger.GlobalRootComponent
import org.blissroms.systemui.dagger.DaggerBlissGlobalRootComponent

class BlissSystemUIInitializer(context: Context) : SystemUIInitializer(context) {

    override fun getGlobalRootComponentBuilder(): GlobalRootComponent.Builder {
        return DaggerBlissGlobalRootComponent.builder()
    }
}

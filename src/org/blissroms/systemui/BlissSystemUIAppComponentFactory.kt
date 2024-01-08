/*
 * Copyright (c) 2014-2023 BlissRoms Project
 *
 * SPDX-License-Identifier: Apache-2.0
 */

package org.blissroms.systemui

import android.content.Context
import com.android.systemui.SystemUIAppComponentFactoryBase
import com.android.systemui.SystemUIInitializer

class BlissSystemUIAppComponentFactory: SystemUIAppComponentFactoryBase() {

    override fun createSystemUIInitializer(context: Context) = BlissSystemUIInitializer(context)
}

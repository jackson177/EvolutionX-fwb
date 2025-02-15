/*
 * Copyright (C) 2021 The Android Open Source Project
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
package com.android.systemui.biometrics

import com.android.systemui.bouncer.domain.interactor.PrimaryBouncerInteractor
import com.android.systemui.dump.DumpManager
import com.android.systemui.plugins.statusbar.StatusBarStateController
import com.android.systemui.statusbar.phone.SystemUIDialogManager

/**
 * Class that coordinates non-HBM animations for biometric prompt.
 */
class UdfpsBpViewController(
    view: UdfpsBpView,
    statusBarStateController: StatusBarStateController,
    primaryBouncerInteractor: PrimaryBouncerInteractor,
    systemUIDialogManager: SystemUIDialogManager,
    dumpManager: DumpManager
) : UdfpsAnimationViewController<UdfpsBpView>(
    view,
    statusBarStateController,
    primaryBouncerInteractor,
    systemUIDialogManager,
    dumpManager
) {
    override val tag = "UdfpsBpViewController"

    override fun shouldPauseAuth(): Boolean {
        return false
    }
}

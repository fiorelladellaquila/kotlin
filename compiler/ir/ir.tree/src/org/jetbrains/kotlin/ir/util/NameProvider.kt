/*
 * Copyright 2010-2020 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.ir.util

import org.jetbrains.kotlin.descriptors.DeclarationDescriptor
import org.jetbrains.kotlin.name.Name

interface NameProvider {
    fun nameForDeclaration(descriptor: DeclarationDescriptor): Name = descriptor.name

    object DEFAULT : NameProvider
}
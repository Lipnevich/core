package com.noxboxcore.core.contracts

import kotlinx.coroutines.flow.StateFlow

interface UAMInterface {

    val isLoggedIn: StateFlow<Boolean>
}
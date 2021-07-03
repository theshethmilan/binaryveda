package com.milan.binaryveda

import android.graphics.Typeface

class Config {
    companion object {
        const val  barlowExtraLight = "Barlow-ExtraLight.ttf"
        const val  barlowCondensedExtraLight = "BarlowCondensed-ExtraLight.ttf"
        const val  barlowCondensedLight = "BarlowCondensed-Light.ttf"
        const val  barlowCondensedMedium = "BarlowCondensed-Medium.ttf"
        const val  barlowMedium = "Barlow-Medium.ttf"

        var typefaceBarlowExtraLight: Typeface? = null
        var typefaceBarlowCondensedExtraLight: Typeface? = null
        var typefaceBarlowCondensedLight: Typeface? = null
        var typefaceBarlowCondensedMedium: Typeface? = null
        var typefaceBarlowMedium: Typeface? = null
    }
}
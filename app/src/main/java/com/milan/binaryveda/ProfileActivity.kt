package com.milan.binaryveda

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.textview.MaterialTextView

class ProfileActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)

        findViewById<MaterialTextView>(R.id.tvUploads).typeface =
            Config.typefaceBarlowCondensedLight
        findViewById<MaterialTextView>(R.id.tvEditProfile).typeface =
            Config.typefaceBarlowCondensedLight
        findViewById<MaterialTextView>(R.id.tvProfileName).typeface =
            Config.typefaceBarlowCondensedExtraLight
        findViewById<MaterialTextView>(R.id.tvMyDashboardTitle).typeface =
            Config.typefaceBarlowCondensedLight
        findViewById<MaterialTextView>(R.id.tvFollowersCounts).typeface =
            Config.typefaceBarlowCondensedLight
        findViewById<MaterialTextView>(R.id.tvFollowersTitle).typeface =
            Config.typefaceBarlowCondensedLight
        findViewById<MaterialTextView>(R.id.tvArtworksCounts).typeface =
            Config.typefaceBarlowCondensedLight
        findViewById<MaterialTextView>(R.id.tvArtworksTitle).typeface =
            Config.typefaceBarlowCondensedLight
        findViewById<MaterialTextView>(R.id.tvExhibitionsCounts).typeface =
            Config.typefaceBarlowCondensedLight
        findViewById<MaterialTextView>(R.id.tvExhibitionsTitle).typeface =
            Config.typefaceBarlowCondensedLight
        findViewById<MaterialTextView>(R.id.tvLikesCount).typeface =
            Config.typefaceBarlowExtraLight
        findViewById<MaterialTextView>(R.id.tvReactCount).typeface =
            Config.typefaceBarlowExtraLight
        findViewById<MaterialTextView>(R.id.tvShareCount).typeface =
            Config.typefaceBarlowExtraLight
        findViewById<MaterialTextView>(R.id.tvColorPalette).typeface =
            Config.typefaceBarlowCondensedMedium
    }
}
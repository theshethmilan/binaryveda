package com.milan.binaryveda

import android.content.Intent
import android.graphics.Typeface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.button.MaterialButton
import com.google.android.material.textview.MaterialTextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Config.typefaceBarlowExtraLight =
            Typeface.createFromAsset(assets, "fonts/${Config.barlowExtraLight}")
        Config.typefaceBarlowCondensedExtraLight =
            Typeface.createFromAsset(assets, "fonts/${Config.barlowCondensedExtraLight}")
        Config.typefaceBarlowCondensedLight =
            Typeface.createFromAsset(assets, "fonts/${Config.barlowCondensedLight}")
        Config.typefaceBarlowCondensedMedium =
            Typeface.createFromAsset(assets, "fonts/${Config.barlowCondensedMedium}")
        Config.typefaceBarlowMedium =
            Typeface.createFromAsset(assets, "fonts/${Config.barlowMedium}")

        findViewById<MaterialTextView>(R.id.tvTagLine).typeface = Config.typefaceBarlowExtraLight
        findViewById<MaterialButton>(R.id.btnRegister).apply {
            typeface = Config.typefaceBarlowCondensedExtraLight
            setOnClickListener {
                startActivity(Intent(this@MainActivity, ProfileActivity::class.java))
            }
        }
        findViewById<MaterialTextView>(R.id.tvCollector).typeface =
            Config.typefaceBarlowCondensedExtraLight
        findViewById<MaterialTextView>(R.id.tvTrackMyApplication).typeface =
            Config.typefaceBarlowCondensedExtraLight
        findViewById<MaterialTextView>(R.id.tv1).typeface = Config.typefaceBarlowCondensedLight
        findViewById<MaterialTextView>(R.id.tv2).typeface = Config.typefaceBarlowExtraLight
        findViewById<MaterialTextView>(R.id.tv3).typeface = Config.typefaceBarlowCondensedLight
        findViewById<MaterialTextView>(R.id.tv4).typeface = Config.typefaceBarlowExtraLight
        findViewById<MaterialTextView>(R.id.tv5).typeface = Config.typefaceBarlowCondensedLight
        findViewById<MaterialTextView>(R.id.tv6).typeface = Config.typefaceBarlowExtraLight
        findViewById<MaterialTextView>(R.id.tv7).typeface = Config.typefaceBarlowCondensedLight
        findViewById<MaterialTextView>(R.id.tv8).typeface = Config.typefaceBarlowExtraLight
        findViewById<MaterialTextView>(R.id.tv9).typeface = Config.typefaceBarlowCondensedLight
        findViewById<MaterialTextView>(R.id.tv10).typeface = Config.typefaceBarlowExtraLight
        findViewById<MaterialTextView>(R.id.tv11).typeface = Config.typefaceBarlowCondensedLight
        findViewById<MaterialTextView>(R.id.tv12).typeface = Config.typefaceBarlowExtraLight
        findViewById<MaterialTextView>(R.id.tv13).typeface = Config.typefaceBarlowCondensedLight
        findViewById<MaterialTextView>(R.id.tv14).typeface = Config.typefaceBarlowExtraLight
        findViewById<MaterialTextView>(R.id.tv15).typeface = Config.typefaceBarlowCondensedLight
        findViewById<MaterialTextView>(R.id.tv16).typeface = Config.typefaceBarlowExtraLight
        findViewById<MaterialTextView>(R.id.tvAboutUs).typeface =
            Config.typefaceBarlowCondensedMedium
        findViewById<MaterialTextView>(R.id.tvTeam).typeface = Config.typefaceBarlowCondensedMedium
        findViewById<MaterialTextView>(R.id.tvReachUs).typeface =
            Config.typefaceBarlowCondensedMedium
        findViewById<MaterialTextView>(R.id.tvAffiliations).typeface =
            Config.typefaceBarlowCondensedMedium
        findViewById<MaterialTextView>(R.id.tvDisclaimers).typeface =
            Config.typefaceBarlowCondensedMedium
        findViewById<MaterialTextView>(R.id.tvPrivacyPolicy).typeface =
            Config.typefaceBarlowCondensedMedium
        findViewById<MaterialTextView>(R.id.tvCopyright).typeface =
            Config.typefaceBarlowCondensedLight

    }
}
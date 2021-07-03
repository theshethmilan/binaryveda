package com.milan.binaryveda

import android.graphics.Typeface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.button.MaterialButton
import com.google.android.material.textview.MaterialTextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Config.typfaceBarlowExtraLight = Typeface.createFromAsset(assets, "fonts/${Config.barlowExtraLight}")
        Config.typfaceBarlowCondensedExtraLight = Typeface.createFromAsset(assets, "fonts/${Config.barlowCondensedExtraLight}")
        Config.typfaceBarlowCondensedLight = Typeface.createFromAsset(assets, "fonts/${Config.barlowCondensedLight}")
        Config.typfaceBarlowCondensedMedium = Typeface.createFromAsset(assets, "fonts/${Config.barlowCondensedMedium}")

        findViewById<MaterialTextView>(R.id.tvTagLine).typeface = Config.typfaceBarlowExtraLight
        findViewById<MaterialButton>(R.id.btnRegister).typeface = Config.typfaceBarlowCondensedExtraLight
        findViewById<MaterialTextView>(R.id.tvCollector).typeface = Config.typfaceBarlowCondensedExtraLight
        findViewById<MaterialTextView>(R.id.tvTrackMyApplication).typeface = Config.typfaceBarlowCondensedExtraLight
        findViewById<MaterialTextView>(R.id.tv1).typeface = Config.typfaceBarlowCondensedLight
        findViewById<MaterialTextView>(R.id.tv2).typeface = Config.typfaceBarlowExtraLight
        findViewById<MaterialTextView>(R.id.tv3).typeface = Config.typfaceBarlowCondensedLight
        findViewById<MaterialTextView>(R.id.tv4).typeface = Config.typfaceBarlowExtraLight
        findViewById<MaterialTextView>(R.id.tv5).typeface = Config.typfaceBarlowCondensedLight
        findViewById<MaterialTextView>(R.id.tv6).typeface = Config.typfaceBarlowExtraLight
        findViewById<MaterialTextView>(R.id.tv7).typeface = Config.typfaceBarlowCondensedLight
        findViewById<MaterialTextView>(R.id.tv8).typeface = Config.typfaceBarlowExtraLight
        findViewById<MaterialTextView>(R.id.tv9).typeface = Config.typfaceBarlowCondensedLight
        findViewById<MaterialTextView>(R.id.tv10).typeface = Config.typfaceBarlowExtraLight
        findViewById<MaterialTextView>(R.id.tv11).typeface = Config.typfaceBarlowCondensedLight
        findViewById<MaterialTextView>(R.id.tv12).typeface = Config.typfaceBarlowExtraLight
        findViewById<MaterialTextView>(R.id.tv13).typeface = Config.typfaceBarlowCondensedLight
        findViewById<MaterialTextView>(R.id.tv14).typeface = Config.typfaceBarlowExtraLight
        findViewById<MaterialTextView>(R.id.tv15).typeface = Config.typfaceBarlowCondensedLight
        findViewById<MaterialTextView>(R.id.tv16).typeface = Config.typfaceBarlowExtraLight
        findViewById<MaterialTextView>(R.id.tvAboutUs).typeface = Config.typfaceBarlowCondensedMedium
        findViewById<MaterialTextView>(R.id.tvTeam).typeface = Config.typfaceBarlowCondensedMedium
        findViewById<MaterialTextView>(R.id.tvReachUs).typeface = Config.typfaceBarlowCondensedMedium
        findViewById<MaterialTextView>(R.id.tvAffiliations).typeface = Config.typfaceBarlowCondensedMedium
        findViewById<MaterialTextView>(R.id.tvDisclaimers).typeface = Config.typfaceBarlowCondensedMedium
        findViewById<MaterialTextView>(R.id.tvPrivacyPolicy).typeface = Config.typfaceBarlowCondensedMedium
        findViewById<MaterialTextView>(R.id.tvCopyright).typeface = Config.typfaceBarlowCondensedLight

    }
}
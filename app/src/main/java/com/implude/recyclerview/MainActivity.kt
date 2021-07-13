package com.implude.recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val profileList = arrayListOf(
            Profiles(R.drawable.profile, "혜리", "@hyeri_0609"),
            Profiles(R.drawable.profile, "ROSÉ", "@roses_are_rosie"),
            Profiles(R.drawable.profile, "TaeYeon", "@taeyeon_ss"),
            Profiles(R.drawable.profile, "Arin", "@ye._.vely618"),
            Profiles(R.drawable.profile, "이지금 IU", "@dlwlrma"),
            Profiles(R.drawable.profile, "Bebe Rexha", "@beberexha"),
            Profiles(R.drawable.profile, "헤이즈,,다혜. ☃️", "@heizeheize"),
            Profiles(R.drawable.profile, "김도연", "@lafilledhiver_"),
            Profiles(R.drawable.profile, "P.O", "@pyojihoon_official")
        )

        recycler_view.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        recycler_view.setHasFixedSize(true)

        recycler_view.adapter = Adapter(profileList)
    }
}
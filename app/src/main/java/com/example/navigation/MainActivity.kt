package com.example.navigation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.widget.Toolbar
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.core.view.GravityCompat
import androidx.drawerlayout.widget.DrawerLayout

class MainActivity : AppCompatActivity() {
    private lateinit var mtb: Toolbar
    private lateinit var myDrawerLayout: DrawerLayout


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mtb = findViewById(R.id.mtb)
        setSupportActionBar(mtb)

        myDrawerLayout = findViewById(R.id.myDrawer)

        val toggle = ActionBarDrawerToggle(
            this,
            myDrawerLayout,
            mtb,
            R.string.navigation_drawer_open,
            R.string.navigation_drawer_open
        )

        myDrawerLayout.addDrawerListener(toggle)
        toggle.syncState()
    }

    @Deprecated("Deprecated in Java")
    @Override
    override fun onBackPressed() {
        if (myDrawerLayout.isDrawerOpen(GravityCompat.START)) {
            myDrawerLayout.closeDrawer(GravityCompat.START)
        }else {
            super.onBackPressed()
        }
    }
}
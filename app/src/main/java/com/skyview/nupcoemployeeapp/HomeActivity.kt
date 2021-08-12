package com.skyview.nupcoemployeeapp

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.AdapterView.OnItemClickListener
import android.widget.GridView
import android.widget.ImageView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager.widget.ViewPager
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.google.android.material.tabs.TabLayout
import java.util.*

class HomeActivity : AppCompatActivity() {
//    public var listItems: List<ItemModelClass>? = null
//    public var page: ViewPager? = null
    public lateinit var tabLayout: TabLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        val gridView = findViewById<GridView>(R.id.grid_view)
        val imageView = findViewById<ImageView>(R.id.userImage)

//        page = findViewById<ViewPager>(R.id.my_pager)
        tabLayout = findViewById(R.id.my_tablayout)


        // Make a copy of the slides you'll be presenting.

        // Make a copy of the slides you'll be presenting.
//        listItems = ArrayList<ItemModelClass>()
//        (listItems as ArrayList<ItemModelClass>).add(ItemModelClass(R.drawable.gr12235, "“If Your Ship Doesn't Come In, Swim Out To Meet It.”"))
//        (listItems as ArrayList<ItemModelClass>).add(ItemModelClass(R.drawable.gr12235, "Slider 2 Title"))
//        (listItems as ArrayList<ItemModelClass>).add(ItemModelClass(R.drawable.gr12235, "Slider 3 Title"))
//        val itemsPager_adapter = ItemAdapter(this, listItems)
//        with(page) {
//            this?.setAdapter(itemsPager_adapter)
//        }
        // The_slide_timer
//        val timer = Timer()
//        timer.scheduleAtFixedRate(HomeActivity.The_slide_timer(), 2000, 3000)
//        tabLayout.setupWithViewPager(page, true)


        val gridTxt = arrayOf(
            "Vacation",
            "Payslip"
        )
        val grid_img = intArrayOf(
            R.drawable.ic_calendar__3_,
            R.drawable.ic_dollar_symbol
        )
        val adapter = MainAdapter(this@HomeActivity, gridTxt, grid_img)
        gridView.adapter = adapter
        gridView.onItemClickListener =
            OnItemClickListener { parent: AdapterView<*>?, view: View?, position: Int, id: Long ->
                Toast.makeText(
                    applicationContext,
                    "you clicked" + gridTxt[+position],
                    Toast.LENGTH_SHORT
                ).show()
                if (position == 0) {
                    val redirect = Intent(this@HomeActivity, Health::class.java)
                    startActivity(redirect)
                } else if (position == 1) {
                    val redirect = Intent(this@HomeActivity, MainActivity::class.java)
                    startActivity(redirect)
                }
            }

        //initialize & Assign variable

        //initialize & Assign variable
        val bottomNavigationView =
            findViewById<BottomNavigationView>(R.id.bottom_navigation)
        bottomNavigationView.selectedItemId = R.id.dashboard
        //perform item selectedListener
        //perform item selectedListener
        bottomNavigationView.setOnNavigationItemSelectedListener(BottomNavigationView.OnNavigationItemSelectedListener { menuitem ->
            when (menuitem.itemId) {
                R.id.dashboard -> return@OnNavigationItemSelectedListener true
                R.id.notification -> {
                    startActivity(Intent(applicationContext, Notification::class.java))
                    overridePendingTransition(0, 0)
                    return@OnNavigationItemSelectedListener true
                }
                R.id.chat -> {
                    startActivity(Intent(applicationContext, ChatActivity::class.java))
                    overridePendingTransition(0, 0)
                    return@OnNavigationItemSelectedListener true
                }
                R.id.account -> {
                    startActivity(Intent(applicationContext, SettingActivity::class.java))
                    overridePendingTransition(0, 0)
                    return@OnNavigationItemSelectedListener true
                }
            }
            false
        })
    }
}

//    class The_slide_timer : TimerTask() {
//        override fun run() {
//            if (page.getCurrentItem()< listItems.size - 1) {
//                page.setCurrentItem(page.getCurrentItem() + 1)
//            } else page.setCurrentItem(0)
//        }
//    }
//}




//           con runOnUiThread(Runnable {
//                if (page.getCurrentItem() < listItems.size - 1) {
//                    page.setCurrentItem(page.getCurrentItem() + 1)
//                } else page.setCurrentItem(0)
//            })


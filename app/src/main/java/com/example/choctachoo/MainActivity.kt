package com.example.choctachoo

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import java.util.ArrayList

class MainActivity : AppCompatActivity() {
    private lateinit var drinkList : ArrayList<Drinks>
    private lateinit var drinkList2 : ArrayList<Drinks>
    private lateinit var drinkList3 : ArrayList<Drinks>
    private lateinit var drinkList4 : ArrayList<Drinks>
    private lateinit var rv : RecyclerView
    private lateinit var rv2 : RecyclerView
    private lateinit var rv3 : RecyclerView
    private lateinit var rv4 : RecyclerView
    private lateinit var adapter: DrinksRvAdapter
    private lateinit var adapter2: DrinksRvAdapter
    private lateinit var adapter3: DrinksRvAdapter
    private lateinit var adapter4: DrinksRvAdapter
    private lateinit var mContext: Context
    private lateinit var offer: ImageView
    private lateinit var contact: Button
    private lateinit var about: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mContext = this
        setContentView(R.layout.activity_main)
        contact = findViewById(R.id.button)
        offer = findViewById(R.id.imageView2)
        rv =findViewById(R.id.recyclerView)
        rv2 =findViewById(R.id.recyclerView2)
        rv3 =findViewById(R.id.recyclerView3)
        rv4 =findViewById(R.id.recyclerView4)
        rv.layoutManager = StaggeredGridLayoutManager(1, StaggeredGridLayoutManager.VERTICAL)
        rv2.layoutManager = StaggeredGridLayoutManager(1, StaggeredGridLayoutManager.VERTICAL)
        rv3.layoutManager = StaggeredGridLayoutManager(1, StaggeredGridLayoutManager.VERTICAL)

        val i1 = Drinks("Old Fashioned")
        val i2 = Drinks("Sazerac")
        val i3 = Drinks("Improved Gin Cocktail")

        val i4 = Drinks("Whiskey Sour")
        val i5 = Drinks("Daiquiri")
        val i6 = Drinks("Margarita")
        val i7 = Drinks("Sidecar")
        val i8 = Drinks("Corpse Reviver #2")
        val i9 = Drinks("Cosmopolitan")

        val i10 = Drinks("Negroni")
        val i11 = Drinks("Boulevardier")
        val i12 = Drinks("Manhattan")
        val i13 = Drinks("Martini")

        val i14 = Drinks("Pina Colada")
        val i15 = Drinks("Mai Tai")



        drinkList = ArrayList<Drinks>()
        drinkList2 = ArrayList<Drinks>()
        drinkList3 = ArrayList<Drinks>()
        drinkList4 = ArrayList<Drinks>()

        drinkList.add(i1)
        drinkList.add(i2)
        drinkList.add(i3)

        drinkList2.add(i4)
        drinkList2.add(i5)
        drinkList2.add(i6)
        drinkList2.add(i7)
        drinkList2.add(i8)
        drinkList2.add(i9)

        drinkList3.add(i10)
        drinkList3.add(i11)
        drinkList3.add(i12)
        drinkList3.add(i13)

        drinkList4.add(i14)
        drinkList4.add(i15)



        adapter = DrinksRvAdapter(this,drinkList)
        adapter2 = DrinksRvAdapter(this,drinkList2)
        adapter3 = DrinksRvAdapter(this,drinkList3)
        adapter4 = DrinksRvAdapter(this,drinkList4)

        rv.adapter = adapter
        rv2.adapter = adapter2
        rv3.adapter = adapter3
        rv4.adapter = adapter4


        offer.setOnClickListener { view ->
            onSeriesButtonClick(view)
        }
        contact.setOnClickListener { view ->
            onSeriesButtonClick2(view)
        }
    }





    private fun onSeriesButtonClick(view: View) {

        Toast.makeText(this,"Added to your shopping cart", Toast.LENGTH_LONG).show()

    }
    private fun onSeriesButtonClick2(view: View) {



        val intent = Intent(this, InformationActivity::class.java)
        intent.putExtra("infoname", "contact")
        startActivity(intent)
    }

}
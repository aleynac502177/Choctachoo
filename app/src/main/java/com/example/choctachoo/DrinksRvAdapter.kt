package com.example.choctachoo

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView

class DrinksRvAdapter (private val mContext: Context, private val drinksList: List<Drinks>) : RecyclerView.Adapter<DrinksRvAdapter.CardViewDesignObjectHolder>() {

    inner class CardViewDesignObjectHolder(view: View): RecyclerView.ViewHolder(view) {
        var CardView: CardView
        var text: TextView
        var cardImage: ImageView
        init {
            CardView = view.findViewById(R.id.CardView)
            text = view.findViewById(R.id.textt)
            cardImage=view.findViewById(R.id.imageView)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardViewDesignObjectHolder {

        val design = LayoutInflater.from(mContext).inflate(R.layout.cardview,parent,false)
        return  CardViewDesignObjectHolder(design)
    }



    override fun getItemCount(): Int {
        return drinksList.size
    }

    override fun onBindViewHolder(
        holder: DrinksRvAdapter.CardViewDesignObjectHolder,
        position: Int
    ) {
        val drinks = drinksList[position]
        holder.text.setText(drinks.name)

        if (drinks.name=="Old Fashioned") {
            holder.cardImage.setBackgroundResource(R.drawable.old)

        }
        if (drinks.name=="Sazerac") {
            holder.cardImage.setBackgroundResource(R.drawable.sazerac)

        }
        if (drinks.name.equals("Improved Gin Cocktail")) {
            holder.cardImage.setBackgroundResource(R.drawable.gin)
        }



        if (drinks.name=="Whiskey Sour") {
            holder.cardImage.setBackgroundResource(R.drawable.whiskeysour)

        }
        if (drinks.name=="Daiquiri") {
            holder.cardImage.setBackgroundResource(R.drawable.daiquiri)

        }
        if (drinks.name=="Margarita") {
            holder.cardImage.setBackgroundResource(R.drawable.margarita)
        }
        if (drinks.name=="Sidecar") {
            holder.cardImage.setBackgroundResource(R.drawable.sidecar)
        }
        if (drinks.name=="Corpse Reviver #2") {
            holder.cardImage.setBackgroundResource(R.drawable.corpse)
        }
        if (drinks.name=="Cosmopolitan") {
            holder.cardImage.setBackgroundResource(R.drawable.cosmopolitan)
        }

        if (drinks.name=="Negroni") {
            holder.cardImage.setBackgroundResource(R.drawable.negroni)
        }
        if (drinks.name=="Boulevardier") {
            holder.cardImage.setBackgroundResource(R.drawable.boulevardier)
        }
        if (drinks.name=="Manhattan") {
            holder.cardImage.setBackgroundResource(R.drawable.manhattan)
        }
        if (drinks.name=="Martini") {
            holder.cardImage.setBackgroundResource(R.drawable.martini)
        }



        if (drinks.name=="Pina Colada") {
            holder.cardImage.setBackgroundResource(R.drawable.pina)
        }
        if (drinks.name=="Mai Tai") {
            holder.cardImage.setBackgroundResource(R.drawable.maitai)
        }


       holder.CardView.setOnClickListener(View.OnClickListener {
            val intent = Intent(mContext, DrinksActivity::class.java)
            intent.putExtra("drinkname", drinks.name)
            mContext.startActivity(intent)
        })
    }
}
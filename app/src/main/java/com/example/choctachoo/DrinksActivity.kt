package com.example.choctachoo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast

class DrinksActivity : AppCompatActivity() {
    private lateinit var imagedrink : ImageView
    private lateinit var textdrink : TextView
    private lateinit var drinkName : String
    private lateinit var textViewdrink : TextView
    private lateinit var buttonBuy : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_drinks)
        textViewdrink = findViewById(R.id.textViewdrink)
        buttonBuy = findViewById(R.id.button4)

        textViewdrink.setText("Information of the drink ")
        if (intent.hasExtra("drinkname")) {
            drinkName = intent.getStringExtra("drinkname")!!
        }
        imagedrink = findViewById(R.id.imagedrink)
        textdrink = findViewById(R.id.textdrink)

        if(drinkName.equals("Old Fashioned")) {
            imagedrink.setBackgroundResource(R.drawable.old)
            textdrink.setText(
                "Base Spirit: Whiskey (usually bourbon or rye).\n" +
                        "Flavor Profile: Strong, aromatic, and slightly sweet due to the sugar and bitters.\n" +
                        "Serving Style: Served over ice in a short glass with a citrus twist.\n" +
                        "Signature Ingredient: Angostura bitters.\n")

        }
        if(drinkName.equals("Sazerac")) {
            imagedrink.setBackgroundResource(R.drawable.sazerac)
            textdrink.setText(
                "Base Spirit: Rye whiskey.\n" +
                        "Flavor Profile: Bold, spicy, and aromatic with a hint of absinthe.\n" +
                        "Serving Style: Served in a chilled glass rinsed with absinthe, garnished with a lemon twist.\n" +
                        "Signature Ingredient: Absinthe.\n")
        }
        if(drinkName.equals("Improved Gin Cocktail")) {
            imagedrink.setBackgroundResource(R.drawable.gin)
            textdrink.setText(
                "Base Spirit: Gin.\n" +
                        "Flavor Profile: Bright, herbaceous, and slightly bitter.\n" +
                        "Serving Style: Stirred and strained into a chilled glass.\n" +
                        "Signature Ingredient: Maraschino liqueur and absinthe rinse.\n")
        }
        if(drinkName.equals("Whiskey Sour")) {
            imagedrink.setBackgroundResource(R.drawable.whiskeysour)
            textdrink.setText(
                "Base Spirit: Whiskey (bourbon or rye).\n" +
                        "Flavor Profile: Balanced between sweet, sour, and boozy.\n" +
                        "Serving Style: Shaken with ice and strained into a rocks glass.\n" +
                        "Signature Ingredient: Fresh lemon juice.\n")
        }
        if(drinkName.equals("Daiquiri")) {
            imagedrink.setBackgroundResource(R.drawable.daiquiri)
            textdrink.setText(
                "Base Spirit: Rum.\n" +
                        "Flavor Profile: Crisp, refreshing, and citrusy.\n" +
                        "Serving Style: Shaken with ice and strained into a chilled glass.\n" +
                        "Signature Ingredient: Fresh lime juice and simple syrup.\n")
        }

        if(drinkName.equals("Margarita")) {
            imagedrink.setBackgroundResource(R.drawable.margarita)
            textdrink.setText(
                "Base Spirit: Tequila.\n" +
                        "Flavor Profile: Tangy, citrusy, and slightly sweet with a hint of salt.\n" +
                        "Serving Style: Shaken with ice and strained into a salt-rimmed glass.\n" +
                        "Signature Ingredient: Triple sec and fresh lime juice.\n")
        }

        if(drinkName.equals("Sidedrink")) {
            imagedrink.setBackgroundResource(R.drawable.sidecar)
            textdrink.setText(
                "Base Spirit: Brandy.\n" +
                        "Flavor Profile: Smooth, citrusy, and balanced.\n" +
                        "Serving Style: Shaken with ice and strained into a sugar-rimmed glass.\n" +
                        "Signature Ingredient: Cointreau and fresh lemon juice.\n")
        }

        if(drinkName.equals("Corpse Reviver #2")) {
            imagedrink.setBackgroundResource(R.drawable.corpse)
            textdrink.setText(
                "Base Spirit: Gin.\n" +
                        "Flavor Profile: Refreshing, herbal, and slightly tart.\n" +
                        "Serving Style: Stirred and strained into a chilled glass.\n" +
                        "Signature Ingredient: Lillet Blanc and absinthe rinse.\n")
        }

        if(drinkName.equals("Cosmopolitan")) {
            imagedrink.setBackgroundResource(R.drawable.cosmopolitan)
            textdrink.setText(
                "Base Spirit: Vodka.\n" +
                        "Flavor Profile: Crisp, fruity, and slightly tart.\n" +
                        "Serving Style: Shaken with ice and strained into a chilled glass.\n" +
                        "Signature Ingredient: Cranberry juice and triple sec.\n")
        }

        if(drinkName.equals("Negroni")) {
            imagedrink.setBackgroundResource(R.drawable.negroni)
            textdrink.setText(
                "Base Spirit: Gin.\n" +
                        "Flavor Profile: Bitter, herbal, and complex.\n" +
                        "Serving Style: Stirred and served over ice in a rocks glass.\n" +
                        "Signature Ingredient: Campari (a bitter Italian liqueur).\n")
        }

        if(drinkName.equals("Boulevardier")) {
            imagedrink.setBackgroundResource(R.drawable.boulevardier)
            textdrink.setText(
                "Base Spirit: Bourbon.\n" +
                        "Flavor Profile: Bitter, bold, and slightly sweet.\n" +
                        "Serving Style: Stirred and served over ice in a rocks glass.\n" +
                        "Signature Ingredient: Campari and sweet vermouth.\n")
        }

        if(drinkName.equals("Manhattan")) {
            imagedrink.setBackgroundResource(R.drawable.manhattan)
            textdrink.setText(
                "Base Spirit: Whiskey (usually bourbon or rye).\n" +
                        "Flavor Profile: Rich, boozy, and slightly sweet with a hint of bitterness.\n" +
                        "Serving Style: Stirred and strained into a chilled glass.\n" +
                        "Signature Ingredient: Sweet vermouth and Angostura bitters.\n")
        }

        if(drinkName.equals("Martini")) {
            imagedrink.setBackgroundResource(R.drawable.martini)
            textdrink.setText(
                "Base Spirit: Gin or vodka.\n" +
                        "Flavor Profile: Clean, crisp, and aromatic.\n" +
                        "Serving Style: Stirred or shaken and strained into a chilled glass.\n" +
                        "Signature Ingredient: Dry vermouth and olive or lemon twist garnish.\n")
        }

        if(drinkName.equals("Pina Colada")) {
            imagedrink.setBackgroundResource(R.drawable.pina)
            textdrink.setText(
                "Base Spirit: Rum.\n" +
                        "Flavor Profile: Tropical, creamy, and sweet.\n" +
                        "Serving Style: Blended with ice and served in a tall glass.\n" +
                        "Signature Ingredient: Coconut cream and pineapple juice.\n")
        }

        if(drinkName.equals("Mai Tai")) {
            imagedrink.setBackgroundResource(R.drawable.maitai)
            textdrink.setText(
                "Base Spirit: Rum.\n" +
                        "Flavor Profile: Tropical, fruity, and complex.\n" +
                        "Serving Style: Shaken with ice and strained into a rocks glass.\n" +
                        "Signature Ingredient: Orgeat syrup and lime juice.\n")
        }



        buttonBuy.setOnClickListener{
            Toast.makeText(this,"Added to your shopping cart",Toast.LENGTH_LONG).show()
        }
    }
}
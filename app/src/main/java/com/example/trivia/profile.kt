package com.example.trivia

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.AutoCompleteTextView
import android.widget.Toast

class profile : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)
        val items = listOf("Sports", "Entertainment:video games")

        val autocomplete: AutoCompleteTextView = findViewById(R.id.auto_compl)

        val adapter = ArrayAdapter(this, R.layout.list_item, items)

        autocomplete.setAdapter(adapter)

        autocomplete.onItemClickListener =
            AdapterView.OnItemClickListener { adapterView, view, i, l ->

                val itemSelected = adapterView.getItemAtPosition(i)

                Toast.makeText(this, "Item: $itemSelected", Toast.LENGTH_SHORT).show()
            }
        val autoComplete = listOf("Easy", "Medium", "Hard")

        val autocomp: AutoCompleteTextView = findViewById(R.id.auto)

        val adapt = ArrayAdapter(this, R.layout.list_item, items)

        autocomplete.setAdapter(adapter)

        autocomplete.onItemClickListener =
            AdapterView.OnItemClickListener { adapterView, view, i, l ->

                val itemSelected = adapterView.getItemAtPosition(i)

                Toast.makeText(this, "Item: $itemSelected", Toast.LENGTH_SHORT).show()
            }
    }
}
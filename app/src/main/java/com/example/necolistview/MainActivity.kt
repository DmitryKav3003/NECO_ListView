package com.example.necolistview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast
import androidx.core.view.get

class MainActivity : AppCompatActivity() {

    var listView: ListView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        listView = findViewById(R.id.listView)

        var nameList = ArrayList<String>()
        nameList.add("Серега")
        nameList.add("Алексей")
        nameList.add("Иван")
        nameList.add("Константин")

        val adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, nameList)
        listView?.adapter = adapter

        listView?.setOnItemClickListener { parent, view, position, id ->
            Toast.makeText(this, "Pussed: ${nameList?.get(position)}", Toast.LENGTH_SHORT).show()
        }

    }
}
package com.example.recyclerview

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // getting the recyclerview by its id
        val recyclerview = findViewById<RecyclerView>(R.id.recyclerview)

        // this creates a vertical layout Manager
        recyclerview.layoutManager = LinearLayoutManager(this)

        // ArrayList of class ItemsViewModel
        val data = ArrayList<ItemsViewModel>()

        // the image with the count of view
        for (i in 1..15) {
            data.add(ItemsViewModel(R.drawable.folder, "Artificial Intelligence"))
            data.add(ItemsViewModel(R.drawable.folder, "Data Structures"))
            data.add(ItemsViewModel(R.drawable.folder, "Database Management Systems"))
            data.add(ItemsViewModel(R.drawable.folder, "Digital Marketing"))
            data.add(ItemsViewModel(R.drawable.folder, "Discrete Mathematics"))
            data.add(ItemsViewModel(R.drawable.folder, "Ethics in IT"))
            data.add(ItemsViewModel(R.drawable.folder, "Game Development"))
            data.add(ItemsViewModel(R.drawable.folder, "Human-Computer Interaction"))
            data.add(ItemsViewModel(R.drawable.folder, "Machine Learning"))
            data.add(ItemsViewModel(R.drawable.folder, "Operating Systems"))
            data.add(ItemsViewModel(R.drawable.folder, "Programming Paradigms"))
            data.add(ItemsViewModel(R.drawable.folder, "Software Quality Assurance"))
            data.add(ItemsViewModel(R.drawable.folder, "UI/UX Design"))
            data.add(ItemsViewModel(R.drawable.folder, "Virtual Reality"))
            data.add(ItemsViewModel(R.drawable.folder, "Wireless Networks"))
        }

        // This will pass the ArrayList to our Adapter
        val adapter = CustomAdapter(data)

        // Setting the Adapter with the recyclerview
        recyclerview.adapter = adapter

    }
}
package com.elvanarvis.bootcamprecyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import androidx.recyclerview.widget.LinearLayoutManager
import com.elvanarvis.bootcamprecyclerview.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val dogList = arrayListOf(

            DogModel(R.drawable.avustralyacoban,"Avustralya Çoban"),
            DogModel(R.drawable.danua,"Danua"),
            DogModel(R.drawable.golden,"Golden"),
            DogModel(R.drawable.husky,"Husky"),
            DogModel(R.drawable.jackrussellterrier,"Jack Russel Terrier"),
            DogModel(R.drawable.pomsky,"pomsky"),
            DogModel(R.drawable.leonberger,"Leonberger")

        )

        val dogAdapter = DogAdapter(dogList)
        binding.recyclerView.layoutManager = LinearLayoutManager(applicationContext, LinearLayoutManager.VERTICAL, false)
        binding.recyclerView.adapter = dogAdapter
        binding.recyclerView.setHasFixedSize(true)
    }
}










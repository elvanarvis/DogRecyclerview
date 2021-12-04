package com.elvanarvis.bootcamprecyclerview

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.elvanarvis.bootcamprecyclerview.databinding.DogCardViewBinding

class DogAdapter(private var dogList: ArrayList<DogModel>): RecyclerView.Adapter<DogAdapter.DogCardTasarim>() {

    //view binding ile birlikte adapterin card xml dosyasıyla iletişimini sağlayacak. Main activitydeki mantığın buraya adapte edilmiş hali
    class DogCardTasarim(val dogCardTasarimBinding: DogCardViewBinding): RecyclerView.ViewHolder(dogCardTasarimBinding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DogCardTasarim {
        //bağlama işlemi gerçekleştiriliyor
        val layoutInflater = LayoutInflater.from(parent.context)
        val dogCardTasarimBinding = DogCardViewBinding.inflate(layoutInflater,parent,false)
        return DogCardTasarim(dogCardTasarimBinding)
    }

    override fun onBindViewHolder(holder: DogCardTasarim, position: Int) {
        //bütün kartlar burada yazdırılıyor. Bir for döngüsü gibi çalışır
        val dog = dogList[position]
        holder.dogCardTasarimBinding.cardImage.setImageResource(dog.dogImage)
        holder.dogCardTasarimBinding.cardText.text = dog.dogName
        holder.dogCardTasarimBinding.cardImage.setOnClickListener {
            
        }
    }

    override fun getItemCount(): Int = dogList.size   // position ı belirler
}




















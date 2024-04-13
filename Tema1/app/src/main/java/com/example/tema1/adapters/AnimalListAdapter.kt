package com.example.tema1.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.tema1.R
import com.example.tema1.helpers.extensions.logErrorMessage
import com.example.tema1.models.AfricaAnimalModel
import com.example.tema1.models.AnimalModel
import com.example.tema1.models.AnimalOrigin
import com.example.tema1.models.AntarcticaAnimalModel
import com.example.tema1.models.AsiaAnimalModel
import com.example.tema1.models.AustraliaAnimalModel
import com.example.tema1.models.EuropeAnimalModel
import com.example.tema1.models.NorthAmericaAnimalModel
import com.example.tema1.models.SouthAmericaAnimalModel

class AnimalListAdapter(
    private val items: List<AnimalModel>
) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    private lateinit var mListener: onItemClickListener
    interface onItemClickListener {
        fun onItemClick(position: Int)
    }

    fun setOnItemClickListener(listener: onItemClickListener) {
        mListener = listener
    }

    override fun getItemCount() = items.size

    override fun getItemViewType(position: Int): Int = items[position].origin.key


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        "onCreateViewHolder".logErrorMessage("AnimalListAdapter")
        return when(viewType) {
            AnimalOrigin.EUROPE.key -> {
                val view = inflater.inflate(R.layout.europe_animal_cell, parent, false)
                EuropeViewHolder(view, mListener)
            }
            AnimalOrigin.AFRICA.key -> {
                val view = inflater.inflate(R.layout.africa_animal_cell, parent, false)
                AfricaViewHolder(view, mListener)
            }
            AnimalOrigin.ANTARCTICA.key -> {
                val view = inflater.inflate(R.layout.antarctica_animal_cell, parent, false)
                AntarcticaViewHolder(view, mListener)
            }
            AnimalOrigin.SOUTH_AMERICA.key -> {
                val view = inflater.inflate(R.layout.south_america_animal_cell, parent, false)
                SouthAmericaViewHolder(view, mListener)
            }
            AnimalOrigin.NORTH_AMERICA.key -> {
                val view = inflater.inflate(R.layout.north_america_animal_cell, parent, false)
                NorthAmericaViewHolder(view, mListener)
            }
            AnimalOrigin.ASIA.key -> {
                val view = inflater.inflate(R.layout.asia_animal_cell, parent, false)
                AsiaViewHolder(view, mListener)
            }
            AnimalOrigin.AUSTRALIA.key -> {
                val view = inflater.inflate(R.layout.australia_animal_cell, parent, false)
                AustraliaViewHolder(view, mListener)
            }
            else -> throw IllegalArgumentException("Invalid view type")
        }
    }

    open inner class ViewHolder(view: View, listener: onItemClickListener) : RecyclerView.ViewHolder(view) {
        protected val animalNameTextView : TextView
        protected val animalOriginTextView : TextView

        init {
            animalNameTextView = view.findViewById(R.id.tv_animal_name)
            animalOriginTextView = view.findViewById(R.id.tv_animal_origin)

            itemView.setOnClickListener {
                val position = adapterPosition
                if (position != RecyclerView.NO_POSITION) {
                    listener.onItemClick(position)
                }
            }
        }
    }

    inner class EuropeViewHolder(view: View, listener: onItemClickListener) : ViewHolder(view, mListener) {
        fun bind(animal: EuropeAnimalModel) {
            animalNameTextView.text = animal.name
            animalOriginTextView.text = animal.origin.name
        }
    }

    inner class AfricaViewHolder(view: View, listener: onItemClickListener) : ViewHolder(view, mListener) {

        fun bind(animal: AfricaAnimalModel) {
            animalNameTextView.text = animal.name
            animalOriginTextView.text = animal.origin.name
        }
    }

    inner class AntarcticaViewHolder(view: View, listener: onItemClickListener) : ViewHolder(view, mListener) {
        fun bind(animal: AntarcticaAnimalModel) {
            animalNameTextView.text = animal.name
            animalOriginTextView.text = animal.origin.name
        }
    }

    inner class SouthAmericaViewHolder(view: View, listener: onItemClickListener) : ViewHolder(view, mListener) {
        fun bind(animal: SouthAmericaAnimalModel) {
            animalNameTextView.text = animal.name
            animalOriginTextView.text = animal.origin.name
        }
    }

    inner class NorthAmericaViewHolder(view: View, listener: onItemClickListener) : ViewHolder(view, mListener) {
        fun bind(animal: NorthAmericaAnimalModel) {
            animalNameTextView.text = animal.name
            animalOriginTextView.text = animal.origin.name
        }
    }

    inner class AsiaViewHolder(view: View, listener: onItemClickListener) : ViewHolder(view, mListener) {
        fun bind(animal: AsiaAnimalModel) {
            animalNameTextView.text = animal.name
            animalOriginTextView.text = animal.origin.name
        }
    }

    inner class AustraliaViewHolder(view: View, listener: onItemClickListener) : ViewHolder(view, mListener) {
        fun bind(animal: AustraliaAnimalModel) {
            animalNameTextView.text = animal.name
            animalOriginTextView.text = animal.origin.name
        }
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val animal = items[position]
        when(holder) {
            is EuropeViewHolder -> (animal as? EuropeAnimalModel)?.let { holder.bind(it) }
            is AfricaViewHolder -> (animal as? AfricaAnimalModel)?.let { holder.bind(it) }
            is AntarcticaViewHolder -> (animal as? AntarcticaAnimalModel)?.let { holder.bind(it) }
            is SouthAmericaViewHolder -> (animal as? SouthAmericaAnimalModel)?.let { holder.bind(it) }
            is NorthAmericaViewHolder -> (animal as? NorthAmericaAnimalModel)?.let { holder.bind(it) }
            is AsiaViewHolder -> (animal as? AsiaAnimalModel)?.let { holder.bind(it) }
            is AustraliaViewHolder -> (animal as? AustraliaAnimalModel)?.let { holder.bind(it) }
        }
        "onBindViewHolder; position = $position".logErrorMessage("AnimalListAdapter")
    }
}
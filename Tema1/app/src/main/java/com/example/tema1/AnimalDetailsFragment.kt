package com.example.tema1

import android.os.Bundle
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.RelativeLayout
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.navArgs
import com.example.tema1.models.AnimalModel
import com.example.tema1.models.AnimalOrigin

class AnimalDetailsFragment : Fragment() {

    val arguments: AnimalDetailsFragmentArgs by navArgs()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ) = inflater.inflate(R.layout.fragment_animal_details, container, false)

    override fun onViewCreated(view: android.view.View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val lLayout: RelativeLayout = view.findViewById<RelativeLayout>(R.id.rl_animal)
        var color = android.graphics.Color.BLACK
        var origin = ""
        when (arguments.animalOrigin) {
            AnimalOrigin.AFRICA.key -> {
                color = resources.getColor(R.color.africa_origin)
                origin = "Africa"
            }
            AnimalOrigin.SOUTH_AMERICA.key -> {
                color = resources.getColor(R.color.south_america_origin)
                origin = "South America"
            }
            AnimalOrigin.NORTH_AMERICA.key -> {
                color = resources.getColor(R.color.north_america_origin)
                origin = "North America"
            }
            AnimalOrigin.AUSTRALIA.key -> {
                color = resources.getColor(R.color.australia_origin)
                origin = "Australia"
            }
            AnimalOrigin.ASIA.key -> {
                color = resources.getColor(R.color.asia_origin)
                origin = "Asia"
            }
            AnimalOrigin.EUROPE.key -> {
                color = resources.getColor(R.color.europe_origin)
                origin = "Europe"
            }
            AnimalOrigin.ANTARCTICA.key -> {
                color = resources.getColor(R.color.antarctica_origin)
                origin = "Antarctica"
            }
        }
        view.findViewById<TextView>(R.id.tv_animal_name).text = arguments.animalName.toString()
        view.findViewById<TextView>(R.id.tv_animal_origin).text = origin
        view.findViewById<TextView>(R.id.tv_animal_description).text = arguments.animalDescription.toString()

        lLayout.setBackgroundColor(color)
    }
}

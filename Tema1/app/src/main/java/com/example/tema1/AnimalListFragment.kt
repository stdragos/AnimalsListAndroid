package com.example.tema1

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.core.app.NotificationCompat.Action.SemanticAction
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.tema1.adapters.AnimalListAdapter
import com.example.tema1.models.AfricaAnimalModel
import com.example.tema1.models.AnimalModel
import com.example.tema1.models.AnimalOrigin
import com.example.tema1.models.AntarcticaAnimalModel
import com.example.tema1.models.AsiaAnimalModel
import com.example.tema1.models.AustraliaAnimalModel
import com.example.tema1.models.EuropeAnimalModel
import com.example.tema1.models.NorthAmericaAnimalModel
import com.example.tema1.models.SouthAmericaAnimalModel
import kotlin.math.log

class AnimalListFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? = inflater.inflate(R.layout.fragment_animal_list, container, false)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setupAnimalList()
    }

    private fun setupAnimalList() {
        val layoutManager = LinearLayoutManager(context)

        val animalList = listOf(
            AsiaAnimalModel(1, "Snow Leopard", "The snow leopard, native to Central and South Asia, is a solitary and elusive big cat, well-adapted to mountainous terrain with its thick fur and long tail for balance."),
            SouthAmericaAnimalModel(2, "Sloth", "Found in the forests of South America, sloths are slow-moving mammals that spend most of their time hanging from trees, feeding on leaves, and exhibiting a calm demeanor."),
            AfricaAnimalModel(3, "Giraffe", "With its long neck and legs, the giraffe is an iconic herbivore of the African savannas, known for its graceful movements as it browses on leaves from tall trees."),
            NorthAmericaAnimalModel(4, "American Black Bear", "Omnivorous and adaptable, the American black bear is widely distributed across North America, varying in coat colors and primarily inhabiting forested areas."),
            EuropeAnimalModel(5, "European Hedgehog", "A nocturnal garden dweller, the European hedgehog is a spiny mammal known for its habit of curling into a ball when threatened."),
            AustraliaAnimalModel(6, "Kangaroo", "An iconic marsupial known for its powerful hind legs and ability to hop at high speeds, kangaroos are native to Australia and are characterized by the pouch in which they carry their young."),
            AsiaAnimalModel(7, "Red Panda", "Native to the eastern Himalayas and southwestern China, the red panda is an arboreal mammal with a distinctive red fur coat and a diet primarily consisting of bamboo leaves."),
            AfricaAnimalModel(8, "Rhino", "Recognized for its large size and distinctive horn on its nose, the rhinoceros is a herbivorous mammal found in various habitats across Africa."),
            NorthAmericaAnimalModel(9, "Bald Eagle", "A symbolic bird of prey known for its white head and powerful talons, the bald eagle is native to North America and often inhabits coastal areas and lakeshores."),
            EuropeAnimalModel(10, "European Badger", "With its black and white markings, the European badger is a nocturnal mammal found in a variety of habitats across Europe, often living in underground burrows."),
            SouthAmericaAnimalModel(11, "Capybara", "The capybara is the largest rodent in the world, native to South America and often found near water, where it feeds on aquatic plants and grasses."),
            AfricaAnimalModel(12, "African Elephant", "As the largest land animal, the African elephant roams the savannas and forests of Africa in search of vegetation, using its long trunk to gather food and water, and its tusks for various tasks including digging and defense."),
            EuropeAnimalModel(13, "Eurasian Lynx", "The Eurasian lynx is a medium-sized wild cat inhabiting European forests and mountains, recognized for its tufted ears and short tail. It preys on small to medium-sized mammals, and its elusive nature makes it challenging to spot in the wild."),
            SouthAmericaAnimalModel(14, "Jaguar", "Native to South America, the jaguar is a powerful big cat with a distinctive rosette pattern on its coat. It is an apex predator, capable of hunting a wide variety of prey including large mammals, reptiles, and fish."),
            AsiaAnimalModel(15, "Asian Elephant", "Similar to its African counterpart, the Asian elephant is a large land mammal found in the forests and grasslands of Asia. It plays a significant cultural and ecological role in the regions where it inhabits."),
            AustraliaAnimalModel(16, "Koala", "Endemic to Australia, the koala is a marsupial known for its cuddly appearance and diet consisting mainly of eucalyptus leaves. Despite its cute demeanor, it has a unique digestive system adapted to a low-nutrient diet."),
            AntarcticaAnimalModel(17, "Emperor Penguin", "The largest penguin species, the emperor penguin, is well-adapted to the harsh conditions of Antarctica. It forms large colonies for breeding, with males incubating the eggs in a huddle while females forage for food."),
            NorthAmericaAnimalModel(18, "Gray Wolf", "Once widespread across North America, the gray wolf is a highly social carnivore known for its pack behavior and howling communication. It plays a crucial role in ecosystems as a top predator, regulating prey populations."),
            EuropeAnimalModel(19, "Alpine Ibex", "Found in the Alpine regions of Europe, the alpine ibex is a mountain-dwelling goat species known for its impressive agility and large, curved horns. It navigates steep cliffs with ease, grazing on grasses and herbs."),
            SouthAmericaAnimalModel(20, "Anaconda", "The anaconda is a large snake species native to the jungles and swamps of South America. It is one of the heaviest snakes in the world and is known for its constricting method of hunting prey."),
            AfricaAnimalModel(21, "Hippopotamus", "The hippopotamus is a large, semi-aquatic mammal found in rivers and lakes throughout sub-Saharan Africa. Despite its appearance, it is one of the most dangerous animals in Africa, known for its territorial behavior and powerful jaws."),
            EuropeAnimalModel(22, "Eurasian Beaver", "The Eurasian beaver is a semi-aquatic rodent known for its dam-building behavior, which creates habitats for a variety of other species. Once widespread in Europe, it has been successfully reintroduced in many areas."),
            NorthAmericaAnimalModel(23, "Mountain Lion", "Also known as a cougar or puma, the mountain lion is a large cat species native to the Americas. Despite its name, it inhabits a variety of habitats, from mountains to forests, and is known for its solitary nature."),
            AustraliaAnimalModel(24, "Platypus", "The platypus is a unique mammal endemic to Australia, known for its duck-bill, webbed feet, and ability to lay eggs. It is one of only a few monotremes, or egg-laying mammals, in the world."),
            SouthAmericaAnimalModel(25, "Tapir", "Tapirs are large, herbivorous mammals found in the jungles and forests of Central and South America. They play a crucial role in seed dispersal and are characterized by their distinct trunk-like snout."),
            AsiaAnimalModel(26, "Japanese Macaque", "Native to Japan, the Japanese macaque is a monkey species known for its adaptation to cold climates and unique behavior, such as bathing in hot springs during the winter."),
            EuropeAnimalModel(27, "European Robin", "The European robin is a small bird species with a red breast, commonly found across Europe. It is known for its melodious song and is often associated with Christmas due to its appearance on holiday cards."),
            AfricaAnimalModel(28, "Leopard", "With its striking spotted coat, the leopard is a big cat species found throughout Africa and parts of Asia. It is a skilled hunter, capable of climbing trees to stash its prey and avoid competition from other predators."),
            SouthAmericaAnimalModel(29, "Chameleon", "Chameleons are lizard species known for their ability to change color to blend in with their surroundings. Found primarily in Madagascar and parts of Africa, they have long, sticky tongues for catching insects."),
            AsiaAnimalModel(30, "Giant Asian Hornet", "The giant Asian hornet is a large wasp species native to East Asia. Known for its aggressive behavior and powerful sting, it is a formidable predator of other insects, including honeybees."),
            NorthAmericaAnimalModel(31, "American Alligator", "The American alligator is a large reptile native to the southeastern United States. It inhabits freshwater habitats such as swamps, marshes, and rivers, where it preys on fish, amphibians, birds, and mammals."),
            SouthAmericaAnimalModel(32, "Toucan", "Toucans are colorful bird species native to Central and South America, known for their large, brightly colored bills. They primarily feed on fruit but will also consume insects and small vertebrates."),
            AsiaAnimalModel(33, "Asian Water Buffalo", "Domesticated for thousands of years, the Asian water buffalo is an important livestock animal in Asia, used for plowing fields, transportation, and as a source of milk and meat."),
            EuropeAnimalModel(34, "Eurasian Eagle-Owl", "One of the largest owl species in the world, the Eurasian eagle-owl is native to Europe and Asia. It is a powerful predator, capable of hunting a variety of prey including small mammals and birds."),
            AfricaAnimalModel(35, "African Wild Dog", "Also known as painted wolves, African wild dogs are highly social carnivores found in sub-Saharan Africa. They live in packs and are skilled hunters, using coordinated tactics to bring down prey."),
            SouthAmericaAnimalModel(36, "Caiman", "Caimans are crocodilian reptiles native to Central and South America. Smaller than their close relatives, alligators and crocodiles, they inhabit freshwater habitats such as rivers, lakes, and swamps."),
            AsiaAnimalModel(37, "Indian Peafowl", "The Indian peafowl, or peacock, is a colorful bird species native to the Indian subcontinent. Known for its elaborate plumage and courtship displays, it is a symbol of beauty and elegance."),
            NorthAmericaAnimalModel(38, "American Bison", "Once numbering in the millions across North America, the American bison is an iconic symbol of the American West. It is a large herbivore that plays a crucial role in grassland ecosystems."),
            EuropeAnimalModel(39, "European Otter", "The European otter is a semi-aquatic mammal found in rivers, lakes, and coastal areas across Europe. It is a skilled swimmer and hunter, preying on fish, crustaceans, and amphibians."),
            SouthAmericaAnimalModel(40, "Alpaca", "Domesticated for their soft wool, alpacas are camelid mammals native to the Andes mountains of South America. They are prized for their fiber, which is used to make clothing and textiles."),
            AfricaAnimalModel(41, "African Penguin", "Found along the coast of South Africa and Namibia, the African penguin is a species of penguin adapted to warmer climates. It is known for its distinctive black and white plumage and braying vocalizations."),
            EuropeAnimalModel(42, "Red Deer", "One of the largest deer species in Europe, the red deer is native to forests and woodlands across the continent. It is a herbivore, feeding on grasses, leaves, and shoots, and is known for its impressive antlers."),
            SouthAmericaAnimalModel(43, "Capybara", "The capybara is the largest rodent in the world, native to South America and often found near water, where it feeds on aquatic plants and grasses."),
            AsiaAnimalModel(44, "Clouded Leopard", "Native to the forests of Southeast Asia, the clouded leopard is a medium-sized wild cat with distinctive cloud-like markings on its coat. It is an agile climber and skilled hunter."),
            AfricaAnimalModel(45, "Meerkat", "Found in arid regions of southern Africa, meerkats are small mongoose species known for their social behavior and cooperative hunting. They live in groups called mobs and are highly vigilant for predators."),
            EuropeAnimalModel(46, "European Lynx", "The European lynx is a medium-sized wild cat native to forests and mountains in Europe. It is known for its tufted ears and short tail, and preys on small to medium-sized mammals."),
            SouthAmericaAnimalModel(47, "Spectacled Bear", "The spectacled bear, also known as the Andean bear, is the only bear species native to South America. It is named for the distinctive markings around its eyes and is primarily herbivorous, feeding on fruits and vegetation."),
            AsiaAnimalModel(48, "Giant Panda", "Endemic to China, the giant panda is a bear species known for its distinctive black and white fur. It primarily feeds on bamboo and is considered a symbol of conservation efforts worldwide."),
            NorthAmericaAnimalModel(49, "American Beaver", "The American beaver is a semi-aquatic rodent found in rivers, streams, and lakes across North America. It is known for its dam-building behavior, which creates habitats for a variety of other species."),
            AfricaAnimalModel(50, "African Buffalo", "Also known as the Cape buffalo, the African buffalo is a large bovine species found in African grasslands and woodlands. It is known for its unpredictable temperament and is considered one of the most dangerous animals in Africa."),
        )

        val adapter = AnimalListAdapter(animalList)

        view?.findViewById<RecyclerView>(R.id.rv_animal_list)?.apply {
            this.layoutManager = layoutManager
            this.adapter = adapter
        }

        adapter.setOnItemClickListener(object : AnimalListAdapter.onItemClickListener {
            override fun onItemClick(position: Int) {

//                Toast.makeText(context, "Item clicked $position", Toast.LENGTH_SHORT).show()

                var name: String = ""
                var description: String = ""
                var origin: Int = 0

                when (animalList[position].origin.key) {
                    AnimalOrigin.EUROPE.key -> {
                        name = (animalList[position] as EuropeAnimalModel).name
                        description = (animalList[position] as EuropeAnimalModel).description
                        origin = AnimalOrigin.EUROPE.key
                    }

                    AnimalOrigin.AFRICA.key -> {
                        name = (animalList[position] as AfricaAnimalModel).name
                        description = (animalList[position] as AfricaAnimalModel).description
                        origin = AnimalOrigin.AFRICA.key
                    }

                    AnimalOrigin.ANTARCTICA.key -> {
                        name = (animalList[position] as AntarcticaAnimalModel).name
                        description =
                            (animalList[position] as AntarcticaAnimalModel).description
                        origin = AnimalOrigin.ANTARCTICA.key
                    }

                    AnimalOrigin.SOUTH_AMERICA.key -> {
                        name = (animalList[position] as SouthAmericaAnimalModel).name
                        description =
                            (animalList[position] as SouthAmericaAnimalModel).description
                        origin = AnimalOrigin.SOUTH_AMERICA.key
                    }

                    AnimalOrigin.NORTH_AMERICA.key -> {
                        name = (animalList[position] as NorthAmericaAnimalModel).name
                        description =
                            (animalList[position] as NorthAmericaAnimalModel).description
                        origin = AnimalOrigin.NORTH_AMERICA.key
                    }

                    AnimalOrigin.ASIA.key -> {
                        name = (animalList[position] as AsiaAnimalModel).name
                        description = (animalList[position] as AsiaAnimalModel).description
                        origin = AnimalOrigin.ASIA.key
                    }

                    AnimalOrigin.AUSTRALIA.key -> {
                        name = (animalList[position] as AustraliaAnimalModel).name
                        description =
                            (animalList[position] as AustraliaAnimalModel).description
                        origin = AnimalOrigin.AUSTRALIA.key
                    }

                    else -> throw IllegalArgumentException("Invalid view type")
                }
                var action = AnimalListFragmentDirections.actionFragmentListToFragmentDetails(
                    name,
                    origin,
                    description
                )

                findNavController().navigate(action)
            }
        })
    }
}

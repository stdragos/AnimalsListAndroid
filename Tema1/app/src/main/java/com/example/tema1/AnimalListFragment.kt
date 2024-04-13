package com.example.tema1

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.app.NotificationCompat.Action.SemanticAction
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.tema1.models.AfricaAnimalModel
import com.example.tema1.models.AnimalModel
import com.example.tema1.models.AnimalOrigin
import com.example.tema1.models.AntarcticaAnimalModel
import com.example.tema1.models.AsiaAnimalModel
import com.example.tema1.models.AustraliaAnimalModel
import com.example.tema1.models.EuropeAnimalModel
import com.example.tema1.models.NorthAmericaAnimalModel
import com.example.tema1.models.SouthAmericaAnimalModel

class AnimalListFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ) = inflater.inflate(R.layout.fragment_animal_list, container, false)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setupAnimalList()
    }

    private fun setupAnimalList() {
        val layoutManager = LinearLayoutManager(context)

        val animalList = listOf(
            SouthAmericaAnimalModel(1, "Panthera onca", "Panthera is a genus within the Felidae family that was named and first described by the German naturalist Lorenz Oken in 1816. The British taxonomist Pocock revised the classification of this genus in 1916 as comprising the species lion, tiger, jaguar, and leopard on the basis of cranial features. Results of genetic analysis indicate that the snow leopard also belongs to the Panthera, a classification that was accepted by IUCN assessors in 2008."),
            EuropeAnimalModel(2, "Ursus arctos", "The brown bear (Ursus arctos) is a large bear species found across Eurasia and North America. In North America, the populations of brown bears are called grizzly bears, while the subspecies that inhabits the Kodiak Islands of Alaska is known as the Kodiak bear. It is one of the largest living terrestrial members of the order Carnivora, rivaled in size only by its closest relative, the polar bear (Ursus maritimus), which is much less variable in size and slightly larger on average."),
            AntarcticaAnimalModel(3, "Aptenodytes forsteri", "The emperor penguin (Aptenodytes forsteri) is the tallest and heaviest of all living penguin species and is endemic to Antarctica"),
            NorthAmericaAnimalModel(4, "Bison bison", "The American bison or simply bison (Bison bison), also commonly known as the American buffalo or simply buffalo, is an American species of bison that once roamed North America in vast herds. Their historical range, by 9000 BCE, is described as the great bison belt, a tract of rich grassland that ran from Alaska to the Gulf of Mexico, east to the Atlantic Seaboard (nearly to the Atlantic tidewater in some areas) as far north as New York and south to Georgia and, according to some sources, down to Florida, with sightings in North Carolina near Buffalo Ford on the Catawba River as late as 1750."),
            SouthAmericaAnimalModel(5, "Panthera onca", "Panthera is a genus within the Felidae family that was named and first described by the German naturalist Lorenz Oken in 1816. The British taxonomist Pocock revised the classification of this genus in 1916 as comprising the species lion, tiger, jaguar, and leopard on the basis of cranial features. Results of genetic analysis indicate that the snow leopard also belongs to the Panthera, a classification that was accepted by IUCN assessors in 2008."),
            EuropeAnimalModel(6, "Ursus arctos", "The brown bear (Ursus arctos) is a large bear species found across Eurasia and North America. In North America, the populations of brown bears are called grizzly bears, while the subspecies that inhabits the Kodiak Islands of Alaska is known as the Kodiak bear. It is one of the largest living terrestrial members of the order Carnivora, rivaled in size only by its closest relative, the polar bear (Ursus maritimus), which is much less variable in size and slightly larger on average."),
            AntarcticaAnimalModel(7, "Aptenodytes forsteri", "The emperor penguin (Aptenodytes forsteri) is the tallest and heaviest of all living penguin species and is endemic to Antarctica"),
            AsiaAnimalModel(8, "Elephas maximus", "The Asian elephant, also known as the Asiatic elephant, is the only living species of the genus Elephas and is distributed throughout the Indian subcontinent and Southeast Asia, from India in the west, Nepal in the north, Sumatra in the south, and to Borneo in the east."),
            NorthAmericaAnimalModel(9, "Bison bison", "The American bison or simply bison (Bison bison), also commonly known as the American buffalo or simply buffalo, is an American species of bison that once roamed North America in vast herds. Their historical range, by 9000 BCE, is described as the great bison belt, a tract of rich grassland that ran from Alaska to the Gulf of Mexico, east to the Atlantic Seaboard (nearly to the Atlantic tidewater in some areas) as far north as New York and south to Georgia and, according to some sources, down to Florida, with sightings in North Carolina near Buffalo Ford on the Catawba River as late as 1750."),
            SouthAmericaAnimalModel(10, "Panthera onca", "Panthera is a genus within the Felidae family that was named and first described by the German naturalist Lorenz Oken in 1816. The British taxonomist Pocock revised the classification of this genus in 1916 as comprising the species lion, tiger, jaguar, and leopard on the basis of cranial features. Results of genetic analysis indicate that the snow leopard also belongs to the Panthera, a classification that was accepted by IUCN assessors in 2008."),
            EuropeAnimalModel(11, "Ursus arctos", "The brown bear (Ursus arctos) is a large bear species found across Eurasia and North America. In North America, the populations of brown bears are called grizzly bears, while the subspecies that inhabits the Kodiak Islands of Alaska is known as the Kodiak bear. It is one of the largest living terrestrial members of the order Carnivora, rivaled in size only by its closest relative, the polar bear (Ursus maritimus), which is much less variable in size and slightly larger on average."),
            AntarcticaAnimalModel(12, "Aptenodytes forsteri", "The emperor penguin (Aptenodytes forsteri) is the tallest and heaviest of all living penguin species and is endemic to Antarctica"),
            AsiaAnimalModel(13, "Elephas maximus", "The Asian elephant, also known as the Asiatic elephant, is the only living species of the genus Elephas and is distributed throughout the Indian subcontinent and Southeast Asia, from India in the west, Nepal in the north, Sumatra in the south, and to Borneo in the east."),
            NorthAmericaAnimalModel(14, "Bison bison", "The American bison or simply bison (Bison bison), also commonly known as the American buffalo or simply buffalo, is an American species of bison that once roamed North America in vast herds. Their historical range, by 9000 BCE, is described as the great bison belt, a tract of rich grassland that ran from Alaska to the Gulf of Mexico, east to the Atlantic Seaboard (nearly to the Atlantic tidewater in some areas) as far north as New York and south to Georgia and, according to some sources, down to Florida, with sightings in North Carolina near Buffalo Ford on the Catawba River as late as 1750."),
            SouthAmericaAnimalModel(15, "Panthera onca", "Panthera is a genus within the Felidae family that was named and first described by the German naturalist Lorenz Oken in 1816. The British taxonomist Pocock revised the classification of this genus in 1916 as comprising the species lion, tiger, jaguar, and leopard on the basis of cranial features. Results of genetic analysis indicate that the snow leopard also belongs to the Panthera, a classification that was accepted by IUCN assessors in 2008."),
            EuropeAnimalModel(16, "Ursus arctos", "The brown bear (Ursus arctos) is a large bear species found across Eurasia and North America. In North America, the populations of brown bears are called grizzly bears, while the subspecies that inhabits the Kodiak Islands of Alaska is known as the Kodiak bear. It is one of the largest living terrestrial members of the order Carnivora, rivaled in size only by its closest relative, the polar bear (Ursus maritimus), which is much less variable in size and slightly larger on average."),
            AntarcticaAnimalModel(17, "Aptenodytes forsteri", "The emperor penguin (Aptenodytes forsteri) is the tallest and heaviest of all living penguin species and is endemic to Antarctica"),
            AsiaAnimalModel(18, "Elephas maximus", "The Asian elephant, also known as the Asiatic elephant, is the only living species of the genus Elephas and is distributed throughout the Indian subcontinent and Southeast Asia, from India in the west, Nepal in the north, Sumatra in the south, and to Borneo in the east."),
            NorthAmericaAnimalModel(19, "Bison bison", "The American bison or simply bison (Bison bison), also commonly known as the American buffalo or simply buffalo, is an American species of bison that once roamed North America in vast herds. Their historical range, by 9000 BCE, is described as the great bison belt, a tract of rich grassland that ran from Alaska to the Gulf of Mexico, east to the Atlantic Seaboard (nearly to the Atlantic tidewater in some areas) as far north as New York and south to Georgia and, according to some sources, down to Florida, with sightings in North Carolina near Buffalo Ford on the Catawba River as late as 1750."),
            SouthAmericaAnimalModel(20, "Panthera onca", "Panthera is a genus within the Felidae family that was named and first described by the German naturalist Lorenz Oken in 1816. The British taxonomist Pocock revised the classification of this genus in 1916 as comprising the species lion, tiger, jaguar, and leopard on the basis of cranial features. Results of genetic analysis indicate that the snow leopard also belongs to the Panthera, a classification that was accepted by IUCN assessors in 2008."),
            SouthAmericaAnimalModel(21, "Lama glama", "The llama (/ˈlɑːmə/; Spanish pronunciation: [ˈʝama]) (Lama glama) is a domesticated South American camelid, widely used as a meat and pack animal by Andean cultures since the Pre-Columbian era."),
            EuropeAnimalModel(22, "Vulpes vulpes", "The red fox (Vulpes vulpes) is the largest of the true foxes and the most geographically spread member of the Carnivora, being distributed across the entire Northern Hemisphere from the Arctic Circle to North Africa, Central America, and Asia."),
            AntarcticaAnimalModel(23, "Chionis albus", "The snowy sheathbill (Chionis albus) is a small, somewhat pigeon-like bird that feeds on carrion, invertebrates, and seaweed. It is the only land bird native to the Antarctic continent."),
            AsiaAnimalModel(24, "Ailuropoda melanoleuca", "The giant panda (Ailuropoda melanoleuca), also known as the panda bear or simply the panda, is a bear native to south central China. It is characterised by large, black patches around its eyes, over the ears, and across its round body. The name \"giant panda\" is sometimes used to distinguish it from the red panda, a neighboring musteloid."),
            NorthAmericaAnimalModel(25, "Canis lupus", "The gray wolf (Canis lupus), also known as the timber wolf or western wolf, is a canine native to the wilderness and remote areas of Eurasia and North America. It is the largest extant member of its family"),
            SouthAmericaAnimalModel(26, "Ocelot", "The ocelot (Leopardus pardalis) is a medium-sized wild cat native to the southwestern United States, Mexico, Central, and South America. It is listed as Least Concern on the IUCN Red List as the population is estimated to comprise more than 40,000 mature individuals and is considered stable."),
            AsiaAnimalModel(27, "Indian elephant", "The Indian elephant (Elephas maximus indicus) is one of three extant recognized subspecies of the Asian elephant and native to mainland Asia."),
            EuropeAnimalModel(28, "Eurasian lynx", "The Eurasian lynx (Lynx lynx) is a medium-sized wild cat native to Northern, Central and Eastern Europe to Central Asia and Siberia, the Tibetan Plateau, and the Himalayas."),
            AntarcticaAnimalModel(29, "Emperor penguin", "The emperor penguin (Aptenodytes forsteri) is the tallest and heaviest of all living penguin species and is endemic to Antarctica."),
            NorthAmericaAnimalModel(30, "American bison", "The American bison or simply bison (Bison bison), also commonly known as the American buffalo or simply buffalo, is an American species of bison that once roamed North America in vast herds. Their historical range, by 9000 BCE, is described as the great bison belt, a tract of rich grassland that ran from Alaska to the Gulf of Mexico, east to the Atlantic Seaboard (nearly to the Atlantic tidewater in some areas) as far north as New York and south to Georgia and, according to some sources, down to Florida, with sightings in North Carolina near Buffalo Ford on the Catawba River as late as 1750."),
            AustraliaAnimalModel(31, "Macropus rufus", "The red kangaroo (Macropus rufus) is the largest of all kangaroos, the largest terrestrial mammal native to Australia, and the largest extant marsupial. It is found across mainland Australia, avoiding only the more fertile areas in the south, the east coast, and the northern rainforests."),
            AfricaAnimalModel(32, "Panthera leo", "The lion (Panthera leo) is a species in the family Felidae and a member of the genus Panthera. It has a muscular, deep-chested body, short, rounded head, round ears, and a hairy tuft at the end of its tail. It is sexually dimorphic"),
            AsiaAnimalModel(33, "Elephas maximus", "The Asian elephant, also known as the Asiatic elephant, is the only living species of the genus Elephas and is distributed throughout the Indian subcontinent and Southeast Asia, from India in the west, Nepal in the north, Sumatra in the south, and to Borneo in the east."),
            AfricaAnimalModel(34, "Giraffa camelopardalis", "The giraffe (Giraffa) is an African artiodactyl mammal, the tallest living terrestrial animal and the largest ruminant. It is traditionally considered to be one species, Giraffa camelopardalis, with nine subspecies."),
            AustraliaAnimalModel(35, "Ornithorhynchus anatinus", "The platypus (Ornithorhynchus anatinus), sometimes referred to as the duck-billed platypus, is a semiaquatic, egg-laying mammal endemic to eastern Australia, including Tasmania."),
            AfricaAnimalModel(36, "Loxodonta africana", "The African bush elephant (Loxodonta africana), also known as the African savanna elephant, is the largest living terrestrial animal with bulls reaching a shoulder height of up to 3.96 m (13.0 ft)."),
            AustraliaAnimalModel(37, "Sarcophilus harrisii", "The Tasmanian devil (Sarcophilus harrisii) is a carnivorous marsupial of the family Dasyuridae. It was once native to mainland Australia and is now found in the wild only on the island state of Tasmania, including tiny east-coast Maria Island where there is a conservation project with disease-free animals."),
            AfricaAnimalModel(38, "Hippopotamus amphibius", "The common hippopotamus (Hippopotamus amphibius), or hippo, is a large, mostly herbivorous, semi-aquatic mammal and ungulate native to sub-Saharan Africa."),
            AustraliaAnimalModel(39, "Phascolarctos cinereus", "The koala (Phascolarctos cinereus, or, inaccurately, koala bear) is an arboreal herbivorous marsupial native to Australia."),
            AfricaAnimalModel(40, "Gorilla beringei", "The eastern gorilla (Gorilla beringei) is a critically endangered species of the genus Gorilla and the largest living primate."),
            AustraliaAnimalModel(41, "Dromaius novaehollandiae", "The emu (Dromaius novaehollandiae) is the second-largest living bird by height, after its ratite relative, the ostrich. It is endemic to Australia where it is the largest native bird and the only extant member of the genus Dromaius."),
            AfricaAnimalModel(42, "Acinonyx jubatus", "The cheetah (Acinonyx jubatus) is a large cat native to Africa and central Iran. It is the fastest land animal, capable of running at speeds up to 80 to 96 km/h (50 to 60 mph), and as such has several adaptations for speed, including a light build, long thin legs, and a long tail."),
            AustraliaAnimalModel(43, "Tachyglossus aculeatus", "The short-beaked echidna (Tachyglossus aculeatus) is one of four living species of echidna and the only member of the genus Tachyglossus. The short-beaked echidna is covered in fur and spines and has a distinctive snout and a specialized tongue that allows it to feed on ants and termites."),
            AfricaAnimalModel(44, "Pan troglodytes", "The common chimpanzee (Pan troglodytes), also known as the robust chimpanzee, is a species of great ape. The common chimpanzee is usually called the chimpanzee (or chimp), though this term can be used to refer to both species in the genus Pan: the common chimpanzee and the closely related bonobo, formerly called the pygmy chimpanzee."),
            AustraliaAnimalModel(45, "Vombatus ursinus", "The common wombat (Vombatus ursinus), also known as the coarse-haired wombat or bare-nosed wombat, is a marsupial, one of three extant species of wombats and the only one in the genus Vombatus."),
            AfricaAnimalModel(46, "Giraffa camelopardalis", "The giraffe (Giraffa) is an African artiodactyl mammal, the tallest living terrestrial animal and the largest ruminant. It is traditionally considered to be one species, Giraffa camelopardalis, with nine subspecies."),
            AustraliaAnimalModel(47, "Ornithorhynchus anatinus", "The platypus (Ornithorhynchus anatinus), sometimes referred to as the duck-billed platypus, is a semiaquatic, egg-laying mammal endemic to eastern Australia, including Tasmania."),
            AfricaAnimalModel(48, "Loxodonta africana", "The African bush elephant (Loxodonta africana), also known as the African savanna elephant, is the largest living terrestrial animal with bulls reaching a shoulder height of up to 3.96 m (13.0 ft)."),
            AustraliaAnimalModel(49, "Sarcophilus harrisii", "The Tasmanian devil (Sarcophilus harrisii) is a carnivorous marsupial of the family Dasyuridae. It was once native to mainland Australia and is now found in the wild only on the island state of Tasmania, including tiny east-coast Maria Island where there is a conservation project with disease-free animals."),
            AfricaAnimalModel(50, "Hippopotamus amphibius", "The common hippopotamus (Hippopotamus amphibius), or hippo, is a large, mostly herbivorous, semi-aquatic mammal and ungulate native to sub-Saharan Africa."),
        )

        val shuffledAnimals = animalList.shuffled()

        val adapter = AnimalListAdapter(shuffledAnimals)
    }
}
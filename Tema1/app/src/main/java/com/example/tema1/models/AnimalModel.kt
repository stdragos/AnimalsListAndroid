package com.example.tema1.models

enum class AnimalOrigin(
    val key: Int
) {
    EUROPE(0),
    AFRICA(1),
    ASIA(2),
    NORTH_AMERICA(3),
    SOUTH_AMERICA(4),
    AUSTRALIA(5),
    ANTARCTICA(6)
}

sealed class AnimalModel(
    val origin: AnimalOrigin
)

data class EuropeAnimalModel(
    val id: Int,
    val name: String,
    val description: String
) : AnimalModel(AnimalOrigin.EUROPE)

data class AfricaAnimalModel(
    val id: Int,
    val name: String,
    val description: String
) : AnimalModel(AnimalOrigin.AFRICA)

data class AsiaAnimalModel(
    val id: Int,
    val name: String,
    val description: String
) : AnimalModel(AnimalOrigin.ASIA)

data class NorthAmericaAnimalModel(
    val id: Int,
    val name: String,
    val description: String
) : AnimalModel(AnimalOrigin.NORTH_AMERICA)

data class SouthAmericaAnimalModel(
    val id: Int,
    val name: String,
    val description: String
) : AnimalModel(AnimalOrigin.SOUTH_AMERICA)

data class AustraliaAnimalModel(
    val id: Int,
    val name: String,
    val description: String
) : AnimalModel(AnimalOrigin.AUSTRALIA)

data class AntarcticaAnimalModel(
    val id: Int,
    val name: String,
    val description: String
) : AnimalModel(AnimalOrigin.ANTARCTICA)

package io.github.serpro69.kfaker.provider

import io.github.serpro69.kfaker.*
import io.github.serpro69.kfaker.dictionary.*

/**
 * [FakeDataProvider] implementation for [CategoryName.GAMES] category.
 */
class Witcher internal constructor(fakerService: FakerService) : AbstractFakeDataProvider(fakerService) {
    override val categoryName = CategoryName.GAMES

    val characters = resolve { fakerService.resolve(it, "witcher", "characters") }
    val witchers = resolve { fakerService.resolve(it, "witcher", "witchers") }
    val schools = resolve { fakerService.resolve(it, "witcher", "schools") }
    val locations = resolve { fakerService.resolve(it, "witcher", "locations") }
    val quotes = resolve { fakerService.resolve(it, "witcher", "quotes") }
    val monsters = resolve { fakerService.resolve(it, "witcher", "monsters") }
}

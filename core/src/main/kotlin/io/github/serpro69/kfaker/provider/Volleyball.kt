@file:Suppress("unused")

package io.github.serpro69.kfaker.provider

import io.github.serpro69.kfaker.*
import io.github.serpro69.kfaker.dictionary.*
import io.github.serpro69.kfaker.provider.unique.LocalUniqueDataProvider
import io.github.serpro69.kfaker.provider.unique.UniqueProviderDelegate

/**
 * [FakeDataProvider] implementation for [YamlCategory.VOLLEYBALL] category.
 */
class Volleyball internal constructor(fakerService: FakerService) :
    YamlFakeDataProvider<Volleyball>(fakerService) {
    override val yamlCategory = YamlCategory.VOLLEYBALL
    override val localUniqueDataProvider = LocalUniqueDataProvider<Volleyball>()
    override val unique by UniqueProviderDelegate(localUniqueDataProvider)

    init {
        fakerService.load(yamlCategory)
    }

    fun team(): String = resolve("team")
    fun player(): String = resolve("player")
    fun coach(): String = resolve("coach")
    fun position(): String = resolve("position")
    fun formation(): String = resolve("formation")
}

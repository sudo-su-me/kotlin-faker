package io.github.serpro69.kfaker.provider

import io.github.serpro69.kfaker.*
import io.github.serpro69.kfaker.dictionary.*
import io.github.serpro69.kfaker.provider.unique.LocalUniqueDataProvider
import io.github.serpro69.kfaker.provider.unique.UniqueProviderDelegate

/**
 * [FakeDataProvider] implementation for [YamlCategory.VERBS] category.
 */
@Suppress("unused")
class Verbs internal constructor(fakerService: FakerService) : YamlFakeDataProvider<Verbs>(fakerService) {
    override val yamlCategory = YamlCategory.VERBS
    override val localUniqueDataProvider = LocalUniqueDataProvider<Verbs>()
    override val unique by UniqueProviderDelegate(localUniqueDataProvider)

    init {
        fakerService.load(yamlCategory)
    }

    fun base() = resolve("base")
    fun past() = resolve("past")
    fun pastParticiple() = resolve("past_participle")
    fun simplePresent() = resolve("simple_present")
    fun ingForm() = resolve("ing_form")
}

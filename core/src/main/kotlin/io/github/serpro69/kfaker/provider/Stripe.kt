package io.github.serpro69.kfaker.provider

import io.github.serpro69.kfaker.*
import io.github.serpro69.kfaker.dictionary.*
import io.github.serpro69.kfaker.provider.unique.LocalUniqueDataProvider
import io.github.serpro69.kfaker.provider.unique.UniqueProviderDelegate

/**
 * [FakeDataProvider] implementation for [YamlCategory.STRIPE] category.
 */
@Suppress("unused")
class Stripe internal constructor(fakerService: FakerService) : YamlFakeDataProvider<Stripe>(fakerService) {
    override val yamlCategory = YamlCategory.STRIPE
    override val localUniqueDataProvider = LocalUniqueDataProvider<Stripe>()
    override val unique by UniqueProviderDelegate(localUniqueDataProvider)

    init {
        fakerService.load(yamlCategory)
    }

    fun validCards(type: String) = resolve("valid_cards", type)
    fun validTokens(type: String) = resolve("valid_tokens", type)
    fun invalidCards(type: String) = resolve("invalid_cards", type)
}

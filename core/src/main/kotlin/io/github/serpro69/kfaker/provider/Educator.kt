package io.github.serpro69.kfaker.provider

import io.github.serpro69.kfaker.FakerService
import io.github.serpro69.kfaker.dictionary.CategoryName
import io.github.serpro69.kfaker.provider.unique.LocalUniqueDataProvider
import io.github.serpro69.kfaker.provider.unique.UniqueProviderDelegate

/**
 * [FakeDataProvider] implementation for [CategoryName.EDUCATOR] category.
 */
@Suppress("unused", "MemberVisibilityCanBePrivate")
class Educator internal constructor(fakerService: FakerService) : AbstractFakeDataProvider<Educator>(fakerService) {
    override val categoryName = CategoryName.EDUCATOR
    override val localUniqueDataProvider = LocalUniqueDataProvider<Educator>()
    override val unique by UniqueProviderDelegate(localUniqueDataProvider)

    fun schoolName() = resolve("school_name")
    fun secondary() = resolve("secondary")

    fun university() = "${schoolName()} ${universityType()}"

    fun secondarySchool() = resolve("secondary_school")
    fun campus() = resolve("campus")
    fun subject() = resolve("subject")

    fun degree() = "${tertiaryDegreeType()} ${subject()}"

    fun courseName() = "${subject()} ${tertiaryDegreeCourseNumber()}"

    fun universityType() = resolve("tertiary", "university_type")
    fun tertiaryDegreeType() = resolve("tertiary", "degree", "type")
    fun tertiaryDegreeCourseNumber() = with(fakerService) {
        resolve("tertiary", "degree", "course_number")
            .numerify()
    }
}

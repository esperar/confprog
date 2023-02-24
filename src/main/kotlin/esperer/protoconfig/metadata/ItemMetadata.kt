package esperer.protoconfig.metadata

import kotlin.reflect.jvm.internal.impl.load.kotlin.JvmType

class ItemMetadata(
    val itemType: ItemType,
    var name: String,
    var type: String,
    var description: String,
    var sourceType: String,
    var sourceMethod: String,
    var defaultValue: JvmType.Object,
    val deprecation: ItemDeprecation
) {
}

enum class ItemType {
    GROUP, PROPERTY
}
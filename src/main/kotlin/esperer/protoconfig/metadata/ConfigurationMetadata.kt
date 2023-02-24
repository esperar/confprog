package esperer.protoconfig.metadata

import java.util.Collections
import java.util.HashMap

class ConfigurationMetadata(
    private var SEPARATOR : Set<Char> ,
    val chars: List<Char> = mutableListOf<Char>('-','_'),
    private val items = mapOf<String, List<ItemMetadata>>()
){


}
package esperer.protoconfig.fieldvalues

import java.util.Collections
import javax.lang.model.element.TypeElement

@FunctionalInterface
interface FieldValueParser {
    fun NONE(element: Any?) = Collections.EMPTY_MAP
    fun getFieldValues(element: TypeElement): Map<String, Any?>
}
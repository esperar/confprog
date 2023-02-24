package esperer.protoconfig

import esperer.protoconfig.metadata.MetadataGenerationEnvironment
import javax.lang.model.element.Element
import javax.lang.model.element.ExecutableElement
import javax.lang.model.element.TypeElement
import javax.lang.model.element.VariableElement
import javax.lang.model.type.TypeMirror


abstract class PropertyDescriptor<S : Element>(
    private val ownerElement: TypeElement,
    private val factoryMethod: ExecutableElement,
    private val source: S,
    private val name: String,
    private val type: TypeMirror,
    private val field: VariableElement,
    private val getter: ExecutableElement,
    private val setter: ExecutableElement,
) {
    abstract fun isProperty(environment: MetadataGenerationEnvironment)
}
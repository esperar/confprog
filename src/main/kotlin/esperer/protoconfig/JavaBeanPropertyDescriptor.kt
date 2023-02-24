package esperer.protoconfig

import esperer.protoconfig.metadata.MetadataGenerationEnvironment
import javax.lang.model.element.ExecutableElement


class JavaBeanPropertyDescriptor: PropertyDescriptor<ExecutableElement>() {

    override fun isProperty(environment: MetadataGenerationEnvironment) {
        TODO("Not yet implemented")
    }

}
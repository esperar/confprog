package esperer.protoconfig.metadata

import java.lang.RuntimeException
import javax.tools.Diagnostic.Kind

open class InvalidConfigurationMetadataException(
    override var message: String,
    private var kind: Kind
): RuntimeException(message) {

}
package esperer.protoconfig.metadata

class MetadataGenerationEnvironment {
    private val NULLABLE_ANNOTATION: String = "org.springframework.lang.Nullable"
    var excludes: Set<String> = hashSetOf<String>()
    private var TYPE_EXCLUDES: Set<String> = setOf()

    init{
        excludes.plus("com.zaxxer.hikari.IConnectionCustomizer")
        excludes.plus("groovy.lang.MetaClass")
        excludes.plus("groovy.text.markup.MarkupTemplateEngine")
        excludes.plus("java.io.Writer")
        excludes.plus("java.io.PrintWriter")
        excludes.plus("java.lang.ClassLoader")
        excludes.plus("java.util.concurrent.ThreadFactory")
        excludes.plus("javax.jms.XAConnectionFactory")
        excludes.plus("javax.sql.DataSource")
        excludes.plus("org.apache.tomcat.jdbc.pool.PoolConfiguration")
        excludes.plus("org.apache.tomcat.jdbc.pool.Validator")
        excludes.plus("org.flywaydb.core.api.callback.FlywayCallback")
        excludes.plus("org.flywaydb.core.api.resolver.MigrationResolver")
        TYPE_EXCLUDES = excludes
    }
}
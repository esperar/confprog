package esperer.protoconfig.fieldvalues.javac

import java.lang.Exception
import java.lang.IllegalStateException
import java.lang.reflect.Method


open class ReflectionWrapper(
    private val type: Any?,
    private val instance: Any?
) {
    constructor() : this(null, null)

    fun findClass(name: String) {
        this.instance?.javaClass?.let { findClass(it.classLoader, name) }
    }

    fun findMethod(name: String, parameterType: Class<*>): Method{
        return findMethod(this.type as Class<*>, name, parameterType)
    }

    fun findClass(classLoader: ClassLoader, name: String): Class<*> {
        try{
            return Class.forName(name, false, classLoader)
        } catch(e: ClassNotFoundException){
            throw IllegalAccessException()
        }
    }

    override fun toString(): String {
        return this.instance.toString()
    }

    fun findMethod(type: Class<*>, name: String, parameterType: Class<*>): Method{
        try{
            return type.getMethod(name, parameterType)
        } catch (e: Exception){
            throw IllegalStateException()
        }
    }
}
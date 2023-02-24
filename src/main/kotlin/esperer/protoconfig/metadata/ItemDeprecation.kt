package esperer.protoconfig.metadata

import jdk.nashorn.internal.objects.NativeDebug.getClass

class ItemDeprecation(
    var reason: String?,
    var replacement: String?,
    var level: String?
) {
    constructor(): this(null, null, null){}

    constructor(reason: String, replacement: String): this(reason, replacement, null){}

    override fun equals(o: Any?): Boolean {
        if(this == o){
            return true;
        }

        if(o == null){
            return false;
        }
        var other: ItemDeprecation = o as ItemDeprecation
        return nullSafeEquals(this.reason, other.reason) && nullSafeEquals(this.replacement, other.replacement)
    }

    override fun hashCode(): Int {
        var result: Int = nullSafeHashCode(this.reason)
        result = 31 * result + nullSafeHashCode(this.replacement)
        result = 31 * result + nullSafeHashCode(this.level)
        return result
    }

    override fun toString(): String {
        return "ItemDeprecation {reason=${this.reason} \\ replacement=${this.replacement} \\ level=${this.level} \\ }"
    }

    fun nullSafeEquals(o1: Any?, o2: Any?): Boolean {
        if(o1 == o2){
            return true
        }

        if(o1 == null || o2 == null){
            return false;
        }

        return o1.equals(o2)
    }

    fun nullSafeHashCode(o: Any?): Int = if(o != null) o.hashCode() else 0;

}
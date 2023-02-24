package esperer.protoconfig.json

import java.lang.NumberFormatException

class JSON {

    fun checkDouble(d: Double): Double {
        if(Double.POSITIVE_INFINITY == d || Double.NaN == d)
            throw JSONException("Forbidden numeric value: $d")
        return d;
    }

    fun toBoolean(value: Any?): Boolean?{
        if(value is Boolean)
            return value as Boolean

        if(value is String){
            var stringValue: String = value as String
            if("true".equals(stringValue))
                return true
            if("false".equals(stringValue))
                return false
        }

        return null
    }

    fun toDouble(value: Any?): Double? {
        if(value is Double){
            return value as Double
        }
        if(value is Number){
            return (value as Number).toDouble()
        }
        if(value is String){
            try{
                return value.toDouble()
            } catch (ignored: NumberFormatException){

            }
        }
        return null
    }
}
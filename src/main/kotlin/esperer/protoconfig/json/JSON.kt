package esperer.protoconfig.json

class JSON {
    open fun checkDouble(d: Double): Double {
        if(Double.POSITIVE_INFINITY == d || Double.NaN == d)
            throw JSONException("Forbidden numeric value: $d")
        return d;
    }
}
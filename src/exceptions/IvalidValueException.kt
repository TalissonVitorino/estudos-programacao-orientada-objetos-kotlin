package exceptions


class IvalidValueException(val value: Double) : RuntimeException() {
    override val message = "value $value is not valid "
}
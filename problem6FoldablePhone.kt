class FoldablePhone(isScreenLightOn: Boolean = false, var isFolded: Boolean = false) : Phone(isScreenLightOn) {
    override fun switchOn() {
        if (!isFolded) {
            super.switchOn()
            println("The foldable phone screen is now on.")
        } else {
            println("Cannot turn on the screen when the phone is folded.")
        }
    }

    fun fold() {
        isFolded = true
        println("The foldable phone is now folded.")
    }

    fun unfold() {
        isFolded = false
        println("The foldable phone is now unfolded.")
    }
}

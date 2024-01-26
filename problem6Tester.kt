fun main() {
    val foldablePhone = FoldablePhone()

    // Initially, the phone is not folded
    foldablePhone.switchOn()
    foldablePhone.checkPhoneScreenLight()

    // Fold the phone
    foldablePhone.fold()
    foldablePhone.switchOn() // This shouldn't turn on the screen when folded

    // Unfold the phone
    foldablePhone.unfold()
    foldablePhone.switchOn() // This should turn on the screen when unfolded
    foldablePhone.checkPhoneScreenLight()
}

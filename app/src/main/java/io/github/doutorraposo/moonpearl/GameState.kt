package io.github.doutorraposo.moonpearl

/**
 * JNI bridge to the running game's state in second_screen.c (libmain.so),
 * loaded by SDLActivity in the :game process.
 */
object GameState {
    @JvmStatic external fun getLinkX(): Int
    @JvmStatic external fun getLinkY(): Int
    @JvmStatic external fun getArea(): Int
    @JvmStatic external fun getModule(): Int
    @JvmStatic external fun isIndoors(): Boolean
    @JvmStatic external fun readSram(out: ByteArray)
    @JvmStatic external fun getEquippedSlot(): Int
    @JvmStatic external fun getEquippedSlotX(): Int
    @JvmStatic external fun getDungeon(): Int
    @JvmStatic external fun getIndoorExit(out: IntArray): Boolean
    @JvmStatic external fun readDungFlags(out: ByteArray)
    @JvmStatic external fun equipSlot(slot: Int)
    @JvmStatic external fun assignSlotX(slot: Int)
    @JvmStatic external fun setHudHidden(hide: Boolean)
    @JvmStatic external fun isHudHidden(): Boolean
    @JvmStatic external fun getFeatures(): Int
    @JvmStatic external fun setFeature(mask: Int, on: Boolean)

    @JvmStatic external fun renderWorldMap(out: IntArray, dark: Boolean): Boolean
    @JvmStatic external fun renderIconSheet(out: IntArray): Boolean
    @JvmStatic external fun renderGlyphSheet(out: IntArray): Boolean
    @JvmStatic external fun renderLetterSheet(out: IntArray): Boolean
    @JvmStatic external fun renderLinkFace(out: IntArray, chunk: Int): Boolean
    @JvmStatic external fun getDungeonLayout(palace: Int, out: ByteArray): Int
    @JvmStatic external fun renderDungeonFloor(palace: Int, floorIdx: Int, out: IntArray): Boolean
    @JvmStatic external fun renderMapIcons(palace: Int, out: IntArray): Boolean
}

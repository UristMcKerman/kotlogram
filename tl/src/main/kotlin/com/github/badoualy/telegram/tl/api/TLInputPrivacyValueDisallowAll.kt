package com.github.badoualy.telegram.tl.api

/**
 * inputPrivacyValueDisallowAll#d66b66c9
 *
 * @author Yannick Badoual yann.badoual@gmail.com
 * @see <a href="http://github.com/badoualy/kotlogram">http://github.com/badoualy/kotlogram</a>
 */
class TLInputPrivacyValueDisallowAll : TLAbsInputPrivacyRule() {
    private val _constructor: String = "inputPrivacyValueDisallowAll#d66b66c9"

    override val constructorId: Int = CONSTRUCTOR_ID

    override fun toString() = _constructor

    override fun equals(other: Any?): Boolean {
        if (other !is TLInputPrivacyValueDisallowAll) return false
        if (other === this) return true

        return true
    }
    companion object  {
        const val CONSTRUCTOR_ID: Int = 0xd66b66c9.toInt()
    }
}
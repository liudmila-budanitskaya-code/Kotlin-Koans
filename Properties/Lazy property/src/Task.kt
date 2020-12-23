import com.sun.xml.internal.ws.policy.spi.AssertionCreationException
import java.lang.AssertionError

class LazyProperty(val initializer: () -> Int) {
    var _lazy: Int? = null
    val lazy: Int
        get() {
            if (_lazy == null) {
                _lazy = initializer()
            }
            return _lazy!!
        }
}

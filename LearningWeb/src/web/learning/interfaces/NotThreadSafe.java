package web.learning.interfaces;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@Target({ ElementType.TYPE })
public @interface NotThreadSafe {

}

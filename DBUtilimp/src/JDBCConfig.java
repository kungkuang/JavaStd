import java.lang.annotation.*;

import static java.lang.annotation.ElementType.METHOD;//
import static java.lang.annotation.ElementType.TYPE;// @TODO: 为何静态导入???

/**
 * Created by AbelKung on 2018/5/14.
 */
@Target({METHOD, TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Inherited
@Documented
public @interface JDBCConfig {
    String ip();
    int port() default 3306;
    String database();
    String encoding();
    String loginName();
    String password();
}

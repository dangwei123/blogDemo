package dangwei.exception;

import lombok.Getter;
import lombok.Setter;

/**
 * ClassName:BaseException
 * Package:dangwei.exception
 * Description:
 *
 * @Date:2020/5/17 14:43
 * @Author:DangWei
 */
@Getter
@Setter
public class BaseException extends RuntimeException {

    protected String code;

    public BaseException(String code, String message) {
        this(code, message, null);
    }

    public BaseException(String code, String message, Throwable cause) {
        super(message, cause);
        this.code = code;
    }
}
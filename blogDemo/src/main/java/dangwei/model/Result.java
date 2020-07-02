package dangwei.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * ClassName:Result
 * Package:dangwei.model
 * Description:
 *
 * @Date:2020/5/11 9:39
 * @Author:DangWei
 */
@Getter
@Setter
@ToString
public class Result {

    private boolean success;

    private String message;

    private String stackTrace;

    private Object data;
}

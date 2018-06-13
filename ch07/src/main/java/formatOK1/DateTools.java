package formatOK1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author : Cheese
 * @date : 2018/6/13
 * @description : TODO
 */
public class DateTools {
    public static Date parse(String formatPattern,String dateString)throws ParseException {
        return new SimpleDateFormat(formatPattern).parse(dateString);
    }
    public static String format(String formatPattern,Date date){
        return new SimpleDateFormat(formatPattern).format(date).toString();
    }
}

package bean.util;

import java.text.DateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class CustomerUtil {

    private static final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    public static String convertDateToUS(String date) {
        LocalDate localDate = LocalDate.parse(date, formatter);
        return localDate.toString();
    }

    public static String convertDateToBR(String date) {
        LocalDate localDate = LocalDate.parse(date);
        return localDate.format(formatter);
    }
}

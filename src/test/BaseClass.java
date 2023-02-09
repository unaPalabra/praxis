package test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class BaseClass {
    public static void main(String[] args) {
        String text = "У Сени и Сани в сенях сом с усами";
        Pattern pattern = Pattern.compile("\\b[Сс][а-яА-ЯёЁ]+\\b");
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()) {
            System.out.println(text.substring(matcher.start(), matcher.end()));
        }
    }
    protected int defaultValue;
    public int protectedValue;

    public BaseClass() {
        this.defaultValue = 1;
        this.protectedValue = 1;
    }
}

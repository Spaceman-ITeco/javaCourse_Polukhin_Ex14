package regex;

import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        //Serebro [Текст песни «Мама Люба»]
        String we ="Мы";
        StringBuilder builder = new StringBuilder("На твоих диванах сходим с ума");
        builder.insert(29, " "+we.toLowerCase(Locale.ROOT));
        System.out.println(builder);
        StringBuilder builder1 = new StringBuilder(" как две мадамы после нирваны");
        builder1.insert(0,we);
        System.out.println(builder1);
        StringBuilder builder2 = new StringBuilder(" так летали, что не заметили твою мать");
        builder2.insert(0,we);
        System.out.println(builder2);
        String regex1 ="ять";
        Pattern pattern1 = Pattern.compile(regex1);
        String stringToBeMatched1 = "Её, и она сказала, что я просто ять";
        String stringToBeReplaced1 = "*****";
        Matcher matcher1 = pattern1.matcher(stringToBeMatched1);
        StringBuilder stringBuilder1 = new StringBuilder();
        while (matcher1.find()) {
            matcher1.appendReplacement(stringBuilder1,
                    stringToBeReplaced1);
        }
        matcher1.appendTail(stringBuilder1);
        System.out.println(stringBuilder1);

        System.out.println();
        StringBuilder str = new StringBuilder();
        String regex = str.append("(давай)").toString();
        Pattern pattern = Pattern.compile(regex);
        String stringToBeMatched = "Мама Люба, давай";
        String stringToBeReplaced = "давай, давай, давай";
        Matcher matcher = pattern.matcher(stringToBeMatched);
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < 6; i++) {
            while (matcher.find()) {
                matcher.appendReplacement(stringBuilder,
                                stringToBeReplaced);
            }
            matcher.appendTail(stringBuilder);
            System.out.println(stringBuilder);
        }
    }
}

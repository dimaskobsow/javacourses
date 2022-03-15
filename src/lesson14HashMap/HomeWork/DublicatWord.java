package lesson14HashMap.HomeWork;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class DublicatWord {
    public static void main(String[] args) {

        String repeat = "  Повторились ли слова в повторе или не повторились";
        String sentence = "Ёлочка вам нравится, ёлочка?";

        List<String> words = new ArrayList<>();
        for (String s : sentence.split(" ")) {
            words.add(s.replaceAll("[^аА-яЯ-ёЁ-пП]", "").toLowerCase());
        }

        Map<String, Long> frequency = countDuplicates(words);
        System.out.println(frequency);


        List<String> wordRepeat = new ArrayList<>();
        for (String r : repeat.split(" ")) {
            wordRepeat.add(r.replaceAll("Аа-Яя", "").toLowerCase());
        }

        Map<String, Long> copyWord = cointWord(wordRepeat);
        System.out.println(copyWord);


    }

    private static Map<String, Long> cointWord(List<String> stringList) {
        return stringList.stream().collect(Collectors.toMap(Function.identity(),v -> 1L, Long::sum));
    }

    public static Map<String, Long> countDuplicates(List<String> inputList) {
        return inputList.stream().collect(Collectors.toMap(Function.identity(), v -> 1L, Long::sum));
    }

}

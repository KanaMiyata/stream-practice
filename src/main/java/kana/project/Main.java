package kana.project;

import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        List<String> names = List.of("miyata", "yamashita", "sato", "hiiragisawa", "yamada");
        List<String> result = names.stream().filter(name -> name.contains("m")).toList();
        System.out.println(result);

    }
}

package kana.project;

import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<String> names = List.of("miyata", "yamashita", "sato", "hiiragisawa", "yamada");
        List<String> result = new ArrayList<>();

        for (int i = 0; i < names.size(); i++) {
            if (names.get(i).contains("m")) {
                result.add(names.get(i));
            }
        }
        System.out.println(result);
    }
}

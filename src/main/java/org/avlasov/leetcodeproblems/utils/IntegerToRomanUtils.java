package org.avlasov.leetcodeproblems.utils;

import org.avlasov.leetcodeproblems.IntegerToRoman;

import java.io.*;
import java.util.Collections;
import java.util.Map;
import java.util.StringJoiner;
import java.util.stream.Collectors;

/**
 * Created By artemvlasov on 24/06/2018
 **/
public class IntegerToRomanUtils {

    private final IntegerToRoman integerToRoman;

    public IntegerToRomanUtils() {
        integerToRoman = new IntegerToRoman();
    }

    public void createFileWithAllRomanNumbers() throws IOException {
        File file = new File("romanToInt.txt");
        if (file.exists())
            file.delete();
        file.createNewFile();
        try (FileOutputStream fos = new FileOutputStream(file)) {
            StringJoiner stringJoiner = new StringJoiner("\n");
            for (int i = 1; i <= 3999; i++) {
                stringJoiner.add(integerToRoman.intToRoman(i) + ":" + i);
            }
            fos.write(stringJoiner.toString().getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public Map<String, Integer> readAllRomanNumbersData(File file) {
        if (file != null && file.exists()) {
            try (FileReader fr = new FileReader(file); BufferedReader br = new BufferedReader(fr)) {
                return br.lines()
                        .collect(Collectors.toMap(
                                s -> s.split(":")[0],
                                s -> Integer.valueOf(s.split(":")[1])));
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return Collections.emptyMap();
    }

}

package org.avlasov.leetcodeproblems.utils;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.avlasov.leetcodeproblems.data.ListNode;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.Random;
import java.util.stream.Stream;

/**
 * Created By artemvlasov on 26/06/2018
 **/
public class MergeTwoSortedListsTestUtils {

    private ObjectMapper objectMapper;

    public MergeTwoSortedListsTestUtils() {
        objectMapper = new ObjectMapper();
    }

    public void createInts(int nums) throws IOException {
        if (nums <= 0) throw new IllegalArgumentException("Nums is negative or zero");
        int[] ints1 = new Random().ints(nums, 1, nums + 1).sorted().toArray();
        int[] ints2 = new Random().ints(nums, 1, nums + 1).sorted().toArray();
        int[] result = Stream.of(Arrays.stream(ints1), Arrays.stream(ints2))
                .flatMapToInt(s -> s)
                .sorted()
                .toArray();
        writeInts(ints1, String.format("MergeTwoSortedLists_%d_List_1.txt", nums));
        writeInts(ints2, String.format("MergeTwoSortedLists_%d_List_2.txt", nums));
        writeInts(result, String.format("MergeTwoSortedLists_%d_Result.txt", nums));
    }

    public int[] readInts(String filename) throws IOException {
        if (filename == null || filename.isEmpty()) return new int[]{};
        File file = new File(filename);
        if (file.exists()) {
            return objectMapper.readValue(file, int[].class);
        }
        return new int[]{};
    }

    public ListNode readIntsAsListNode(String filename) throws IOException {
        int[] ints = readInts(filename);
        return ListNodeUtils.createListNode(ints);
    }

    private void writeInts(int[] ints, String filename) throws IOException {
        File file = new File(filename);
        if (file.exists())
            file.delete();
        file.createNewFile();
        try (FileOutputStream fos = new FileOutputStream(file)) {
            fos.write(Arrays.toString(ints).getBytes());
        }
    }

}

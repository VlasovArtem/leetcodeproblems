package org.avlasov.leetcodeproblems.utils;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.avlasov.leetcodeproblems.data.BinaryData;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

import static com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance;

/**
 * Created By artemvlasov on 29/06/2018
 **/
public class AddBinaryTestUtils {

    private ObjectMapper objectMapper;

    public AddBinaryTestUtils() {
        objectMapper = new ObjectMapper();
    }

    public List<BinaryData> generateBinaryData(int numberOfBinaryData, int maxNumber) {
        Random random = new Random();
        List<BinaryData> binaryData = new ArrayList<>();
        for (int i = 0; i < numberOfBinaryData; i++) {
            binaryData.add(new BinaryData(random.nextInt(maxNumber + 1), random.nextInt(maxNumber + 1)));
        }
        return binaryData;
    }

    public void writeBinaryData(List<BinaryData> binaryData, String filePath) throws IOException {
        writeBinaryData(binaryData, new File(filePath));
    }

    public void writeBinaryData(List<BinaryData> binaryData, File file) throws IOException {
        if (file.exists())
            file.delete();
        file.createNewFile();
        objectMapper.writeValue(file, binaryData);
    }

    public List<BinaryData> readBinaryData(File file) throws IOException {
        if (file.exists()) {
            return objectMapper.readValue(file, defaultInstance().constructCollectionType(List.class, BinaryData.class));
        }
        return Collections.emptyList();
    }

    public List<BinaryData> readBinaryData(String filePath) throws IOException {
        return readBinaryData(new File(filePath));
    }

    public static void main(String[] args) throws IOException {
        AddBinaryTestUtils addBinaryTestUtils = new AddBinaryTestUtils();
        addBinaryTestUtils.writeBinaryData(addBinaryTestUtils.generateBinaryData(200, 5000), "binary_data.json");
    }

}

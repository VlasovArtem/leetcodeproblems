package org.avlasov.leetcodeproblems.easy;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.type.TypeFactory;
import org.junit.Test;

import java.io.File;
import java.util.Map;

import static org.junit.Assert.*;

/**
 * Created By artemvlasov on 12/07/2018
 **/
public class ExcelSheetColumnTitleTest {

    private ExcelSheetColumnTitle excelSheetColumnTitle;

    public ExcelSheetColumnTitleTest() {
        excelSheetColumnTitle = new ExcelSheetColumnTitle();
    }

    @Test
    public void convertToTitle_WithInteger1_ReturnString() {
        String result = excelSheetColumnTitle.convertToTitle(1);
        assertNotNull(result);
        assertEquals("A", result);
    }

    @Test
    public void convertToTitle_WithInteger2_ReturnString() {
        String result = excelSheetColumnTitle.convertToTitle(28);
        assertNotNull(result);
        assertEquals("AB", result);
    }

    @Test
    public void convertToTitle_WithInteger3_ReturnString() {
        String result = excelSheetColumnTitle.convertToTitle(701);
        assertNotNull(result);
        assertEquals("ZY", result);
    }

    @Test
    public void convertToTitle_WithInteger4_ReturnString() {
        String result = excelSheetColumnTitle.convertToTitle(52);
        assertNotNull(result);
        assertEquals("AZ", result);
    }

    @Test
    public void convertToTitle_WithInteger5_ReturnString() {
        String result = excelSheetColumnTitle.convertToTitle(703);
        assertNotNull(result);
        assertEquals("AAA", result);
    }

    @Test
    public void convertToTitle_WithIntegers1_ReturnString() throws Exception {
        File dataFile = new File(ExcelSheetColumnTitleTest.class.getResource("./excel_column_sheet_title.json").getFile());
        Map<String, Integer> testData = new ObjectMapper().readValue(dataFile, TypeFactory.defaultInstance().constructMapType(Map.class, String.class, Integer.class));
        for (Map.Entry<String, Integer> dataEntry : testData.entrySet()) {
            String result = excelSheetColumnTitle.convertToTitle(dataEntry.getValue());
            assertNotNull(result);
            assertEquals(dataEntry.getKey(), result);
        }
    }

    @Test
    public void convertToTitle_WithZeroInteger_ReturnNull() {
        assertNull(excelSheetColumnTitle.convertToTitle(0));
    }

    @Test
    public void convertToTitle_WithNegativeInteger_ReturnNull() {
        assertNull(excelSheetColumnTitle.convertToTitle(-1));
    }

}
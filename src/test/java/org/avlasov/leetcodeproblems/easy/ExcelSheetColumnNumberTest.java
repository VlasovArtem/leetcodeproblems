package org.avlasov.leetcodeproblems.easy;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.type.TypeFactory;
import org.junit.Test;

import java.io.File;
import java.util.Map;

import static org.junit.Assert.assertEquals;

/**
 * Created By artemvlasov on 13/07/2018
 **/
public class ExcelSheetColumnNumberTest {

    private ExcelSheetColumnNumber excelSheetColumnNumber;

    public ExcelSheetColumnNumberTest() {
        excelSheetColumnNumber = new ExcelSheetColumnNumber();
    }

    @Test
    public void titleToNumber_WithString1_ReturnInteger() {
        assertEquals(1, excelSheetColumnNumber.titleToNumber("A"));
    }

    @Test
    public void titleToNumber_WithString2_ReturnInteger() {
        assertEquals(28, excelSheetColumnNumber.titleToNumber("AB"));
    }

    @Test
    public void titleToNumber_WithString3_ReturnInteger() {
        assertEquals(701, excelSheetColumnNumber.titleToNumber("ZY"));
    }

    @Test
    public void titleToNumber_WithString4_ReturnInteger() {
        assertEquals(52, excelSheetColumnNumber.titleToNumber("AZ"));
    }

    @Test
    public void titleToNumber_WithString5_ReturnInteger() {
        assertEquals(703, excelSheetColumnNumber.titleToNumber("AAA"));
    }

    @Test
    public void titleToNumber_WithStrings1_ReturnInteger() throws Exception {
        File dataFile = new File(ExcelSheetColumnNumber.class.getResource("./excel_column_sheet_title.json").getFile());
        Map<String, Integer> testData = new ObjectMapper().readValue(dataFile, TypeFactory.defaultInstance().constructMapType(Map.class, String.class, Integer.class));
        for (Map.Entry<String, Integer> dataEntry : testData.entrySet()) {
            Integer value = dataEntry.getValue();
            assertEquals((int) value, excelSheetColumnNumber.titleToNumber(dataEntry.getKey()));
        }
    }

    @Test(expected = IllegalArgumentException.class)
    public void titleToNumber_WithNullString_ThrowsIllegalArgumentException() {
        excelSheetColumnNumber.titleToNumber(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void titleToNumber_WithEmptyString_ThrowsIllegalArgumentException() {
        excelSheetColumnNumber.titleToNumber("");
    }
    
}
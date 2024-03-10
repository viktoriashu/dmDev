package com.viktoria.cs.lesson7;


import com.viktoria.cs.lesson7.csv.CsvName;
import com.viktoria.cs.lesson7.csv.CsvPrice;
import com.viktoria.cs.lesson7.csv.CsvResult;

import java.io.*;
import java.nio.file.Path;
import java.util.List;


public class CsvRunner {


    public static void main(String[] args) throws IOException {
        Path pathPrice = Path.of("resources", "items-price.csv");
        Path pathName = Path.of("resources", "items-name.csv");
        Path result = Path.of("resources", "result.csv");

        List<CsvPrice> csvPriceList = CsvPrice.getCvsPrices(pathPrice);
        List<CsvName> csvNameList = CsvName.getCvsNames(pathName);
        List<CsvResult> csvResultList = CsvResult.getCvsResult(csvPriceList, csvNameList);

        CsvResult.writeCsvResultFile(result, csvResultList);
    }
}

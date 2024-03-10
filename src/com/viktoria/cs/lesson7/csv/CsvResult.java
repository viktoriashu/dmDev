package com.viktoria.cs.lesson7.csv;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class CsvResult {
    private static final String DELIMITER = ",";
    private static final String FILE_HEADER = "ID,NAME,PRICE";

    private int id;
    private String name;
    private double price;


    public static void writeCsvResultFile(Path result, List<CsvResult> getCsvResult) throws IOException {

        try (BufferedWriter fileWriter = Files.newBufferedWriter(result)) {
            fileWriter.append(FILE_HEADER);
            fileWriter.newLine();

            for (CsvResult csvResult : getCsvResult) {
                fileWriter.append(String.valueOf(csvResult.getId()));
                fileWriter.append(DELIMITER);
                fileWriter.append(csvResult.getName());
                fileWriter.append(DELIMITER);
                fileWriter.append(String.valueOf(csvResult.getPrice()));
                fileWriter.newLine();
            }

            System.out.println("Файл result.csv записан успешно");

        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }

    }


    public static List<CsvResult> getCvsResult(List<CsvPrice> csvPriceList, List<CsvName> csvNameList) {

        List<CsvResult> csvResultList = new ArrayList<>();
        int i = 0;

        for (CsvPrice csvPrice : csvPriceList) {
            CsvResult csvResult = new CsvResult();
            csvResult.setId(csvNameList.get(i).getId());
            csvResult.setName(csvNameList.get(i).getName());
            csvResult.setPrice(csvPriceList.get(i).getPrice());
            csvResultList.add(csvResult);
            i++;
        }
        return csvResultList;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        CsvResult csvResult = (CsvResult) object;
        return id == csvResult.id && Double.compare(price, csvResult.price) == 0 && Objects.equals(name, csvResult.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, price);
    }

    @Override
    public String toString() {
        return "CsvResult{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}

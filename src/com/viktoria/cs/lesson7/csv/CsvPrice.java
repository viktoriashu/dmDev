package com.viktoria.cs.lesson7.csv;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class CsvPrice {
    private static final String DELIMITER = ",";
    private int id;
    private double price;

    public CsvPrice() {
    }

    public static List<CsvPrice> getCvsPrices(Path pathPrice) throws IOException {
        BufferedReader readerPrice = Files.newBufferedReader(pathPrice);
        List<CsvPrice> csvPriceList = new ArrayList<>();
        String line = null;
        Scanner scanner = null;
        int index = 0;

        readerPrice.readLine().lines().skip(1);

        while ((line = readerPrice.readLine()) != null) {
            CsvPrice csvPrice = new CsvPrice();
            scanner = new Scanner(line);
            scanner.useDelimiter(DELIMITER);
            while (scanner.hasNext()) {
                String value = scanner.next();
                if (index == 0)
                    csvPrice.setId(Integer.parseInt(value));
                else if (index == 1)
                    csvPrice.setPrice(Double.parseDouble(value));
                else
                    System.out.println("Некорректные данные:" + value);
                index++;
            }
            index = 0;
            csvPriceList.add(csvPrice);
        }
        readerPrice.close();
        return csvPriceList;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
        CsvPrice csvPrice = (CsvPrice) object;
        return id == csvPrice.id && Double.compare(price, csvPrice.price) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, price);
    }

    @Override
    public String toString() {
        return "CsvPrice{" +
                "id=" + id +
                ", price=" + price +
                '}';
    }
}

package com.viktoria.cs.lesson7.csv;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class CsvName {
    private static final String DELIMITER = ",";
    private int id;
    private String name;
    private String description;


    public static List<CsvName> getCvsNames(Path pathName) throws IOException {
        BufferedReader readerName = Files.newBufferedReader(pathName);
        List<CsvName> csvNameList = new ArrayList<>();
        String line = null;
        Scanner scanner = null;
        int index = 0;

        readerName.readLine().lines().skip(1);

        while ((line = readerName.readLine()) != null) {
            CsvName csvName = new CsvName();
            scanner = new Scanner(line);
            scanner.useDelimiter(DELIMITER);
            while (scanner.hasNext()) {
                String value = scanner.next();
                if (index == 0)
                    csvName.setId(Integer.parseInt(value));
                else if (index == 1)
                    csvName.setName(value);
                else if (index == 2)
                    csvName.setDescription(value);
                else
                    System.out.println("Некорректные данные::" + value);
                index++;
            }
            index = 0;
            csvNameList.add(csvName);
        }
        readerName.close();
        return csvNameList;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        CsvName csvName = (CsvName) object;
        return id == csvName.id && Objects.equals(name, csvName.name) && Objects.equals(description, csvName.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, description);
    }

    @Override
    public String toString() {
        return "CsvName{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}

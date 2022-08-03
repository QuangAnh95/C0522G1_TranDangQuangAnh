package FuramaResort.utils;

import FuramaResort.model.Person.Customer;
import FuramaResort.model.Person.Employee;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReadEmployeeFile {
    private static List<String> readFile(String path){
        List<String> stringList = new ArrayList<>();
        String line;
        try {
            File file = new File(path);
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            while ((line = bufferedReader.readLine()) != null){
                stringList.add(line);
            }
            bufferedReader.close();

        } catch (IOException e){
            e.printStackTrace();
        }
        return stringList;
    }
    public static List<Employee> readEmployeeFile(String path){
        List<String> stringList = readFile(path);
        List<Employee> employeeList = new ArrayList<>();
        String[] info;
        for (String line : stringList){
            info = line.split(",");
            employeeList.add(new Employee(info[0],info[1],info[2],info[3],info[4],info[5],info[6],info[7],info[8],info[9],Double.parseDouble(info[10])));
        }
        return employeeList;
    }
}
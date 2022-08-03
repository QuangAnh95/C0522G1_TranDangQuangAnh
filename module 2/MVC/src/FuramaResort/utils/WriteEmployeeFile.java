package FuramaResort.utils;

import FuramaResort.model.Person.Employee;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class WriteEmployeeFile {
    private static void writeEmployee(String path, String data) {
        try {
            File file = new File(path);
            FileWriter fileWriter = new FileWriter(file);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(data);
            bufferedWriter.close();
            
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    public static void writeEmployeeFile(String path, List<Employee> employeeList) {
        StringBuilder data = new StringBuilder();
        for (Employee employee : employeeList){
            data.append(employee.getInfoPerson());
        }
        writeEmployee(path,data.toString());
    }
}

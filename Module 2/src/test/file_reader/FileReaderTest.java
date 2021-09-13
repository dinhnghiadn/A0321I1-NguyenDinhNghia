package test.file_reader;

import b12_java_collection_framework.bai_tap.luyen_tap_java_collection.Product;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileReaderTest {
    public static void main(String[] args) {
        // cách 1: dùng file reader
//        FileReader fileReader = null;
//
//        try {
//            fileReader = new FileReader("myFile.txt");
//            int character;
//            String temp = "";
//            while ((character = fileReader.read()) != -1 ){
//                temp+= (char)character;
//
//            }
//            String[] pro = temp.split(",");
//            Product product = new Product (pro[0],Integer.parseInt(pro[1]),pro[2]);
//            fileReader.close();
//        } catch (FileNotFoundException e){
//            e.printStackTrace();
//        }
//        catch (IOException e) {
//            e.printStackTrace();
//        }

        // cách 2 : dùng buffer Reader
//        try {
//            FileReader fileReader = new FileReader("myFile.txt");
//            BufferedReader bufferedReader = new BufferedReader(fileReader);
//            String line;
//            List<Product> productList = new ArrayList<>();
//            while ((line = bufferedReader.readLine()) != null)
//            {
//                String[] pro = line.split(",");
//                Product product = new Product (pro[0],Integer.parseInt(pro[1]),pro[2]);
//                productList.add(product);
//            }
//            fileReader.close();
//            bufferedReader.close();
//        } catch (FileNotFoundException e){
//            e.printStackTrace();
//        }
//        catch (IOException e) {
//            e.printStackTrace();
//        }

    }
}

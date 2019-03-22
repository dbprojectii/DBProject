package services;

import model.book;
import model.electronic;

import java.io.*;
import java.util.*;

public class productserviceimpl implements productservices {

    static int id = 1;

    static File file = new File("products.bin");
    static File tempFile = new File("productstemp.bin");
    static Scanner info = new Scanner(System.in);


    public void deleteProduct(int id) {
        Map<Integer,String> tempMap = new HashMap<>();
        try {

            BufferedReader buff = new BufferedReader(new FileReader(file));
            while (buff.ready()) {
                String read = buff.readLine();
                String productArrays[] = read.split(":");
                tempMap.put(Integer.parseInt(productArrays[0]), read);
            }
            tempMap.remove(id);
            buff.close();

            BufferedWriter buffw = new BufferedWriter(new FileWriter(tempFile, true));

            for (Map.Entry<Integer, String> entry : tempMap.entrySet())
            {
                buffw.write(entry.getValue());
                buffw.newLine();
            }

            tempFile.renameTo(file);
            buffw.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    public void addProduct() {
        try {
            BufferedWriter buffw = new BufferedWriter(new FileWriter(file, true));

            System.out.println("product name");
            String name = info.next();

            System.out.println("product quantity (type integer)");
            int quantity = info.nextInt();

            System.out.println("product price (type integer)");
            int price = info.nextInt();

            System.out.println("product Type (Electronic or Book)");
            String type = info.next();

            electronic electronic = null;
            book book = null;
            if (type.equalsIgnoreCase("electronic")) {
                electronic = new electronic(id, quantity, name, price);
            } else if (type.equalsIgnoreCase("book")) {
                book = new book(id, quantity, name, price);
            }


            if (electronic != null) {
                buffw.write(electronic.toString());
            } else {
                buffw.write(book.toString());
            }

            buffw.newLine();
            buffw.close();

            id++;
        } catch (IOException e) {
            e.printStackTrace();

        }

    }

    public List<String> listProduct() {
        List<String> products = new ArrayList<>();
        try {
            BufferedReader buff = new BufferedReader(new FileReader(file));
            while (buff.ready()) {
                String read = buff.readLine();
                products.add(read);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return products;
    }
}

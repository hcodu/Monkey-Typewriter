import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class CSVParser {
    static ArrayList<String> list = new ArrayList<String>();

    static String filePath;

    public CSVParser(String file) {
        filePath = file;
        int counter = 0;
        try
        {
            Scanner fileScanner = new Scanner(new File(filePath));
            fileScanner.nextLine();


            while (counter < 2308) {
                //System.out.println(file.nextLine());

                list.add(concatinate(fileScanner.nextLine()));


                counter++;
            }
            fileScanner.close();

            //System.out.println(list);
            
        }
        catch(FileNotFoundException e) {
            System.out.println("FloodFill: readIn(): FileNotFoundException!!");
        }
    }


    public static String concatinate(String line) {

        if(line.substring(1, 2).equals(",")) {
            return line.substring(8, 13);
        } 
        else if (line.substring(2,3).equals(",")) {

            return line.substring(9, 14);
        } 
        else if (line.substring(3,4).equals(",")) {

            return line.substring(10, 15);
        } 
        else {
            return line.substring(11, 16);

        }
    }

    public String[] getList() {
		String array[] = new String[list.size()];              
		for(int j = 0; j < list.size(); j++){
		  array[j] = list.get(j);
		}

        // for(int i = 0; i < array.length; i++) {
        //     //System.out.println(array[i]);
        // }



        return array;


    }
  }
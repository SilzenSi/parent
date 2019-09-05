package src.main.webapp;

import java.io.File;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileWriter;

public class dataFileRead {
       public static void main(String args[]) {
            //catch the error
            try {
                //Read .txt file，give the absolute path
                String pathname = "/Users/cuimac/Downloads/test.txt";
                File filename = new File(pathname);
                InputStreamReader reader = new InputStreamReader(
                        //create input stream object reader
                        new FileInputStream(filename));
                //create a object, it can transfer the file content into the language that the computer can recognize
                BufferedReader br = new BufferedReader(reader);
                String line = "";
                line = br.readLine();
                while (line != null) {
                    //Read one line per time
                    line = br.readLine();
                }

                //Write into the .txt file，give the absolute path
                File writename = new File("/Users/cuimac/Downloads/output.txt");
                //Create new file
                writename.createNewFile();
                BufferedWriter out = new BufferedWriter(new FileWriter(writename));
                out.write("I can write file\r\n");
                //push the cache content into the file
                out.flush();
                //Close the file
                out.close();

            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }


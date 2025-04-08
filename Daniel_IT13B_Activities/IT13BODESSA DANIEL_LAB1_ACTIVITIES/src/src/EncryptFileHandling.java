import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

package EncyptFileHandling;

public class java {
    
    public static void main(String[] args) throws IOException {
      
        File myObj = new File("C:\\Users\\oscar\\OneDrive\\Desktop\\EncryptFileHandling.txt");
        if (myObj.createNewFile()) {
            System.out.println("File created: " + myObj.getName());
        } else {
            System.out.println("File already exists.");
        }

        int key = 6;
        String message = "I love You \nGwapa ko! \nBuotan si Ma'am";
        String encryptedMessage = encryptMessage(message, key);

       
        System.out.println("Original Message:\n" + message);
        System.out.println("Encrypted Message:\n" + encryptedMessage);

       
        FileWriter myWriter = new FileWriter(myObj);
        myWriter.write("Original Message:\n" + message + "\n\n");
        myWriter.write("Encrypted Message:\n" + encryptedMessage);
        myWriter.close();

        System.out.println("Successfully wrote to the file.");
    }

   
    public static String encryptMessage(String message, int key) {
        char[] chars = message.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] != ' ' && chars[i] != '\n') {
                chars[i] += key;
            }
        }
        return new String(chars);
    }
}



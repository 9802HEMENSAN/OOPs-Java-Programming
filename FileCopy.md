Here's a **Java program** that copies the contents of a given file into another file using standard file I/O (with proper exception handling):

---

### ✅ Java Program: File Copy

```java
import java.io.*;

public class FileCopy {
    public static void main(String[] args) {
        // Specify source and destination file paths
        String sourceFile = "source.txt";
        String destinationFile = "destination.txt";

        // Try-with-resources ensures streams are closed automatically
        try (FileInputStream fis = new FileInputStream(sourceFile);
             FileOutputStream fos = new FileOutputStream(destinationFile)) {

            int byteData;
            // Read one byte at a time and write to destination
            while ((byteData = fis.read()) != -1) {
                fos.write(byteData);
            }

            System.out.println("File copied successfully from " + sourceFile + " to " + destinationFile);

        } catch (FileNotFoundException e) {
            System.out.println("Source file not found: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Error during file copy: " + e.getMessage());
        }
    }
}
```

---

### ✅ How to Use:

1. Create a text file named `source.txt` in the same directory as the program.
2. Add some sample content to `source.txt`.
3. Compile and run the program:

   ```bash
   javac FileCopy.java
   java FileCopy
   ```
4. A new file named `destination.txt` will be created with identical content.

---

### ✅ Output Example:

```
File copied successfully from source.txt to destination.txt
```

---

### 🔒 Notes:

* You can replace `FileInputStream` and `FileOutputStream` with `BufferedReader` and `BufferedWriter` if working with text files line-by-line.
* This example uses **byte stream**, suitable for both text and binary files.

Let me know if you want the line-by-line version using `BufferedReader` for better performance with large text files.

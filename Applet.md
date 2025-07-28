Create an applet using Java, which take name of any person as 
input and display its reverse. Use appropriate GUI and layout in your applet.

Here is a **Java Applet** that takes a person's name as input and displays the **reversed name**. It uses AWT (Abstract Window Toolkit) for the GUI and a simple layout for positioning.

---

### ✅ Features:

* Text input field for the name
* Button to trigger reverse operation
* Label to display the reversed name
* Uses **FlowLayout** for simplicity

---

### ✅ Java Applet Code

> Save this as `ReverseNameApplet.java`

```java
import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

/*
<applet code="ReverseNameApplet" width=400 height=200>
</applet>
*/

public class ReverseNameApplet extends Applet implements ActionListener {
    Label nameLabel, resultLabel;
    TextField nameInput;
    Button reverseButton;

    public void init() {
        // Set layout
        setLayout(new FlowLayout());

        // Initialize components
        nameLabel = new Label("Enter your name:");
        nameInput = new TextField(20);
        reverseButton = new Button("Reverse Name");
        resultLabel = new Label("Reversed Name: ");

        // Add components to applet
        add(nameLabel);
        add(nameInput);
        add(reverseButton);
        add(resultLabel);

        // Register listener
        reverseButton.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        String name = nameInput.getText();
        String reversed = new StringBuilder(name).reverse().toString();
        resultLabel.setText("Reversed Name: " + reversed);
    }
}
```

---

### ✅ How to Compile and Run the Applet:

1. **Compile**:

   ```bash
   javac ReverseNameApplet.java
   ```

2. **Create an HTML file to load the applet:**

   > Save as `ReverseNameApplet.html`

   ```html
   <html>
   <body>
     <applet code="ReverseNameApplet.class" width="400" height="200">
     </applet>
   </body>
   </html>
   ```

3. **Run using Applet Viewer**:

   ```bash
   appletviewer ReverseNameApplet.html
   ```

---

### ⚠ Note:

Applet support has been **removed in modern Java versions** (Java 11+). You may need to use an older version (e.g., Java 8) and the `appletviewer` tool.

---

### ✅ Alternative:

If you want a **modern GUI version using Swing**, I can provide that too. Would you like the Swing version instead?

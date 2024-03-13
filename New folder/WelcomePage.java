import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class WelcomePage extends JFrame {
    public WelcomePage() {
        // Set the title of the frame
        setTitle("Welcome to Our Application");
        // Set the size of the frame
        setSize(900, 700); // Set a reasonable size for the welcome page
        // Center the frame on the screen
        setLocationRelativeTo(null);
        // Set the default close operation
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        // Add the components to the frame
        initComponents();
    }

    private void initComponents() {
        // Create the custom advanced label with welcoming message
        AdvancedLabel welcomeLabel = new AdvancedLabel("Welcome to Our Application!");

        // Load and resize the image from the given path
        ImageIcon appIcon = loadImage("C:\\Users\\saura\\Pictures\\Image\\abc.jpg", 700, 500);

        // Create a JLabel to display the image
        JLabel iconLabel = new JLabel(appIcon);

        // Create interactive buttons
        JButton loginButton = new JButton("Login");
        JButton signUpButton = new JButton("Sign Up");
        JButton continueButton = new JButton("Continue");

        // Add action listeners for the buttons (implement your functionality)
        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(WelcomePage.this, "Login button clicked!");
            }
        });

        signUpButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(WelcomePage.this, "Sign Up button clicked!");
            }
        });

        continueButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(WelcomePage.this, "Continue button clicked!");
            }
        });

        // Create a panel for the buttons
        JPanel buttonPanel = new JPanel(new FlowLayout());
        buttonPanel.add(loginButton);
        buttonPanel.add(signUpButton);
        buttonPanel.add(continueButton);

        // Set up the layout using GridBagLayout
        setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.insets = new Insets(10, 10, 10, 10);
        gbc.anchor = GridBagConstraints.CENTER;

        // Add components to the frame
        add(welcomeLabel, gbc);

        gbc.gridy++;
        add(iconLabel, gbc);

        gbc.gridy++;
        add(buttonPanel, gbc);
    }

    // Custom Advanced JLabel
    private static class AdvancedLabel extends JLabel {
        public AdvancedLabel(String text) {
            super(text);
            // Customize the label with custom font and foreground color
            setFont(new Font("Arial", Font.BOLD, 24));
            setForeground(Color.DARK_GRAY);
        }
    }

    // Helper method to load and resize the image from the file path
    private ImageIcon loadImage(String imagePath, int width, int height) {
        try {
            BufferedImage originalImage = ImageIO.read(new File(imagePath));
            Image scaledImage = originalImage.getScaledInstance(width, height, Image.SCALE_SMOOTH);
            return new ImageIcon(scaledImage);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            WelcomePage welcomePage = new WelcomePage();
            welcomePage.setVisible(true);
        });
    }
}

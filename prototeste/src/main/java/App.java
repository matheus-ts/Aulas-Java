import javax.swing.*;

public class App extends JDialog {
    private JPanel contentPane;
    private JButton button;
    private String lblTexto;
    private JButton buttonOK;

    public App() {
        setContentPane(contentPane);
        setModal(true);
        getRootPane().setDefaultButton(buttonOK);
    }
    private void btnCliqueActionPerformed(java.awt.event.ActionEvent evt){
        lblTexto= "Deu certo";
    }

    public static void main(String[] args) {
        App dialog = new App();
        dialog.pack();
        dialog.setVisible(true);
        System.exit(0);
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }
}

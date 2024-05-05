import javax.swing.*;

public class NotepadView {
    private JTextArea textArea;

    public NotepadView() {
        JFrame frame = new JFrame("Bloco de Notas");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        textArea = new JTextArea();
        JScrollPane scrollPane = new JScrollPane(textArea);

        frame.getContentPane().add(scrollPane);
        frame.setSize(600, 400);
        frame.setVisible(true);
    }

    public String getText() {
        return textArea.getText();
    }

    public void setText(String text) {
        textArea.setText(text);
    }
}

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class NotepadController {
    private Note model;
    private NotepadView view;

    public NotepadController(Note model, NotepadView view) {
        this.model = model;
        this.view = view;

        // Adiciona um ouvinte de evento para atualizar a view quando o texto for modificado
        view.textArea.getDocument().addDocumentListener(new DocumentListener() {
            public void changedUpdate(DocumentEvent e) {
                updateModel();
            }

            public void removeUpdate(DocumentEvent e) {
                updateModel();
            }

            public void insertUpdate(DocumentEvent e) {
                updateModel();
            }
        });
    }

    private void updateModel() {
        model.setContent(view.getText());
    }

    public void initController() {
        // Define o texto inicial da view baseado no modelo
        view.setText(model.getContent());
    }

    // Você pode adicionar métodos adicionais aqui para lidar com eventos, como salvar, abrir arquivos, etc.
}

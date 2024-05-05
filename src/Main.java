public class Main {
    public static void main(String[] args) {
        // Cria instâncias do modelo, da visualização e do controlador
        Note model = new Note();
        NotepadView view = new NotepadView();
        NotepadController controller = new NotepadController(model, view);

        // Inicializa o controlador para vincular a visualização ao modelo
        controller.initController();
    }
}

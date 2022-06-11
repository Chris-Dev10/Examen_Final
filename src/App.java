import controller.MenuPrincipalController;
import view.MenuPrincipalView;


public class App {
    public static void main(String[] args) throws Exception {
        MenuPrincipalView menuView = new MenuPrincipalView();

        MenuPrincipalController menuController = new MenuPrincipalController(menuView);

        while (menuController.getOpcion() != 3) {
            menuController.showMenuPrincipal();
        }
    }
}

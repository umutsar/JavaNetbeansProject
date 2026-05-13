package supermarketcashiersystem;

/**
 * Entry point of the application.
 */
public class SupermarketCashierSystem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Event Dispatch Thread (EDT): Ensure Swing components are created on the correct thread for safety
        java.awt.EventQueue.invokeLater(() -> {
            // Instantiate and display the main UI window
            new CashierUI().setVisible(true);
        });
    }

}
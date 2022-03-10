package analizadorlexico;
import UI.UI_AnalizadorLexico;
public class AnalizadorLexico {
    
    public static void main(String[] args) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UI_AnalizadorLexico().setVisible(true);
            }
        });
    }
}

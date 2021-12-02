
package main;

import javax.swing.UnsupportedLookAndFeelException;

public class Main {
    
        public int idUser; 
    
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, UnsupportedLookAndFeelException {
    
        for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
            if ("Nimbus".equals(info.getName())) {
                javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    
                    break;
                }
            }
            telas.Login login = new telas.Login();
            login.setVisible(true);
        }
}

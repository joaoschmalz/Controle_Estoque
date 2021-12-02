
package funcoesRelatorios;

import javax.swing.table.DefaultTableModel;
import static telas.Relatorios.jDataIni;
import static telas.Relatorios.jDataFim;
import static telas.Relatorios.lbResult;

public class LimparTela {
   
    public static void LimparTela(){
        jDataIni.setText("");
        jDataFim.setText("");
        lbResult.setText("");
        
        DefaultTableModel model = (DefaultTableModel) telas.Relatorios.jTableReports.getModel();
        model.setNumRows(0);        
    }
    
}



    

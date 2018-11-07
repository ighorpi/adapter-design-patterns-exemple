package Main;

import TomadasExemploAdapter.AdapatadorDeTomada;
import TomadasExemploAdapter.NovoPadrao;
import TomadasExemploAdapter.TomadaDoisPinos;


/**
 *
 * @author ighor
 */
public class Main
{

    public static void main(String[] args) {
        
        TomadaDoisPinos t1 = new TomadaDoisPinos();
        t1.ligarDoisPinos();
        
        
        NovoPadrao t2 = new NovoPadrao();
        t2.ligarTresPinos();
        
        
        NovoPadrao t3 = new NovoPadrao();
        AdapatadorDeTomada AdaptadorTe = new AdapatadorDeTomada(t3);
        AdaptadorTe.ligarDoisPinos();
    }
    
}

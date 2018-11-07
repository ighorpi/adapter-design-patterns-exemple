/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TomadasExemploAdapter;

/**
 *
 * @author ighor
 */
public class AdapatadorDeTomada extends TomadaDoisPinos
{
    private NovoPadrao novoPadrao;
    public AdapatadorDeTomada (NovoPadrao novoPadrao){
        this.novoPadrao = novoPadrao;
    }
    
    public void ligarDoisPinos(){
        novoPadrao.ligarTresPinos();
    }
}

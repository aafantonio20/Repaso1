/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.ulima.visortexto;

/**
 *
 * @author Administrator
 */
public class ModoVisualizarFactory {
    public ModoVisualizacionAdapter obtenerAdapter(String tipo){
        if (tipo.equals("pdf")){
            return new PDFAdapter();
        }else if (tipo.equals("html")){
            return new HTMLAdapter();
        }else{
            return null;
        }
    }    
}

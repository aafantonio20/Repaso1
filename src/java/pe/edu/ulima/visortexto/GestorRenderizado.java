/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.ulima.visortexto;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

/**
 *
 * @author Administrator
 */
public class GestorRenderizado {
    public ByteArrayOutputStream renderizar(String titulo, String contenido, String tipo) throws IOException{
        ModoVisualizarFactory factory = new ModoVisualizarFactory();
        ModoVisualizacionAdapter adapter = factory.obtenerAdapter(tipo);
        ByteArrayOutputStream baos = adapter.renderizar(titulo, contenido);
        return baos;
    }
}

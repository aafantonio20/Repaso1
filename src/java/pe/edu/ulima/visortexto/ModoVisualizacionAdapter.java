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
public interface ModoVisualizacionAdapter {
    public ByteArrayOutputStream renderizar(String titulo, String contenido)throws IOException;
}

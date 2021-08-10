/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package automata2;

import Lista.Lista;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Carlos
 */
public class Interfaz extends javax.swing.JFrame {
    String archivo;
    static String fallo="";
    static Lista Identificadores;
    static Lista OpAritmeticos;
    static Lista OpRelacionales;
    static Lista OpLogicos;
    static Lista pReservada;
    static Lista Numero;
    static Lista Comentario;
    static String[][] Matriz;

    /**
     * Creates new form Interfaz
     */
    public Interfaz() {
        super("Automata 2");
        initComponents();
        lblAlfabeto.setIcon(null);
        lblLexico.setIcon(null);
        lblSintaxis.setIcon(null);
        lblError.setText("");
       
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        txtArea = new javax.swing.JTextArea();
        btnAnalizar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        btnCodigoP = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        lblAlfabeto = new javax.swing.JLabel();
        lblSintaxis = new javax.swing.JLabel();
        lblLexico = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        lblError = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtArea.setEditable(true);
        txtArea.setColumns(20);
        txtArea.setRows(5);
        txtArea.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtAreaCaretUpdate(evt);
            }
        });
        jScrollPane1.setViewportView(txtArea);

        btnAnalizar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnAnalizar.setText("Analizar");
        btnAnalizar.setEnabled(false);
        btnAnalizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnalizarActionPerformed(evt);
            }
        });

        btnLimpiar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnLimpiar.setText("Limpiar");
        btnLimpiar.setEnabled(false);;
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        btnCodigoP.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnCodigoP.setText("Codigo de Prueba");
        btnCodigoP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCodigoPActionPerformed(evt);
            }
        });

        lblAlfabeto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/check.png"))); // NOI18N

        lblSintaxis.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/check.png"))); // NOI18N

        lblLexico.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/check.png"))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel1.setText(" Alfabeto");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel2.setText(" Lexico");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel3.setText(" Sintaxis");

        lblError.setEditable(false);
        lblError.setColumns(20);
        lblError.setRows(5);
        jScrollPane2.setViewportView(lblError);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane2)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblAlfabeto, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGap(42, 42, 42)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblLexico)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblSintaxis, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(16, 16, 16))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblLexico)
                    .addComponent(lblSintaxis)
                    .addComponent(lblAlfabeto))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnLimpiar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAnalizar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCodigoP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(btnAnalizar, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43)
                        .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnCodigoP, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    /*-------------Realiza las acciones del boton analizar--------------------*/  
    private void btnAnalizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnalizarActionPerformed
        eliminarArchivos();
        String[] texto;
        Identificadores = new Lista();
        OpAritmeticos = new Lista();
        OpRelacionales = new Lista();
        OpLogicos = new Lista();
        pReservada = new Lista();
        Numero = new Lista();
        Comentario = new Lista();
        lblAlfabeto.setIcon(null);
        lblLexico.setIcon(null);
        lblSintaxis.setIcon(null);
        lblError.setText("");
        lblError.setText("");
        fallo="";
        try {
            File file = new File(".\\Archivos\\Codigo.txt");
            if (!file.exists()) 
            {
                file.createNewFile();
            }
            texto=txtArea.getText().split("\n");
            BufferedWriter BW = new BufferedWriter(new FileWriter(file));
            for(int i=0;i<texto.length;i++)
            {
                BW.write(texto[i]);
                BW.newLine();
            }
                
            BW.close();
            archivo=".\\Archivos\\Codigo.txt";
            if(!Alfabeto(archivo))
            {
                lblAlfabeto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/check.png"))); // NOI18N
                System.out.println("Cada caracter pertenece al Alfabeto.");
                if(!Llenado(".\\Archivos\\MatrizLexica.txt"))
                {
                    if(!ALexico())
                    {
                        lblLexico.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/check.png"))); // NOI18N
                        System.out.println("Analisis lexico exitoso");
                        
                        if(!Llenado(".\\Archivos\\MatrizSintactica.txt"))
                        {
                            if(!ASintactico())
                            {
                                lblSintaxis.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/check.png"))); // NOI18N
                                System.out.println("Analisis Sintactico exitoso");
                            }else
                            {
                                lblError.setText(fallo);
                                lblSintaxis.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cross.png"))); // NOI18N
                            }
                }else
                {
                    lblError.setText(fallo);
                    lblLexico.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cross.png"))); // NOI18N
                }
                    
                    }else
                    {
                    lblError.setText(fallo);
                    lblLexico.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cross.png"))); // NOI18N
                    }
                    
                }else
                {
                    lblError.setText(fallo);
                    lblLexico.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cross.png"))); // NOI18N
                }
            }else
            {
                lblError.setText(fallo);
                lblAlfabeto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cross.png"))); // NOI18N
            }
        } catch (IOException ex) {
            Logger.getLogger(Interfaz.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_btnAnalizarActionPerformed
    /*-------------Realiza las acciones del boton codigo prueba---------------*/  /*AQUI SE CAMBIA A P CUANDO SE TERMINE*/
    private void btnCodigoPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCodigoPActionPerformed
        btnAnalizar.setEnabled(true);
        btnLimpiar.setEnabled(true);
        archivo=".\\Archivos\\CodigoP2.txt";
        try {
            BufferedReader BR = new BufferedReader(new FileReader(archivo));
            String Linea=BR.readLine();
            txtArea.setText("");
            while(Linea!=null)
            {
                txtArea.setText(txtArea.getText()+Linea+"\n");
                Linea=BR.readLine();
            }
            BR.close();
        } catch (IOException ex) {
            Logger.getLogger(Interfaz.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnCodigoPActionPerformed
    /*-------------Realiza las acciones del boton limpiar---------------------*/  
    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        eliminarArchivos();
        txtArea.setText("");
        btnAnalizar.setEnabled(false);
        btnLimpiar.setEnabled(false);
        lblAlfabeto.setIcon(null);
        lblLexico.setIcon(null);
        lblSintaxis.setIcon(null);
        lblError.setText("");
    }//GEN-LAST:event_btnLimpiarActionPerformed
    /*-------------Desactiva los botones cuando no haya codigo escrito--------*/
    private void txtAreaCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtAreaCaretUpdate
        if(txtArea.getText().equals(""))
        {
            btnAnalizar.setEnabled(false);
            btnLimpiar.setEnabled(false);
        }else
        {
            btnAnalizar.setEnabled(true);
            btnLimpiar.setEnabled(true);
        }
    }//GEN-LAST:event_txtAreaCaretUpdate

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interfaz().setVisible(true);
            }
        });
    }

    /*-------------Comprueba que cada caracter pertenesca al alfabeto del lenguaje-------------*/    
    public static Boolean Alfabeto(String archivo) throws FileNotFoundException, IOException
    {
        Boolean error=false;
        BufferedReader BR = new BufferedReader(new FileReader(".\\Archivos\\Alfabeto.txt"));
        String Patron=BR.readLine();
        BR.close();
        BR=new BufferedReader(new FileReader(archivo));
        String[] Letras;
        String Linea = BR.readLine();
        Pattern p = Pattern.compile(Patron);
        for(int j=0;Linea!=null;j++)
        {
            Linea=Linea.replaceAll("\\s", "");
            if(!Linea.equals(""))
            {
                Letras=Linea.split("");
                for(int w=0;w<Letras.length;w++)
                {
                    if(w<Letras.length)
                    {
                        Matcher Matcher = p.matcher(Letras[w]);
                        if(!Matcher.find())
                        {
                            fallo=fallo+"Error en la linea: "+(j+1)+"\n"+"El simbolo: "+Letras[w]+"\n"+"No existe en el alfabeto"+"\n";
                            error=true;
                        }
                    }
                }
            }
            Linea=BR.readLine(); 
            
        }
        BR.close();
        return error;
    }
    /*-------------Recorre la Matriz para identificar Tockens*/
    public static Boolean ALexico()
    {
        Boolean error=false;
        try {
            BufferedReader BR = new BufferedReader(new FileReader(".\\Archivos\\Codigo.txt"));
            BufferedWriter BW = new BufferedWriter(new FileWriter(".\\Archivos\\LexicoSintactico.txt"));
            String Linea=BR.readLine();
            String palabra;
            String estado;
            String cadena;
            int conte=0;
            int recorrido;
            String[] Letra;
            while(Linea!=null)
            {
                cadena="";
                estado="Q0";
                recorrido=0;
                palabra="";
                conte++;
                if(Linea.contains("#"))
                    Linea="";
                if(!Linea.trim().equals(""))
                {
 //---------Pone un ; al final del arreglo para anunciar el final de la linea de codigo                   
                    Letra=Linea.split("");
                    Letra=finLinea(Letra);
//----------Hace un ciclo en el cual se salta todos los espacios al inicio de la oracion                    
                    while(Letra[recorrido].equals(" ") || Letra[recorrido].equals("\t"))
                        recorrido++;
//----------Empeza a recorrer el arreglo para checar caracter por caracter                    
                    do
                    {
                        estado=busqueda(Letra[recorrido],estado);
                        switch (PalabraLexico(estado))
                        {
                            case "P.Reservada":
                                pReservada.Insertar(estado.substring(1,estado.length()), "p.Reservada", palabra);
                                cadena=cadena+","+estado.substring(1,estado.length());
                                estado="Q0";
                                palabra="";
                                break;
                            case "Identificador":
                                Identificadores.InsertarN(estado.substring(1,estado.length()), "Identificador", palabra);
                                cadena=cadena+","+estado.substring(1,estado.length());
                                estado="Q0";
                                palabra="";
                                break;
                            case "O.Aritmetico":
                                OpAritmeticos.Insertar(estado.substring(1,estado.length()), "O. Aritmetico", palabra);
                                cadena=cadena+","+estado.substring(1,estado.length());
                                estado="Q0";
                                palabra="";
                                break;
                            case "O.Relacional":
                                OpRelacionales.Insertar(estado.substring(1,estado.length()), "O. Relacional", palabra);
                                cadena=cadena+","+estado.substring(1,estado.length());
                                estado="Q0";
                                palabra="";
                                break;
                            case "O.Logico":
                                OpLogicos.Insertar(estado.substring(1,estado.length()), "O. Logico", palabra);
                                cadena=cadena+","+estado.substring(1,estado.length());
                                estado="Q0";
                                palabra="";
                                break;
                            case "Numero":
                                Numero.InsertarN(estado.substring(1,estado.length()), "Numero", palabra);
                                cadena=cadena+","+estado.substring(1,estado.length());
                                estado="Q0";
                                palabra="";
                                break;
                            case "Comentario":
                                Comentario.InsertarN(estado.substring(1,estado.length()), "String", palabra);
                                cadena=cadena+","+estado.substring(1,estado.length());
                                estado="Q0";
                                palabra="";
                                break;
                            case "Error":
                                fallo=fallo+"Error lexico en la linea: "+conte+"\nEn el caracter: "+palabra+"\n";
                                error=true;
                                recorrido=Letra.length;
                                break;
                            case "":
                                if(!Letra[recorrido].equals(";")  && !Letra[recorrido].equals(" "))
                                    palabra=palabra+Letra[recorrido];
                                recorrido++;
                                break;
                        }
                    }while(recorrido<Letra.length);             
                }

                Linea=BR.readLine();
                BW.write(cadena);
                BW.newLine();
            }
            BR.close();
            BW.close();
            escribir();
        } catch (FileNotFoundException ex) {
            fallo=fallo+"No se encontro el archivo de codigo";
            error=true;
        } catch (IOException ex) {
            error=true;
        }
       
       return error;
    }
    public static Boolean ASintactico()
    {
        Boolean error=false;
        try {
            BufferedReader BR = new BufferedReader(new FileReader(".\\Archivos\\LexicoSintactico.txt"));
            String Linea=BR.readLine();
            String estado;
            int conte=0;
            int recorrido;
            String[] Letra;
            while(Linea!=null)
            {
                estado="Q0";
                recorrido=0;
                conte++;
                if(!Linea.trim().equals(""))
                {
                    Linea=Linea.substring(1,Linea.length());
    //---------Pone un ; al final del arreglo para anunciar el final de la linea de codigo                   
                    Letra=Linea.split(",");
                    Letra=finLinea(Letra);
    //----------Empeza a recorrer el arreglo para checar caracter por caracter                    
                    do
                    {
                        estado=busqueda(Letra[recorrido],estado);
                        switch (PalabraSintactico(estado))
                        {
                            case "Declarar":
                                fallo=fallo+"Error Sintactico en la linea: "+conte+"\n";
                                error=true;
                                recorrido=Letra.length;
                                break;
                            case "if":
                                fallo=fallo+"Error Sintactico en la linea: "+conte+"\n";
                                error=true;
                                recorrido=Letra.length;
                                break;
                            case "else":
                                fallo=fallo+"Error Sintactico en la linea: "+conte+"\n";
                                error=true;
                                recorrido=Letra.length;
                                break;
                            case "puts":
                                fallo=fallo+"Error Sintactico en la linea: "+conte+"\n";
                                error=true;
                                recorrido=Letra.length;
                                break;
                            case "end":
                                fallo=fallo+"Error Sintactico en la linea: "+conte+"\n";
                                error=true;
                                recorrido=Letra.length;
                                break;
                            case "while":
                                fallo=fallo+"Error Sintactico en la linea: "+conte+"\n";
                                error=true;
                                recorrido=Letra.length;
                                break;
                            case "incremento":
                                fallo=fallo+"Error Sintactico en la linea: "+conte+"\n";
                                error=true;
                                recorrido=Letra.length;
                                break;
                            case "operacion":
                                fallo=fallo+"Error Sintactico en la linea: "+conte+"\n";
                                error=true;
                                recorrido=Letra.length;
                                break;
                            case "Correcto":
                                System.out.println("Sintaxis de la linea: "+conte+" correcta");
                                recorrido=Letra.length;
                                break;
                            case "NC":
                                fallo=fallo+"Caso no contemplado para el analisis lexico\n"+"Linea: "+conte+"\n";
                                error=true;
                                recorrido=Letra.length;
                                break;
                            case "":
                                recorrido++;
                                break;
                        }
                    }while(recorrido<Letra.length);  
                }
                Linea=BR.readLine();
            }
            BR.close();
        } catch (FileNotFoundException ex) {
            fallo=fallo+"No se encontro el archivo de codigo";
            error=true;
        } catch (IOException ex) {
            error=true;
        }
       
       return error;
    }
    /*-------------Recorre la Matriz para llenarla con los estados-------------*/    
    public static boolean Llenado(String archivo)
    {
        boolean error=false;
        try {
            BufferedReader BR = new BufferedReader(new FileReader(archivo));
            String Linea = BR.readLine();
            int Aux=0;
            String[] Tamaño=Linea.split("	");
            while(Linea!=null)
            {
                Aux++;
                Linea=BR.readLine();
            }
            Matriz=new String[Aux][Tamaño.length];
            BR.close();
            BR = new BufferedReader(new FileReader(archivo));
            for(int i=0;i<Aux;i++)
            {
                Linea=BR.readLine();
                Tamaño=Linea.split("	");
                for(int j=0;j<Tamaño.length;j++)
                Matriz[i][j]=Tamaño[j];
            }
            BR.close();
        } catch (FileNotFoundException ex) {
            fallo=fallo+"No se encontro la matriz\nde estados durante\n el analisis lexico"+"\n";
            error=true;
        } catch (IOException ex) {
            error=true;
        }
        return error;
    }   
    /*--------Recorre la matriz para encontrar el siguient estado-------------*/
    public static String busqueda(String letra, String Lugar)
    {
        int j=0;
        int i=0;
        while(!Matriz[i][0].equals(Lugar))
            i++;
        while(!Matriz[0][j].equals(letra))
        {
            j++;
        }
        return Matriz[i][j];
    }
    /*--------------Comprueba si el estado actual es final en lexico----------*/
    public static String PalabraLexico(String siguiente)
    {
        String resultado="";
        if(siguiente.equals("Q998"))
            resultado="Identificador";
        else
            if(Integer.parseInt(siguiente.substring(1,siguiente.length()))>300 && Integer.parseInt(siguiente.substring(1,siguiente.length()))<400)
                resultado="P.Reservada";
        else
                if(Integer.parseInt(siguiente.substring(1,siguiente.length()))>400 && Integer.parseInt(siguiente.substring(1,siguiente.length()))<500)
                    resultado="O.Aritmetico";
        else
                    if(Integer.parseInt(siguiente.substring(1,siguiente.length()))>500 && Integer.parseInt(siguiente.substring(1,siguiente.length()))<600)
                        resultado="O.Relacional";
        else
                        if(Integer.parseInt(siguiente.substring(1,siguiente.length()))>600 && Integer.parseInt(siguiente.substring(1,siguiente.length()))<700)
                            resultado="O.Logico";
        else
                            if(siguiente.equals("Q701"))
                                resultado="Numero";
        else
                                if(siguiente.equals("Q1000"))
                                    resultado="Error";
        else
                                    if(siguiente.equals("Q1100"))
                                        resultado="Comentario";
        return resultado;
    }
    /*--------------Comprueba si el estado actual es final en sintaxis--------*/
    public static String PalabraSintactico(String siguiente)
    {
        String resultado="";
        if(siguiente.equals("Q2000"))
            resultado="Correcto";
        else
            if(siguiente.equals("Q2100"))
                resultado="Correcto";
        else
                if(siguiente.equals("Q2200"))
                    resultado="Correcto";
        else
                    if(siguiente.equals("Q2300"))
                        resultado="Correcto";
        else
                        if(siguiente.equals("Q2400"))
                            resultado="Correcto";
        else
                            if(siguiente.equals("Q2500"))
                                resultado="Correcto";
        else
                                if(siguiente.equals("Q2600"))
                                    resultado="Correcto";
        else
                                    if(siguiente.equals("Q2800"))
                                        resultado="Correcto";
        else
        if(siguiente.equals("Q2001"))
             resultado="Declarar";
        else
            if(siguiente.equals("Q2101"))
                resultado="if";
        else
                if(siguiente.equals("Q2201"))
                    resultado="else";
        else
                    if(siguiente.equals("Q2301"))
                        resultado="puts";
        else
                        if(siguiente.equals("Q2401"))
                            resultado="end";
        else
                            if(siguiente.equals("Q2501"))
                                resultado="while";
        else
                                if(siguiente.equals("Q2601"))
                                    resultado="incremento";
        else
                                    if(siguiente.equals("Q2801"))
                                        resultado="operacion";
        else
                                        if(siguiente.equals("Q3000"))
                                            resultado="NC";
        return resultado;
    }
    /*--------------Añade un ; al final de la linea---------------------------*/
    public static String[] finLinea(String[] Letra)
    {
        String[] aux=new String[Letra.length+1];
        for(int i=0;i<aux.length;i++)
        {
            if(i<Letra.length)
                aux[i]=Letra[i];
            else
                aux[i]=";";
        }
        Letra=new String[aux.length];
        for(int i=0;i<Letra.length;i++)
        {
            Letra[i]=aux[i];
        }
        return Letra;            
    }
    /*---------------Rellena el documento de tokens---------------------------*/
    public static void escribir() throws IOException
    {
       String[] Letra;
       String texto="Numero        Tipo        Palabra \n";
       texto=texto+OpAritmeticos.recuperar();
       texto=texto+OpRelacionales.recuperar();
       texto=texto+OpLogicos.recuperar();
       texto=texto+Numero.recuperar();
       texto=texto+pReservada.recuperar();
       texto=texto+Identificadores.recuperar();
       texto=texto+Comentario.recuperar();
       
       File file = new File(".\\Archivos\\Tokens.txt");
       if (!file.exists()) {
	     file.createNewFile();
	  }
       Letra=texto.split("\n");
       BufferedWriter BW = new BufferedWriter(new FileWriter(file));
       for(int i=0;i<Letra.length;i++)
       {
           BW.write(Letra[i]);
           BW.newLine();
       }
       BW.close();
    }
    /*---------------Elimina los archivos cada que hay un cambio--------------*/
    public void eliminarArchivos()
    {
        File file = new File(".\\Archivos\\Tokens.txt");
        if (file.exists()) {
	     file.delete();
        }
        file = new File(".\\Archivos\\Codigo.txt");
        if (file.exists()) {
            file.delete();
        }
        file = new File(".\\Archivos\\LexicoSintactico.txt");
        if (file.exists()) {
            file.delete();
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAnalizar;
    private javax.swing.JButton btnCodigoP;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblAlfabeto;
    private javax.swing.JTextArea lblError;
    private javax.swing.JLabel lblLexico;
    private javax.swing.JLabel lblSintaxis;
    private javax.swing.JTextArea txtArea;
    // End of variables declaration//GEN-END:variables
}

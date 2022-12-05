package camara;

import com.github.sarxos.webcam.Webcam;
import com.github.sarxos.webcam.WebcamPanel;
import com.github.sarxos.webcam.WebcamResolution;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Captura extends javax.swing.JFrame {
    
    int anchoCamara = 640;
    int largoCamara = 470;    
    Dimension dimension = new Dimension(anchoCamara,largoCamara);
    Dimension dimension1 = WebcamResolution.HD720.getSize();
    Webcam webcam = Webcam.getDefault();
    WebcamPanel webcamPanel = new WebcamPanel(webcam, dimension, false);    
    BufferedImage ruta;
    int contador = 0;

    public Captura() {
        initComponents();
        setLocationRelativeTo(null);
        webcam.setViewSize(dimension1);
        webcamPanel.setFillArea(true);
        pnlWebcam.setLayout(new FlowLayout());
        pnlWebcam.add(webcamPanel);
        
        lbl.setText(webcam.toString());
        apagarBotones();
    }

    public void apagarBotones (){
        
        btnApagar.setEnabled(false);
        btnCF.setEnabled(false);
        btnSave.setEnabled(false);        
    }
    
    public void prenderBotones(){
        
        btnApagar.setEnabled(true);
        btnCF.setEnabled(true);
        
    }
    
    public void cargandoCamara(){
        
        btnApagar.setText("Iniciando Camara...");
        btnCF.setText("Iniciando Camara...");
        btnSave.setText("Iniciando Camara...");
        btnIniciar.setText("Iniciando Camara...");        
    }
    
    public void camaraCargada () {
        
        btnApagar.setText("APAGAR");
        btnCF.setText("CAPTURAR FOTO");
        btnSave.setText("GUARDAR FOTO");
        btnIniciar.setText("INICIAR");        
    }   
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlOpciones = new javax.swing.JPanel();
        btnApagar = new javax.swing.JButton();
        lblCamaraEnUso = new javax.swing.JLabel();
        lbl = new javax.swing.JLabel();
        btnIniciar = new javax.swing.JButton();
        btnCF = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        pnlWebcam = new javax.swing.JPanel();
        pnlImg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cámara");
        setBackground(new java.awt.Color(0, 0, 0));
        setResizable(false);

        pnlOpciones.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        btnApagar.setBackground(new java.awt.Color(204, 204, 204));
        btnApagar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnApagar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/off.png"))); // NOI18N
        btnApagar.setText("APAGAR");
        btnApagar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnApagar.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btnApagar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnApagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnApagarActionPerformed(evt);
            }
        });

        lblCamaraEnUso.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblCamaraEnUso.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCamaraEnUso.setText("CAMARA EN USO");

        lbl.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl.setText("-");

        btnIniciar.setBackground(new java.awt.Color(204, 204, 204));
        btnIniciar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnIniciar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/on.png"))); // NOI18N
        btnIniciar.setText("INICIAR");
        btnIniciar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnIniciar.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btnIniciar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnIniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIniciarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlOpcionesLayout = new javax.swing.GroupLayout(pnlOpciones);
        pnlOpciones.setLayout(pnlOpcionesLayout);
        pnlOpcionesLayout.setHorizontalGroup(
            pnlOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlOpcionesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblCamaraEnUso, javax.swing.GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE)
                    .addComponent(lbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlOpcionesLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnlOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnIniciar)
                    .addComponent(btnApagar))
                .addGap(47, 47, 47))
        );
        pnlOpcionesLayout.setVerticalGroup(
            pnlOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlOpcionesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnApagar)
                .addGap(98, 98, 98)
                .addComponent(btnIniciar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 174, Short.MAX_VALUE)
                .addComponent(lblCamaraEnUso)
                .addGap(30, 30, 30)
                .addComponent(lbl)
                .addGap(21, 21, 21))
        );

        btnCF.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnCF.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/camera.png"))); // NOI18N
        btnCF.setText("CAPTURAR FOTO");
        btnCF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCFActionPerformed(evt);
            }
        });

        btnSave.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/save.png"))); // NOI18N
        btnSave.setText("GUARDAR");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        pnlWebcam.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout pnlWebcamLayout = new javax.swing.GroupLayout(pnlWebcam);
        pnlWebcam.setLayout(pnlWebcamLayout);
        pnlWebcamLayout.setHorizontalGroup(
            pnlWebcamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 640, Short.MAX_VALUE)
        );
        pnlWebcamLayout.setVerticalGroup(
            pnlWebcamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 470, Short.MAX_VALUE)
        );

        pnlImg.setForeground(new java.awt.Color(204, 204, 204));
        pnlImg.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlOpciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(pnlWebcam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(pnlImg, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(btnCF)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 477, Short.MAX_VALUE)
                        .addComponent(btnSave)
                        .addGap(36, 36, 36))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(74, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlOpciones, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(pnlImg, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(90, 90, 90))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(pnlWebcam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(24, 24, 24)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnCF)
                            .addComponent(btnSave))
                        .addGap(10, 10, 10)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnApagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnApagarActionPerformed
        webcamPanel.stop();
        apagarBotones();
        btnIniciar.setEnabled(true);
        pnlImg.setIcon(null);
    }//GEN-LAST:event_btnApagarActionPerformed

    private void btnCFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCFActionPerformed
        
        btnCF.setText("Capturar Otra Foto");
        btnSave.setEnabled(true);
        
        ImageIcon foto;
        foto = new ImageIcon(webcam.getImage());
        Icon iconoFoto = new ImageIcon(foto.getImage().getScaledInstance(pnlImg.getWidth(), pnlImg.getHeight(), Image.SCALE_SMOOTH));
        pnlImg.setIcon(iconoFoto);
        
        ruta = webcam.getImage();
        
    }//GEN-LAST:event_btnCFActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        
        int pregunta = JOptionPane.showConfirmDialog(this, "¿Desea Guardar La Foto?", "Guardar", JOptionPane.OK_OPTION);
        
        if (pregunta == 0) {
            
            File export = new File ("C:\\Users\\propo\\OneDrive\\Documentos\\Foto_"+contador+".jpg");
            
            try{
                ImageIO.write(ruta, "jpg", export);
                JOptionPane.showMessageDialog(this, "Imagen Guardada En: " + export.getAbsolutePath());
            } catch (IOException e){
                System.out.println("Error: " + e);
            }
            
            pnlImg.setIcon(null);
            btnSave.setEnabled(false);
            btnCF.setText("CAPTURAR FOTO");
        }
        
        contador++;
        
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnIniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIniciarActionPerformed
        
        cargandoCamara();
        
        Thread hilo = new Thread (){
            
            @Override
            public void run () {
                webcamPanel.start();
                prenderBotones();
                camaraCargada();
            }
        };
        
        hilo.setDaemon(true);
        hilo.start();
        btnIniciar.setEnabled(false);
    }//GEN-LAST:event_btnIniciarActionPerformed

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
            java.util.logging.Logger.getLogger(Captura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Captura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Captura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Captura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Captura().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnApagar;
    private javax.swing.JButton btnCF;
    private javax.swing.JButton btnIniciar;
    private javax.swing.JButton btnSave;
    private javax.swing.JLabel lbl;
    private javax.swing.JLabel lblCamaraEnUso;
    private javax.swing.JLabel pnlImg;
    private javax.swing.JPanel pnlOpciones;
    private javax.swing.JPanel pnlWebcam;
    // End of variables declaration//GEN-END:variables
}

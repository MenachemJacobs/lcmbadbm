package edu.touro.mco152.bm.ui;

import edu.touro.mco152.bm.App;

import java.io.File;

/** This class is in charge of allowing the user to pick a location on their computer
 * to choose with directory should be used for the program. The GUI gives functionally
 * to the user to get to around there file system and choose where it shall be stored.
 *
 * @see javax.swing.JFrame
 * @see javax.swing.JFileChooser
 */
public class SelectFrame extends javax.swing.JFrame {

    private static final long serialVersionUID = 1L;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFileChooser jFileChooser1;

    /**
     * Creates new form SelectFrame
     */
    public SelectFrame() {
        initComponents();
        setLocationRelativeTo(Gui.mainFrame);
        if (App.locationDir == null) {
            App.locationDir = new File(System.getProperty("user.home"));
            App.dataDir = new File(App.locationDir.getAbsolutePath()
                    + File.separator + App.DATADIRNAME);
        }
    }

    /**
     * By using the GUI, this method helps execute the users choice for either verifying or canceling
     * any of its previous choices that were made. By the user clicking "OK", that will trigger the
     * "ApproveSelection" in which will allow the applications directory to be saved as the chosen directory.
     * "CancelSelection", triggers nothing and reverts back to how it previously was.
     *
     * @param evt - the ActionEvent which is to find out with selection the user chose.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFileChooser1 = new javax.swing.JFileChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Choose Location");

        jFileChooser1.setFileSelectionMode(javax.swing.JFileChooser.DIRECTORIES_ONLY);
        jFileChooser1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFileChooser1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jFileChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 520, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jFileChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jFileChooser1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFileChooser1ActionPerformed
        // TODO add your handling code here:
        System.out.println(evt);
        switch (evt.getActionCommand()) {
            case "ApproveSelection":
                App.locationDir = jFileChooser1.getSelectedFile();
                App.saveConfig();
                Gui.mainFrame.setLocation(App.locationDir.getAbsolutePath());
                break;
            case "CancelSelection":
                break;
        }
        Gui.selFrame.setVisible(false);
        Gui.selFrame.dispose();
    }//GEN-LAST:event_jFileChooser1ActionPerformed
    // End of variables declaration//GEN-END:variables

    void setInitDir(File file) {
        jFileChooser1.setSelectedFile(file);
    }

}

/*
 * HelpBrowserPanel.java
 *
 * Created on den 17 juni 2008, 11:27
 */

package org.catacombae.hfsexplorer.helpbrowser;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;

/**
 *
 * @author  erik
 */
public class HelpBrowserPanel extends javax.swing.JPanel {

    /** Creates new form HelpBrowserPanel */
    public HelpBrowserPanel() {
        initComponents();
        try {
            htmlView.setPage(new URL("http://hem.bredband.net/catacombae/hfsx.html"));
        } catch(MalformedURLException ex) {
            // Why do I need to catch this? It's not malformed ffs.
        } catch(IOException ex) {
            Logger.getLogger(HelpBrowserPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        backButton = new javax.swing.JButton();
        homeButton = new javax.swing.JButton();
        htmlViewScroller = new javax.swing.JScrollPane();
        htmlView = new javax.swing.JTextPane();

        backButton.setText("Back");

        homeButton.setText("Home");

        htmlViewScroller.setViewportView(htmlView);

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(backButton)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(homeButton)
                .addContainerGap(466, Short.MAX_VALUE))
            .add(htmlViewScroller, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 616, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(backButton)
                    .add(homeButton))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(htmlViewScroller, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 341, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton;
    private javax.swing.JButton homeButton;
    private javax.swing.JTextPane htmlView;
    private javax.swing.JScrollPane htmlViewScroller;
    // End of variables declaration//GEN-END:variables

    
    
    public static void main(String[] args) {
        JFrame f = new JFrame("Help viewer");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.add(new HelpBrowserPanel());
        f.pack();
        f.setLocationRelativeTo(null);
        f.setVisible(true);
    }
}
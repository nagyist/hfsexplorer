/*-
 * Copyright (C) 2008 Erik Larsson
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package org.catacombae.hfsexplorer.unfinished;

import java.awt.event.*;
import javax.swing.*;
import org.catacombae.hfs.HFSVolume;

/**
 *
 * @author  Erik
 */
public class CacheSettingsPanel extends javax.swing.JPanel {
    
    /** Creates new form CacheSettingsPanel */
    public CacheSettingsPanel(final HFSVolume fsView) {
        initComponents();
        cachingEnabledBox.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                boolean b = cachingEnabledBox.isSelected();
                blockSizeField.setEnabled(b);
                blocksInCacheField.setEnabled(b);
                
            }
        });
        
        applyButton.addActionListener(new ActionListener () {
            public void actionPerformed(ActionEvent ae) {
                
            }
        });
    }

    public static void main(String[] args) {
        CacheSettingsPanel csp = new CacheSettingsPanel(null);
        JFrame jf = new JFrame();
        jf.add(csp);
        jf.pack();
        jf.setLocationRelativeTo(null);
        jf.setVisible(true);
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cachingEnabledBox = new javax.swing.JCheckBox();
        blockSizeLabel = new javax.swing.JLabel();
        blocksInCacheLabel = new javax.swing.JLabel();
        blocksInCacheField = new javax.swing.JTextField();
        blockSizeField = new javax.swing.JTextField();
        totalCacheSizeLabel = new javax.swing.JLabel();
        totalCacheSizeField = new javax.swing.JTextField();
        applyButton = new javax.swing.JButton();
        cancelButton = new javax.swing.JButton();

        cachingEnabledBox.setText("Caching enabled");
        cachingEnabledBox.setMargin(new java.awt.Insets(0, 0, 0, 0));

        blockSizeLabel.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        blockSizeLabel.setText("Block size:");

        blocksInCacheLabel.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        blocksInCacheLabel.setText("Blocks in cache:");

        blocksInCacheField.setColumns(9);
        blocksInCacheField.setEnabled(false);

        blockSizeField.setColumns(9);
        blockSizeField.setEnabled(false);

        totalCacheSizeLabel.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        totalCacheSizeLabel.setText("Total cache size:");

        totalCacheSizeField.setEditable(false);
        totalCacheSizeField.setText("0 B");
        totalCacheSizeField.setBorder(null);
        totalCacheSizeField.setOpaque(false);

        applyButton.setText("Apply");

        cancelButton.setText("Cancel");

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                        .add(cancelButton)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, 102, Short.MAX_VALUE)
                        .add(applyButton))
                    .add(layout.createSequentialGroup()
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING, false)
                            .add(totalCacheSizeLabel, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .add(org.jdesktop.layout.GroupLayout.LEADING, blocksInCacheLabel, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .add(org.jdesktop.layout.GroupLayout.LEADING, blockSizeLabel, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .add(org.jdesktop.layout.GroupLayout.LEADING, cachingEnabledBox, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(blocksInCacheField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(blockSizeField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(totalCacheSizeField, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(cachingEnabledBox)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(blockSizeLabel)
                    .add(blockSizeField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(blocksInCacheLabel)
                    .add(blocksInCacheField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(totalCacheSizeField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(totalCacheSizeLabel))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(applyButton)
                    .add(cancelButton))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton applyButton;
    private javax.swing.JTextField blockSizeField;
    private javax.swing.JLabel blockSizeLabel;
    private javax.swing.JTextField blocksInCacheField;
    private javax.swing.JLabel blocksInCacheLabel;
    private javax.swing.JCheckBox cachingEnabledBox;
    private javax.swing.JButton cancelButton;
    private javax.swing.JTextField totalCacheSizeField;
    private javax.swing.JLabel totalCacheSizeLabel;
    // End of variables declaration//GEN-END:variables
}

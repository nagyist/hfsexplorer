/*-
 * Copyright (C) 2014 Erik Larsson
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

package org.catacombae.hfsexplorer.gui;

/**
 * @author <a href="http://www.catacombae.org/" target="_top">Erik Larsson</a>
 */
public class LeafInfoPanel extends javax.swing.JPanel {

    /** Creates new form LeafInfoPanel */
    public LeafInfoPanel() {
        initComponents();

        recordNumberField.setOpaque(false);
        recordOffsetField.setOpaque(false);
        recordSizeField.setOpaque(false);
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        recordNumberLabel = new javax.swing.JLabel();
        recordOffsetLabel = new javax.swing.JLabel();
        recordSizeLabel = new javax.swing.JLabel();
        recordNumberField = new javax.swing.JTextField();
        recordOffsetField = new javax.swing.JTextField();
        recordSizeField = new javax.swing.JTextField();

        recordNumberLabel.setText("Record number:");

        recordOffsetLabel.setText("Record offset:");

        recordSizeLabel.setText("Record size:");

        recordNumberField.setEditable(false);
        recordNumberField.setText("jTextField1");
        recordNumberField.setBorder(null);

        recordOffsetField.setEditable(false);
        recordOffsetField.setText("jTextField2");
        recordOffsetField.setBorder(null);

        recordSizeField.setEditable(false);
        recordSizeField.setText("jTextField3");
        recordSizeField.setBorder(null);

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(layout.createSequentialGroup()
                        .add(recordNumberLabel)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(recordNumberField, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 164, Short.MAX_VALUE))
                    .add(layout.createSequentialGroup()
                        .add(recordOffsetLabel)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(recordOffsetField, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE))
                    .add(layout.createSequentialGroup()
                        .add(recordSizeLabel)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(recordSizeField, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 187, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(recordNumberLabel)
                    .add(recordNumberField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(recordOffsetLabel)
                    .add(recordOffsetField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(recordSizeLabel)
                    .add(recordSizeField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField recordNumberField;
    private javax.swing.JLabel recordNumberLabel;
    private javax.swing.JTextField recordOffsetField;
    private javax.swing.JLabel recordOffsetLabel;
    private javax.swing.JTextField recordSizeField;
    private javax.swing.JLabel recordSizeLabel;
    // End of variables declaration//GEN-END:variables

    public void setRecordNumber(int recordNumber) {
        recordNumberField.setText("" + recordNumber);
    }

    public void setRecordOffset(int recordOffset) {
        recordOffsetField.setText(recordOffset + " bytes");
    }

    public void setRecordSize(int recordSize) {
        recordSizeField.setText(recordSize + " bytes");
    }
}
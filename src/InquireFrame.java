/**
 *
 * @author yinuo
 */
public class InquireFrame extends javax.swing.JFrame {
    /**
     * Creates new form InquireFrame
     */
    protected EmployeeInfo currentEmp;
    protected MyHashTable currentHT;
    
    public InquireFrame(EmployeeInfo cEmp, MyHashTable cHT) {
        initComponents();
        currentEmp = cEmp;
        currentHT = cHT;
        modifyEN.setText(Integer.toString(currentEmp.getEmployeeNum()));
        modifyFN.setText(currentEmp.getFirstName());
        modifyLN.setText(currentEmp.getLastName());
        modifySX.setText(Integer.toString(currentEmp.getSex()));
        modifyWL.setText(Integer.toString(currentEmp.getWorkLocation()));
        modifyDR.setText(Double.toString(currentEmp.getDeductionRate()));
        if (currentEmp instanceof PartTimeEmployee){
            PartTimeEmployee initPartEmp = (PartTimeEmployee)currentEmp;
            modifyHW.setText(Double.toString(initPartEmp.getHourlyWage()));
            modifyHPW.setText(Integer.toString(initPartEmp.getHoursPerWeek()));
            modifyWPY.setText(Integer.toString(initPartEmp.getWeeksPerYear()));
            editButtonPT.setSelected(true);
        }
        else{
            modifyYS.setText(Double.toString(((FullTimeEmployee)currentEmp).getYearlySalary()));
            editButtonFT.setSelected(true);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        editEmpType = new javax.swing.ButtonGroup();
        modifyEN = new javax.swing.JTextField();
        modifyFN = new javax.swing.JTextField();
        modifyLN = new javax.swing.JTextField();
        editTitle = new javax.swing.JLabel();
        eNLabel = new javax.swing.JLabel();
        fNLabel = new javax.swing.JLabel();
        lNLabel = new javax.swing.JLabel();
        saveButton = new javax.swing.JButton();
        deleteButton = new javax.swing.JButton();
        modifySX = new javax.swing.JTextField();
        modifyWL = new javax.swing.JTextField();
        modifyDR = new javax.swing.JTextField();
        sXLabel = new javax.swing.JLabel();
        wLLabel = new javax.swing.JLabel();
        dRLabel = new javax.swing.JLabel();
        editButtonPT = new javax.swing.JRadioButton();
        editButtonFT = new javax.swing.JRadioButton();
        modifyYS = new java.awt.TextField();
        ySLabel = new java.awt.Label();
        modifyHW = new java.awt.TextField();
        modifyWPY = new java.awt.TextField();
        modifyHPW = new java.awt.TextField();
        hWLabel = new java.awt.Label();
        wPYLabel = new java.awt.Label();
        hPWLabel = new java.awt.Label();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        modifyEN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modifyENActionPerformed(evt);
            }
        });

        modifyFN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modifyFNActionPerformed(evt);
            }
        });

        modifyLN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modifyLNActionPerformed(evt);
            }
        });

        editTitle.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        editTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        editTitle.setText("Employee Edit");

        eNLabel.setText("Emplyoee Num");

        fNLabel.setText("First Name");

        lNLabel.setText("Last Name");

        saveButton.setText("Save");
        saveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveButtonActionPerformed(evt);
            }
        });

        deleteButton.setText("Delete");
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });

        modifySX.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modifySXActionPerformed(evt);
            }
        });

        modifyWL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modifyWLActionPerformed(evt);
            }
        });

        modifyDR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modifyDRActionPerformed(evt);
            }
        });

        sXLabel.setText("Sex");

        wLLabel.setText("Work Location");

        dRLabel.setText("Deduction Rate");

        editEmpType.add(editButtonPT);
        editButtonPT.setText("Part-Time");

        editEmpType.add(editButtonFT);
        editButtonFT.setText("Full-Time");

        ySLabel.setText("Yearly Salary");

        hWLabel.setText("Hourly Wage");

        wPYLabel.setText("Weeks Per Year");

        hPWLabel.setText("Hours Per Week");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(editTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(eNLabel)
                            .addComponent(fNLabel)
                            .addComponent(lNLabel))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(modifyFN)
                            .addComponent(modifyLN)
                            .addComponent(modifyEN, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(sXLabel)
                            .addComponent(wLLabel)
                            .addComponent(dRLabel))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(modifyWL)
                            .addComponent(modifyDR)
                            .addComponent(modifySX, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)))))
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(wPYLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(hWLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(hPWLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(editButtonPT)
                    .addComponent(modifyHW, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(modifyWPY, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(modifyHPW, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(editButtonFT)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(modifyYS, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ySLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))))
            .addGroup(layout.createSequentialGroup()
                .addGap(132, 132, 132)
                .addComponent(saveButton)
                .addGap(18, 18, 18)
                .addComponent(deleteButton))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(editTitle)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(eNLabel)
                    .addComponent(modifyEN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fNLabel)
                    .addComponent(modifyFN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lNLabel)
                    .addComponent(modifyLN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sXLabel)
                    .addComponent(modifySX, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(wLLabel)
                    .addComponent(modifyWL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dRLabel)
                    .addComponent(modifyDR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(editButtonPT)
                    .addComponent(editButtonFT))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(modifyYS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ySLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(modifyHW, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(hWLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(modifyHPW, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(modifyWPY, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(wPYLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(hPWLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(saveButton)
                    .addComponent(deleteButton))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void modifyENActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modifyENActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_modifyENActionPerformed

    private void modifyFNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modifyFNActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_modifyFNActionPerformed

    private void modifyLNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modifyLNActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_modifyLNActionPerformed

    private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButtonActionPerformed
        int saveEN = Integer.parseInt(modifyEN.getText());
        String saveFN = modifyFN.getText();
        String saveLN = modifyLN.getText();
        int saveSX = Integer.parseInt(modifySX.getText());
        int saveWL = Integer.parseInt(modifyWL.getText());
        double saveDR = Double.parseDouble(modifyDR.getText());
        double saveHW = Double.parseDouble(isEmpty(modifyHW.getText()));
        int saveHPW = Integer.parseInt(isEmpty(modifyHPW.getText()));
        int saveWPY = Integer.parseInt(isEmpty(modifyWPY.getText()));
        double saveYS = Double.parseDouble(isEmpty(modifyYS.getText()));
        if (saveEN != currentEmp.getEmployeeNum()){
            currentHT.removeEmployee(currentEmp.getEmployeeNum());
            if (editButtonPT.isSelected()){
                currentHT.addEmployee(new PartTimeEmployee(saveEN, saveFN, saveLN, saveSX, saveWL, saveDR, saveHW, saveHPW, saveWPY));
            }
            else{
                currentHT.addEmployee(new FullTimeEmployee(saveEN, saveFN, saveLN, saveSX, saveWL, saveDR, saveYS));
            }
            currentEmp = currentHT.searchEmployee(saveEN);
        }
        else{
            currentEmp.setFirstName(saveFN); 
            currentEmp.setLastName(saveLN);
            currentEmp.setSex(saveSX);
            currentEmp.setWorkLocation(saveWL);
            currentEmp.setDeductionRate(saveDR);
            if (editButtonPT.isSelected()){
                PartTimeEmployee partEmp = (PartTimeEmployee)currentEmp;
                partEmp.setHourlyWage(saveHW);
                partEmp.setHoursPerWeek(saveHPW);
                partEmp.setWeeksPerYear(saveWPY);
            }
            else{ // if employee is full time
                ((FullTimeEmployee)currentEmp).setYearlySalary(saveYS);
            }
        }
        this.setVisible(false); // why is this not working
    }//GEN-LAST:event_saveButtonActionPerformed

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
        currentHT.removeEmployee(currentEmp.getEmployeeNum());
        this.setVisible(false);
    }//GEN-LAST:event_deleteButtonActionPerformed

    private void modifySXActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modifySXActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_modifySXActionPerformed

    private void modifyWLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modifyWLActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_modifyWLActionPerformed

    private void modifyDRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modifyDRActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_modifyDRActionPerformed
    
    private String isEmpty(String input){
        if (input.equals("")){
            return "0";
        }
        return input;
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel dRLabel;
    private javax.swing.JButton deleteButton;
    private javax.swing.JLabel eNLabel;
    private javax.swing.JRadioButton editButtonFT;
    private javax.swing.JRadioButton editButtonPT;
    private javax.swing.ButtonGroup editEmpType;
    private javax.swing.JLabel editTitle;
    private javax.swing.JLabel fNLabel;
    private java.awt.Label hPWLabel;
    private java.awt.Label hWLabel;
    private javax.swing.JLabel lNLabel;
    private javax.swing.JTextField modifyDR;
    private javax.swing.JTextField modifyEN;
    private javax.swing.JTextField modifyFN;
    private java.awt.TextField modifyHPW;
    private java.awt.TextField modifyHW;
    private javax.swing.JTextField modifyLN;
    private javax.swing.JTextField modifySX;
    private javax.swing.JTextField modifyWL;
    private java.awt.TextField modifyWPY;
    private java.awt.TextField modifyYS;
    private javax.swing.JLabel sXLabel;
    private javax.swing.JButton saveButton;
    private javax.swing.JLabel wLLabel;
    private java.awt.Label wPYLabel;
    private java.awt.Label ySLabel;
    // End of variables declaration//GEN-END:variables
}

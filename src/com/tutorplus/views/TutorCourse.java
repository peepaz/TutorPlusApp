package com.tutorplus.views;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author elleb
 */
public class TutorCourse extends javax.swing.JFrame {

    /**
     * Creates new form TutorCourse
     */
    public TutorCourse() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        MyProfileJPanel = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        ViewTutorInfo = new javax.swing.JButton();
        LogOutTutor = new javax.swing.JButton();
        StudentCoursesJPanel = new javax.swing.JPanel();
        EditCourse = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TutorCourseListPrintout = new javax.swing.JList<>();
        jPanel2 = new javax.swing.JPanel();
        CourseOverviewJPanel = new javax.swing.JPanel();
        DeleteCourse = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        CourseNameLabel = new javax.swing.JLabel();
        CourseDescriptionLabel = new javax.swing.JLabel();
        UpdatePublishCourse = new javax.swing.JButton();
        CourseTypeLabel = new javax.swing.JLabel();
        CourseSemesterLabel = new javax.swing.JLabel();
        Department = new javax.swing.JLabel();
        CourseNameInput = new javax.swing.JTextField();
        CourseTypeComboBox = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        CourseDescriptionText = new javax.swing.JTextArea();
        SemesterComboBox = new javax.swing.JComboBox<>();
        DepartmentComboBox = new javax.swing.JComboBox<>();
        CourseTutorialJPanel = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        TutorialPrintout = new javax.swing.JList<>();
        ViewTutorialInfo = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        PageLabel2 = new javax.swing.JLabel();
        MenuBar = new javax.swing.JMenuBar();
        MyDashboardMenu = new javax.swing.JMenu();
        Exit = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1600, 1000));

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        MyProfileJPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("My Profile"));

        jLabel2.setText("UserName of logged in user");

        jLabel1.setText("Welcome");

        ViewTutorInfo.setText("View my information");

        LogOutTutor.setText("Log Out");

        javax.swing.GroupLayout MyProfileJPanelLayout = new javax.swing.GroupLayout(MyProfileJPanel);
        MyProfileJPanel.setLayout(MyProfileJPanelLayout);
        MyProfileJPanelLayout.setHorizontalGroup(
            MyProfileJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MyProfileJPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(MyProfileJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(MyProfileJPanelLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel2))
                    .addGroup(MyProfileJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(LogOutTutor, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(ViewTutorInfo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        MyProfileJPanelLayout.setVerticalGroup(
            MyProfileJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MyProfileJPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(MyProfileJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addComponent(ViewTutorInfo)
                .addGap(18, 18, 18)
                .addComponent(LogOutTutor)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        StudentCoursesJPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("My Courses"));

        EditCourse.setText("Edit Course Information");

        TutorCourseListPrintout.setBackground(new java.awt.Color(240, 240, 240));
        TutorCourseListPrintout.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "List of all courses tutor created" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(TutorCourseListPrintout);

        javax.swing.GroupLayout StudentCoursesJPanelLayout = new javax.swing.GroupLayout(StudentCoursesJPanel);
        StudentCoursesJPanel.setLayout(StudentCoursesJPanelLayout);
        StudentCoursesJPanelLayout.setHorizontalGroup(
            StudentCoursesJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(StudentCoursesJPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(StudentCoursesJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 193, Short.MAX_VALUE)
                    .addGroup(StudentCoursesJPanelLayout.createSequentialGroup()
                        .addComponent(EditCourse)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        StudentCoursesJPanelLayout.setVerticalGroup(
            StudentCoursesJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, StudentCoursesJPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 295, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(EditCourse)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(MyProfileJPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(StudentCoursesJPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(MyProfileJPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(StudentCoursesJPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        CourseOverviewJPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Course Details"));

        DeleteCourse.setText("Delete Course");
        DeleteCourse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteCourseActionPerformed(evt);
            }
        });

        jButton1.setText("Update Course");

        CourseNameLabel.setText("Course Name");

        CourseDescriptionLabel.setText("Course Description");

        UpdatePublishCourse.setText("Update and Publish Course");
        UpdatePublishCourse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdatePublishCourseActionPerformed(evt);
            }
        });

        CourseTypeLabel.setText("Course Type");

        CourseSemesterLabel.setText("Course Semester");

        Department.setText("Department");

        CourseNameInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CourseNameInputActionPerformed(evt);
            }
        });

        CourseTypeComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        CourseDescriptionText.setColumns(20);
        CourseDescriptionText.setRows(5);
        jScrollPane2.setViewportView(CourseDescriptionText);

        SemesterComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        DepartmentComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout CourseOverviewJPanelLayout = new javax.swing.GroupLayout(CourseOverviewJPanel);
        CourseOverviewJPanel.setLayout(CourseOverviewJPanelLayout);
        CourseOverviewJPanelLayout.setHorizontalGroup(
            CourseOverviewJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CourseOverviewJPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(CourseOverviewJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(CourseOverviewJPanelLayout.createSequentialGroup()
                        .addGroup(CourseOverviewJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(CourseSemesterLabel)
                            .addComponent(Department))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(CourseOverviewJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(SemesterComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(DepartmentComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(12, 12, 12))
                    .addGroup(CourseOverviewJPanelLayout.createSequentialGroup()
                        .addGroup(CourseOverviewJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2)
                            .addGroup(CourseOverviewJPanelLayout.createSequentialGroup()
                                .addGroup(CourseOverviewJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(CourseOverviewJPanelLayout.createSequentialGroup()
                                        .addComponent(jButton1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(UpdatePublishCourse)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(DeleteCourse))
                                    .addComponent(CourseDescriptionLabel))
                                .addGap(0, 25, Short.MAX_VALUE))
                            .addGroup(CourseOverviewJPanelLayout.createSequentialGroup()
                                .addComponent(CourseNameLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(CourseNameInput)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(CourseTypeLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(CourseTypeComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap())))
        );
        CourseOverviewJPanelLayout.setVerticalGroup(
            CourseOverviewJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CourseOverviewJPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(CourseOverviewJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CourseNameLabel)
                    .addComponent(CourseTypeLabel)
                    .addComponent(CourseNameInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CourseTypeComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(CourseDescriptionLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(CourseOverviewJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CourseSemesterLabel)
                    .addComponent(SemesterComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(CourseOverviewJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Department)
                    .addComponent(DepartmentComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(CourseOverviewJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(UpdatePublishCourse)
                    .addComponent(DeleteCourse))
                .addGap(60, 60, 60))
        );

        CourseTutorialJPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Course Search"));

        TutorialPrintout.setBackground(new java.awt.Color(240, 240, 240));
        TutorialPrintout.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Print out of all course tutorial" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane3.setViewportView(TutorialPrintout);

        ViewTutorialInfo.setText("View Tutorial Information");

        javax.swing.GroupLayout CourseTutorialJPanelLayout = new javax.swing.GroupLayout(CourseTutorialJPanel);
        CourseTutorialJPanel.setLayout(CourseTutorialJPanelLayout);
        CourseTutorialJPanelLayout.setHorizontalGroup(
            CourseTutorialJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CourseTutorialJPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(CourseTutorialJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3)
                    .addGroup(CourseTutorialJPanelLayout.createSequentialGroup()
                        .addComponent(ViewTutorialInfo)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        CourseTutorialJPanelLayout.setVerticalGroup(
            CourseTutorialJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CourseTutorialJPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(ViewTutorialInfo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(CourseOverviewJPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(CourseTutorialJPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(CourseOverviewJPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(CourseTutorialJPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        PageLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        PageLabel2.setText("My Course Dashboard");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(PageLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(PageLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        MyDashboardMenu.setText("My Dashboard");
        MyDashboardMenu.setActionCommand("");
        MyDashboardMenu.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        MenuBar.add(MyDashboardMenu);

        Exit.setText("Exit");
        Exit.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        MenuBar.add(Exit);

        setJMenuBar(MenuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void UpdatePublishCourseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdatePublishCourseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_UpdatePublishCourseActionPerformed

    private void DeleteCourseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteCourseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DeleteCourseActionPerformed

    private void CourseNameInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CourseNameInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CourseNameInputActionPerformed

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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TutorCourse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new TutorCourse().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel CourseDescriptionLabel;
    private javax.swing.JTextArea CourseDescriptionText;
    private javax.swing.JTextField CourseNameInput;
    private javax.swing.JLabel CourseNameLabel;
    private javax.swing.JPanel CourseOverviewJPanel;
    private javax.swing.JLabel CourseSemesterLabel;
    private javax.swing.JPanel CourseTutorialJPanel;
    private javax.swing.JComboBox<String> CourseTypeComboBox;
    private javax.swing.JLabel CourseTypeLabel;
    private javax.swing.JButton DeleteCourse;
    private javax.swing.JLabel Department;
    private javax.swing.JComboBox<String> DepartmentComboBox;
    private javax.swing.JButton EditCourse;
    private javax.swing.JMenu Exit;
    private javax.swing.JButton LogOutTutor;
    private javax.swing.JMenuBar MenuBar;
    private javax.swing.JMenu MyDashboardMenu;
    private javax.swing.JPanel MyProfileJPanel;
    private javax.swing.JLabel PageLabel2;
    private javax.swing.JComboBox<String> SemesterComboBox;
    private javax.swing.JPanel StudentCoursesJPanel;
    private javax.swing.JList<String> TutorCourseListPrintout;
    private javax.swing.JList<String> TutorialPrintout;
    private javax.swing.JButton UpdatePublishCourse;
    private javax.swing.JButton ViewTutorInfo;
    private javax.swing.JButton ViewTutorialInfo;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    // End of variables declaration//GEN-END:variables
}
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QuizApp_Gui;

import QuizApp_DAO.QuestionDAO;
import QuizApp_Pojo.Exam;
import QuizApp_Pojo.Question;
import QuizApp_Pojo.QuestionStore;
import QuizApp_Pojo.UserProfile;
import java.awt.Color;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;
import javax.swing.JOptionPane;

/**
 *
 * @author Sandarbh Taran
 */
public class EditQuestionFrame extends javax.swing.JFrame {

    /**
     * Creates new form EditQuestionFrame
     */Color oldcolor;
     private HashMap<String,String>options;
    public EditQuestionFrame() {
        initComponents();
         setLocationRelativeTo(null);
         oldcolor=lblLogout.getForeground();
         lblDisplayUsername.setText("HELLO "+UserProfile.getUsername());
          this.setTitle("QUIZAPP");
          options=new HashMap<>();
          options.put("Option 1","option1");
          options.put("Option 2","option2");
          options.put("Option 3","option3");
          options.put("Option 4","option4");
          qno=1;
          lblQno.setText("Question no : "+qno);
         
        
    }
    private Exam editExam;
    private QuestionStore qstore;
    
    public EditQuestionFrame(Exam exam)
    {
        this();
        this.editExam=exam;
        lblEditQuestionFrame.setText("EDITING "+editExam.getSubject()+" PAPER");
        loadQuestion();
        showQuestion();
    }

    private int pos=0;
    private int qno;
    private String question,option1,option2,option3,option4,correct_Option;
    
    private boolean validateInput()
    {
          question=txtareaQuestion.getText().trim();
        option1=txtOption1.getText().trim();
        option2=txtOption2.getText().trim();
        option3=txtOption3.getText().trim();
        option4=txtOption4.getText().trim();
        correct_Option=cbOptions.getSelectedItem().toString();
        if(question.isEmpty()||option1.isEmpty()||option2.isEmpty()||option3.isEmpty()||option4.isEmpty()||correct_Option.isEmpty())
        {
            return false;
        }
        return true;
    }
    
    private void showQuestion()
    {
        System.out.println("SHOW QUESTION "+pos);
        Question q=qstore.getQuestion(pos);
        txtareaQuestion.setText(q.getQuestion());
        txtOption1.setText(q.getOption1());
        txtOption2.setText(q.getOption2());
        txtOption3.setText(q.getOption3());
        txtOption4.setText(q.getOption4());
        String correct_Answer=q.getCorrectAnswer();
        String correct_Opt=getKeyFromValue(correct_Answer);
        cbOptions.setSelectedItem(correct_Opt);
    }
    
    private String getKeyFromValue(String value)
    {
        Set <String>keys=options.keySet();
        for(String k:keys)
        {
            String v=options.get(k);
            if(v.equals(value))
                return k;
        }
        return null;
    }
    
    private void loadQuestion()
    {
        try{
            ArrayList<Question>questionList=QuestionDAO.getQuestionsByExamId(editExam.getExamId());
            System.out.println(editExam.getExamId());
            qstore=new QuestionStore();
            System.out.println("QUESTIONLIST"+questionList);
            for(Question q:questionList)
            {
                System.out.println(q);
                qstore.addQuestion(q);
            }
            System.out.println(qstore.getAllQuestions());
        }catch(SQLException ex)
        {
            JOptionPane.showMessageDialog(null,"DB Error","EDIT QUESTION ERROR!",JOptionPane.ERROR_MESSAGE);
            ex.printStackTrace();
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

        SetQuestionPanel = new javax.swing.JPanel();
        lblLogout = new javax.swing.JLabel();
        lblEditQuestionFrame = new javax.swing.JLabel();
        pnlSetQuestionInner = new javax.swing.JPanel();
        btnPrevious = new javax.swing.JButton();
        btnDone = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        btnNext = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtareaQuestion = new javax.swing.JTextArea();
        lblQno = new javax.swing.JLabel();
        txtOption1 = new javax.swing.JTextField();
        txtOption3 = new javax.swing.JTextField();
        txtOption2 = new javax.swing.JTextField();
        txtOption4 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lblQno1 = new javax.swing.JLabel();
        cbOptions = new javax.swing.JComboBox<>();
        lblCorrectAnswer = new javax.swing.JLabel();
        lblDisplayUsername = new javax.swing.JLabel();
        lblSetQuestionImage = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        SetQuestionPanel.setBackground(new java.awt.Color(0, 0, 0));
        SetQuestionPanel.setForeground(new java.awt.Color(255, 153, 51));

        lblLogout.setBackground(new java.awt.Color(0, 0, 0));
        lblLogout.setFont(new java.awt.Font("Cambria", 3, 24)); // NOI18N
        lblLogout.setForeground(new java.awt.Color(255, 153, 51));
        lblLogout.setText("Logout");
        lblLogout.setOpaque(true);
        lblLogout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblLogoutMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblLogoutMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblLogoutMouseExited(evt);
            }
        });

        lblEditQuestionFrame.setBackground(new java.awt.Color(0, 0, 0));
        lblEditQuestionFrame.setFont(new java.awt.Font("Cambria", 3, 48)); // NOI18N
        lblEditQuestionFrame.setForeground(new java.awt.Color(0, 255, 0));

        pnlSetQuestionInner.setBackground(new java.awt.Color(0, 0, 0));
        pnlSetQuestionInner.setForeground(new java.awt.Color(255, 153, 51));

        btnPrevious.setBackground(new java.awt.Color(0, 0, 0));
        btnPrevious.setFont(new java.awt.Font("Cambria", 3, 24)); // NOI18N
        btnPrevious.setForeground(new java.awt.Color(255, 153, 51));
        btnPrevious.setText("PREVIOUS");
        btnPrevious.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPreviousActionPerformed(evt);
            }
        });

        btnDone.setBackground(new java.awt.Color(0, 0, 0));
        btnDone.setFont(new java.awt.Font("Cambria", 3, 24)); // NOI18N
        btnDone.setForeground(new java.awt.Color(255, 153, 51));
        btnDone.setText("DONE");
        btnDone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDoneActionPerformed(evt);
            }
        });

        btnCancel.setBackground(new java.awt.Color(0, 0, 0));
        btnCancel.setFont(new java.awt.Font("Cambria", 3, 24)); // NOI18N
        btnCancel.setForeground(new java.awt.Color(255, 153, 51));
        btnCancel.setText("CANCEL");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });

        btnNext.setBackground(new java.awt.Color(0, 0, 0));
        btnNext.setFont(new java.awt.Font("Cambria", 3, 24)); // NOI18N
        btnNext.setForeground(new java.awt.Color(255, 153, 51));
        btnNext.setText("NEXT");
        btnNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNextActionPerformed(evt);
            }
        });

        txtareaQuestion.setBackground(new java.awt.Color(204, 204, 204));
        txtareaQuestion.setColumns(20);
        txtareaQuestion.setFont(new java.awt.Font("Cambria", 3, 24)); // NOI18N
        txtareaQuestion.setRows(5);
        jScrollPane1.setViewportView(txtareaQuestion);

        lblQno.setBackground(new java.awt.Color(0, 0, 0));
        lblQno.setFont(new java.awt.Font("Cambria", 3, 18)); // NOI18N
        lblQno.setForeground(new java.awt.Color(0, 255, 0));

        txtOption1.setBackground(new java.awt.Color(204, 204, 204));
        txtOption1.setFont(new java.awt.Font("Cambria", 3, 24)); // NOI18N

        txtOption3.setBackground(new java.awt.Color(204, 204, 204));
        txtOption3.setFont(new java.awt.Font("Cambria", 3, 24)); // NOI18N

        txtOption2.setBackground(new java.awt.Color(204, 204, 204));
        txtOption2.setFont(new java.awt.Font("Cambria", 3, 24)); // NOI18N

        txtOption4.setBackground(new java.awt.Color(204, 204, 204));
        txtOption4.setFont(new java.awt.Font("Cambria", 3, 24)); // NOI18N

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Cambria", 3, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 153, 51));
        jLabel1.setText("OPTION 1");

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("Cambria", 3, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 153, 51));
        jLabel2.setText("OPTION 3");

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setFont(new java.awt.Font("Cambria", 3, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 153, 51));
        jLabel3.setText("OPTION 2");

        jLabel4.setBackground(new java.awt.Color(0, 0, 0));
        jLabel4.setFont(new java.awt.Font("Cambria", 3, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 153, 51));
        jLabel4.setText("OPTION 4");

        lblQno1.setBackground(new java.awt.Color(0, 0, 0));
        lblQno1.setFont(new java.awt.Font("Cambria", 3, 18)); // NOI18N
        lblQno1.setForeground(new java.awt.Color(0, 255, 0));

        cbOptions.setBackground(new java.awt.Color(204, 204, 204));
        cbOptions.setFont(new java.awt.Font("Cambria", 3, 24)); // NOI18N
        cbOptions.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Option 1", "Option 2", "Option 3", "Option 4" }));

        lblCorrectAnswer.setBackground(new java.awt.Color(0, 0, 0));
        lblCorrectAnswer.setFont(new java.awt.Font("Cambria", 3, 24)); // NOI18N
        lblCorrectAnswer.setForeground(new java.awt.Color(255, 153, 51));
        lblCorrectAnswer.setText("CORRECT ANSWER :");

        javax.swing.GroupLayout pnlSetQuestionInnerLayout = new javax.swing.GroupLayout(pnlSetQuestionInner);
        pnlSetQuestionInner.setLayout(pnlSetQuestionInnerLayout);
        pnlSetQuestionInnerLayout.setHorizontalGroup(
            pnlSetQuestionInnerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSetQuestionInnerLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlSetQuestionInnerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlSetQuestionInnerLayout.createSequentialGroup()
                        .addComponent(lblQno, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 703, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblQno1, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(pnlSetQuestionInnerLayout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addComponent(btnPrevious, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(62, 62, 62)
                .addGroup(pnlSetQuestionInnerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlSetQuestionInnerLayout.createSequentialGroup()
                        .addComponent(lblCorrectAnswer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(pnlSetQuestionInnerLayout.createSequentialGroup()
                        .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 97, Short.MAX_VALUE)
                        .addComponent(btnNext, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(73, 73, 73)
                        .addComponent(btnDone, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(69, 69, 69))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlSetQuestionInnerLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnlSetQuestionInnerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlSetQuestionInnerLayout.createSequentialGroup()
                        .addGroup(pnlSetQuestionInnerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlSetQuestionInnerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(txtOption3)
                                .addComponent(txtOption1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addGap(179, 179, 179)
                        .addGroup(pnlSetQuestionInnerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addGroup(pnlSetQuestionInnerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtOption2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtOption4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(169, 169, 169))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlSetQuestionInnerLayout.createSequentialGroup()
                        .addComponent(cbOptions, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(211, 211, 211))))
        );
        pnlSetQuestionInnerLayout.setVerticalGroup(
            pnlSetQuestionInnerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSetQuestionInnerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblQno1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(pnlSetQuestionInnerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlSetQuestionInnerLayout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(lblQno, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlSetQuestionInnerLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnlSetQuestionInnerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlSetQuestionInnerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtOption1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtOption2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(pnlSetQuestionInnerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlSetQuestionInnerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtOption3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtOption4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(pnlSetQuestionInnerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cbOptions, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCorrectAnswer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(52, 52, 52)
                .addGroup(pnlSetQuestionInnerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnPrevious)
                    .addComponent(btnDone)
                    .addComponent(btnCancel)
                    .addComponent(btnNext))
                .addGap(30, 30, 30))
        );

        lblDisplayUsername.setBackground(new java.awt.Color(0, 0, 0));
        lblDisplayUsername.setFont(new java.awt.Font("Cambria", 3, 24)); // NOI18N
        lblDisplayUsername.setForeground(new java.awt.Color(0, 255, 0));

        lblSetQuestionImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/QuizApp_Gui/Images/questionpaper4.jpg"))); // NOI18N

        javax.swing.GroupLayout SetQuestionPanelLayout = new javax.swing.GroupLayout(SetQuestionPanel);
        SetQuestionPanel.setLayout(SetQuestionPanelLayout);
        SetQuestionPanelLayout.setHorizontalGroup(
            SetQuestionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SetQuestionPanelLayout.createSequentialGroup()
                .addGroup(SetQuestionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(SetQuestionPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(pnlSetQuestionInner, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(SetQuestionPanelLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(lblDisplayUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(48, 48, 48)
                        .addComponent(lblEditQuestionFrame, javax.swing.GroupLayout.PREFERRED_SIZE, 426, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(SetQuestionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(SetQuestionPanelLayout.createSequentialGroup()
                    .addGap(420, 420, 420)
                    .addComponent(lblSetQuestionImage, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(421, Short.MAX_VALUE)))
        );
        SetQuestionPanelLayout.setVerticalGroup(
            SetQuestionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SetQuestionPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(SetQuestionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblLogout)
                    .addComponent(lblDisplayUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(SetQuestionPanelLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(lblEditQuestionFrame, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 193, Short.MAX_VALUE)
                .addComponent(pnlSetQuestionInner, javax.swing.GroupLayout.PREFERRED_SIZE, 531, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(SetQuestionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(SetQuestionPanelLayout.createSequentialGroup()
                    .addGap(90, 90, 90)
                    .addComponent(lblSetQuestionImage, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(534, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(SetQuestionPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(SetQuestionPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblLogoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLogoutMouseClicked
        // TODO add your handling code here:
        LoginFrame login=new LoginFrame();
        login.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_lblLogoutMouseClicked

    private void lblLogoutMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLogoutMouseEntered
        // TODO add your handling code here:
        lblLogout.setForeground(Color.WHITE);
    }//GEN-LAST:event_lblLogoutMouseEntered

    private void lblLogoutMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLogoutMouseExited
        // TODO add your handling code here:
        lblLogout.setForeground(oldcolor);
    }//GEN-LAST:event_lblLogoutMouseExited

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        // TODO add your handling code here:
        int ans=JOptionPane.showConfirmDialog(null,"Do you wanna discard everything?","CONFIRM/?",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
        if(ans==JOptionPane.YES_OPTION)
        {
            SetPaperFrame setFrame=new SetPaperFrame();
            setFrame.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_btnCancelActionPerformed

    private void btnNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextActionPerformed
        // TODO add your handling code here:
        if(!validateInput())
        {
             JOptionPane.showMessageDialog(null,"Please fill all fields","!!!Error",JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        String optionName=options.get(correct_Option);
        Question obj=new Question(editExam.getExamId(),qno,editExam.getSubject(),option1,option2,option3,option4,optionName,question);
        qstore.removeQuestion(pos);
        qstore.setQuestionAt(pos, obj);
        pos++;
        if(pos>=qstore.getCount())
        {
            JOptionPane.showMessageDialog(null,"Your question set is prepared successfully\nPress Done to add the to the database","!!!EXAM EDITTED",JOptionPane.INFORMATION_MESSAGE);
            pos=0;
        }
        showQuestion();
        qno++;
        if(qno>qstore.getCount())
            qno=1;
        lblQno.setText("Question no : "+qno);
    }//GEN-LAST:event_btnNextActionPerformed

    private void btnPreviousActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPreviousActionPerformed
        // TODO add your handling code here:
        
         if(!validateInput())
        {
             JOptionPane.showMessageDialog(null,"Please fill all fields","!!!Error",JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        String optionName=options.get(correct_Option);
        Question obj=new Question(editExam.getExamId(),qno,editExam.getSubject(),option1,option2,option3,option4,optionName,question);
        qstore.removeQuestion(pos);
        qstore.setQuestionAt(pos, obj);
        pos--;
        if(pos<0)
        {
            JOptionPane.showMessageDialog(null,"Your question set is prepared successfully\nPress Done to add the to the database","!!!EXAM EDITTED",JOptionPane.INFORMATION_MESSAGE);
            pos=qstore.getCount()-1;
        }
        showQuestion();
        qno--;
        if(qno<=0)
            qno=qstore.getCount();
        lblQno.setText("Question no : "+qno);
    }//GEN-LAST:event_btnPreviousActionPerformed

    private void btnDoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDoneActionPerformed
        // TODO add your handling code here:
         if(!validateInput()){
            JOptionPane.showMessageDialog(null, "Please fill all the fields!","Error!",JOptionPane.ERROR_MESSAGE);
            return;
        }        
        try{            
            QuestionDAO.updateQuestions(qstore);
            System.out.println(qstore);
            JOptionPane.showMessageDialog(null,"Your questions have been successfully updated to the database!","Exam Updated!",JOptionPane.INFORMATION_MESSAGE);
            AdminOptionFrame adminFrame=new AdminOptionFrame();
            adminFrame.setVisible(true);
            this.dispose();
        }
        catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "DB Error!", "Edit Questions Error!", JOptionPane.ERROR_MESSAGE);
            ex.printStackTrace();
        }
        
        
    }//GEN-LAST:event_btnDoneActionPerformed

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
            java.util.logging.Logger.getLogger(EditQuestionFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditQuestionFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditQuestionFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditQuestionFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditQuestionFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel SetQuestionPanel;
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnDone;
    private javax.swing.JButton btnNext;
    private javax.swing.JButton btnPrevious;
    private javax.swing.JComboBox<String> cbOptions;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCorrectAnswer;
    private javax.swing.JLabel lblDisplayUsername;
    private javax.swing.JLabel lblEditQuestionFrame;
    private javax.swing.JLabel lblLogout;
    private javax.swing.JLabel lblQno;
    private javax.swing.JLabel lblQno1;
    private javax.swing.JLabel lblSetQuestionImage;
    private javax.swing.JPanel pnlSetQuestionInner;
    private javax.swing.JTextField txtOption1;
    private javax.swing.JTextField txtOption2;
    private javax.swing.JTextField txtOption3;
    private javax.swing.JTextField txtOption4;
    private javax.swing.JTextArea txtareaQuestion;
    // End of variables declaration//GEN-END:variables
}

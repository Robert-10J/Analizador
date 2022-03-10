package UI;
import javax.swing.JOptionPane;
import static analizadorlexico.MethodsLexicalAnalyzer.isIdentifier;
import static analizadorlexico.MethodsLexicalAnalyzer.isOperator;
import static analizadorlexico.MethodsLexicalAnalyzer.toAscii;
import static analizadorlexico.MethodsLexicalAnalyzer.toList;
import static analizadorlexico.MethodsLexicalAnalyzer.removeIncongruity;
public class UI_AnalizadorLexico extends javax.swing.JFrame {
    
    String expression;
    String newExpression;
    String lblExpression;
    
    // X = A + B * C - D  AA+C/a*E  aa*-/bd++xd
    
    public UI_AnalizadorLexico() {
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        labelExpression = new javax.swing.JLabel();
        textFieldExpression = new javax.swing.JTextField();
        btnEvaluateExpression = new javax.swing.JButton();
        btnAnalyzerExpression = new javax.swing.JButton();
        btnEditExpression = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAreaExpression = new javax.swing.JTextArea();
        lblViewExpression = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtAreaOperators = new javax.swing.JTextArea();
        btnExit = new javax.swing.JButton();
        btnInputNewExpression = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        labelExpression.setFont(new java.awt.Font("Candara", 1, 16)); // NOI18N
        labelExpression.setText("             Introduzca una expresión:");

        textFieldExpression.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        btnEvaluateExpression.setBackground(new java.awt.Color(102, 153, 255));
        btnEvaluateExpression.setFont(new java.awt.Font("Candara", 1, 16)); // NOI18N
        btnEvaluateExpression.setForeground(new java.awt.Color(255, 255, 255));
        btnEvaluateExpression.setText("Evaluar Expresión");
        btnEvaluateExpression.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEvaluateExpressionActionPerformed(evt);
            }
        });

        btnAnalyzerExpression.setBackground(new java.awt.Color(102, 153, 255));
        btnAnalyzerExpression.setFont(new java.awt.Font("Candara", 1, 16)); // NOI18N
        btnAnalyzerExpression.setForeground(new java.awt.Color(255, 255, 255));
        btnAnalyzerExpression.setText("Analizar Expresión");
        btnAnalyzerExpression.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnalyzerExpressionActionPerformed(evt);
            }
        });

        btnEditExpression.setBackground(new java.awt.Color(102, 153, 255));
        btnEditExpression.setFont(new java.awt.Font("Candara", 1, 16)); // NOI18N
        btnEditExpression.setForeground(new java.awt.Color(255, 255, 255));
        btnEditExpression.setText("Corregir Expresión");
        btnEditExpression.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditExpressionActionPerformed(evt);
            }
        });

        txtAreaExpression.setBackground(new java.awt.Color(102, 153, 255));
        txtAreaExpression.setColumns(20);
        txtAreaExpression.setFont(new java.awt.Font("Candara", 1, 16)); // NOI18N
        txtAreaExpression.setRows(5);
        jScrollPane1.setViewportView(txtAreaExpression);

        lblViewExpression.setVisible(false);
        lblViewExpression.setFont(new java.awt.Font("Candara", 1, 16)); // NOI18N

        txtAreaOperators.setBackground(new java.awt.Color(102, 153, 255));
        txtAreaOperators.setColumns(20);
        txtAreaOperators.setFont(new java.awt.Font("Candara", 1, 16)); // NOI18N
        txtAreaOperators.setRows(5);
        jScrollPane2.setViewportView(txtAreaOperators);

        btnExit.setBackground(new java.awt.Color(102, 153, 255));
        btnExit.setFont(new java.awt.Font("Candara", 1, 16)); // NOI18N
        btnExit.setForeground(new java.awt.Color(255, 255, 255));
        btnExit.setText("Salir");

        btnInputNewExpression.setBackground(new java.awt.Color(102, 153, 255));
        btnInputNewExpression.setFont(new java.awt.Font("Candara", 1, 16)); // NOI18N
        btnInputNewExpression.setForeground(new java.awt.Color(255, 255, 255));
        btnInputNewExpression.setText("Nueva  Expresión");
        btnInputNewExpression.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInputNewExpressionActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Candara", 1, 16)); // NOI18N
        jLabel1.setText("Tabla de identificadores");

        jLabel2.setFont(new java.awt.Font("Candara", 1, 16)); // NOI18N
        jLabel2.setText("Tabla de operadores");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(201, 201, 201)
                .addComponent(lblViewExpression, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addComponent(btnAnalyzerExpression)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnEditExpression)
                            .addGap(60, 60, 60)
                            .addComponent(btnInputNewExpression))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(labelExpression, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(textFieldExpression, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(btnEvaluateExpression))))
                .addContainerGap(67, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(111, 111, 111)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(91, 91, 91))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelExpression, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textFieldExpression, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEvaluateExpression, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addComponent(lblViewExpression, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAnalyzerExpression, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEditExpression, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnInputNewExpression, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(40, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private boolean evaluate() {
        expression = textFieldExpression.getText();
        lblExpression = expression;
        if( lblExpression.equals("") ) {
            return true;
        } 
        return false;
    }
    
    private boolean evaluateTextArea() {
        String textExpression = txtAreaExpression.getText();
        String textOperators = txtAreaOperators.getText();
        if( textExpression.equals("") && textOperators.equals("") ) {
            return true;
        } 
        return false;
    }
    
    private void btnEvaluateExpressionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEvaluateExpressionActionPerformed
        
        if( evaluate() ) {
            JOptionPane.showMessageDialog(null, "No ingreso una expresión!");
        } else {
            expression = textFieldExpression.getText().toUpperCase();
            lblViewExpression.setText("La expresión a analizar es: " + expression);
            lblViewExpression.setVisible(true);
        }
    }//GEN-LAST:event_btnEvaluateExpressionActionPerformed
    
    private void btnAnalyzerExpressionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnalyzerExpressionActionPerformed
        
        if( evaluate() ) {
            JOptionPane.showMessageDialog(null, "No ingreso una expresión!");
        } else {
            if( evaluateTextArea() ) {
                txtAreaExpression.setText("");
                txtAreaOperators.setText("");
            }
            toList( lblExpression ).forEach( ( character ) -> {
                if( isIdentifier(character) ) {
                    txtAreaExpression.append(character + ": es un identificador\n");
                } else if(isOperator(character)){
                
                switch( toAscii( character ) ){
                    case 42 :
                        txtAreaOperators.append(character + ": es un operador de multiplicación\n");
                        break;
                    case 43 :
                        txtAreaOperators.append(character + ": es un operador de suma\n");
                        break;
                    case 45 :
                        txtAreaOperators.append(character + ": es un operador de resta\n");
                        break;
                    case 47 :
                        txtAreaOperators.append(character + ": es un operador de división\n");
                        break;
                    case 61 :
                        txtAreaOperators.append(character + ": es un operador de asignación\n");
                        break;
                }
            }
        });
        }
    }//GEN-LAST:event_btnAnalyzerExpressionActionPerformed

    private void btnEditExpressionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditExpressionActionPerformed
        if( evaluate() ) {
            JOptionPane.showMessageDialog(null, "No ingreso una expresión a corregir!");
        } else {
            newExpression = removeIncongruity(expression);
            expression = newExpression;
            lblViewExpression.setText("La expresión corregida es: " + newExpression ); 
            
            toList( newExpression ).forEach( ( character ) -> {
            if( isIdentifier(character) ) {
                txtAreaExpression.append(character + ": es un identificador\n");
            } else if(isOperator(character)){
                
                switch( toAscii( character ) ){
                    case 42 :
                        txtAreaOperators.append(character + ": es un operador de multiplicación\n");
                        break;
                    case 43 :
                        txtAreaOperators.append(character + ": es un operador de suma\n");
                        break;
                    case 45 :
                        txtAreaOperators.append(character + ": es un operador de resta\n");
                        break;
                    case 47 :
                        txtAreaOperators.append(character + ": es un operador de división\n");
                        break;
                    case 61 :
                        txtAreaOperators.append(character + ": es un operador de asignación\n");
                        break;
                }
            }
        });
        }
    }//GEN-LAST:event_btnEditExpressionActionPerformed

    private void btnInputNewExpressionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInputNewExpressionActionPerformed
        lblViewExpression.setVisible(false);
        labelExpression.setText("Puede ingresar una nueva expresión: ");
        textFieldExpression.setText("");
        txtAreaExpression.setText("");
        txtAreaOperators.setText("");
    }//GEN-LAST:event_btnInputNewExpressionActionPerformed
 
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAnalyzerExpression;
    private javax.swing.JButton btnEditExpression;
    private javax.swing.JButton btnEvaluateExpression;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnInputNewExpression;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel labelExpression;
    public javax.swing.JLabel lblViewExpression;
    private javax.swing.JTextField textFieldExpression;
    private javax.swing.JTextArea txtAreaExpression;
    private javax.swing.JTextArea txtAreaOperators;
    // End of variables declaration//GEN-END:variables
}

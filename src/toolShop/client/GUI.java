/**
 * @author Alyssa Lee, Joel Poirier, Owen Troke-Billard
 */

package toolShop.client;

import javax.swing.*;
import java.awt.*;

/**
 * Creates view portion of GUI.
 * Code within this component is generated and will not be individually commented.
 */
public class GUI extends javax.swing.JFrame
{
    Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();

    /**
     * Creates new form GUI
     */
    public GUI()
    {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents()
    {

        loginMenu = new javax.swing.JFrame();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        loginUsernameField = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        loginPasswordField = new javax.swing.JTextArea();
        cancelLoginButton = new javax.swing.JButton();
        acceptLoginButton = new javax.swing.JButton();
        invalidLoginPopup = new javax.swing.JDialog();
        jPanel5 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        invalidLoginAcknowledge = new javax.swing.JButton();
        ownerClientMenu = new javax.swing.JFrame();
        jPanel6 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane3 = new javax.swing.JScrollPane();
        ownerDisplay = new javax.swing.JTextArea();
        jLabel8 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        searchByName = new javax.swing.JButton();
        listToolsOwner = new javax.swing.JButton();
        searchByID = new javax.swing.JButton();
        decreaseQuantity = new javax.swing.JButton();
        printOrder = new javax.swing.JButton();
        logout = new javax.swing.JButton();
        addLogin = new javax.swing.JButton();
        addTool = new javax.swing.JButton();
        removeTool = new javax.swing.JButton();
        searchByNameDialog = new javax.swing.JDialog();
        jPanel8 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        nameTextArea = new javax.swing.JTextArea();
        searchNameAccept = new javax.swing.JButton();
        searchNameCancel = new javax.swing.JButton();
        searchByIDDialog = new javax.swing.JDialog();
        jPanel9 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        idTextArea = new javax.swing.JTextArea();
        searchIDAccept = new javax.swing.JButton();
        idNameCancel = new javax.swing.JButton();
        checkQuantityDialog = new javax.swing.JDialog();
        jPanel10 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        quantityTextArea = new javax.swing.JTextArea();
        checkQuantityAccept = new javax.swing.JButton();
        checkQuantityCancel = new javax.swing.JButton();
        decreaseQuantityDialog = new javax.swing.JDialog();
        jPanel11 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane7 = new javax.swing.JScrollPane();
        decreaseTextArea = new javax.swing.JTextArea();
        decreaseQuantityAccept = new javax.swing.JButton();
        decreaseQuantityCancel = new javax.swing.JButton();
        amountToDecreaseField = new java.awt.TextField();
        increaseAmount = new java.awt.Button();
        decreaseAmount = new java.awt.Button();
        addOwnerLoginMenu = new javax.swing.JFrame();
        jPanel13 = new javax.swing.JPanel();
        jPanel14 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jScrollPane9 = new javax.swing.JScrollPane();
        loginNewUsernameField = new javax.swing.JTextArea();
        jScrollPane10 = new javax.swing.JScrollPane();
        loginNewPasswordField = new javax.swing.JTextArea();
        cancelNewLoginButton = new javax.swing.JButton();
        addLoginButton = new javax.swing.JButton();
        customerClientMenu = new javax.swing.JFrame();
        jPanel15 = new javax.swing.JPanel();
        jPanel16 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jScrollPane11 = new javax.swing.JScrollPane();
        customerDisplay = new javax.swing.JTextArea();
        jLabel17 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        searchByName1 = new javax.swing.JButton();
        listToolsCustomer = new javax.swing.JButton();
        buyItem = new javax.swing.JButton();
        logout1 = new javax.swing.JButton();
        buyItemDialog = new javax.swing.JDialog();
        jPanel17 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jScrollPane12 = new javax.swing.JScrollPane();
        buyTextArea = new javax.swing.JTextArea();
        buyAmountAccept = new javax.swing.JButton();
        buyAmountCancel = new javax.swing.JButton();
        amountToBuyField = new java.awt.TextField();
        increaseBuy = new java.awt.Button();
        decreaseBuy = new java.awt.Button();
        addItemDialog = new javax.swing.JDialog();
        jPanel12 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jScrollPane8 = new javax.swing.JScrollPane();
        addToolNameArea = new javax.swing.JTextArea();
        addToolButton = new javax.swing.JButton();
        doneAddingTools = new javax.swing.JButton();
        jScrollPane13 = new javax.swing.JScrollPane();
        addToolIDArea = new javax.swing.JTextArea();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jScrollPane14 = new javax.swing.JScrollPane();
        addToolStockArea = new javax.swing.JTextArea();
        jScrollPane15 = new javax.swing.JScrollPane();
        addToolPriceArea = new javax.swing.JTextArea();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jScrollPane16 = new javax.swing.JScrollPane();
        addToolSupplierIDArea = new javax.swing.JTextArea();
        removeToolDialog = new javax.swing.JDialog();
        jPanel18 = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        jScrollPane17 = new javax.swing.JScrollPane();
        removeItemArea = new javax.swing.JTextArea();
        removeItemButton = new javax.swing.JButton();
        removeItemDone = new javax.swing.JButton();
        searchByNameDialog1 = new javax.swing.JDialog();
        jPanel19 = new javax.swing.JPanel();
        jLabel24 = new javax.swing.JLabel();
        jScrollPane18 = new javax.swing.JScrollPane();
        nameTextArea1 = new javax.swing.JTextArea();
        searchNameAccept1 = new javax.swing.JButton();
        searchNameCancel1 = new javax.swing.JButton();
        placeOrderDialog = new javax.swing.JDialog();
        jPanel20 = new javax.swing.JPanel();
        jLabel25 = new javax.swing.JLabel();
        placeOrderCancel = new java.awt.Button();
        placeOrderAccept = new java.awt.Button();
        successDialog = new javax.swing.JDialog();
        jPanel21 = new javax.swing.JPanel();
        jLabel26 = new javax.swing.JLabel();
        failDialog = new javax.swing.JDialog();
        jPanel22 = new javax.swing.JPanel();
        jLabel27 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        loginOwnerButton = new javax.swing.JButton();
        loginCustomerButton = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        loginQuitButton = new javax.swing.JButton();

        jPanel3.setBackground(new java.awt.Color(204, 204, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jPanel4.setBackground(new java.awt.Color(204, 204, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setText("OWNER LOGIN");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
                jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel4Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel2)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
                jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel4Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel2)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel3.setText("Username:");

        jLabel4.setText("Password:");

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        loginUsernameField.setColumns(20);
        loginUsernameField.setRows(5);
        jScrollPane1.setViewportView(loginUsernameField);

        jScrollPane2.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane2.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        loginPasswordField.setColumns(20);
        loginPasswordField.setRows(5);
        jScrollPane2.setViewportView(loginPasswordField);

        cancelLoginButton.setFont(new java.awt.Font("Trebuchet MS", 1, 16)); // NOI18N
        cancelLoginButton.setText("Cancel");
        cancelLoginButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        cancelLoginButton.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                cancelLoginButtonActionPerformed(evt);
            }
        });

        acceptLoginButton.setFont(new java.awt.Font("Trebuchet MS", 1, 16)); // NOI18N
        acceptLoginButton.setText("Accept");
        acceptLoginButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
/*        acceptLoginButton.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                acceptLoginButtonActionPerformed(evt);
            }
        });*/

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
                jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(jPanel3Layout.createSequentialGroup()
                                                .addComponent(jLabel4)
                                                .addGap(19, 19, 19)
                                                .addComponent(jScrollPane2))
                                        .addGroup(jPanel3Layout.createSequentialGroup()
                                                .addComponent(jLabel3)
                                                .addGap(18, 18, 18)
                                                .addComponent(jScrollPane1))
                                        .addGroup(jPanel3Layout.createSequentialGroup()
                                                .addComponent(cancelLoginButton, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(acceptLoginButton, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
                jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel3)
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel4)
                                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(cancelLoginButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(acceptLoginButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout loginMenuLayout = new javax.swing.GroupLayout(loginMenu.getContentPane());
        loginMenu.getContentPane().setLayout(loginMenuLayout);
        loginMenuLayout.setHorizontalGroup(
                loginMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        loginMenuLayout.setVerticalGroup(
                loginMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jPanel5.setBackground(new java.awt.Color(255, 204, 204));
        jPanel5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel5.setFont(new java.awt.Font("Tahoma", 3, 16)); // NOI18N
        jLabel5.setText("Invalid Login!");

        invalidLoginAcknowledge.setFont(new java.awt.Font("Trebuchet MS", 1, 16)); // NOI18N
        invalidLoginAcknowledge.setText("OK");
        invalidLoginAcknowledge.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        invalidLoginAcknowledge.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                invalidLoginAcknowledgeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
                jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel5Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 84, Short.MAX_VALUE)
                                .addComponent(invalidLoginAcknowledge, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
                jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel5Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel5)
                                        .addComponent(invalidLoginAcknowledge))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout invalidLoginPopupLayout = new javax.swing.GroupLayout(invalidLoginPopup.getContentPane());
        invalidLoginPopup.getContentPane().setLayout(invalidLoginPopupLayout);
        invalidLoginPopupLayout.setHorizontalGroup(
                invalidLoginPopupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        invalidLoginPopupLayout.setVerticalGroup(
                invalidLoginPopupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jPanel6.setBackground(new java.awt.Color(205, 228, 245));
        jPanel6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jPanel7.setBackground(new java.awt.Color(175, 197, 226));
        jPanel7.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel6.setFont(new java.awt.Font("Tahoma", 3, 48)); // NOI18N
        jLabel6.setText("Shop Owner Client Control Menu ");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
                jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel7Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 846, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
                jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel7Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel6)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        ownerDisplay.setEditable(false);
        ownerDisplay.setColumns(20);
        ownerDisplay.setRows(5);
        ownerDisplay.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.MatteBorder(null), "Display", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 2, 16))); // NOI18N
        jScrollPane3.setViewportView(ownerDisplay);

        jLabel8.setText("Select a Command:");

        jSeparator2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        searchByName.setFont(new java.awt.Font("Trebuchet MS", 1, 16)); // NOI18N
        searchByName.setText("Search By Name");
        searchByName.setToolTipText("Check inventory for item based on name");
        searchByName.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        searchByName.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                searchByNameActionPerformed(evt);
            }
        });

        listToolsOwner.setFont(new java.awt.Font("Trebuchet MS", 1, 16)); // NOI18N
        listToolsOwner.setText("List All Tools");
        listToolsOwner.setToolTipText("Display all tools currently in inventory");
        listToolsOwner.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        listToolsOwner.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listToolsOwnerActionPerformed(evt);
            }
        });

        searchByID.setFont(new java.awt.Font("Trebuchet MS", 1, 16)); // NOI18N
        searchByID.setText("Search By ID");
        searchByID.setToolTipText("Check inventory for specific item by ID");
        searchByID.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        searchByID.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                searchByIDActionPerformed(evt);
            }
        });

        decreaseQuantity.setFont(new java.awt.Font("Trebuchet MS", 1, 16)); // NOI18N
        decreaseQuantity.setText("Decrease Quantity");
        decreaseQuantity.setToolTipText("Decrease the quantity of an item based on name or ID");
        decreaseQuantity.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        decreaseQuantity.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                decreaseQuantityActionPerformed(evt);
            }
        });

        printOrder.setFont(new java.awt.Font("Trebuchet MS", 1, 16)); // NOI18N
        printOrder.setText("Print Today's Order");
        printOrder.setToolTipText("Decrease the quantity of an item based on name or ID");
        printOrder.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        printOrder.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                printOrderActionPerformed(evt);
            }
        });

        logout.setFont(new java.awt.Font("Trebuchet MS", 1, 16)); // NOI18N
        logout.setText("Logout");
        logout.setToolTipText("Decrease the quantity of an item based on name or ID");
        logout.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        logout.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                logoutActionPerformed(evt);
            }
        });

        addLogin.setFont(new java.awt.Font("Trebuchet MS", 1, 16)); // NOI18N
        addLogin.setText("Add New Owner Login");
        addLogin.setToolTipText("Create new login username and password for owner to access shop controls");
        addLogin.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        addLogin.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                addLoginActionPerformed(evt);
            }
        });

        addTool.setFont(new java.awt.Font("Trebuchet MS", 1, 16)); // NOI18N
        addTool.setText("Add Tool");
        addTool.setToolTipText("Check the quantity of an item based on name or ID");
        addTool.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        addTool.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                addToolActionPerformed(evt);
            }
        });

        removeTool.setFont(new java.awt.Font("Trebuchet MS", 1, 16)); // NOI18N
        removeTool.setText("Remove Tool");
        removeTool.setToolTipText("Check the quantity of an item based on name or ID");
        removeTool.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        removeTool.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                removeToolActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
                jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel6Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel6Layout.createSequentialGroup()
                                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel8)
                                                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                                .addComponent(searchByName, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 280, Short.MAX_VALUE)
                                                                .addComponent(listToolsOwner, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                .addComponent(searchByID, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                        .addComponent(decreaseQuantity, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(printOrder, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(addTool, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(removeTool, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addGroup(jPanel6Layout.createSequentialGroup()
                                                                .addComponent(addLogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                .addGap(15, 15, 15)
                                                                .addComponent(logout, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 510, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, 830, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
                jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel6Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel6Layout.createSequentialGroup()
                                                .addComponent(jLabel8)
                                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(jPanel6Layout.createSequentialGroup()
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(jSeparator1))
                                                        .addGroup(jPanel6Layout.createSequentialGroup()
                                                                .addGap(18, 18, 18)
                                                                .addComponent(listToolsOwner, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(20, 20, 20)
                                                                .addComponent(searchByName, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(searchByID, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addComponent(decreaseQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addComponent(printOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addComponent(addTool, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addComponent(removeTool, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(0, 8, Short.MAX_VALUE))))
                                        .addGroup(jPanel6Layout.createSequentialGroup()
                                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(jPanel6Layout.createSequentialGroup()
                                                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 368, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                        .addComponent(logout, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(addLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(0, 0, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout ownerClientMenuLayout = new javax.swing.GroupLayout(ownerClientMenu.getContentPane());
        ownerClientMenu.getContentPane().setLayout(ownerClientMenuLayout);
        ownerClientMenuLayout.setHorizontalGroup(
                ownerClientMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        ownerClientMenuLayout.setVerticalGroup(
                ownerClientMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jPanel8.setBackground(new java.awt.Color(249, 223, 180));
        jPanel8.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel7.setFont(new java.awt.Font("Tahoma", 2, 16)); // NOI18N
        jLabel7.setText("Please enter tool name:");
        jLabel7.setBorder(javax.swing.BorderFactory.createCompoundBorder());

        jScrollPane4.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane4.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        nameTextArea.setColumns(20);
        nameTextArea.setRows(5);
        jScrollPane4.setViewportView(nameTextArea);

        searchNameAccept.setFont(new java.awt.Font("Trebuchet MS", 1, 16)); // NOI18N
        searchNameAccept.setText("Search");
        searchNameAccept.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        searchNameAccept.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchNameAcceptActionPerformed(evt);
            }
        });

        searchNameCancel.setFont(new java.awt.Font("Trebuchet MS", 1, 16)); // NOI18N
        searchNameCancel.setText("Cancel");
        searchNameCancel.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        searchNameCancel.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                searchNameCancelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
                jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel8Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel8Layout.createSequentialGroup()
                                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 0, Short.MAX_VALUE))
                                        .addComponent(jScrollPane4)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                                                .addComponent(searchNameCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                                                .addComponent(searchNameAccept, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
                jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel8Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(searchNameAccept, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(searchNameCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout searchByNameDialogLayout = new javax.swing.GroupLayout(searchByNameDialog.getContentPane());
        searchByNameDialog.getContentPane().setLayout(searchByNameDialogLayout);
        searchByNameDialogLayout.setHorizontalGroup(
                searchByNameDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        searchByNameDialogLayout.setVerticalGroup(
                searchByNameDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel9.setBackground(new java.awt.Color(255, 255, 204));
        jPanel9.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel9.setFont(new java.awt.Font("Tahoma", 2, 16)); // NOI18N
        jLabel9.setText("Please enter tool ID:");
        jLabel9.setBorder(javax.swing.BorderFactory.createCompoundBorder());

        jScrollPane5.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane5.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        idTextArea.setColumns(20);
        idTextArea.setRows(5);
        jScrollPane5.setViewportView(idTextArea);

        searchIDAccept.setFont(new java.awt.Font("Trebuchet MS", 1, 16)); // NOI18N
        searchIDAccept.setText("Search");
        searchIDAccept.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        searchIDAccept.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchIDAcceptActionPerformed(evt);
            }
        });

        idNameCancel.setFont(new java.awt.Font("Trebuchet MS", 1, 16)); // NOI18N
        idNameCancel.setText("Cancel");
        idNameCancel.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        idNameCancel.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                idNameCancelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
                jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel9Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel9Layout.createSequentialGroup()
                                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 0, Short.MAX_VALUE))
                                        .addComponent(jScrollPane5)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                                                .addComponent(idNameCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                                                .addComponent(searchIDAccept, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap())
        );
        jPanel9Layout.setVerticalGroup(
                jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel9Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(searchIDAccept, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(idNameCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout searchByIDDialogLayout = new javax.swing.GroupLayout(searchByIDDialog.getContentPane());
        searchByIDDialog.getContentPane().setLayout(searchByIDDialogLayout);
        searchByIDDialogLayout.setHorizontalGroup(
                searchByIDDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        searchByIDDialogLayout.setVerticalGroup(
                searchByIDDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(searchByIDDialogLayout.createSequentialGroup()
                                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel10.setBackground(new java.awt.Color(255, 153, 204));
        jPanel10.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel10.setFont(new java.awt.Font("Tahoma", 2, 16)); // NOI18N
        jLabel10.setText("Please enter tool name or ID to check quantity:");
        jLabel10.setBorder(javax.swing.BorderFactory.createCompoundBorder());

        jScrollPane6.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane6.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        quantityTextArea.setColumns(20);
        quantityTextArea.setRows(5);
        jScrollPane6.setViewportView(quantityTextArea);

        checkQuantityAccept.setFont(new java.awt.Font("Trebuchet MS", 1, 16)); // NOI18N
        checkQuantityAccept.setText("Search");
        checkQuantityAccept.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        checkQuantityAccept.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkQuantityAcceptActionPerformed(evt);
            }
        });

        checkQuantityCancel.setFont(new java.awt.Font("Trebuchet MS", 1, 16)); // NOI18N
        checkQuantityCancel.setText("Cancel");
        checkQuantityCancel.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        checkQuantityCancel.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                checkQuantityCancelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
                jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel10Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jScrollPane6)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                                                .addComponent(checkQuantityCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                                                .addComponent(checkQuantityAccept, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addContainerGap())
        );
        jPanel10Layout.setVerticalGroup(
                jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel10Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(checkQuantityAccept, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(checkQuantityCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout checkQuantityDialogLayout = new javax.swing.GroupLayout(checkQuantityDialog.getContentPane());
        checkQuantityDialog.getContentPane().setLayout(checkQuantityDialogLayout);
        checkQuantityDialogLayout.setHorizontalGroup(
                checkQuantityDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        checkQuantityDialogLayout.setVerticalGroup(
                checkQuantityDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jPanel11.setBackground(new java.awt.Color(0, 255, 204));
        jPanel11.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel11.setFont(new java.awt.Font("Tahoma", 2, 16)); // NOI18N
        jLabel11.setText("Please enter tool name or ID of item to decrease:");
        jLabel11.setBorder(javax.swing.BorderFactory.createCompoundBorder());

        jScrollPane7.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane7.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        decreaseTextArea.setColumns(20);
        decreaseTextArea.setRows(5);
        jScrollPane7.setViewportView(decreaseTextArea);

        decreaseQuantityAccept.setFont(new java.awt.Font("Trebuchet MS", 1, 16)); // NOI18N
        decreaseQuantityAccept.setText("Decrease by Amount");
        decreaseQuantityAccept.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        decreaseQuantityAccept.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                decreaseQuantityAcceptActionPerformed(evt);
            }
        });

        decreaseQuantityCancel.setFont(new java.awt.Font("Trebuchet MS", 1, 16)); // NOI18N
        decreaseQuantityCancel.setText("Done");
        decreaseQuantityCancel.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        decreaseQuantityCancel.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                decreaseQuantityCancelActionPerformed(evt);
            }
        });

        amountToDecreaseField.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        amountToDecreaseField.setEditable(false);
        amountToDecreaseField.setText("1");
        amountToDecreaseField.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                amountToDecreaseFieldActionPerformed(evt);
            }
        });

        increaseAmount.setLabel("+");
        increaseAmount.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                increaseAmountActionPerformed(evt);
            }
        });

        decreaseAmount.setLabel("-");
        decreaseAmount.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                decreaseAmountActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
                jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel11Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jScrollPane7)
                                        .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, 366, Short.MAX_VALUE)
                                        .addGroup(jPanel11Layout.createSequentialGroup()
                                                .addComponent(amountToDecreaseField, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(increaseAmount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(decreaseAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(19, 19, 19)
                                                .addComponent(decreaseQuantityAccept, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(decreaseQuantityCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap())
        );
        jPanel11Layout.setVerticalGroup(
                jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel11Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(jPanel11Layout.createSequentialGroup()
                                                .addComponent(increaseAmount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(decreaseAmount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(amountToDecreaseField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(decreaseQuantityAccept, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(decreaseQuantityCancel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout decreaseQuantityDialogLayout = new javax.swing.GroupLayout(decreaseQuantityDialog.getContentPane());
        decreaseQuantityDialog.getContentPane().setLayout(decreaseQuantityDialogLayout);
        decreaseQuantityDialogLayout.setHorizontalGroup(
                decreaseQuantityDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        decreaseQuantityDialogLayout.setVerticalGroup(
                decreaseQuantityDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(decreaseQuantityDialogLayout.createSequentialGroup()
                                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel13.setBackground(new java.awt.Color(177, 85, 199));
        jPanel13.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jPanel14.setBackground(new java.awt.Color(199, 97, 199));
        jPanel14.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel13.setText("ADD NEW OWNER LOGIN");

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
                jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel14Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel13)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel14Layout.setVerticalGroup(
                jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel14Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel13)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel14.setText("Username:");

        jLabel15.setText("Password:");

        jScrollPane9.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane9.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        loginNewUsernameField.setColumns(20);
        loginNewUsernameField.setRows(5);
        jScrollPane9.setViewportView(loginNewUsernameField);

        jScrollPane10.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane10.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        loginNewPasswordField.setColumns(20);
        loginNewPasswordField.setRows(5);
        jScrollPane10.setViewportView(loginNewPasswordField);

        cancelNewLoginButton.setFont(new java.awt.Font("Trebuchet MS", 1, 16)); // NOI18N
        cancelNewLoginButton.setText("Cancel");
        cancelNewLoginButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        cancelNewLoginButton.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                cancelNewLoginButtonActionPerformed(evt);
            }
        });

        addLoginButton.setFont(new java.awt.Font("Trebuchet MS", 1, 16)); // NOI18N
        addLoginButton.setText("Add");
        addLoginButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
/*        addLoginButton.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                addLoginButtonActionPerformed(evt);
            }
        });*/

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
                jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel13Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jPanel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(jPanel13Layout.createSequentialGroup()
                                                .addComponent(jLabel15)
                                                .addGap(19, 19, 19)
                                                .addComponent(jScrollPane10))
                                        .addGroup(jPanel13Layout.createSequentialGroup()
                                                .addComponent(jLabel14)
                                                .addGap(18, 18, 18)
                                                .addComponent(jScrollPane9))
                                        .addGroup(jPanel13Layout.createSequentialGroup()
                                                .addComponent(cancelNewLoginButton, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(addLoginButton, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap())
        );
        jPanel13Layout.setVerticalGroup(
                jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel13Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel14)
                                        .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel15)
                                        .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(cancelNewLoginButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(addLoginButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout addOwnerLoginMenuLayout = new javax.swing.GroupLayout(addOwnerLoginMenu.getContentPane());
        addOwnerLoginMenu.getContentPane().setLayout(addOwnerLoginMenuLayout);
        addOwnerLoginMenuLayout.setHorizontalGroup(
                addOwnerLoginMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        addOwnerLoginMenuLayout.setVerticalGroup(
                addOwnerLoginMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jPanel15.setBackground(new java.awt.Color(204, 255, 204));
        jPanel15.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jPanel16.setBackground(new java.awt.Color(102, 204, 0));
        jPanel16.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel16.setFont(new java.awt.Font("Tahoma", 3, 48)); // NOI18N
        jLabel16.setText("Customer Client Control Menu ");

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
                jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel16Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 846, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel16Layout.setVerticalGroup(
                jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel16Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel16)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jSeparator3.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        customerDisplay.setEditable(false);
        customerDisplay.setColumns(20);
        customerDisplay.setRows(5);
        customerDisplay.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.MatteBorder(null), "Display", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 2, 16))); // NOI18N
        jScrollPane11.setViewportView(customerDisplay);

        jLabel17.setText("Select a Command:");

        jSeparator4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        searchByName1.setFont(new java.awt.Font("Trebuchet MS", 1, 16)); // NOI18N
        searchByName1.setText("Search By Name");
        searchByName1.setToolTipText("Check inventory for item based on name");
        searchByName1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        searchByName1.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                searchByName1ActionPerformed(evt);
            }
        });

        listToolsCustomer.setFont(new java.awt.Font("Trebuchet MS", 1, 16)); // NOI18N
        listToolsCustomer.setText("List All Tools");
        listToolsCustomer.setToolTipText("Display all tools currently in inventory");
        listToolsCustomer.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        listToolsCustomer.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                listToolsCustomerActionPerformed(evt);
            }
        });

        buyItem.setFont(new java.awt.Font("Trebuchet MS", 1, 16)); // NOI18N
        buyItem.setText("Buy Item");
        buyItem.setToolTipText("Decrease the quantity of an item based on name or ID");
        buyItem.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        buyItem.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                buyItemActionPerformed(evt);
            }
        });

        logout1.setFont(new java.awt.Font("Trebuchet MS", 1, 16)); // NOI18N
        logout1.setText("Logout");
        logout1.setToolTipText("Decrease the quantity of an item based on name or ID");
        logout1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        logout1.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                logout1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
                jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel15Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel15Layout.createSequentialGroup()
                                                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel17)
                                                        .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                                .addComponent(searchByName1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 280, Short.MAX_VALUE)
                                                                .addComponent(listToolsCustomer, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                        .addComponent(buyItem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(logout1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, 510, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, 830, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel15Layout.setVerticalGroup(
                jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel15Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel15Layout.createSequentialGroup()
                                                .addComponent(jLabel17)
                                                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(jPanel15Layout.createSequentialGroup()
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(jSeparator3))
                                                        .addGroup(jPanel15Layout.createSequentialGroup()
                                                                .addGap(18, 18, 18)
                                                                .addComponent(listToolsCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(20, 20, 20)
                                                                .addComponent(searchByName1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(buyItem, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addComponent(logout1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(0, 9, Short.MAX_VALUE))))
                                        .addGroup(jPanel15Layout.createSequentialGroup()
                                                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(jScrollPane11, javax.swing.GroupLayout.DEFAULT_SIZE, 253, Short.MAX_VALUE)
                                                        .addComponent(jSeparator4))
                                                .addGap(0, 0, Short.MAX_VALUE)))
                                .addGap(0, 8, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout customerClientMenuLayout = new javax.swing.GroupLayout(customerClientMenu.getContentPane());
        customerClientMenu.getContentPane().setLayout(customerClientMenuLayout);
        customerClientMenuLayout.setHorizontalGroup(
                customerClientMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        customerClientMenuLayout.setVerticalGroup(
                customerClientMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel17.setBackground(new java.awt.Color(139, 190, 55));
        jPanel17.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel18.setFont(new java.awt.Font("Tahoma", 2, 16)); // NOI18N
        jLabel18.setText("Please enter name of item to buy:");
        jLabel18.setBorder(javax.swing.BorderFactory.createCompoundBorder());

        jScrollPane12.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane12.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        buyTextArea.setColumns(20);
        buyTextArea.setRows(5);
        jScrollPane12.setViewportView(buyTextArea);

        buyAmountAccept.setFont(new java.awt.Font("Trebuchet MS", 1, 16)); // NOI18N
        buyAmountAccept.setText("Buy Amount");
        buyAmountAccept.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        buyAmountAccept.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                buyAmountAcceptActionPerformed(evt);
            }
        });

        buyAmountCancel.setFont(new java.awt.Font("Trebuchet MS", 1, 16)); // NOI18N
        buyAmountCancel.setText("Done");
        buyAmountCancel.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        buyAmountCancel.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                buyAmountCancelActionPerformed(evt);
            }
        });

        amountToBuyField.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        amountToBuyField.setEditable(false);
        amountToBuyField.setText("1");
        amountToBuyField.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                amountToBuyFieldActionPerformed(evt);
            }
        });

        increaseBuy.setLabel("+");
        increaseBuy.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                increaseBuyActionPerformed(evt);
            }
        });

        decreaseBuy.setLabel("-");
        decreaseBuy.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                decreaseBuyActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
                jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel17Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jScrollPane12)
                                        .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, 366, Short.MAX_VALUE)
                                        .addGroup(jPanel17Layout.createSequentialGroup()
                                                .addComponent(amountToBuyField, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(increaseBuy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(decreaseBuy, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(19, 19, 19)
                                                .addComponent(buyAmountAccept, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(buyAmountCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap())
        );
        jPanel17Layout.setVerticalGroup(
                jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel17Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel18)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane12, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(jPanel17Layout.createSequentialGroup()
                                                .addComponent(increaseBuy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(decreaseBuy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(amountToBuyField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(buyAmountAccept, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(buyAmountCancel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout buyItemDialogLayout = new javax.swing.GroupLayout(buyItemDialog.getContentPane());
        buyItemDialog.getContentPane().setLayout(buyItemDialogLayout);
        buyItemDialogLayout.setHorizontalGroup(
                buyItemDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        buyItemDialogLayout.setVerticalGroup(
                buyItemDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jPanel12.setBackground(new java.awt.Color(238, 90, 90));
        jPanel12.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel12.setFont(new java.awt.Font("Tahoma", 2, 16)); // NOI18N
        jLabel12.setText("Tool Name: ");
        jLabel12.setBorder(javax.swing.BorderFactory.createCompoundBorder());

        jScrollPane8.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane8.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        addToolNameArea.setColumns(20);
        addToolNameArea.setRows(5);
        jScrollPane8.setViewportView(addToolNameArea);

        addToolButton.setFont(new java.awt.Font("Trebuchet MS", 1, 16)); // NOI18N
        addToolButton.setText("Add");
        addToolButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        addToolButton.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                addToolButtonActionPerformed(evt);
            }
        });

        doneAddingTools.setFont(new java.awt.Font("Trebuchet MS", 1, 16)); // NOI18N
        doneAddingTools.setText("Done");
        doneAddingTools.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        doneAddingTools.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                doneAddingToolsActionPerformed(evt);
            }
        });

        jScrollPane13.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane13.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        addToolIDArea.setColumns(20);
        addToolIDArea.setRows(5);
        jScrollPane13.setViewportView(addToolIDArea);

        jLabel19.setFont(new java.awt.Font("Tahoma", 2, 16)); // NOI18N
        jLabel19.setText("Tool ID: ");
        jLabel19.setBorder(javax.swing.BorderFactory.createCompoundBorder());

        jLabel20.setFont(new java.awt.Font("Tahoma", 2, 16)); // NOI18N
        jLabel20.setText("Stock:");
        jLabel20.setBorder(javax.swing.BorderFactory.createCompoundBorder());

        jScrollPane14.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane14.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        addToolStockArea.setColumns(20);
        addToolStockArea.setRows(5);
        jScrollPane14.setViewportView(addToolStockArea);

        jScrollPane15.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane15.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        addToolPriceArea.setColumns(20);
        addToolPriceArea.setRows(5);
        jScrollPane15.setViewportView(addToolPriceArea);

        jLabel21.setFont(new java.awt.Font("Tahoma", 2, 16)); // NOI18N
        jLabel21.setText("Price: ");
        jLabel21.setBorder(javax.swing.BorderFactory.createCompoundBorder());

        jLabel22.setText("SupplierID:");

        jScrollPane16.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane16.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        addToolSupplierIDArea.setColumns(20);
        addToolSupplierIDArea.setRows(5);
        jScrollPane16.setViewportView(addToolSupplierIDArea);

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
                jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel12Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel12Layout.createSequentialGroup()
                                                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(doneAddingTools, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(jLabel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(jLabel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(jLabel21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                                        .addGroup(jPanel12Layout.createSequentialGroup()
                                                .addComponent(jLabel22)
                                                .addGap(17, 17, 17)))
                                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jScrollPane16)
                                        .addComponent(jScrollPane15)
                                        .addComponent(jScrollPane14)
                                        .addComponent(jScrollPane13)
                                        .addComponent(addToolButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                                                .addGap(0, 0, Short.MAX_VALUE)
                                                .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap())
        );
        jPanel12Layout.setVerticalGroup(
                jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel12Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel12)
                                        .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jScrollPane13, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel19))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jScrollPane14, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel20))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jScrollPane15, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel21))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jScrollPane16, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel22))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(addToolButton, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
                                        .addComponent(doneAddingTools, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addContainerGap())
        );

        javax.swing.GroupLayout addItemDialogLayout = new javax.swing.GroupLayout(addItemDialog.getContentPane());
        addItemDialog.getContentPane().setLayout(addItemDialogLayout);
        addItemDialogLayout.setHorizontalGroup(
                addItemDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        addItemDialogLayout.setVerticalGroup(
                addItemDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jPanel18.setBackground(java.awt.SystemColor.inactiveCaption);
        jPanel18.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel23.setFont(new java.awt.Font("Tahoma", 2, 16)); // NOI18N
        jLabel23.setText("Please enter tool ID to remove:");
        jLabel23.setBorder(javax.swing.BorderFactory.createCompoundBorder());

        jScrollPane17.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane17.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        removeItemArea.setColumns(20);
        removeItemArea.setRows(5);
        jScrollPane17.setViewportView(removeItemArea);

        removeItemButton.setFont(new java.awt.Font("Trebuchet MS", 1, 16)); // NOI18N
        removeItemButton.setText("Remove");
        removeItemButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        removeItemButton.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                removeItemButtonActionPerformed(evt);
            }
        });

        removeItemDone.setFont(new java.awt.Font("Trebuchet MS", 1, 16)); // NOI18N
        removeItemDone.setText("Done");
        removeItemDone.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        removeItemDone.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                removeItemDoneActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
                jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel18Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jScrollPane17)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel18Layout.createSequentialGroup()
                                                .addComponent(removeItemDone, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(removeItemButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addComponent(jLabel23, javax.swing.GroupLayout.DEFAULT_SIZE, 366, Short.MAX_VALUE))
                                .addContainerGap())
        );
        jPanel18Layout.setVerticalGroup(
                jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel18Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel23)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane17, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(removeItemButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(removeItemDone, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout removeToolDialogLayout = new javax.swing.GroupLayout(removeToolDialog.getContentPane());
        removeToolDialog.getContentPane().setLayout(removeToolDialogLayout);
        removeToolDialogLayout.setHorizontalGroup(
                removeToolDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        removeToolDialogLayout.setVerticalGroup(
                removeToolDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jPanel19.setBackground(new java.awt.Color(255, 204, 204));
        jPanel19.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel24.setFont(new java.awt.Font("Tahoma", 2, 16)); // NOI18N
        jLabel24.setText("Please enter tool name:");
        jLabel24.setBorder(javax.swing.BorderFactory.createCompoundBorder());

        jScrollPane18.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane18.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        nameTextArea1.setColumns(20);
        nameTextArea1.setRows(5);
        jScrollPane18.setViewportView(nameTextArea1);

        searchNameAccept1.setFont(new java.awt.Font("Trebuchet MS", 1, 16)); // NOI18N
        searchNameAccept1.setText("Search");
        searchNameAccept1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        searchNameAccept1.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                searchNameAccept1ActionPerformed(evt);
            }
        });

        searchNameCancel1.setFont(new java.awt.Font("Trebuchet MS", 1, 16)); // NOI18N
        searchNameCancel1.setText("Cancel");
        searchNameCancel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        searchNameCancel1.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                searchNameCancel1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel19Layout = new javax.swing.GroupLayout(jPanel19);
        jPanel19.setLayout(jPanel19Layout);
        jPanel19Layout.setHorizontalGroup(
                jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel19Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel19Layout.createSequentialGroup()
                                                .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 0, Short.MAX_VALUE))
                                        .addComponent(jScrollPane18)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel19Layout.createSequentialGroup()
                                                .addComponent(searchNameCancel1, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                                                .addComponent(searchNameAccept1, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap())
        );
        jPanel19Layout.setVerticalGroup(
                jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel19Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel24)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane18, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(searchNameAccept1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(searchNameCancel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout searchByNameDialog1Layout = new javax.swing.GroupLayout(searchByNameDialog1.getContentPane());
        searchByNameDialog1.getContentPane().setLayout(searchByNameDialog1Layout);
        searchByNameDialog1Layout.setHorizontalGroup(
                searchByNameDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        searchByNameDialog1Layout.setVerticalGroup(
                searchByNameDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jPanel20.setBackground(javax.swing.UIManager.getDefaults().getColor("ComboBox.selectionBackground"));
        jPanel20.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel25.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel25.setText("Place daily order?");

        placeOrderCancel.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        placeOrderCancel.setLabel("Don't Place");
        placeOrderCancel.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                placeOrderCancelActionPerformed(evt);
            }
        });

        placeOrderAccept.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        placeOrderAccept.setLabel("Place");
        placeOrderAccept.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                placeOrderAcceptActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel20Layout = new javax.swing.GroupLayout(jPanel20);
        jPanel20.setLayout(jPanel20Layout);
        jPanel20Layout.setHorizontalGroup(
                jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel20Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel20Layout.createSequentialGroup()
                                                .addComponent(placeOrderCancel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(placeOrderAccept, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(jLabel25))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel20Layout.setVerticalGroup(
                jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel20Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel25)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(placeOrderCancel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(placeOrderAccept, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout placeOrderDialogLayout = new javax.swing.GroupLayout(placeOrderDialog.getContentPane());
        placeOrderDialog.getContentPane().setLayout(placeOrderDialogLayout);
        placeOrderDialogLayout.setHorizontalGroup(
                placeOrderDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(placeOrderDialogLayout.createSequentialGroup()
                                .addComponent(jPanel20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
        );
        placeOrderDialogLayout.setVerticalGroup(
                placeOrderDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(placeOrderDialogLayout.createSequentialGroup()
                                .addComponent(jPanel20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel21.setBackground(new java.awt.Color(204, 255, 204));
        jPanel21.setBorder(new javax.swing.border.MatteBorder(null));

        jLabel26.setFont(new java.awt.Font("Trebuchet MS", 2, 24)); // NOI18N
        jLabel26.setText("Operation Successful!");

        javax.swing.GroupLayout jPanel21Layout = new javax.swing.GroupLayout(jPanel21);
        jPanel21.setLayout(jPanel21Layout);
        jPanel21Layout.setHorizontalGroup(
                jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel21Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel26)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel21Layout.setVerticalGroup(
                jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel21Layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel26)
                                .addContainerGap())
        );

        javax.swing.GroupLayout successDialogLayout = new javax.swing.GroupLayout(successDialog.getContentPane());
        successDialog.getContentPane().setLayout(successDialogLayout);
        successDialogLayout.setHorizontalGroup(
                successDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        successDialogLayout.setVerticalGroup(
                successDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jPanel22.setBackground(new java.awt.Color(255, 153, 153));
        jPanel22.setBorder(new javax.swing.border.MatteBorder(null));

        jLabel27.setFont(new java.awt.Font("Trebuchet MS", 2, 24)); // NOI18N
        jLabel27.setText("Operation Failed.");

        javax.swing.GroupLayout jPanel22Layout = new javax.swing.GroupLayout(jPanel22);
        jPanel22.setLayout(jPanel22Layout);
        jPanel22Layout.setHorizontalGroup(
                jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel22Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel27)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel22Layout.setVerticalGroup(
                jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel22Layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel27)
                                .addContainerGap())
        );

        javax.swing.GroupLayout failDialogLayout = new javax.swing.GroupLayout(failDialog.getContentPane());
        failDialog.getContentPane().setLayout(failDialogLayout);
        failDialogLayout.setHorizontalGroup(
                failDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        failDialogLayout.setVerticalGroup(
                failDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 153, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        loginOwnerButton.setFont(new java.awt.Font("Trebuchet MS", 1, 16)); // NOI18N
        loginOwnerButton.setText("Login as Owner");
        loginOwnerButton.setToolTipText("For Shop Owner use");
        loginOwnerButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        loginOwnerButton.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                loginOwnerButtonActionPerformed(evt);
            }
        });

        loginCustomerButton.setFont(new java.awt.Font("Trebuchet MS", 1, 16)); // NOI18N
        loginCustomerButton.setText("Login as Customer");
        loginCustomerButton.setToolTipText("For Shop Owner use");
        loginCustomerButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        loginCustomerButton.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                loginCustomerButtonActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(204, 204, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("ToolShop Application - User Login");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 422, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel1)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        loginQuitButton.setFont(new java.awt.Font("Trebuchet MS", 1, 16)); // NOI18N
        loginQuitButton.setText("Quit");
        loginQuitButton.setToolTipText("For Shop Owner use");
        loginQuitButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        loginQuitButton.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                loginQuitButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(loginOwnerButton, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(loginCustomerButton, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(loginQuitButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(loginOwnerButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(loginCustomerButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(loginQuitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>

    private void loginOwnerButtonActionPerformed(java.awt.event.ActionEvent evt)
    {
        successDialog.setBounds(((int) screenSize.getWidth() - 403) / 2, ((int) screenSize.getHeight() - 250) / 2, 280, 100);
        failDialog.setBounds(((int) screenSize.getWidth() - 403) / 2, ((int) screenSize.getHeight() - 250) / 2, 230, 100);
        loginMenu.setBounds(((int) screenSize.getWidth() - 403) / 2, ((int) screenSize.getHeight() - 250) / 2, 408, 260);
        loginMenu.setVisible(true);
    }

    private void loginCustomerButtonActionPerformed(java.awt.event.ActionEvent evt)
    {
        successDialog.setBounds(((int) screenSize.getWidth() - 403) / 2, ((int) screenSize.getHeight() - 250) / 2, 280, 100);
        failDialog.setBounds(((int) screenSize.getWidth() - 403) / 2, ((int) screenSize.getHeight() - 250) / 2, 230, 100);
        customerClientMenu.setBounds(((int) screenSize.getWidth() - 870) / 2, ((int) screenSize.getHeight() - 415) / 2, 870, 425);
        customerClientMenu.setVisible(true);
    }

    private void loginQuitButtonActionPerformed(java.awt.event.ActionEvent evt)
    {
        System.exit(1);
    }

    private void cancelLoginButtonActionPerformed(java.awt.event.ActionEvent evt)
    {
        loginUsernameField.setText("");
        loginPasswordField.setText("");
        loginMenu.setVisible(false);
    }

    private void invalidLoginAcknowledgeActionPerformed(java.awt.event.ActionEvent evt)
    {
        invalidLoginPopup.setVisible(false);
        loginMenu.setVisible(true);
    }

    private void searchByNameActionPerformed(java.awt.event.ActionEvent evt)
    {
        searchByNameDialog.setBounds(((int) screenSize.getWidth() - 404) / 2, ((int) screenSize.getHeight() - 160) / 2, 404, 180);
        searchByNameDialog.setVisible(true);
    }

    private void listToolsOwnerActionPerformed(java.awt.event.ActionEvent evt)
    {

    }

    private void searchByIDActionPerformed(java.awt.event.ActionEvent evt)
    {
        searchByIDDialog.setBounds(((int) screenSize.getWidth() - 404) / 2, ((int) screenSize.getHeight() - 160) / 2, 404, 180);
        searchByIDDialog.setVisible(true);
    }

    private void decreaseQuantityActionPerformed(java.awt.event.ActionEvent evt)
    {
        decreaseQuantityDialog.setBounds(((int) screenSize.getWidth() - 404) / 2, ((int) screenSize.getHeight() - 160) / 2, 404, 205);
        decreaseQuantityDialog.setVisible(true);
    }

    private void printOrderActionPerformed(java.awt.event.ActionEvent evt)
    {
        placeOrderDialog.setBounds(((int) screenSize.getWidth() - 200) / 2, ((int) screenSize.getHeight() - 150) / 2, 230, 130);
        placeOrderDialog.setVisible(true);
    }

    private void logoutActionPerformed(java.awt.event.ActionEvent evt)
    {
        System.exit(1);
    }

    private void searchNameAcceptActionPerformed(java.awt.event.ActionEvent evt)
    {

    }

    private void searchNameCancelActionPerformed(java.awt.event.ActionEvent evt)
    {
        nameTextArea.setText("");
        searchByNameDialog.setVisible(false);
    }

    private void searchIDAcceptActionPerformed(java.awt.event.ActionEvent evt)
    {

    }

    private void idNameCancelActionPerformed(java.awt.event.ActionEvent evt)
    {
        idTextArea.setText("");
        searchByIDDialog.setVisible(false);
    }

    private void checkQuantityAcceptActionPerformed(java.awt.event.ActionEvent evt)
    {

    }

    private void checkQuantityCancelActionPerformed(java.awt.event.ActionEvent evt)
    {
        quantityTextArea.setText("");
        checkQuantityDialog.setVisible(false);
    }

    private void decreaseQuantityAcceptActionPerformed(java.awt.event.ActionEvent evt)
    {
        String input = decreaseTextArea.getText();
        //decreaseTextArea.setText("");
        decreaseQuantityDialog.setVisible(false);
    }

    private void decreaseQuantityCancelActionPerformed(java.awt.event.ActionEvent evt)
    {
        decreaseTextArea.setText("");
        decreaseQuantityDialog.setVisible(false);
    }

    private void amountToDecreaseFieldActionPerformed(java.awt.event.ActionEvent evt)
    {
        int amountToDecrease = Integer.parseInt(amountToDecreaseField.getText());
        //Decrease stock by this amount
        decreaseQuantityDialog.setVisible(false);
    }

    private void increaseAmountActionPerformed(java.awt.event.ActionEvent evt)
    {
        int amount = Integer.parseInt(amountToDecreaseField.getText());
        amount++;
        amountToDecreaseField.setText(Integer.toString(amount));
    }

    private void decreaseAmountActionPerformed(java.awt.event.ActionEvent evt)
    {
        int amount = Integer.parseInt(amountToDecreaseField.getText());
        if (amount > 0)
            amount--;
        amountToDecreaseField.setText(Integer.toString(amount));
    }

    private void cancelNewLoginButtonActionPerformed(java.awt.event.ActionEvent evt)
    {
        loginNewUsernameField.setText("");
        loginNewPasswordField.setText("");
        addOwnerLoginMenu.setVisible(false);
    }

    private void searchByName1ActionPerformed(java.awt.event.ActionEvent evt)
    {
        searchByNameDialog1.setBounds(((int) screenSize.getWidth() - 404) / 2, ((int) screenSize.getHeight() - 160) / 2, 404, 180);
        searchByNameDialog1.setVisible(true);
    }

    private void listToolsCustomerActionPerformed(java.awt.event.ActionEvent evt)
    {

    }

    private void buyItemActionPerformed(java.awt.event.ActionEvent evt)
    {
        buyItemDialog.setBounds(((int) screenSize.getWidth() - 404) / 2, ((int) screenSize.getHeight() - 160) / 2, 404, 205);
        buyItemDialog.setVisible(true);
    }

    private void logout1ActionPerformed(java.awt.event.ActionEvent evt)
    {
        System.exit(1);
    }

    private void buyAmountAcceptActionPerformed(java.awt.event.ActionEvent evt)
    {
        int amountToBuy = Integer.parseInt(amountToBuyField.getText());
        String itemName = buyTextArea.getText();
        //Decrease stock by this amount
        buyItemDialog.setVisible(false);
    }

    private void buyAmountCancelActionPerformed(java.awt.event.ActionEvent evt)
    {
        buyTextArea.setText("");
        buyItemDialog.setVisible(false);
    }

    private void amountToBuyFieldActionPerformed(java.awt.event.ActionEvent evt)
    {
        //Delete this
    }

    private void increaseBuyActionPerformed(java.awt.event.ActionEvent evt)
    {
        int amount = Integer.parseInt(amountToBuyField.getText());
        amount++;
        amountToBuyField.setText(Integer.toString(amount));
    }

    private void decreaseBuyActionPerformed(java.awt.event.ActionEvent evt)
    {
        int amount = Integer.parseInt(amountToBuyField.getText());
        if (amount > 0)
            amount--;
        amountToBuyField.setText(Integer.toString(amount));
    }

    private void addToolActionPerformed(java.awt.event.ActionEvent evt)
    {
        addItemDialog.setBounds(((int) screenSize.getWidth() - 400) / 2, ((int) screenSize.getHeight() - 300) / 2, 405, 310);
        addItemDialog.setVisible(true);
    }

    private void removeToolActionPerformed(java.awt.event.ActionEvent evt)
    {
        removeToolDialog.setBounds(((int) screenSize.getWidth() - 400) / 2, ((int) screenSize.getHeight() - 300) / 2, 400, 180);
        removeToolDialog.setVisible(true);
    }

    private void addToolButtonActionPerformed(java.awt.event.ActionEvent evt)
    {

    }

    private void doneAddingToolsActionPerformed(java.awt.event.ActionEvent evt)
    {
        addToolNameArea.setText("");
        addToolIDArea.setText("");
        addToolStockArea.setText("");
        addToolPriceArea.setText("");
        addToolSupplierIDArea.setText("");
        addItemDialog.setVisible(false);
    }

    private void removeItemButtonActionPerformed(java.awt.event.ActionEvent evt)
    {

    }

    private void removeItemDoneActionPerformed(java.awt.event.ActionEvent evt)
    {
        removeItemArea.setText("");
        removeToolDialog.setVisible(false);
    }

    private void addLoginActionPerformed(java.awt.event.ActionEvent evt)
    {
        addOwnerLoginMenu.setBounds(((int) screenSize.getWidth() - 404) / 2, ((int) screenSize.getHeight() - 260) / 2, 404, 255);
        addOwnerLoginMenu.setVisible(true);
    }

    private void searchNameAccept1ActionPerformed(java.awt.event.ActionEvent evt)
    {
        // TODO add your handling code here:
    }

    private void searchNameCancel1ActionPerformed(java.awt.event.ActionEvent evt)
    {
        // TODO add your handling code here:
    }

    private void placeOrderAcceptActionPerformed(java.awt.event.ActionEvent evt)
    {
        //Places order
        placeOrderDialog.setVisible(false);
    }

    private void placeOrderCancelActionPerformed(java.awt.event.ActionEvent evt)
    {
        placeOrderDialog.setVisible(false);
    }

    public Dimension getScreenSize()
    {
        return screenSize;
    }

    public JButton getAcceptLoginButton()
    {
        return acceptLoginButton;
    }

    public JButton getAddLoginButton()
    {
        return addLoginButton;
    }

    public JFrame getAddOwnerLoginMenu()
    {
        return addOwnerLoginMenu;
    }

    public JButton getAddToolButton()
    {
        return addToolButton;
    }

    public JTextArea getAddToolIDArea()
    {
        return addToolIDArea;
    }

    public JTextArea getAddToolNameArea()
    {
        return addToolNameArea;
    }

    public JTextArea getAddToolPriceArea()
    {
        return addToolPriceArea;
    }

    public JTextArea getAddToolStockArea()
    {
        return addToolStockArea;
    }

    public JTextArea getAddToolSupplierIDArea()
    {
        return addToolSupplierIDArea;
    }

    public TextField getAmountToBuyField()
    {
        return amountToBuyField;
    }

    public TextField getAmountToDecreaseField()
    {
        return amountToDecreaseField;
    }

    public JButton getBuyAmountAccept()
    {
        return buyAmountAccept;
    }

    public JDialog getBuyItemDialog()
    {
        return buyItemDialog;
    }

    public JTextArea getBuyTextArea()
    {
        return buyTextArea;
    }

    public JTextArea getCustomerDisplay()
    {
        return customerDisplay;
    }

    public JButton getDecreaseQuantityAccept()
    {
        return decreaseQuantityAccept;
    }

    public JDialog getDecreaseQuantityDialog()
    {
        return decreaseQuantityDialog;
    }

    public JTextArea getDecreaseTextArea()
    {
        return decreaseTextArea;
    }

    public JDialog getFailDialog()
    {
        return failDialog;
    }

    public JTextArea getIdTextArea()
    {
        return idTextArea;
    }

    public JDialog getInvalidLoginPopup()
    {
        return invalidLoginPopup;
    }

    public JButton getListToolsCustomer()
    {
        return listToolsCustomer;
    }

    public JButton getListToolsOwner()
    {
        return listToolsOwner;
    }

    public JFrame getLoginMenu()
    {
        return loginMenu;
    }

    public JTextArea getLoginNewPasswordField()
    {
        return loginNewPasswordField;
    }

    public JTextArea getLoginNewUsernameField()
    {
        return loginNewUsernameField;
    }

    public JTextArea getLoginPasswordField()
    {
        return loginPasswordField;
    }

    public JTextArea getLoginUsernameField()
    {
        return loginUsernameField;
    }

    public JTextArea getNameTextArea()
    {
        return nameTextArea;
    }

    public JTextArea getNameTextArea1()
    {
        return nameTextArea1;
    }

    public JFrame getOwnerClientMenu()
    {
        return ownerClientMenu;
    }

    public JTextArea getOwnerDisplay()
    {
        return ownerDisplay;
    }

    public Button getPlaceOrderAccept()
    {
        return placeOrderAccept;
    }

    public JButton getPrintOrder()
    {
        return printOrder;
    }

    public JTextArea getRemoveItemArea()
    {
        return removeItemArea;
    }

    public JButton getRemoveItemButton()
    {
        return removeItemButton;
    }

    public JDialog getSearchByIDDialog()
    {
        return searchByIDDialog;
    }

    public JDialog getSearchByNameDialog()
    {
        return searchByNameDialog;
    }

    public JButton getSearchIDAccept()
    {
        return searchIDAccept;
    }

    public JButton getSearchNameAccept()
    {
        return searchNameAccept;
    }

    public JButton getSearchNameAccept1()
    {
        return searchNameAccept1;
    }

    public JDialog getSuccessDialog()
    {
        return successDialog;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try
        {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels())
            {
                if ("Nimbus".equals(info.getName()))
                {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex)
        {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                new GUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify
    private javax.swing.JButton acceptLoginButton;
    private javax.swing.JDialog addItemDialog;
    private javax.swing.JButton addLogin;
    private javax.swing.JButton addLoginButton;
    private javax.swing.JFrame addOwnerLoginMenu;
    private javax.swing.JButton addTool;
    private javax.swing.JButton addToolButton;
    private javax.swing.JTextArea addToolIDArea;
    private javax.swing.JTextArea addToolNameArea;
    private javax.swing.JTextArea addToolPriceArea;
    private javax.swing.JTextArea addToolStockArea;
    private javax.swing.JTextArea addToolSupplierIDArea;
    private java.awt.TextField amountToBuyField;
    private java.awt.TextField amountToDecreaseField;
    private javax.swing.JButton buyAmountAccept;
    private javax.swing.JButton buyAmountCancel;
    private javax.swing.JButton buyItem;
    private javax.swing.JDialog buyItemDialog;
    private javax.swing.JTextArea buyTextArea;
    private javax.swing.JButton cancelLoginButton;
    private javax.swing.JButton cancelNewLoginButton;
    private javax.swing.JButton checkQuantityAccept;
    private javax.swing.JButton checkQuantityCancel;
    private javax.swing.JDialog checkQuantityDialog;
    private javax.swing.JFrame customerClientMenu;
    private javax.swing.JTextArea customerDisplay;
    private java.awt.Button decreaseAmount;
    private java.awt.Button decreaseBuy;
    private javax.swing.JButton decreaseQuantity;
    private javax.swing.JButton decreaseQuantityAccept;
    private javax.swing.JButton decreaseQuantityCancel;
    private javax.swing.JDialog decreaseQuantityDialog;
    private javax.swing.JTextArea decreaseTextArea;
    private javax.swing.JButton doneAddingTools;
    private javax.swing.JDialog failDialog;
    private javax.swing.JButton idNameCancel;
    private javax.swing.JTextArea idTextArea;
    private java.awt.Button increaseAmount;
    private java.awt.Button increaseBuy;
    private javax.swing.JButton invalidLoginAcknowledge;
    private javax.swing.JDialog invalidLoginPopup;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane12;
    private javax.swing.JScrollPane jScrollPane13;
    private javax.swing.JScrollPane jScrollPane14;
    private javax.swing.JScrollPane jScrollPane15;
    private javax.swing.JScrollPane jScrollPane16;
    private javax.swing.JScrollPane jScrollPane17;
    private javax.swing.JScrollPane jScrollPane18;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JButton listToolsCustomer;
    private javax.swing.JButton listToolsOwner;
    private javax.swing.JButton loginCustomerButton;
    private javax.swing.JFrame loginMenu;
    private javax.swing.JTextArea loginNewPasswordField;
    private javax.swing.JTextArea loginNewUsernameField;
    private javax.swing.JButton loginOwnerButton;
    private javax.swing.JTextArea loginPasswordField;
    private javax.swing.JButton loginQuitButton;
    private javax.swing.JTextArea loginUsernameField;
    private javax.swing.JButton logout;
    private javax.swing.JButton logout1;
    private javax.swing.JTextArea nameTextArea;
    private javax.swing.JTextArea nameTextArea1;
    private javax.swing.JFrame ownerClientMenu;
    private javax.swing.JTextArea ownerDisplay;
    private java.awt.Button placeOrderAccept;
    private java.awt.Button placeOrderCancel;
    private javax.swing.JDialog placeOrderDialog;
    private javax.swing.JButton printOrder;
    private javax.swing.JTextArea quantityTextArea;
    private javax.swing.JTextArea removeItemArea;
    private javax.swing.JButton removeItemButton;
    private javax.swing.JButton removeItemDone;
    private javax.swing.JButton removeTool;
    private javax.swing.JDialog removeToolDialog;
    private javax.swing.JButton searchByID;
    private javax.swing.JDialog searchByIDDialog;
    private javax.swing.JButton searchByName;
    private javax.swing.JButton searchByName1;
    private javax.swing.JDialog searchByNameDialog;
    private javax.swing.JDialog searchByNameDialog1;
    private javax.swing.JButton searchIDAccept;
    private javax.swing.JButton searchNameAccept;
    private javax.swing.JButton searchNameAccept1;
    private javax.swing.JButton searchNameCancel;
    private javax.swing.JButton searchNameCancel1;
    private javax.swing.JDialog successDialog;
    // End of variables declaration
}

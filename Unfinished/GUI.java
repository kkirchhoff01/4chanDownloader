/**
*This is an alternate GUI containing a jTextArea
*which will display a console. I haven't figured
*out how to send messages to it yet. Feel free to
*edit this and post the revised version.
*/




package com.javacodegeeks.snippets.enterprise;

import javax.swing.JFileChooser;

public class GUI extends javax.swing.JFrame {

	    /**
	     * Creates new form Parser
	     */
	private JFileChooser chooser;
	private String choosertitle;
	private String file;
	
	    public GUI() {
	        initComponents();
	    }

	    /**
	     * This method is called from within the constructor to initialize the form.
	     * WARNING: Do NOT modify this code. The content of this method is always
	     * regenerated by the Form Editor.
	     */
	    @SuppressWarnings("unchecked")
	    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
	    private void initComponents() {

	        Title = new javax.swing.JLabel();
	        Download = new javax.swing.JButton();
	        ChooseFile = new javax.swing.JButton();
	        jScrollPane1 = new javax.swing.JScrollPane();
	        BoardList = new javax.swing.JList();
	        Boards = new javax.swing.JComboBox();
	        ChooseBoard = new javax.swing.JButton();
	        Refresh = new javax.swing.JButton();
	        ConsolPane = new javax.swing.JScrollPane();
	        Consol = new javax.swing.JTextArea();

	        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
	        setResizable(false);

	        Title.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
	        Title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
	        Title.setText("Image Downloader");

	        Download.setText("Download!");
	        Download.addActionListener(new java.awt.event.ActionListener() {
	            public void actionPerformed(java.awt.event.ActionEvent evt) {
	                DownloadActionPerformed(evt);
	            }
	        });

	        ChooseFile.setText("Choose File Path");
	        ChooseFile.addActionListener(new java.awt.event.ActionListener() {
	            public void actionPerformed(java.awt.event.ActionEvent evt) {
	                ChooseFileActionPerformed(evt);
	            }
	        });

	        BoardList.setModel(new javax.swing.AbstractListModel() {
	            String[] strings = DownloadImages.getThreads();
	            public int getSize() { return strings.length; }
	            public Object getElementAt(int i) { return strings[i]; }
	        });
	        BoardList.setToolTipText("");
	        jScrollPane1.setViewportView(BoardList);

	        Boards.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "/a/", "/b/", "/c/", "/d/", "/e/", "/f/", "/g/", "/gif/", "/h/", "/hr/", "/k/", "/m/", "/o/", "/p/", "/r/", "/s/", "/t/", "/u/", "/v/", "/vg/", "/vr/", "/w/", "/wg/", "/i/", "/ic/", "/r9k/", "[s4s]", "/cm/", "/hm/", "/lgbt/", "/y/", "/3/", "/adv/", "/an/", "/asp/", "/biz/", "/cgi/", "/ck/", "/co/", "/diy/", "/fa/", "/fit/", "/gd/", "/hc/", "/int/", "/jp/", "/lit/", "/mlp/", "/toy/", "/trv/", "/tv/", "/vp/", "/wsg/", "/x/" }));
	        Boards.addActionListener(new java.awt.event.ActionListener() {
	            public void actionPerformed(java.awt.event.ActionEvent evt) {
	                BoardsActionPerformed(evt);
	            }
	        });

	        ChooseBoard.setText("Choose Board");
	        ChooseBoard.addActionListener(new java.awt.event.ActionListener() {
	            public void actionPerformed(java.awt.event.ActionEvent evt) {
	                ChooseBoardActionPerformed(evt);
	            }
	        });

	        Refresh.setText("Refresh");
	        Refresh.addActionListener(new java.awt.event.ActionListener() {
	            public void actionPerformed(java.awt.event.ActionEvent evt) {
	                RefreshActionPerformed(evt);
	            }
	        });

	        Consol.setColumns(20);
	        Consol.setRows(5);
	        Consol.addComponentListener(new java.awt.event.ComponentAdapter() {
	            public void componentMoved(java.awt.event.ComponentEvent evt) {
	                ConsolComponentMoved(evt);
	            }
	        });
	        ConsolPane.setViewportView(Consol);

	        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
	        getContentPane().setLayout(layout);
	        layout.setHorizontalGroup(
	            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addGroup(layout.createSequentialGroup()
	                .addContainerGap()
	                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	                    .addComponent(Title, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
	                    .addComponent(Download, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
	                    .addGroup(layout.createSequentialGroup()
	                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
	                            .addComponent(jScrollPane1)
	                            .addComponent(ChooseFile, javax.swing.GroupLayout.DEFAULT_SIZE, 440, Short.MAX_VALUE))
	                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
	                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
	                                .addComponent(ChooseBoard, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
	                                .addGap(28, 28, 28))
	                            .addGroup(layout.createSequentialGroup()
	                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	                                    .addGroup(layout.createSequentialGroup()
	                                        .addGap(48, 48, 48)
	                                        .addComponent(Boards, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
	                                    .addGroup(layout.createSequentialGroup()
	                                        .addGap(18, 18, 18)
	                                        .addComponent(Refresh, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)))
	                                .addGap(0, 31, Short.MAX_VALUE))))
	                    .addComponent(ConsolPane))
	                .addContainerGap())
	        );
	        layout.setVerticalGroup(
	            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addGroup(layout.createSequentialGroup()
	                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	                    .addGroup(layout.createSequentialGroup()
	                        .addGap(94, 94, 94)
	                        .addComponent(Boards, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
	                        .addGap(18, 18, 18)
	                        .addComponent(ChooseBoard))
	                    .addGroup(layout.createSequentialGroup()
	                        .addContainerGap()
	                        .addComponent(Title)
	                        .addGap(18, 18, 18)
	                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)))
	                .addGap(36, 36, 36)
	                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
	                    .addComponent(ChooseFile)
	                    .addComponent(Refresh, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
	                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
	                .addComponent(Download, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
	                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
	                .addComponent(ConsolPane, javax.swing.GroupLayout.DEFAULT_SIZE, 107, Short.MAX_VALUE)
	                .addContainerGap())
	        );

	        pack();
	    }// </editor-fold>                        

	    private void DownloadActionPerformed(java.awt.event.ActionEvent evt) {                                         
	        // TODO add your handling code here:
		    int[] choices = BoardList.getSelectedIndices();
		    
		        // TODO add your handling code here:
			    DownloadImages.setFile(file);
			    DownloadImages.setURLs(choices);
			    System.out.println("Here");
			    DownloadImages.setRefreshed(false);
	    }                                        

	    private void ChooseFileActionPerformed(java.awt.event.ActionEvent evt) {                                           
	        // TODO add your handling code here:
		    int result;
		        
		    chooser = new JFileChooser(); 
		    chooser.setCurrentDirectory(new java.io.File("."));
		    chooser.setDialogTitle(choosertitle);
		    chooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
		    //
		    // disable the "All files" option.
		    //
		    chooser.setAcceptAllFileFilterUsed(false);
		    //    
		    if (chooser.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) { 
		      System.out.println("getCurrentDirectory(): " 
		         +  chooser.getCurrentDirectory());
		      System.out.println("getSelectedFile() : " 
		         +  chooser.getSelectedFile());
		      file = chooser.getSelectedFile().toString();
		      }
		    else {
		      System.out.println("No Selection ");
		      }
	    }                                          

	    private void BoardsActionPerformed(java.awt.event.ActionEvent evt) {                                       
	        // TODO add your handling code here:
	    }                                      

	    private void RefreshActionPerformed(java.awt.event.ActionEvent evt) {                                        
	        // TODO add your handling code here:
		    DownloadImages.setBoard(Boards.getSelectedIndex());
		    DownloadImages.setFile(file);
		        
		        BoardList.setModel(new javax.swing.AbstractListModel(){
		     	   String[] strings = DownloadImages.getThreads();
		     	   public int getSize() { return strings.length; }
			            public Object getElementAt(int i) { return strings[i]; }
			        });
		        BoardList.setToolTipText("");
		        jScrollPane1.setViewportView(BoardList);
		        DownloadImages.setRefreshed(false);

	    }                                       

	    private void ChooseBoardActionPerformed(java.awt.event.ActionEvent evt) {                                            
	        // TODO add your handling code here:
		    DownloadImages.setBoard(Boards.getSelectedIndex());
			 RefreshActionPerformed(evt);
	    }                                           

	    private void ConsolComponentMoved(java.awt.event.ComponentEvent evt) {                                      
	        // TODO add your handling code here:
	        Consol.append(DownloadImages.getText());
	    }                                     

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
	            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	        } catch (InstantiationException ex) {
	            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	        } catch (IllegalAccessException ex) {
	            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
	            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	        }
	        //</editor-fold>

	        /* Create and display the form */
	        java.awt.EventQueue.invokeLater(new Runnable() {
	            public void run() {
	                new GUI().setVisible(true);
	            }
	        });
	    }

	    // Variables declaration - do not modify                     
	    private javax.swing.JList BoardList;
	    private javax.swing.JComboBox Boards;
	    private javax.swing.JButton ChooseBoard;
	    private javax.swing.JButton ChooseFile;
	    private javax.swing.JTextArea Consol;
	    private javax.swing.JScrollPane ConsolPane;
	    private javax.swing.JButton Download;
	    private javax.swing.JButton Refresh;
	    private javax.swing.JLabel Title;
	    private javax.swing.JScrollPane jScrollPane1;
	    // End of variables declaration                   
	}

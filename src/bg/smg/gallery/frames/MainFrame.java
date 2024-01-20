/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bg.smg.gallery.frames;

import bg.smg.gallery.model.JPanelWithBackground;
import bg.smg.gallery.model.Painting;
import bg.smg.gallery.model.User;
import java.awt.Image;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 *
 * @author n.m.borisova
 */
public class MainFrame extends javax.swing.JFrame {

	private User currentUser;
        List<Painting> paintings1;
        List<Painting> paintings2;
        List<Painting> paintings3;
    /**
     * Creates new form MainFrame
     */
        
    public MainFrame() {
        setTitle("Галерия - начало");
        init(1);
    }
    public MainFrame(User user) {
    	this.currentUser = user;
        init(1);        
    }

    private void init(int TypeG) {
        initComponents();
        jPanelPaintingFullScreen.setVisible(false);
        List<Painting> paintings=new ArrayList<>();
        paintings1=new ArrayList<>();
        paintings2=new ArrayList<>();
        paintings3=new ArrayList<>();
        
        loadPaintings();
        Path resourceDirectory = Paths.get("src","resources");
        String absolutePath = resourceDirectory.toFile().getAbsolutePath();
        Image imgIcon = new ImageIcon(absolutePath+"/bg_gallery.jpeg").getImage();
        JPanelWithBackground pnl = new JPanelWithBackground(imgIcon);
        pnl.setLayout(null);
        pnl.setBounds(0, 0, 635, 430);
        
        
        switch(TypeG) {
            case 1: paintings=paintings1; break;
            case 2: paintings=paintings2; break;
            case 3: paintings=paintings3; break;
            default: paintings=paintings1; break;
        }       
        for(Painting p:paintings) {
            JLabel img = new JLabel();
            ImageIcon icon = new ImageIcon(absolutePath+"/"+p.getIcon());
            img.setIcon(icon);
            img.setBounds(p.getX() ,p.getY() , icon.getIconWidth(), icon.getIconHeight());
//            img.addMouseListener(l);
            pnl.add(img);
        }
        getContentPane().removeAll();
        getContentPane().add(pnl);
    }
    

    
    private void loadPaintings(){
        //TODO file read
        Painting p = new Painting("Robert Delaunay", 300000000, 1912, "In his Windows series, a group of twenty-two paintings made between April and December of 1912, Delaunay rejected painting’s traditional function as a window onto an imaginary world. Instead he turned to the pictorial surface as a place where the process of seeing itself could be recorded.", "WindowIcn.jpg", "Window.jpg", 55,39 );
        paintings1.add(p);
        p = new Painting("Edvard Munch", 300000000, 1893, "The Scream is a composition created by Norwegian artist Edvard Munch in 1893. The agonized face in the painting has become one of the most iconic images of art, seen as symbolizing the anxiety of the human condition. Munch's work, including The Scream, had a formative influence on the Expressionist movement", "The_ScreamIcn.jpg", "The_Scream.jpg", 275,39 );
        paintings1.add(p);
        p = new Painting("Vassily Kandinsky", 300000000, 1910, "Wassily Kandinsky’s “Murnau With Church” I is a painting created at the start of his career in 1910. This artwork was painted at the peak of Kandinsky’s involvement with Fauvism, which resulted in the bright swathes of color. Although Kandinsky utilized modernist elements such as thick paint application and overlapping planes of color to highlight an abstracted landscape, there are still recognizable forms of the church and landscape which demonstrate minimal references to representation.", "Murnau_With_ChurchIcn.jpg", "Murnau_With_Church.jpg", 510,42 );
        paintings1.add(p);
        p = new Painting("Ogi", 300000000, 2024, "our logo", "Expressionism1.png", "pic1", 175,280 );
        paintings1.add(p);
        p = new Painting("Ogi", 300000000, 2024, "our logo", "Expressionism2.png", "pic2", 275,281 );
        paintings1.add(p);
        p = new Painting("Ogi", 300000000, 2024, "our logo", "Expressionism3.png", "pic3", 375,281 );
        paintings1.add(p);
        
        p = new Painting("Claude Monet", 300000000, 1872, "Impression, Sunrise is an 1872 painting by Claude Monet first shown at what would become known as the \"Exhibition of the Impressionists\" in Paris in April, 1874. The painting is credited with inspiring the name of the Impressionist movement.", "ImpressionIcn.jpg", "Impression.jpg", 56,38 );
        paintings2.add(p);
        p = new Painting("Alfred Sisley", 300000000, 1877, "Alfred Sisley was born into an international family whose historical ties to both France and England went back several generations. In his immediate family, he was the youngest of four children and the only one to be born in Paris—on 30 October 1839. ", "Sisley_la_seine_au_point_du_jour_1877Icn.jpg", "Sisley_la_seine_au_point_du_jour_1877.jpg", 275,39 );
        paintings2.add(p);
        p = new Painting("Edgar Degas", 300000000, 1878, "Degas also produced bronze sculptures, prints, and drawings. Degas is especially identified with the subject of dance; more than half of his works depict dancers.[3] Although Degas is regarded as one of the founders of Impressionism, he rejected the term, preferring to be called a realist, and did not paint outdoors as many Impressionists did.", "DancerIcn.jpg", "Dancer.jpg", 510,41);
        paintings2.add(p);
        p = new Painting("Ogi", 300000000, 2024, "our logo", "Impressionism1.png", "pic1", 175,280 );
        paintings2.add(p);
        p = new Painting("Ogi", 300000000, 2024, "our logo", "Impressionism2.png", "pic2", 275,281 );
        paintings2.add(p);
        p = new Painting("Ogi", 300000000, 2024, "our logo", "Expressionism3.png", "pic3", 375,281 );
        paintings2.add(p);
        
        p = new Painting("Caspar David Friedrich", 300000000, 1818, "Wanderer above the Sea of Fog is a painting by Caspar David Friedrich made in 1818. It depicts a man standing upon a rocky precipice with his back to the viewer; he is gazing out on a landscape covered in a thick sea of fog through which other ridges, trees, and mountains pierce, which stretches out into the distance indefinitely.", "WandererIcn.jpg", "Wanderer.jpg", 55,38 );
        paintings3.add(p);
        p = new Painting("Theodore Gericault", 300000000, 1819, "info", "RaftIcn.jpg", "Raft.jpg", 276,40 );
        paintings3.add(p);
        p = new Painting("Joseph Mallord William Turner", 300000000, 1872, "info", "The_FightingIcn.jpg", "The_Fighting.jpg", 511,41 );
        paintings3.add(p);
        p = new Painting("Ogi", 300000000, 2024, "our logo", "Romanticism1.png", "pic1", 175,280 );
        paintings3.add(p);
        p = new Painting("Ogi", 300000000, 2024, "our logo", "Romanticism2.png", "pic2", 275,281 );
        paintings3.add(p);
        p = new Painting("Ogi", 300000000, 2024, "our logo", "Romanticism3.png", "pic3", 375,281 );
        paintings3.add(p);
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelPaintingFullScreen = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jLblAuthorName = new javax.swing.JLabel();
        jLblPainting = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();
        jMenu6 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenu7 = new javax.swing.JMenu();
        jMenu8 = new javax.swing.JMenu();
        jMenu9 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jMenu10 = new javax.swing.JMenu();
        jMenu11 = new javax.swing.JMenu();
        jMenu12 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("X");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelPaintingFullScreenLayout = new javax.swing.GroupLayout(jPanelPaintingFullScreen);
        jPanelPaintingFullScreen.setLayout(jPanelPaintingFullScreenLayout);
        jPanelPaintingFullScreenLayout.setHorizontalGroup(
            jPanelPaintingFullScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPaintingFullScreenLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelPaintingFullScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelPaintingFullScreenLayout.createSequentialGroup()
                        .addComponent(jLblPainting, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(jPanelPaintingFullScreenLayout.createSequentialGroup()
                        .addComponent(jLblAuthorName, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 83, Short.MAX_VALUE)
                        .addComponent(jButton1))))
        );
        jPanelPaintingFullScreenLayout.setVerticalGroup(
            jPanelPaintingFullScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPaintingFullScreenLayout.createSequentialGroup()
                .addGroup(jPanelPaintingFullScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jLblAuthorName))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLblPainting, javax.swing.GroupLayout.DEFAULT_SIZE, 225, Short.MAX_VALUE)
                .addContainerGap())
        );

        jMenu1.setText("Експресионизъм");
        jMenu1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jMenu1MouseEntered(evt);
            }
        });
        jMenu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu1ActionPerformed(evt);
            }
        });

        jMenu4.setText("Прозорец");
        jMenu4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu1Item1(evt);
            }
        });
        jMenu1.add(jMenu4);

        jMenu5.setText("Писъкът ");
        jMenu5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu1Item2(evt);
            }
        });
        jMenu1.add(jMenu5);

        jMenu6.setText("Мурнау с църква I");
        jMenu6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu1Item3(evt);
            }
        });
        jMenu1.add(jMenu6);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Импресионизъм");
        jMenu2.addMenuListener(new javax.swing.event.MenuListener() {
            public void menuCanceled(javax.swing.event.MenuEvent evt) {
            }
            public void menuDeselected(javax.swing.event.MenuEvent evt) {
            }
            public void menuSelected(javax.swing.event.MenuEvent evt) {
                jMenu2MenuSelected(evt);
            }
        });
        jMenu2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu2MouseClicked(evt);
            }
        });
        jMenu2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu2ActionPerformed(evt);
            }
        });

        jMenu7.setText("Импресия, изгряващо слънце");
        jMenu2.add(jMenu7);

        jMenu8.setText("Сена в средата на деня");
        jMenu2.add(jMenu8);

        jMenu9.setText("Танцьорка с букет цветя ");
        jMenu2.add(jMenu9);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Романтизъм");
        jMenu3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu3MouseClicked(evt);
            }
        });
        jMenu3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu3ActionPerformed(evt);
            }
        });

        jMenu10.setText("Странник над море от мъгла");
        jMenu3.add(jMenu10);

        jMenu11.setText("Потъването на медуза");
        jMenu3.add(jMenu11);

        jMenu12.setText("Темерер на буксир към последния пристън");
        jMenu3.add(jMenu12);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(169, 169, 169)
                .addComponent(jPanelPaintingFullScreen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(181, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(76, Short.MAX_VALUE)
                .addComponent(jPanelPaintingFullScreen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(68, 68, 68))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu1ActionPerformed
        // TODO add your handling code here:
       
       
    }//GEN-LAST:event_jMenu1ActionPerformed

    private void jMenu2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu2ActionPerformed
        // TODO add your handling code here:
       //init(2);
    }//GEN-LAST:event_jMenu2ActionPerformed

    
    
    
    
    private void jMenu1Item1(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu1Item1
        // TODO add your handling code here:
        jLblAuthorName.setText("Robert Delaunay");
        jLblPainting.setIcon(new ImageIcon("src/resources/Window.jpg"));
        jPanelPaintingFullScreen.setVisible(true);
    }//GEN-LAST:event_jMenu1Item1

    private void jMenu1Item2(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu1Item2
        // TODO add your handling code here:
        
        jLblAuthorName.setText("Edvard Munch");
        jLblPainting.setIcon(new ImageIcon("src/resources/The_Scream.jpg"));
        jPanelPaintingFullScreen.setVisible(true);
    }//GEN-LAST:event_jMenu1Item2

    private void jMenu1Item3(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu1Item3
        // TODO add your handling code here:
        
        jLblAuthorName.setText("Vassily Kandinsky");
        jLblPainting.setIcon(new ImageIcon("src/resources/Murnau_With_Church.jpg"));
        jPanelPaintingFullScreen.setVisible(true);
    }//GEN-LAST:event_jMenu1Item3

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
        // jPanelPaintingFullScreen.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jMenu3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenu3ActionPerformed
    private void jMenu2MenuSelected(javax.swing.event.MenuEvent evt) {//GEN-FIRST:event_jMenu2MenuSelected
                 // TODO add your handling code here:
    }//GEN-LAST:event_jMenu2MenuSelected

    private void jMenu2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu2MouseClicked
        // TODO add your handling code here:
        init(2);
    }//GEN-LAST:event_jMenu2MouseClicked

    private void jMenu3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu3MouseClicked
        // TODO add your handling code here:
        init(3);
    }//GEN-LAST:event_jMenu3MouseClicked

    private void jMenu1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu1MouseClicked
        // TODO add your handling code here:
        init(1);
    }//GEN-LAST:event_jMenu1MouseClicked

    private void jMenu1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu1MouseEntered
        // TODO add your handling code here:
        // init(1);
    }//GEN-LAST:event_jMenu1MouseEntered

              
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
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLblAuthorName;
    private javax.swing.JLabel jLblPainting;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu10;
    private javax.swing.JMenu jMenu11;
    private javax.swing.JMenu jMenu12;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenu jMenu8;
    private javax.swing.JMenu jMenu9;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanelPaintingFullScreen;
    // End of variables declaration//GEN-END:variables
}

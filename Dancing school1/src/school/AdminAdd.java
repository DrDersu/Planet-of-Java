package school;



import javax.swing.*;
import java.awt.*;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

public class AdminAdd extends Container {
    private Container cont = null;
    private AdultAdd adult = null;
    private KidsAdd kids = null;



    public AdultAdd getAdultAdd() {
        return adult;
    }

    public KidsAdd getKidsAdd() {
        return kids;
    }


    public AdminAdd(School school) throws SQLException {
        adult = new AdultAdd(school);
        kids = new KidsAdd(school);

        cont = adult;


        ButtonGroup bg = new ButtonGroup();
        JToggleButton ad = new JToggleButton("ADULT");
        ad.setBackground(java.awt.Color.decode("#20B2AA"));
        ad.setForeground(java.awt.Color.decode("#FF00FF"));
        Font font = new Font("Serif", Font.PLAIN, 20);
        ad.setFont(font);
        ad.setBounds(180, 20, 200, 50);bg.add(ad);add(ad);
        JToggleButton kid = new JToggleButton("KIDS");
        kid.setBounds(420, 20, 200, 50);bg.add(kid);add(kid);
        kid.setBackground(java.awt.Color.decode("#20B2AA"));
        kid.setForeground(java.awt.Color.decode("#FF00FF"));        
        kid.setFont(font);

        add(adult);add(kids);

        ad.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                school.switchFrame(adult, cont);
                cont = adult;
            }
        });

        kid.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                school.switchFrame(kids, cont);
                cont = kids;
            }
        });


        setVisible(false);
        setLayout(null);
        setSize(800,600);
    }
}

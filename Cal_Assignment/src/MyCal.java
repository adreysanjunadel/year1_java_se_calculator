
import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.lang.Math;

class close extends WindowAdapter {

    public void windowClosing(WindowEvent e) {
        System.exit(0);
    }

}

class cal implements ActionListener {

    Button b1, b2, b3, b4, b5, b6, b7, b8, b9, b10, b11, b12, b13, b14, b15, b16, b17, b18, b19, b20;
    TextField tf;
    String fv, sv, op;
    double fdv, sdv, tot;

    cal() {

        Frame f1 = new Frame();

        f1.setBackground(Color.WHITE);
        f1.addWindowListener(new close());
        f1.setBounds(1535, 575, 390, 475);
        f1.setTitle("Calculator");

        MenuBar mb = new MenuBar();

        MenuItem mi1 = new MenuItem("Standard Mode");
        MenuItem mi2 = new MenuItem("Scientific Mode");
        MenuItem mi3 = new MenuItem("Copy");
        MenuItem mi4 = new MenuItem("Paste");
        MenuItem mi5 = new MenuItem("View Help F1");
        MenuItem mi6 = new MenuItem("About Calculator");
        MenuItem mi7 = new MenuItem("Light");
        MenuItem mi8 = new MenuItem("Dark");

        Menu m1 = new Menu("Mode");
        m1.add(mi1);
        m1.add(mi2);

        Menu m2 = new Menu("Edit");
        m2.add(mi3);
        m2.add(mi4);

        Menu m3 = new Menu("Help");
        m3.add(mi5);
        m3.add(mi6);

        Menu m4 = new Menu("Theme");
        m4.add(mi7);
        m4.add(mi8);

        mb.add(m1);
        mb.add(m2);
        mb.add(m3);
        mb.add(m4);

        f1.setMenuBar(mb);

        b1 = new Button("C");
        b2 = new Button("\u221A");
        b3 = new Button("%");
        b4 = new Button("\u00F7");
        b5 = new Button("7");
        b6 = new Button("8");
        b7 = new Button("9");
        b8 = new Button("\u00D7");
        b9 = new Button("4");

        b10 = new Button("5");
        b11 = new Button("6");
        b12 = new Button("-");
        b13 = new Button("1");
        b14 = new Button("2");
        b15 = new Button("3");
        b16 = new Button("+");
        b17 = new Button("+/-");
        b18 = new Button("0");
        b19 = new Button(".");
        b20 = new Button("=");

        Font font1 = new Font("Source Sans Pro", Font.PLAIN, 24);
        Font fonte = new Font("Source Sans Pro", Font.BOLD, 28);

        Font font2 = new Font("Source Sans Pro", Font.BOLD, 24);
        Font fontc = new Font("Source Sans Pro", Font.BOLD, 24);

        b5.setFont(font1);
        b6.setFont(font1);
        b7.setFont(font1);
        b9.setFont(font1);
        b10.setFont(font1);
        b11.setFont(font1);
        b13.setFont(font1);
        b14.setFont(font1);
        b15.setFont(font1);
        b17.setFont(font1);
        b18.setFont(font1);
        b19.setFont(font1);

        b1.setFont(fontc);
        b20.setFont(fonte);

        b2.setFont(font2);
        b3.setFont(font2);
        b4.setFont(font2);
        b8.setFont(font2);
        b12.setFont(font2);
        b16.setFont(font2);
        
        Color fontCl = Color.decode("#F86F69");
        Color fontOp = Color.decode("#49a212");
        
        b1.setForeground(fontCl);
        b2.setForeground(fontOp);
        b3.setForeground(fontOp);
        b4.setForeground(fontOp);
        b8.setForeground(fontOp);
        b12.setForeground(fontOp);
        b16.setForeground(fontOp);

        b20.setBackground(Color.decode("#49a212"));

        class LightTheme implements ActionListener {

            @Override
            public void actionPerformed(ActionEvent f) {
                Color backgroundColor = Color.WHITE;
                Color foregroundColor = Color.BLACK;
                Color buttonColor = Color.decode("#F6F6F6");
                b1.setBackground(buttonColor);
                b2.setBackground(buttonColor);
                b3.setBackground(buttonColor);
                b4.setBackground(buttonColor);
                b5.setBackground(buttonColor);
                b6.setBackground(buttonColor);
                b7.setBackground(buttonColor);
                b8.setBackground(buttonColor);
                b9.setBackground(buttonColor);
                b10.setBackground(buttonColor);
                b11.setBackground(buttonColor);
                b12.setBackground(buttonColor);
                b13.setBackground(buttonColor);
                b14.setBackground(buttonColor);
                b15.setBackground(buttonColor);
                b16.setBackground(buttonColor);
                b17.setBackground(buttonColor);
                b18.setBackground(buttonColor);
                b19.setBackground(buttonColor);
                
                // Set font color to white for the required buttons
                Color fontColor = Color.BLACK;
                b5.setForeground(fontColor);
                b6.setForeground(fontColor);
                b7.setForeground(fontColor);
                b9.setForeground(fontColor);
                b10.setForeground(fontColor);
                b11.setForeground(fontColor);
                b13.setForeground(fontColor);
                b14.setForeground(fontColor);
                b15.setForeground(fontColor);
                b17.setForeground(fontColor);
                b18.setForeground(fontColor);
                b19.setForeground(fontColor);
                
                Color fontEq = Color.BLACK;
                b20.setForeground(fontEq);

                tf.setBackground(backgroundColor);
                tf.setForeground(foregroundColor);

            }
        }

        class DarkTheme implements ActionListener {

            @Override
            public void actionPerformed(ActionEvent g) {
                Color backgroundColor = Color.decode("#010101");
                Color foregroundColor = Color.WHITE;
                Color buttonColor = Color.decode("#171717");

                b1.setBackground(buttonColor);
                b2.setBackground(buttonColor);
                b3.setBackground(buttonColor);
                b4.setBackground(buttonColor);
                b5.setBackground(buttonColor);
                b6.setBackground(buttonColor);
                b7.setBackground(buttonColor);
                b8.setBackground(buttonColor);
                b9.setBackground(buttonColor);
                b10.setBackground(buttonColor);
                b11.setBackground(buttonColor);
                b12.setBackground(buttonColor);
                b13.setBackground(buttonColor);
                b14.setBackground(buttonColor);
                b15.setBackground(buttonColor);
                b16.setBackground(buttonColor);
                b17.setBackground(buttonColor);
                b18.setBackground(buttonColor);
                b19.setBackground(buttonColor);

                // Set font color to white for the required buttons
                Color fontColor = Color.WHITE;
                b5.setForeground(fontColor);
                b6.setForeground(fontColor);
                b7.setForeground(fontColor);
                b9.setForeground(fontColor);
                b10.setForeground(fontColor);
                b11.setForeground(fontColor);
                b13.setForeground(fontColor);
                b14.setForeground(fontColor);
                b15.setForeground(fontColor);
                b17.setForeground(fontColor);
                b18.setForeground(fontColor);
                b19.setForeground(fontColor);
                
                Color fontEq = Color.WHITE;
                b20.setForeground(fontEq);

                tf.setBackground(backgroundColor);
                tf.setForeground(foregroundColor);

            }
        }

        mi7.addActionListener(new LightTheme());
        mi8.addActionListener(new DarkTheme());

        Panel p = new Panel();
        p.setLayout(new GridLayout(5, 4, 10, 10));

        tf = new TextField(16);

        Font font = new Font("Source Sans Pro", Font.BOLD, 36);

        tf.setFont(font);
        tf.setEditable(false);

        tf.setForeground(Color.BLACK);
        tf.setBackground(Color.WHITE);

        Panel p1 = new Panel();
        Panel p2 = new Panel();

        GridLayout g1 = new GridLayout(6, 5, 3, 3);

        p1.add(tf);

        p2.setLayout(g1);
        p2.setBackground(Color.WHITE);

        p2.add(b1);
        p2.add(b2);
        p2.add(b3);
        p2.add(b4);
        p2.add(b5);
        p2.add(b6);
        p2.add(b7);
        p2.add(b8);
        p2.add(b9);
        p2.add(b10);
        p2.add(b11);
        p2.add(b12);
        p2.add(b13);
        p2.add(b14);
        p2.add(b15);
        p2.add(b16);
        p2.add(b17);
        p2.add(b18);
        p2.add(b19);
        p2.add(b20);

        f1.add(p1, BorderLayout.NORTH);
        f1.add(p2, BorderLayout.CENTER);

        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);
        b8.addActionListener(this);
        b9.addActionListener(this);
        b10.addActionListener(this);
        b11.addActionListener(this);
        b12.addActionListener(this);
        b13.addActionListener(this);
        b14.addActionListener(this);
        b15.addActionListener(this);
        b16.addActionListener(this);
        b17.addActionListener(this);
        b18.addActionListener(this);
        b19.addActionListener(this);
        b20.addActionListener(this);
        
        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                tf.setText("");
            }
        });

        f1.setVisible(true);

    }
    
    
    
    @Override
    public void actionPerformed(ActionEvent d) {

        Object o = d.getSource();

        if (o.equals(b13)) {
            tf.setText(tf.getText() + b13.getLabel());
        } else if (o.equals(b14)) {
            tf.setText(tf.getText() + b14.getLabel());

        } else if (o.equals(b15)) {
            tf.setText(tf.getText() + b15.getLabel());

        } else if (o.equals(b9)) {
            tf.setText(tf.getText() + b9.getLabel());

        } else if (o.equals(b10)) {
            tf.setText(tf.getText() + b10.getLabel());

        } else if (o.equals(b11)) {
            tf.setText(tf.getText() + b11.getLabel());

        } else if (o.equals(b5)) {
            tf.setText(tf.getText() + b5.getLabel());

        } else if (o.equals(b6)) {
            tf.setText(tf.getText() + b6.getLabel());

        } else if (o.equals(b7)) {
            tf.setText(tf.getText() + b7.getLabel());

        } else if (o.equals(b18)) {
            tf.setText(tf.getText() + b18.getLabel());
        } else if (o.equals(b2)) {

            fv = tf.getText();
            tf.setText("");

            op = b2.getLabel();

        } else if (o.equals(b3)) {

            fv = tf.getText();
            tf.setText("");

            op = b3.getLabel();

        } else if (o.equals(b16)) {

            fv = tf.getText();
            tf.setText("");

            op = b16.getLabel();

        } else if (o.equals(b12)) {

            fv = tf.getText();
            tf.setText("");

            op = b12.getLabel();

        } else if (o.equals(b8)) {

            fv = tf.getText();
            tf.setText("");

            op = b8.getLabel();

        } else if (o.equals(b4)) {

            fv = tf.getText();
            tf.setText("");

            op = b4.getLabel();

        } else if (o.equals(b20)) {

            sv = tf.getText();

            fdv = Double.parseDouble(fv);
            sdv = Double.parseDouble(sv);

            if (op.equals("+")) {
                tot = fdv + sdv;
                tf.setText(tot + "");

            } else if (op.equals("-")) {
                tot = fdv - sdv;
                tf.setText(tot + "");

            } else if (op.equals("\u00D7")) {
                tot = fdv * sdv;
                tf.setText(tot + "");

            } else if (op.equals("\u00F7")) {
                tot = fdv / sdv;
                tf.setText(tot + "");

            } else if (op.equals("\u221A")) {
                tot = Math.sqrt(sdv);
                tf.setText(tot + "");

            } else if (op.equals("%")) {
                double percentage = Double.parseDouble(tf.getText());
                double number = Double.parseDouble(fv);
                double result = (percentage / 100) * number;
                tf.setText(result + "");
            }

        }

        throw new UnsupportedOperationException("Not supported yet.");
    }

}

public class MyCal {

    public static void main(String[] args) {

        new cal();

    }

}

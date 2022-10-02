package CountingApp;

import CountingApp.components.DigitJButton;
import CountingApp.components.OperatorJButton;
import CountingApp.listener.ButtonListener;
import CountingApp.listener.ClearFieldButtonListener;
import CountingApp.listener.EqualsButtonListener;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CountingApp extends JFrame {
    private JTextField inputField;

    private final String appTitle;
    public CountingApp(String appTitle){
        super(appTitle);
        this.appTitle = appTitle;
        setBounds(200, 500, 250, 370);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setAlwaysOnTop(true);

        //menu

        setLayout(new BorderLayout());

        add(createTopPanel(), BorderLayout.NORTH);
        setJMenuBar(createMenu());
        add(createCenterPanel(), BorderLayout.CENTER);

        /*add(new Button("Button"), BorderLayout.EAST);
        add(new Button("Button"), BorderLayout.WEST);
        add(new Button("Button"), BorderLayout.NORTH);
        add(new Button("Button"), BorderLayout.SOUTH);
        add(new Button("Button"), BorderLayout.CENTER);*/



        setVisible(true);
    }

    private JPanel createTopPanel() {
        JPanel top = new JPanel();
        top.setLayout(new BorderLayout());
        inputField = new JTextField();
        inputField.setEditable(false);
        top.add(inputField);

        inputField.setFont(new Font("Arial", Font.PLAIN, 25));
        inputField.setMargin(new Insets(8,0,8,0));
        inputField.setBackground(new Color(227, 198, 198));

        /*inputField.setText("(1 + 2) / 3 = 12");*/
        return top;
    };

    private JPanel createCenterPanel() {
        JPanel centerPanel = new JPanel();
        centerPanel.setLayout(new BorderLayout());

        ActionListener buttonListener = new ButtonListener(inputField);

        centerPanel.add(createDigitsPanel(buttonListener), BorderLayout.CENTER);
        centerPanel.add(createOperatorsPanel(buttonListener), BorderLayout.WEST);

        return centerPanel;
    }

    private JPanel createOperatorsPanel(ActionListener buttonListener) {
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4,1));

        JButton minus = new OperatorJButton("-");
        minus.addActionListener(buttonListener);
        panel.add(minus);

        JButton plus = new OperatorJButton("+");
        plus.addActionListener(buttonListener);
        panel.add(plus);

        JButton multiply = new OperatorJButton("*");
        multiply.addActionListener(buttonListener);
        panel.add(multiply);

        JButton divide = new OperatorJButton("/");
        divide.addActionListener(buttonListener);
        panel.add(divide);
        return panel;
    }

    private JPanel createDigitsPanel(ActionListener buttonListener) {
        JPanel digitsPanel = new JPanel();

        digitsPanel.setLayout(new GridLayout(4,3));

        for (int i = 0; i < 10; i++) {
            String buttonTitle = (i == 9) ? "0" : String.valueOf(i + 1);
            JButton btn = new DigitJButton(buttonTitle);
            btn.addActionListener(buttonListener);
            digitsPanel.add(btn);

        }

        JButton calc = new OperatorJButton("=");
        digitsPanel.add(calc);
        calc.addActionListener(new EqualsButtonListener(inputField));


        JButton clr = new OperatorJButton("C");
        clr.addActionListener(new ClearFieldButtonListener(inputField));
        digitsPanel.add(clr);

        return digitsPanel;
    }

    ;



    private JMenuBar createMenu(){
        JMenuBar menuBar = new JMenuBar();

        JMenu menuFile = new JMenu("File");
        JMenuItem clr = new JMenuItem("Clear");
        clr.addActionListener(new ClearFieldButtonListener(inputField));

        menuFile.add(clr);

        menuFile.add(new JMenuItem("Exit"));
        menuBar.add(menuFile);



        menuBar.add(new JMenuItem("Help"));
        menuBar.add(new JMenuItem("About"));



        JMenuItem exit = new JMenuItem("Exit");
        /*exit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });*/
        exit.addActionListener(e -> System.exit(0));
        menuBar.add(exit);



        return menuBar;
    }



}

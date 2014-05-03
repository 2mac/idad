import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Random;

/**
 * @author 2mac
 */
public class MainWindow extends JFrame
{
    public MainWindow()
    {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setName("iDad");
        setTitle("iDad");
        setLayout(new GridLayout(2,1,5,5));
        setSize(300,200);
        setLocationRelativeTo(null);

        final JTextField text = new JTextField("");
        text.setEditable(false);

        JButton next = new JButton("Next Message");
        next.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent actionEvent)
            {
                text.setText(getJoke());
            }
        });

        add(text);
        add(next);

        setVisible(true);
    }

    public int getRandom(int bottom, int top)
    {
        Random dice = new Random();
        int dif = top - bottom;
        return bottom + dice.nextInt(dif+1);
    }

    public String getJoke()
    {
        ArrayList<String> jokes = new ArrayList<String>();
        jokes.add("Hi, free user. I'm dad.");
        jokes.add("I don't know. Can you do the thing?");
        jokes.add("SPORTS!");

        return jokes.get(getRandom(0,jokes.size()-1));
    }

    public static void main(String[] args)
    {
        new MainWindow();
    }
}

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ContactForm extends JFrame {
    JTextField nameFiald;
    JTextField emailFiald;
    JRadioButton male;
    JRadioButton female;
    JCheckBox check;

    public ContactForm() {
        super("Контактная форма");
        super.setBounds(200, 100, 300, 230);
        super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container container = super.getContentPane();
        container.setLayout(new GridLayout(5, 2, 2, 10));
        JLabel name = new JLabel("Введите имя: ");
        nameFiald = new JTextField(" ", 1);
        JLabel email = new JLabel("Введите почту: ");
        emailFiald = new JTextField("@", 1);

        container.add(name);
        container.add(nameFiald);
        container.add(email);
        container.add(emailFiald);

        male = new JRadioButton("Мужской");
        female = new JRadioButton("Женский");
        check = new JCheckBox("Согласен?", true);
        JButton sendButton = new JButton("Отправить");

        male.setSelected(true);
        container.add(male);
        container.add(female);
        container.add(check);
        container.add(sendButton);

        ButtonGroup group = new ButtonGroup();

        group.add(male);
        group.add(female);

        sendButton.addActionListener(new ButtonEventMeneger());
    }

    public class ButtonEventMeneger implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            String name = nameFiald.getText();
            String email = emailFiald.getText();

            String isMail = "Мужской";
            if (!male.isSelected()) isMail = "Женский";

            boolean checkBox = check.isSelected();

            JOptionPane.showMessageDialog(null, "Ваша почта: " +
                    email + "\nВаш пол: " + isMail
                    + "\nВы согласны? " + checkBox, "Привет, " + name, JOptionPane.PLAIN_MESSAGE);
        }
    }

}

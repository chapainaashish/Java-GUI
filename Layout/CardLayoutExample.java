package Layout;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// TO be done
public class CardLayoutExample {
    public static void main(String[] args) {
        Frame frame = new Frame("CardLayout Example");
        frame.setLayout(new CardLayout());

        Panel cardPanel = new Panel();
        CardLayout cardLayout = new CardLayout();
        cardPanel.setLayout(cardLayout);

        Button button1 = new Button("Card 1");
        Button button2 = new Button("Card 2");
        Button button3 = new Button("Card 3");

        cardPanel.add(button1, "card1");
        cardPanel.add(button2, "card2");
        cardPanel.add(button3, "card3");

        frame.add(cardPanel);

        // Button to switch to the next card
        Button nextButton = new Button("Next");
        nextButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                cardLayout.next(cardPanel);
            }
        });
    }
}



import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.*;

public class ImageComboBox{

  public static void main(String[] args) throws IOException {
    JFrame frame = new JFrame("Image Selection");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(600, 500);
    BufferedImage image1 = ImageIO.read(ImageComboBox.class.getResource("/image1.jpg"));
    BufferedImage image2 = ImageIO.read(ImageComboBox.class.getResource("/image2.png"));
    BufferedImage image3 = ImageIO.read(ImageComboBox.class.getResource("/image3.bmp"));

    ImageIcon icon1 = new ImageIcon(image1.getScaledInstance(200, 150, Image.SCALE_SMOOTH));
    ImageIcon icon2 = new ImageIcon(image2.getScaledInstance(200, 150, Image.SCALE_SMOOTH));
    ImageIcon icon3 = new ImageIcon(image3.getScaledInstance(200, 150, Image.SCALE_SMOOTH));
    DefaultComboBoxModel<ImageIcon> model = new DefaultComboBoxModel<>();
    model.addElement(icon1);
    model.addElement(icon2);
    model.addElement(icon3);
    JComboBox<ImageIcon> comboBox = new JComboBox<>(model);
    comboBox.setRenderer(new ImageComboBoxRenderer());
    JLabel imageLabel = new JLabel();
    imageLabel.setPreferredSize(new Dimension(200, 150));
    JButton showButton = new JButton("Show Image");

    showButton.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        ImageIcon selectedIcon = (ImageIcon) comboBox.getSelectedItem();
        imageLabel.setIcon(selectedIcon);
      }
    });
    JPanel panel = new JPanel();
    panel.add(comboBox);
    panel.add(showButton);
    panel.add(imageLabel);
    frame.add(panel);
    frame.setVisible(true);
  }
}
class ImageComboBoxRenderer extends JLabel implements ListCellRenderer<ImageIcon> {
  public ListCellRendererComponent<ImageIcon> getListCellRendererComponent(
      JList<? extends ImageIcon> list, ImageIcon value, int index, boolean isSelected,
      boolean cellHasFocus) {
    if (value != null) {
      setIcon(value);
      setText("");
    }
    return this;
  }
}

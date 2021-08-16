package ziffernfolge;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.Font;

@SuppressWarnings("serial")
public class Benutzeroberflaeche extends JFrame //implements Bestenliste
{
  private static final int abstand=10;
  private JPanel contentPane;
  private Spielkonsole spielkonsole = new Spielkonsole();
  private Bestenliste bestenliste = new Bestenliste();
  private Steuerung steuerung = new Steuerung(spielkonsole);
  private BestenlisteZeile b = new BestenlisteZeile(bestenliste);
  public final static JButton btnNamenEingeben = new JButton("Namen bestaetigen");
  public final static JButton btnNeuesSpiel = new JButton("Neues Spiel");
  public static JTextField txtNameInput;
  /**
   * Launch the application.
   */
  public static void main(String[] args)
  {
    EventQueue.invokeLater(new Runnable()
    {
      public void run()
      //
      {
        try
        {
          Benutzeroberflaeche frame = new Benutzeroberflaeche();
          frame.setVisible(true);
          frame.steuerung.spiel_gestartet();
        } catch (Exception e)
        {
          e.printStackTrace();
        }
      }
    });
  }

  /**
   * Create the frame.
   */
  public Benutzeroberflaeche()
  {
    setTitle("Ziffernfolge");
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setBounds(100,100,376,
              289);
    contentPane = new JPanel();
    contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
    setContentPane(contentPane);
    contentPane.setLayout(null);

    spielkonsole.melde_an(steuerung);
    spielkonsole.setLocation(abstand,abstand);
    contentPane.add(spielkonsole);
    bestenliste.setLocation(180,10);
    contentPane.add(bestenliste);
    
    
    btnNeuesSpiel.addMouseListener(new MouseAdapter() {
    	@Override
    	public void mouseClicked(MouseEvent e) {
    		bestenliste.neues_Spiel(e);
    	}
    });

    btnNeuesSpiel.setBounds(10, 213, 116, 23);
    contentPane.add(btnNeuesSpiel);
    btnNamenEingeben.addMouseListener(new MouseAdapter() {
    	@Override
    	public void mouseClicked(MouseEvent e) {
    		bestenliste.Name_eingegeben(e);
    	}
    });
    btnNamenEingeben.setFont(new Font("Tahoma", Font.PLAIN, 9));
    btnNamenEingeben.setBounds(232, 213, 118, 23);
    btnNamenEingeben.setVisible(false);
    
    contentPane.add(btnNamenEingeben);
    
    txtNameInput = new JTextField();
    txtNameInput.setBounds(136, 214, 86, 20);
    contentPane.add(txtNameInput);
    txtNameInput.setColumns(10);
    txtNameInput.setEditable(false);
	txtNameInput.setVisible(false);
	txtNameInput.setToolTipText("Bitte Namen eingeben ");
    
  }
}

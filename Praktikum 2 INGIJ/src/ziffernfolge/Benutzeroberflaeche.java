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
import javax.swing.JLabel;

@SuppressWarnings("serial")
public class Benutzeroberflaeche extends JFrame 
{
  private static final int abstand=10;
  private JPanel contentPane;
  private Spielkonsole spielkonsole = new Spielkonsole();
  private Bestenliste bestenliste;
  public Steuerung steuerung = new Steuerung(spielkonsole);
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
    setBounds(100,100,375,
              359);
    contentPane = new JPanel();
    contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
    setContentPane(contentPane);
    contentPane.setLayout(null);
    bestenliste = new Bestenliste(this);
    spielkonsole.melde_an(steuerung);
    spielkonsole.setLocation(abstand,abstand);
    contentPane.add(spielkonsole);
    bestenliste.setLocation(180,10);
    contentPane.add(bestenliste);
    
    JLabel lblUeberschrift = new JLabel("Bestenliste");
    lblUeberschrift.setFont(new Font("Tahoma", Font.BOLD, 18));
    lblUeberschrift.setBounds(40, 0, 170, 14);
    bestenliste.add(lblUeberschrift);
    
    
    btnNeuesSpiel.addMouseListener(new MouseAdapter() {
    	@Override
    	public void mouseClicked(MouseEvent e) {
    		bestenliste.neues_Spiel(e);
    	}
    });

    btnNeuesSpiel.setBounds(10, 282, 116, 23);
    contentPane.add(btnNeuesSpiel);
    
    btnNamenEingeben.addMouseListener(new MouseAdapter() {
    	@Override
    	public void mouseClicked(MouseEvent e) {
    		bestenliste.Name_eingegeben(e);
    		steuerung.spiel_gestartet();
    	}
    });
    
    btnNamenEingeben.setFont(new Font("Tahoma", Font.PLAIN, 9));
    btnNamenEingeben.setBounds(232, 282, 118, 23);
    btnNamenEingeben.setVisible(false);
    btnNeuesSpiel.setVisible(true);
    
    contentPane.add(btnNamenEingeben);
    
    txtNameInput = new JTextField();
    txtNameInput.setBounds(138, 283, 86, 20);
    contentPane.add(txtNameInput);
    txtNameInput.setColumns(10);
    txtNameInput.setEditable(false);
	txtNameInput.setVisible(false);
	txtNameInput.setToolTipText("Bitte Namen eingeben ");
    
  }

}

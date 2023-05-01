import javax.swing.*;
import java.awt.event.*;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.Color;

public class PanelAccueil extends JPanel implements ActionListener
{
	private Controleur ctrl;
	
	private JTextField txtPseudo;
	private JTextField txtPortServ;
	private JTextField txtPortCli;
	
	private JButton btnCreer;
	private JButton btnRejoindre;
	
	public PanelAccueil( Controleur ctrl )
	{
		this.setLayout( new BorderLayout() );
		
		this.ctrl = ctrl;
		
		this.txtPseudo   = new JTextField("Joueur");
		this.txtPortServ = new JTextField();
		this.txtPortCli  = new JTextField();
		
		JPanel pnlMid = new JPanel();
		pnlMid.setLayout( new GridLayout(3,2, 10, 5) );
		
		this.btnCreer     = new JButton("Créer une Salle");
		this.btnRejoindre = new JButton("Rejoindre une Salle");
		
		this.add( new JLabel("Pseudo : "), BorderLayout.NORTH );
		this.add( this.txtPseudo         , BorderLayout.NORTH );
		
		this.add( pnlMid, BorderLayout.CENTER );
		
		pnlMid.add( new JLabel("Port de la Salle : ") );
		pnlMid.add( new JLabel("Port de la Salle : ") );
		
		pnlMid.add( this.txtPortServ );
		pnlMid.add( this.txtPortCli );
		
		pnlMid.add( this.btnCreer );
		pnlMid.add( this.btnRejoindre );
	}
	
	public void actionPerformed ( ActionEvent e)
	{
		if( e.getSource() == this.btnCreer )
		{
			this.ctrl.lancerPartie();
		}
		
		if( e.getSource() == this.btnRejoindre )
		{
			
		}
	}
}
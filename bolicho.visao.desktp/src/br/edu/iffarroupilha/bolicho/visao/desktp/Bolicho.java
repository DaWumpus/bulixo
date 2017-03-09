package br.edu.iffarroupilha.bolicho.visao.desktp;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.plaf.nimbus.NimbusLookAndFeel;

public class Bolicho extends JFrame{
	
	public Bolicho() {
		setTitle("Bolicho ::");
		setLocationRelativeTo(null);
		setSize(640,480);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		desenhaComponentes();
		// muda a aparencia da aplicação JAVA
		try {
			UIManager.setLookAndFeel( new NimbusLookAndFeel() );
		} catch (UnsupportedLookAndFeelException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		setVisible(true);
	}

	private void desenhaComponentes() {
		JMenuBar menu = new JMenuBar();
		
		// cria o menu cadastro
		JMenuItem cadastro = new JMenu("Cadastro");
		menu.add(cadastro);
		
		// cria os sub itens
		JMenuItem cliente = new JMenuItem("Clientes");
		JMenuItem produto = new JMenuItem("Produtos");
		JMenuItem venda = new JMenuItem("Vendas");
		// vincula ao menu cadastros
		cadastro.add(cliente);
		cadastro.add(produto);
		cadastro.add(venda);
		// vincula as ações aos itens
		cliente.addActionListener( new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				JOptionPane.showMessageDialog(Bolicho.this, "Voce clicou");
			}
			});
		produto.addActionListener( new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				JOptionPane.showMessageDialog(Bolicho.this, "Voce clicou");
			}
			});
		venda.addActionListener( new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				JOptionPane.showMessageDialog(Bolicho.this, "Voce clicou");
			}
			});
		
		// adiciona o menu em tela
		setJMenuBar(menu);
	}

	public static void main(String[] args){
		new Bolicho();
	}
}
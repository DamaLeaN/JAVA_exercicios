import javax.swing.JOptionPane;

/*Faça um programa que o usuário digita o nome e a cidade onde mora e logo em seguida o 
programa responde com a mensagem “Olá bem vindo [nome]! Soube que você mora na cidade de [cidade] ”.

@autor Leandro Damasceno Alves 

*/

public class nomeCidade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		JOptionPane.showMessageDialog(null,	"Olá Humano!");
		
		String nickname = JOptionPane.showInputDialog("Qual é o seu nome?");
		
		JOptionPane.showMessageDialog(null,	"\npode me chamar de JV", nickname, JOptionPane.WARNING_MESSAGE);
		
		String city = JOptionPane.showInputDialog("Mora em qual quebrada?");
					
		JOptionPane.showMessageDialog(null,	"Não botei fé nessa quebrada hein! \nVou confirmar com o seu IP....");
		
		JOptionPane.showMessageDialog(null,	"Olá, seja Bem vindo "+nickname+"!\nRastrei o seu IP, diz que sua localização é em "+city);
		
		
		System.exit(0);

	}

}
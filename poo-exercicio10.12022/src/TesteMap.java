import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import javax.swing.JOptionPane;

public class TesteMap {

	public static void main(String[] args) {
		
		
		Map<Integer, String> nomes = new HashMap<Integer,String>();
		
		//Inserindo através de for
		//for(int x = 0; x < 10; x++) {
		//	String nome = JOptionPane.showInputDialog("Informe o "+(x+1)+"º nome: ");
		//	nomes.put(x, nome);
		//}
		//Inserindo Direto
		nomes.put(0,"Alan");
		nomes.put(1,"Samantha");
		nomes.put(2,"João");
		nomes.put(3,"Aline");
		nomes.put(4,"Sebastião");
		nomes.put(5,"Graziela");
		nomes.put(6,"Jossana");
		
		//Testanto
		System.out.println(nomes.containsKey(3));
		System.out.println(nomes.containsKey(10));
		System.out.println(nomes.get(3));
		
		Set<Integer> chaves = nomes.keySet();
		System.out.println("-------NOMES-----------");
		for(int chave : chaves) {
			System.out.println("Nome: "+nomes.get(chave));
		}
		
		System.out.println("-------NOMES PELO VALOR-----------");
		for(String nome : nomes.values()) {
			System.out.println("Nome: "+nome);
		}
		System.out.println("Removendo do Map: "+nomes.remove(3));
		
		System.out.println("-------NOMES PELO VALOR-----------");
		for(String nome : nomes.values()) {
			System.out.println("Nome: "+nome);
		}
	}

}

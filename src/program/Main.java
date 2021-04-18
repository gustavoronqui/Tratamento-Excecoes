package program;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import entities.Reserva;

public class Main {

	public static void main(String[] args) throws ParseException {
		
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
				
		System.out.print("Digite o numero do quarto:");
		long nQuarto = sc.nextLong();
		System.out.print("Digite a data de entrada (DD/MM/AAA):");
		Date  dataEntrada = sdf.parse(sc.next());
		System.out.print("Digite a data de saida (DD/MM/AAA):");
		Date  dataSaida = sdf.parse(sc.next());	
		Date dataAtual = new Date();
		
		if (dataEntrada.before(dataAtual) || dataSaida.before(dataAtual)) {
			System.out.println("Data de entrada e saida deve ser maior que a data atual");
		}
		else if (dataSaida.before(dataEntrada)) {
			System.out.println("Data de saida deve ser maior que a data de entrada");
		}
		else {	
		Reserva reserva = new Reserva(nQuarto, dataEntrada, dataSaida);
		System.out.println(reserva);
		
		System.out.println();
		System.out.println("Atualizar datas:");
		
		System.out.print("Digite a data de entrada (DD/MM/AAA):");
		dataEntrada = sdf.parse(sc.next());
		System.out.print("Digite a data de saida (DD/MM/AAA):");
		dataSaida = sdf.parse(sc.next());	
		
		 if (dataEntrada.before(dataAtual) || dataSaida.before(dataAtual)) {
		 	System.out.println("Data de entrada e saida deve ser maior que a data atual");
		 }
		 else if (dataSaida.before(dataEntrada)) {
			System.out.println("Data de saida deve ser maior que a data de entrada");
		 }
		 else {	
		 reserva.AtualizarDatas(dataEntrada, dataSaida);
		 System.out.println(reserva);
		 }
		}
			
		sc.close(); 
	}

}

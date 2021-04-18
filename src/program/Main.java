package program;

import java.security.InvalidParameterException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.InputMismatchException;
import java.util.Scanner;

import entities.Reserva;

public class Main {

	public static void main(String[] args) {
		
	 try{
		
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
				
		System.out.print("Digite o numero do quarto:");
		long nQuarto = sc.nextLong();
		System.out.print("Digite a data de entrada (DD/MM/AAA):");
		Date  dataEntrada = sdf.parse(sc.next());
		System.out.print("Digite a data de saida (DD/MM/AAA):");
		Date  dataSaida = sdf.parse(sc.next());	
		
		Reserva reserva = new Reserva(nQuarto, dataEntrada, dataSaida);
		System.out.println(reserva);
		
		System.out.println();
		System.out.println("Atualizar datas:");
		
		System.out.print("Digite a data de entrada (DD/MM/AAA):");
		dataEntrada = sdf.parse(sc.next());
		System.out.print("Digite a data de saida (DD/MM/AAA):");
		dataSaida = sdf.parse(sc.next());
		reserva.AtualizarDatas(dataEntrada, dataSaida);
	    System.out.println(reserva);
		
	    sc.close(); 
	   }
		catch(ParseException e) {
			System.out.println("Formato de data Invalido");
		}
	    catch (InvalidParameterException e) {
			System.out.println(e.getMessage());
		}
	    catch(InputMismatchException e) {
	       System.out.println("Input invalido");	
	    }
	    

 }
}

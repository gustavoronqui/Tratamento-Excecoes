package entities;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Reserva {

 long nQuarto;
 Date dataEntrada;
 Date dataSaida;
 SimpleDateFormat sdf =  new SimpleDateFormat("dd/MM/yyyy");
 
 
 public Reserva() {
	 
 }
 public Reserva(long nQuarto, Date dataEntrada,Date dataSaida) {
  this.dataEntrada=dataEntrada;
  this.dataSaida=dataSaida;
  this.nQuarto=nQuarto;
 }
 
public long getnQuarto() {
	return nQuarto;
}
public Date getDataEntrada() {
	return dataEntrada;
}
public Date getDataSaida() {
	return dataSaida;
}
public SimpleDateFormat getSdf() {
	return sdf;
}
public long Duracao () {
  return TimeUnit.DAYS.convert((dataSaida.getTime()- dataEntrada.getTime()),TimeUnit.MILLISECONDS);	 
 }

public void setnQuarto(long nQuarto) {
	this.nQuarto= nQuarto;
}

 
 public String AtualizarDatas(Date dataEntrada, Date dataSaida) {
	 
	 Date dataAtual = new Date();
	 
	 if (dataEntrada.before(dataAtual) || dataSaida.before(dataAtual)) {
	 return "Data de entrada e saida deve ser maior que a data atual";
	 }
	 if (dataSaida.before(dataEntrada)) {
	 return "Data de saida deve ser maior que a data de entrada";
	 }
	 	 
	 this.dataEntrada=dataEntrada;
	 this.dataSaida = dataSaida;
	 return null;
 }

 @Override
	public String toString() {
		return "Quarto:"
	           +nQuarto+" ,"
	           + " Entrada: "
	           + sdf.format(dataEntrada)
	           +" Saida: "
	           + sdf.format(dataSaida)
	           +" , "
	           +Duracao()
	           + " noites";
	}
 
 
}


 
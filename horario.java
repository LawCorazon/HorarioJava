package br.com.dio.bootcamp;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class horario {
	public static void main(String[] args) {
    LocalDateTime myDateObj = LocalDateTime.now();
//    System.out.println("Before formatting: " + myDateObj);
    DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("HH");

    String formattedDate = myDateObj.format(myFormatObj);
//    System.out.println("After formatting: " + formattedDate);
    int porra = Integer.parseInt(formattedDate);
 if (porra >= 0 && porra <= 12) {
	 System.out.println("Bom dia");
 } else if (porra <= 18) {
	 System.out.println("Boa tarde");
 } else {
	 System.out.println("Boa noite");
 }
  }
}
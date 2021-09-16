package P1;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class GestorCorreo {
	static Scanner  tec = new Scanner(System.in);
	public static void main(String[] args) {
		ArrayList<Correo> listacorreo = new ArrayList<Correo>();
		Date d = new Date();
		listacorreo.add(new Correo("aaa","aaaa","aaaa","aaaa",d));
		listacorreo.add(new Correo("sss","sss","sssss","ssss",d));
		listacorreo.add(new Correo("ddd","ddd","dddd","ddddd",d));
		
		int opc;
		do {
			System.out.println("\n\nIntroduzca la opcion: ");
			System.out.println("1. Bandeja de entrada");
			System.out.println("2. Añadir correo");
			System.out.println("3. Eliminar correo");
			System.out.println("4. Mostrar un correo");
			System.out.println("5. Mostrar todos los correos");
			System.out.println("6. Mostrar correos a partir de su origen");
			System.out.println("7. Salir");
			opc=tec.nextInt();
			switch (opc) {
			case 1:
				bandeja(listacorreo);
				break;
			case 2:
				añadir(listacorreo);
				break;
			case 3:
				borrar(listacorreo);
				break;
			case 4:
				mostrar(listacorreo);
				break;
			case 5:
				mostrarT(listacorreo);
				break;
			case 6:
				mostrarO(listacorreo);
				break;
				
				
			}
			
		}while(opc!=7);
		
		
		
	}
	public static void añadir(ArrayList<Correo> listacorreo) {
		System.out.println("Introduzca Origen ");
		String origen=tec.next();
		tec.next();
		System.out.println("Introduzca Destino ");
		String destino=tec.next();
		tec.next();
		System.out.println("Introduzca asunto ");
		String asunto=tec.next();
		System.out.println("Introduzca cuerpo del mensaje ");
		String cuerpo=tec.next();
		Date fecha= new Date();
		listacorreo.add(new Correo(origen,destino,asunto,cuerpo,fecha));
	}
	public static void bandeja(ArrayList<Correo> listacorreo) {
		for (int i = 0; i<listacorreo.size(); i++) {
			listacorreo.get(i).bandeja();
		}
	}
	
	public static void borrar(ArrayList<Correo> listacorreo) {
		for (int i = 0; i<listacorreo.size(); i++) {
			System.out.println(i+1+" :");
			System.out.print("\t");listacorreo.get(i).bandeja();
		}
		System.out.println("Introduzca numero de correo a borrar");
		int num=tec.nextInt();
		
		listacorreo.remove(num-1);
	}
	public static void mostrar(ArrayList<Correo> listacorreo) {
		for (int i = 0; i<listacorreo.size(); i++) {
			System.out.println(i+1+" :");
			System.out.print("\t");listacorreo.get(i).bandeja();
		}
		System.out.println("Introduzca numero de correo a mostrar");
		int num=tec.nextInt();
		
		System.out.println(listacorreo.get(num-1).getCuerpo());
	}
	public static void mostrarT(ArrayList<Correo> listacorreo) {
		for (int i = 0; i<listacorreo.size(); i++) {
			System.out.println(listacorreo.get(i).getCuerpo());
		}
	}
	public static void mostrarO(ArrayList<Correo> listacorreo) {
		System.out.println("Introduzca origen de correo ");
		String origen=tec.next();
		for (int i = 0; i<listacorreo.size(); i++) {
			if (listacorreo.get(i).getOrigen().equals(origen)) {
				System.out.println(listacorreo.get(i).getCuerpo());
			}
		}
	}
	
	
	
	

}

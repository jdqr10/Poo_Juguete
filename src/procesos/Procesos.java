package procesos;

import java.util.HashMap;

import javax.swing.JOptionPane;

import juguete.Juguete;

public class Procesos {

	HashMap<Integer,Juguete> mapJuguetes;
	Juguete juguete;

	    private String nombre, marca, material;
		private int bateria, opc, id;
		private boolean encendido;
	
	public Procesos() {
		mapJuguetes = new HashMap<>();
	}
	
	public void iniciar() {
		
		do {
			
			opcion();
			
			switch (opc) {
			case 1:
				registratJuguete();
				break;
				
			case 2:
				imprimirJuguetes();
				break;
				
			case 3:
				if (!mapJuguetes.isEmpty()) {
					imprimirJuguete();
				}
				break;
			
			case 4:
				JOptionPane.showMessageDialog(null, "Gracias por usar el programa...");
				break;	

			default:
				break;
			}
			
		} while (opc!=4);
	}
	
	private void imprimirJuguete() {
		// TODO Auto-generated method stub
		int buscarId = Integer.parseInt(JOptionPane.showInputDialog("Ingrese id del juguete a buscar"));
		String message="";
		if (mapJuguetes.containsKey(buscarId)) {
			message = "------INFO. JUGUETE----- \n";
			Juguete juguete = mapJuguetes.get(buscarId);
			message += "Id del juguete : " + juguete.getId() + "\n";
			message += "Nombre del juguete : " +juguete.getNombre() + "\n";
			message += "Marca del juguete : " + juguete.getMarca() + "\n";
			message += "Material del juguete : " + juguete.getMaterial() + "\n";
			message += "Bateria del juguete : " + juguete.getBateria() + "\n";
			System.out.println(message);
		}else {
	        System.out.println("El juguete con el id " + buscarId + " no se encuentra en la lista.");
	    }
		
		
	}

	private void imprimirJuguetes() {
		String message = "";
		for (int id : mapJuguetes.keySet()) {
			
			message = "------JUGUETE----- \n";
			juguete = mapJuguetes.get(id);
			message += "Id del juguete : " + juguete.getId() + "\n";
			message += "Nombre del juguete : " +juguete.getNombre() + "\n";
			message += "Marca del juguete : " + juguete.getMarca() + "\n";
			message += "Material del juguete : " + juguete.getMaterial() + "\n";
			message += "Bateria del juguete : " + juguete.getBateria() + "\n";
			System.out.println(message);
					
		}
		
	}

	public void opcion() {
		String menu = "  ---------MENU-------\n";
				menu+="1.Ingresar juguete \n";
				menu+= "2. Consultar todos los juguetes \n";
				menu += "3. Consultar juguete individual \n";
				menu += "4. !SALIR! \n";
				
		opc = Integer.parseInt(JOptionPane.showInputDialog(menu));
		
	}

	private void registratJuguete() {
		String preg = "";
		
		do {
			id = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el id del juguete"));
			nombre = JOptionPane.showInputDialog("Ingrese el nombre del juguete");
			marca = JOptionPane.showInputDialog("Ingrese la marca del juguete");
			material = JOptionPane.showInputDialog("Ingrese el material del juguete");
			bateria = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la bateria del juguete"));
			
			juguete = new Juguete(id, nombre, marca, material, bateria);
			mapJuguetes.put(id, juguete);
			preg=JOptionPane.showInputDialog("Desea Ingressar otro juguete?");
			
			
		} while (preg.equalsIgnoreCase("si"));
	}
	
	
	
}

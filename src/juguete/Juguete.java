package juguete;

public class Juguete {

	private String nombre, marca, material;
	private int bateria, id;
	private boolean encendido;

	
	
	public Juguete(int id, String nombre, String marca, String material, int bateria) {
		// TODO Auto-generated constructor stub
		this.id = id;
		this.nombre = nombre;
		this.marca = marca;
		this.material = material;
		this.bateria = bateria;
	}

	public void setNombre(String nombre) {
		this.nombre= nombre;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setId(int id) {
		this.id= id;
	}
	
	public int getId() {
		return id;
	}
	
	public void setBateria(int bateria) {
		this.bateria= bateria;
	}
	
	public int getBateria() {
		return bateria;
	}
	
	public void setMarca(String marca) {
		this.marca= marca;
	}
	
	public String getMarca() {
		return marca;
	}
	
	public void setMaterial(String material) {
		this.material= material;
	}
	
	public String getMaterial() {
		return material;
	}
	
	public Juguete() {
        encendido = false;
        bateria = 100;
    }

    public void encender() {
        encendido = true;
        System.out.println("El juguete se ha encendido.");
    }

    public void apagar() {
        encendido = false;
        System.out.println("El juguete se ha apagado.");
    }

    public void jugar() {
        if (encendido) {
            System.out.println("¡Estás jugando con el juguete!");
        } else {
            System.out.println("El juguete está apagado. Enciéndelo para jugar.");
        }
    }

    public void cargarBateria() {
        bateria = 100;
        System.out.println("La batería del juguete se ha cargado al 100%.");
    }

    public void verificarNivelBateria() {
        System.out.println("Nivel de batería: " + bateria + "%");
    }
	
}

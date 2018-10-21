package ar.com.belax;
import java.sql.Array;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.Map;
import java.util.Objects;
import java.util.Set;



public class Persona {


  public static String fraseMemorable = "Hola, que tal";
private static ArrayList<Persona> list <Personas>;
  public String apellido;
  public String nombre;
  public Date fechaNac;
  public int dni;

  public static void hablar (Persona p) {

    System.out.println(fraseMemorable + " " + p.apellido);

  }

  public int getDni () {

    return this.dni;

  }

  /**
 * @param args
 */
public static void main(String[] args) {

    Persona p1 = new Persona();
    System.out.println("DNI, " + p1.getDni());
    p1.apellido = "Curti";
    System.out.println("Apellido, " + p1.apellido.isEmpty());
    Persona.hablar(p1);

    Persona p2 = new Persona();
    System.out.println("DNI, " + p2.getDni());
    p2.apellido = "";
    
    
   ArrayList <Persona> = new ArrayList<Persona>();
		
   Set
   
    System.out.println("Dice,");
    System.out.println("Apellido, " + p2.apellido.isEmpty());

  }

/* (non-Javadoc)
 * @see java.lang.Object#hashCode()
 */
@Override
public int hashCode() {
	return Objects.hash(apellido, dni, fechaNac, nombre);
}

/* (non-Javadoc)
 * @see java.lang.Object#equals(java.lang.Object)
 */
@Override
public boolean equals(Object obj) {
	if (this == obj) {
		return true;
	}
	if (obj == null) {
		return false;
	}
	if (!(obj instanceof Persona)) {
		return false;
	}
	Persona other = (Persona) obj;
	return Objects.equals(apellido, other.apellido) && dni == other.dni && Objects.equals(fechaNac, other.fechaNac)
			&& Objects.equals(nombre, other.nombre);
}
}
package es.studium.Tema5;

import java.awt.Choice;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.TextField;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class Ejercicio5 implements WindowListener, ItemListener
{
Frame ventana = new Frame("Gentilicios");
Choice choProvincias = new Choice();
String[ ] provincias = {"Seleccione una provincia","Alava","Albacete","Alicante","Almería","Asturias","Avila","Badajoz","Barcelona","Burgos","Cáceres",
"Cádiz","Cantabria","Castellón","Ciudad Real","Córdoba","La Coruña","Cuenca","Gerona","Granada","Guadalajara",
"Guipúzcoa","Huelva","Huesca","Islas Baleares","Jaén","León","Lérida","Lugo","Madrid","Málaga","Murcia","Navarra",
"Orense","Palencia","Las Palmas","Pontevedra","La Rioja","Salamanca","Segovia","Sevilla","Soria","Tarragona",
"Santa Cruz de Tenerife","Teruel","Toledo","Valencia","Valladolid","Vizcaya","Zamora","Zaragoza"};
String[] gentiliciosMasculinos = {"","Alavés", "Albaceteño", "Alicantino"};
String[] gentiliciosFemeninos = {"","Alavesa", "Albaceteña", "Alicantina"};
TextField gentilicioMasculino = new TextField(20);
TextField gentilicioFemenino = new TextField(20);

public Ejercicio5()
{
ventana.setLayout(new FlowLayout());
// Establecemos el tamaño
ventana.setSize(300, 200);
// Añadimos los componentes
for(String provincia: provincias)
{
choProvincias.add(provincia);
}
ventana.add(choProvincias);
ventana.add(gentilicioMasculino);
ventana.add(gentilicioFemenino);
// Añadir Listeners
choProvincias.addItemListener(this);
ventana.addWindowListener(this);
ventana.setResizable(false);
ventana.setLocationRelativeTo(null);
// Hacemos visible la pantalla
ventana.setVisible(true);
}

public static void main(String[] args)
{
new Ejercicio5();
}
public void windowActivated(WindowEvent e) {}
public void windowClosed(WindowEvent e) {}
public void windowClosing(WindowEvent e)
{
// Salir
System.exit(0);
}
public void windowDeactivated(WindowEvent e) {}
public void windowDeiconified(WindowEvent e) {}
public void windowIconified(WindowEvent e) {}
public void windowOpened(WindowEvent e) {}

@Override
public void itemStateChanged(ItemEvent evento)
{
gentilicioMasculino.setText(gentiliciosMasculinos[choProvincias.getSelectedIndex()]);
gentilicioFemenino.setText(gentiliciosFemeninos[choProvincias.getSelectedIndex()]);
}
}
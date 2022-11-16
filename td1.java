import lejos.hardware.Button;
import lejos.hardware.port.SensorPort;
import lejos.hardware.sensor.EV3ColorSensor;
import lejos.robotics.Color;
import java.util.ArrayList;
import java.util.Arrays;
public class td1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Button.waitForAnyPress();
		EV3ColorSensor capteurCouleur;
		capteurCouleur = new EV3ColorSensor(SensorPort.S3);
		float[] tab = new float [3];
		float[] couleurs = new float[5];
		ArrayList<float[]> res = new ArrayList<float[]>();
		
		for(i=0;i<6; i++) {
			float tab2 = new float;
			tab2 = distEuclCol(tab, couleurs[i]);
			res.add(tab2);
			
		}
		
		double [] res = new double [1];
		tab3 = Arrays.stream(res).min().getAsDouble();
		System.out.println(tab3)
		
		
		capteurCouleur.getRGBMode().fetchSample(tab, 0);
        capteurCouleur.close();	
        }


	public static float [] distEuclCol(float[] tab, float[] tab1) {
		double distR = Math.sqrt(Math.pow(tab[0]-tab1[0],2));
		double distG = Math.sqrt(Math.pow(tab[1]-tab1[1],2));
		double distB = Math.sqrt(Math.pow(tab[2]-tab1[2]),2);
		
		double R = distR + distG + distB;
		return (float) R 
				
	
}
	public static int couleurPlusProche(float[] tab) {
		if (tab[0]<tab[1] && tab[0]<tab[2]) {
			return Color.RED;
			
			
		} 
}
	

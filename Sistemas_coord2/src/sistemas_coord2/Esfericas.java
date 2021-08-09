
package sistemas_coord2;


public class Esfericas {
    
    private float r; //Distancia desde el origen a un punto
    private float ang; // angulo con respecto al eje x de la proyeccion de punto sobre el planno x/y
    private float azi; // angulo del vector formado por el punto y el origen con respecto al eje z

    public Esfericas(float r, float ang, float azi) {
        this.r = r;
        this.ang = ang;
        this.azi = azi;
    }
    
    public Esfericas (){
    
    
    }
    
    public Esfericas esfericas_cilindricas (float r, float ang, float azi){
    
        
        
        return new Esfericas(); 
    
    }
    public float getR() {
        return r;
    }

    public void setR(float r) {
        this.r = r;
    }

    public float getAng() {
        return ang;
    }

    public void setAng(float ang) {
        this.ang = ang;
    }

    public float getAzi() {
        return azi;
    }

    public void setCono(float azi) {
        this.azi = azi;
    }
    
    
}

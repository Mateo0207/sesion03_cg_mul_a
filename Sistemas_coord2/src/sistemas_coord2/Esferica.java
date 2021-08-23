
package sistemas_coord2;


class Esferica {
     private float r; //Distancia desde el origen a un punto
    private float ang; // angulo con respecto al eje x de la proyeccion de punto sobre el planno x/y
    private float azi; // angulo del vector formado por el punto y el origen con respecto al eje z

    public Esferica(float r, float ang, float azi) {
        this.r = r;
        this.ang = ang;
        this.azi = azi;
    }

    private Esferica() {
        
    }
    
     public Esferica esfericas_cilindricas (float r, float ang, float azi){
         
         float r = (float)Math.sqrt(Math.pow(r, 2)+ Math.pow(azi,2));
         float ang = r;
         float azi = (float)Math.acos(z/(Math.sqrt(Math.pow(r,2)+Math.pow(z, 2))));
        
        return new Esferica(r,ang,azi);
        
    
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

    public void setAzi(float azi) {
        this.azi = azi;
    }
}

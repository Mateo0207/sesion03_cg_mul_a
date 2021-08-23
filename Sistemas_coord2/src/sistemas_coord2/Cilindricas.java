
package sistemas_coord2;


public class Cilindricas {
    
    private float radio;// RADIO BASE CILINDRICA
    private float punto;// VALOR DE LA COORDENADA Z
    private float azi;// ANGULO RESPECTO DE X DE LA PROYECCION DEL PUNTO SOBRE EL PLANO XYZ

    public Cilindricas(float x, float y, float z) {
        this.radio = radio;
        this.punto = punto;
        this.azi = azi;
    }
    
    public Cilindricas (){
    
    
    }
    
    public Cilindricas esferica_cilindrica(float r, float ang, float azi){
    
    float radio = (float)Math.sqrt(Math.pow(r,2)*Math.pow(Math.sin(azi), 2));
    float punto = ang;
    float z = r*(float)Math.cos(azi);
    return new Cilindricas ( radio, punto, z);
    }
    
    public Cilindricas esferica_cilindrica(Esferica a){
    
        return esferica_cilindrica(a.getradio(),a.getang(),a.getAzi());
    }

    public Cilindricas(float radio, float punto, float azi, Cilindricas esferica) {
        this.radio = radio;
        this.punto = punto;
        this.azi = azi;
        
    }

    public float getX() {
        return radio;
    }

    public void setX(float x) {
        this.radio = radio;
    }

    public float getY() {
        return radio;
    }

    public void setY(float y) {
        this.punto = punto;
    }

    public float getZ() {
        return azi;
    }

    public void setZ(float z) {
        this.azi = azi;
    }
    
}


package atividade4uc9versaoenvio;

import java.util.ArrayList;
import java.util.List;

public class GravarMedicao {
    
    private String data;
    private String hora;
    private int pSistolica;
    private int pDiastolica;
    private boolean estresse;
    
    protected static final List<GravarMedicao> medicoes = new ArrayList<>();

    public GravarMedicao() {
    }

    public GravarMedicao(String data, String hora, int pSistolica, int pDiastolica, boolean estresse) {
        this.data = data;
        this.hora = hora;
        this.pSistolica = pSistolica;
        this.pDiastolica = pDiastolica;
        this.estresse = estresse;
        
        medicoes.add(this);
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public int getpSistolica() {
        return pSistolica;
    }

    public void setpSistolica(int pSistolica) {
        this.pSistolica = pSistolica;
    }

    public int getpDiastolica() {
        return pDiastolica;
    }

    public void setpDiastolica(int pDiastolica) {
        this.pDiastolica = pDiastolica;
    }

    public boolean isEstresse() {
        return estresse;
    }

    public void setEstresse(boolean estresse) {
        this.estresse = estresse;
    }
    
    public static List<GravarMedicao> getLista(){
        return medicoes;
    }
    
    public void addMrdicoes(){
        medicoes.add(this);
    }
    
    public void atualizarMedicoes(String data, String hora, int pSistolica, int pDiastolica, boolean estresse){
        
        for(GravarMedicao g : medicoes){
            g.setData(data);
            g.setHora(hora);
            g.getpSistolica();
            g.setpDiastolica(pDiastolica);
            g.isEstresse();
            break;
        }
        
    }
    
    
    
}

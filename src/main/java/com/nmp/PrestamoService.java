package com.nmp;

import jakarta.enterprise.context.ApplicationScoped;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@ApplicationScoped
public class PrestamoService {
    private final PrestamosResource prestamosResource;
    private List<Prestamo> valores = new ArrayList<>();

    @jakarta.inject.Inject
    public PrestamoService(PrestamosResource prestamoResource) {
        this.prestamosResource = prestamoResource;

    }

    public  Prestamo addArticulo(Prestamo temp){
        valores.add(temp);
        return temp;
    }
    public List<Prestamo> obtenerArticulo() {
        return Collections.unmodifiableList(valores);
    }

    public PrestamoOfertado obtenerPrestamo(Prestamo pm) {
        double prestamoautorizado;
        prestamoautorizado=formulaprestamo(pm.getIdMaterial(), pm.getGramos());

        PrestamoOfertado p = new PrestamoOfertado();
        p.setPrestamo(prestamoautorizado);

        return p;
    }

    public double formulaprestamo(int id, double gramos){
        double montoprestamo ;

        montoprestamo= (gramos * 1400) * (0.80);
        return montoprestamo;
    }
}

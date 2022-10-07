package com.primer_parcial.SyK.models;


import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;


@Data
@NoArgsConstructor
@Entity
@Table(name = "almacen")

public class Articulo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(length = 100, nullable = false)
    private String nombre;
    @Column(length = 50, nullable = false)
    private String codigo;
    @Column(length = 300, nullable = false)
    private String descripcion;
    @Column(length = 100, nullable = false)
    private Date fechaRegistro;
    @Column(length = 300)
    private String categoria;
    @Column(length = 100)
    private Integer stock;
    @Column(length=400, nullable= false)
    private Float precio_compra;
    @Column(length=400, nullable= false)
    private Float precio_venta;

}

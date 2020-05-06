package com.example.anton_lab4;

import java.io.Serializable;

public class Animal implements Serializable {

    private int _id;
    private  String gatunek;
    private String kolor;
    private float wielkosc;
    private String opis;

    public Animal(){}

    public Animal(String gatunek,String kolor,float wielkosc,String opis){
        super();
        this.gatunek=gatunek;
        this.kolor=kolor;
        this.wielkosc=wielkosc;
        this.opis=opis;
    }

    @Override
    public String toString(){
        return "Zwierze:[id="+_id+" ,gatunek="+gatunek+", kolor="+kolor+", wielkosc="+wielkosc+"]";

    }

    public String getOpis(){return opis;}
    public String getKolor(){return kolor;}
    public String getGatunek(){return gatunek;}
    public float getWielkosc(){return wielkosc;}
    public int getID(){return _id;}
    public void setID(int id){this._id=id;}

}

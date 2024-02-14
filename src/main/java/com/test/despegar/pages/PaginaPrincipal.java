package com.test.despegar.pages;

public class PaginaPrincipal extends BasePage{

    private String vuelos = "//a[@title='Vuelos']";
    private String origen = "(//input[@placeholder='Ingresa desde dónde viajas'])[1]";
    private String bogota = "//li[@class='item -active']";
    private String destino = "(//input[@placeholder='Ingresa hacia dónde viajas'])[1]";
    private String cartagena = "(//li[@class='item'])[1]";
    private String Buscar = "(//button[@class='sbox5-box-button-ovr--3LK5x sbox5-3-btn sbox5-button -secondary -icon -lg'])";


    public PaginaPrincipal(){
        super(driver);
    }

    public void navigateToDespegar(){
        navigateTo("https://www.despegar.com.co/");
    }

    public void goflights(){
        clickElement(vuelos);
    }

    public void searchforoutboundflight(String criteriaOne){
        write(origen, criteriaOne);
    }
    public void firstflight(){
        clickElement(bogota);
    }
    public void searchforreturnboundflight(String criteriaTwo){
        write(destino, criteriaTwo);
    }

    public void secondflight(){
        clickElement(cartagena);
    }

    public void seeflights(){
        clickElement(Buscar);
    }

}

package com.test.despegar.steps;

import com.test.despegar.pages.PaginaPrincipal;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BuscarVueloSteps {

    PaginaPrincipal main = new PaginaPrincipal();


    @Given("El usuario está en la página de inicio")
    public void navigateToDespegar(){
        main.navigateToDespegar();
        main.goflights();
    }

    @When("Busca un vuelo de (.+) a (.+)")
    public void findTravel(String criteria){
        main.searchforoutboundflight(criteria);
        main.firstflight();
        main.searchforreturnboundflight(criteria);
        main.secondflight();
    }

    @Then("Se muestra la lista de vuelos disponibles")
    public void verVuelos(){
        main.seeflights();
    }


}

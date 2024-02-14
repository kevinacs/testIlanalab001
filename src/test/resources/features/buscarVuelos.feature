Feature: Búsqueda de vuelos
  Como un usuario
  Quiero buscar vuelos de Bogotá a Cartagena
  Para planificar mi viaje

  Scenario Outline: Buscar vuelo disponible
    Given El usuario está en la página de inicio
    When Busca un vuelo de <Origen> a <Destino>
    Then Se muestra la lista de vuelos disponibles

    Examples:
      | Origen | Destino   |
      | Bogota | Cartagena |
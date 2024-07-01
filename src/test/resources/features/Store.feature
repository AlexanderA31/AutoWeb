Feature: Tienda en línea

  @validacionPrecioProducto
  Scenario: Validación del Precio de un Producto
    Given estoy en la página de la tienda
    And me logueo con mi usuario "ufredoalegria@hotmail.com" y clave "0201062619Aa."
    When navego a la categoria "Clothes" y subcategoria "Men"
    And agrego 2 unidades del primer producto al carrito
    And valido en el popup que el monto total sea calculado correctamente

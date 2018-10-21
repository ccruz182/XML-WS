/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws;

import java.util.ArrayList;
import java.util.Collections;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author cesar
 */
@WebService(serviceName = "WS_Operaciones")
public class WS_Operaciones {

  @WebMethod(operationName = "sumar")
  public int sumar(@WebParam(name = "x") int x, @WebParam(name = "y") int y) {
    return x + y;
  }

  @WebMethod(operationName = "restar")
  public int restar(@WebParam(name = "x") int x, @WebParam(name = "y") int y) {
    return x - y;
  }

  @WebMethod(operationName = "multiplicar")
  public int multiplicar(@WebParam(name = "x") int x, @WebParam(name = "y") int y) {
    return x * y;
  }

  @WebMethod(operationName = "dividir")
  public double dividir(@WebParam(name = "x") int x, @WebParam(name = "y") int y) {
    return x / y;
  }

  @WebMethod(operationName = "promedio")
  public double promedio(@WebParam(name = "datos") ArrayList<Double> datos) {
    double suma = 0;
    for (Double dato : datos) {
      suma += dato;
    }

    return suma / datos.size();
  }

  @WebMethod(operationName = "desvEstandar")
  public double desvEstandar(@WebParam(name = "datos") ArrayList<Double> datos) {
    double prom = promedio(datos);
    double sum = 0;
    for (Double dato : datos) {
      sum = sum + Math.pow(dato - prom, 2);
    }

    return Math.sqrt(sum / datos.size());
  }

  @WebMethod(operationName = "factorial")
  public int factorial(@WebParam(name = "numero") int numero) {
    if (numero > 1) {
      return numero * factorial(numero - 1);
    } else if (numero == 0) {
      return 1;
    } else {
      return 1;
    }
  }

  @WebMethod(operationName = "fibonacci")
  public int fibonacci(@WebParam(name = "numero") int numero) {
    int n1 = 0, n2 = 1, n3 = 0;
    for (int i = 0; i < (numero - 2); i++) {
      n3 = n1 + n2;
      n1 = n2;
      n2 = n3;
    }

    return n3;
  }

  @WebMethod(operationName = "mediana")
  public double mediana(@WebParam(name = "datos") ArrayList<Double> datos) {
    Collections.sort(datos);
    if (datos.size() % 2 != 0) {
      return datos.get(datos.size() / 2);
    } else {
      double d1 = datos.get(datos.size() / 2);
      double d2 = datos.get((datos.size() / 2) - 1);
      return (d1 + d2) / 2;
    }
  }

  @WebMethod(operationName = "desvMedia")
  public double desvMedia(@WebParam(name = "datos") ArrayList<Double> datos) {
    double prom = promedio(datos);
    double sum = 0;

    for (Double dato : datos) {
      sum += Math.abs(dato - prom);
    }

    return sum / datos.size();
  }
}

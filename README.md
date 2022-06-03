# TEORIA DE GRAFOS - CONJUNTO Y NUMERO CLIQUE

## 👩🏻‍💻 Datos del Estudiante: 
_**Nombre completo:** Esther Romero Aguilar_

_**Carrera:** Ingeniera Informática_

---

# Tarea Clique


_Elaboración de la estructura, métodos y atributos de un Conjunto y Número Clique_

## 1) Conceptos básicos 📖

_Teoría de conceptos basicos y consideraciones que se tomaron en cuenta al momento de la implementación._

### 📌Conjunto y Número Clique 

_**Conjunto:** Es un conjunto de vértices adyacentes en el grafo, que forman un subgrafo completo._

_**Número:** Es el mayor numero de vértices de un conjunto camarilla._

<p align="center"><img width="500" src="https://github.com/esther-romero/Teoria-de-Grafos-Conjunto-Clique/blob/main/img/Conjunto%20Camarilla.png?raw=true" alt="Imagen Conjunto Camarilla"></p>

## 2) Explicación de la lógica 📖
_Consideramos el siguiente Grafo:_

<p align="center"><img width="350" src="https://github.com/esther-romero/Teoria-de-Grafos-Conjunto-Clique/blob/main/img/Grafo1.png?raw=true" alt="Imagen de un grafo"></p>

_Observamos que tiene más de un conjunto Clique, entre ellos:_

- **`SUBGRAFOS COMPLETOS:`**

    | Subgrafo1    | Subgrafo2                       |   Subgrafo3   |
    | -------- | --------------------------------- | -----------|
    | <p align="center"><img width="250" src="https://github.com/esther-romero/Teoria-de-Grafos-Conjunto-Clique/blob/main/img/azul.png?raw=true" alt="Imagen Resultado Grafo 1"></p>   | <p align="center"><img width="250" src="https://github.com/esther-romero/Teoria-de-Grafos-Conjunto-Clique/blob/main/img/rosa.png?raw=true" alt="Imagen Resultado"></p>  |   <p align="center"><img width="250" src="https://github.com/esther-romero/Teoria-de-Grafos-Conjunto-Clique/blob/main/img/naranja.png?raw=true" alt="Imagen Resultado Grafo 1"></p> |

_Observamos que encontramos otro conjunto Clique de un número de vertices mayor al anterior:_

- **`SUBGRAFO COMPLETO:`**

<p align="center"><img width="500" src="https://github.com/esther-romero/Teoria-de-Grafos-Conjunto-Clique/blob/main/img/lila.png?raw=true" alt="Imagen Conjunto Camarilla"></p>

_ ............ _


## 3) Explicación de Clases 📖

_Se cuenta con dos clases: Clase Main y Clase Clique_


<p align="center"><img width="350" src="https://github.com/esther-romero/Teoria-de-Grafos-Conjunto-Clique/blob/main/img/clases.png?raw=true" alt="Imagen Clases"></p>

_**Clase Main:** Es nuestra clase principal, por donde hacemos correr todos los métodos implementados en nuestra clase Clique._

_**Clase Clique:** Esta clase se encarga de la verificación de un subgrafo completo._

_A su vez, se utilizo listas de adyacencia para la representacion de los grafos._

```
public class Clique {
    private int nodo;
    private boolean[] vis;
    private int contCiclos;
    private int conjuntoCamarilla[];
    private ArrayList<Integer>[] adj;
}    
```

## 4) Explicación de métodos y su tipo de retorno 🚀

_La clase Clique contiene 4 métodos, verificando la existencia de un subgrafo completo._

### void run() 📋

_Verifica la existencia de un subgrafo completo, tomando en cuenta, cada vértice del grafo._

```
@param  No necesita parametros
@return void - sin valor de retorno
```

### addEdge(int o, int d) 📋

_Agrega aristas a un grafo_

```
@param int -> origen del vertice (o)
@param int -> destino del vertice (d)
@return void - sin valor de retorno
```

### esCiclo (int v) 📋

_Verifica si un primer vertice coincide con el ultimo vertice, es decir, valida si un subgrafo es ciclo._

```
@param int -> último vertice visitado
@return true/false - true si el subgrafo es ciclo, falso si el subgrafo no es ciclo.
```

### void recorrido(int v, int destino) 📋

_Recorre todo el grafo bajo el algoritmo DFS recursivo, buscando un subgrafo completo._

_Imprime todos los resultados que encuentra, tomando cada vertice como punto de partida._

```
@param int -> origen del vertice (v)
@param int -> destino del vertice (destino)
@return void - sin valor de retorno
```

## 5) Ejecutando Pruebas - DEMO ⚙️
  


## 6) Construido con 🛠️

_Herramientas que se utilizaron para el proyecto_

* Java - Lenguaje de programación
* Visual Studio Code - IDE de programación

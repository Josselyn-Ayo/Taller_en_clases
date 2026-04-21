<img width="920" height="629" alt="image" src="https://github.com/user-attachments/assets/e274575c-32ff-426b-9d8e-74635c272018" /># 📱 Calculadora Cliente-Servidor UDP

##  Descripción

Este proyecto consiste en una calculadora con interfaz gráfica (GUI) desarrollada en Java, que funciona bajo el modelo cliente-servidor utilizando el protocolo UDP.

El cliente permite ingresar dos números y seleccionar una operación matemática, enviando los datos al servidor, el cual procesa la operación y devuelve el resultado.

---

## Tecnologías utilizadas

* Java
* JavaFX
* Sockets UDP (DatagramSocket, DatagramPacket)

---

## Funcionamiento

1. El usuario ingresa dos números en la interfaz.
2. Selecciona una operación (sumar, restar, multiplicar o dividir).
3. El cliente envía los datos al servidor mediante UDP.
4. El servidor procesa la operación.
5. El servidor retorna el resultado.
6. El cliente muestra el resultado en pantalla.

---

##  Ejecución del proyecto

### 1. Ejecutar el servidor

Ejecutar la clase:

```id="xqgk2y"
MainServidor
```

Esto iniciará el servidor en el puerto 5000.

---

### 2. Ejecutar el cliente (GUI)

Ejecutar la clase:

```id="pn8j0g"
Main
```

Se abrirá la calculadora.

---

##  Configuración de red

* Para pruebas locales:

```id="x9r7r3"
127.0.0.1
```

* Para conexión en red:

```id="wt9k2c"
192.168.x.x
```

Ambos dispositivos deben estar en la misma red.

---

##  Consideraciones

* El servidor debe estar activo antes de ejecutar el cliente.
* Verificar que el puerto (5000) coincida en cliente y servidor.
* En caso de usar red, permitir conexión en el firewall.

---

## 📸 Evidencias
<img width="734" height="499" alt="image" src="https://github.com/user-attachments/assets/377e8a01-8c76-4f88-b87f-78561979f607" />
---
<img width="924" height="590" alt="image" src="https://github.com/user-attachments/assets/aaef7d3c-68fa-4ea6-aede-7f5082ed3175" />
---
<img width="887" height="606" alt="image" src="https://github.com/user-attachments/assets/3afb67af-2a2d-40d3-816e-df66c591afa5" />
---




---

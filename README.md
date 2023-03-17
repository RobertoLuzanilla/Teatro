# Teatro
Este es el proyecto bueno, con ayuda, tuve varias complicaciones, la mas grande fue moverme por las filas, el uso de los metodos no lo fue tanto, me ayudaron
para poder hacer este codigo, sin embargo ya conozco mas sobre las listas



ESTO ES EL OBJEETIVO DEL PROGRAMA


ESTRUCTURA DE DATOS
PROYECTO DE LA TERCER COMPETENCIA
Programa del Teatro Sonora.

Estructura del programa:
 Dar de alta en un arreglo de objeto, 3 secciones (VIP, Palcos y Normal).
 Cada sección va a contener una lista doble de filas cuyo nombre serán las letras 
del abecedario (en mayúsculas).
 Cada fila contendrá una lista simple de asientos, los cuales se enumerarán.
 Clases. Deben de ser 5 clases: Principal, Oper_listaFilas, Filas, 
Oper_listaAsientos, Asientos

Qué es lo que se requiere ? -MENU DE OPCIONES-.
 Dar de alta Fila. (10 puntos)
 Dar de alta asiento. (15 puntos)
 Mostrar filas de una sección. (10 puntos)
 Listar asientos disponibles. (10 puntos)
 Asignar precio de boletos. (5 puntos)
 Venta de boletos. (15 puntos)
 Cancelar una venta. (15 puntos)
 Cambiar asiento. (10 puntos)
 Mostrar ventas por sección. (10 puntos)
 Salir.

Aclaraciones:

Dar de alta Fila.
Aquí se deberá pedir la sección a la que pertenecerá. El nombre deberá ser automático 
con las letras del abecedario en mayúscula (A, B, C, etc.). Se podrá dar de alta un 
determinado número de filas en una sola alta.

Dar de alta asiento.
Se deberá pedir la sección y la fila. Si la fila no existe o es incorrecta, mandar un 
mensaje de error y regresar al menú principal. Si todo está correcto, el nombre del 
asiento deberá ser automático con un número entero de manera ascendente (1,2,3, etc.).
Se podrá dar de alta un determinado número de asientos en una sola alta.

Mostrar filas de una sección.
Se muestra el nombre de las filas que existen en una sección con la cantidad de asientos 
con la que cuenta cada una de ellas. Pedir la sección que deseamos mostrar. Ejemplo, si 
el usuario elije la de VIP, mostrará:
Fila A – 0 asientos
Fila B – 3 asientos
Fila C – 2 asientos
Fila D – 3 asientos

Listar asientos disponibles.
Se enlistan los asientos disponibles en una sección determinada. Mostrar los asientos 
disponibles por cada fila. Preguntar por la sección. Por ejemplo: si el usuario desea 
saber los asientos disponibles de la sección de Palcos, se podrá mostrar lo siguiente:
Fila A - 1, 2, 3
Fila B - 3 (ahí significa que los asientos 1 y 2 ya están ocupados)
Fila C - 1, 2, 5, 6 (ahí significa que los asientos 3 y 4 ya están ocupados)

Asignar precio de boletos.
Se pide el precio que deberá tener los boletos por sección.

Venta de boletos.
Se deberá pedir la sección, fila y asiento. La venta se realizará por un determinado 
número de boletos y se pedirá la ubicación de cada boleto vendido. Se deberán vender 
únicamente asientos desocupados. Al final de la operación se deberá mostrar el importe 
total de la venta. 
Primeramente, se deberá validar que SI hay asientos disponibles para esa venta. Es 
decir, por ejemplo, si el usuario quiere hacer una venta de 5 boletos, el sistema deberá 
validar que al menos existan 5 asientos disponibles en todo el teatro (no importa que no 
sean de la misma sección). Si no los hay, marcar un error y regresar al menú principal.
Por cada boleto, deberá pedir la sección, y al seleccionarla, se pueden mostrar las Filas 
con los asientos disponibles. 

Cancelar una venta.
La cancelación solamente es por UN asiento vendido. Se deberá pedir la sección, y se 
mostrarán los asientos ocupados por cada fila. Posteriormente, se pedirá la fila y el 
asiento que desea cancelar. El importe de ese asiento será descontado y el asiento 
quedará disponible. El sistema deberá validar que al menos exista un asiento vendido.

Cambiar asiento.
Se deberá pedir la sección, y se mostrarán los asientos ocupados por cada fila. 
Posteriormente, se pedirá la fila y el asiento que desea cambiar. Después, se pedirá la 
sección de la nueva ubicación. En seguida, se mostrarán los asientos desocupados por 
fila, y se deberá pedir fila y asiento. Mostrar un mensaje mostrando la diferencia que 
hay que pagar por precio de boletos (si es que existe).
Se deberá validar que al menos haya un asiento vendido, y al menos un asiento 
desocupado.

Mostrar ventas totales.
Se mostrará una tabla mostrando el número de boletos vendido por sección, su costo y 
el importe total vendido, así como los totales generales (no. total de boletos, así como la 
venta total). Ejemplo:
 
Sección Boletos vendidos Precio Total
VIP 5 300.00 1,500.00
Palcos 10 200.00 2,000.00
Normal 15 100.00 1,500.00
Boletos vendidos: 30
Total de ventas: $ 5,000.00

Enunciado 

El Taller Mecánico Ort Boxes nos contrata para realizar un programa para poder tener una mejor administración de los servicios que realiza. 
Ellos son: cambio de aceite, alineación y encendido. De cada servicio que se realiza se sabe: String descripcion double porcentaje ganancia String patente y para cada tipo de servicio varía su precio de venta y su precio de costo.

Además cada servicio es Detallable, lo que permite mostrar por pantalla qué tipo de servicio es, la patente del vehículo y el precio de la venta del servicio.

El modo de cálculo del costo de los servicios varía para cada uno de ellos: 

● Cambio de Aceite: de este servicio se sabe la cantidad de horas que va a llevar (int). Es Cotizable por mano de obra y Cotizable por materiales. Esto significa que el costo del mismo es la suma del costo de las horas más el costo de los materiales. 

● Alineación: de este servicio se sabe la cantidad de horas que va a llevar (int), si se incluye también balanceo o no (boolean) y un importe extra que es el costo del balanceo (double). Es Cotizable por mano de obra. Esto significa que el costo del mismo es el costo de las horas. Si incluyera también balanceo, a ese costo debe sumarse el valor extra por balanceo.

● Encendido: este servicio es Cotizable por materiales. Esto significa que el costo del mismo es el costo de los materiales.

Los costos tienen dos formas de calcularse, dependiendo del tipo de servicio (si para su cálculo se incluyen horas, insumos, o ambas): 

● Si su costo incluye horas (mano de obra), se calcula multiplicando la cantidad de horas utilizadas para el servicio por el valor fijo de la hora. 

● Si el costo incluye insumos, el mismo se calcula sumando el costo de los materiales (material1 + material2).

Finalmente, el precio de venta para todos los servicios se calcula agregando al precio de costo el porcentaje de ganancia (general y único).

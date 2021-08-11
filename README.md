# AnalizadorRuby
Analizador lexico y sintactico del lenguaje Ruby desarrollado en Java dentro del entorno de Netbeans.

El programa hace uso de un arreglo bidimensional como una tabla de estados la cual analiza caracter por caracter cada palabra hasta identificarla.

Dichas tablas de estados estan almacenadas en la carpeta archivos tanto en formato EXCEL como en formato TEXT, estos ultimos son los que el programa utiliza para realizar sus funciones.

En caso de encontrar un error el programa devuelve en la esquina inferior derecha un cuadro donde indica la linea y el caracter del error.

A su vez devuelve una cruz o una paloma en caso de que el paso del analisis se complete adecuadamente.{

El programa no requiere ninguna libreria externa, unicamente la carpeta de archivos contenida dentro del repositorio.

En caso de modificar la tabla de excel se debe marcar todas las casillas, copiar el contenido y pegarlo en el archivo txt, de otra manera los cambios no seran reflejados en el funcionamiento.

importar  Java . útil _ aleatorio ;
importar  Java . útil _ escáner ;

 clase  pública Reto4 {

    public  static  void  main ( String [] args ) {
        Escáner  escáner = nuevo  Escáner ( System . in );
         Aleatorio aleatorio = nuevo  Aleatorio ();
        String [] opciones = { "piedra" , "papel" , "tijera" };

        sistema _ fuera _ println ( "Bienvenido al juego de piedra, papel o tijera. ¿Listo para jugar?" );

        mientras ( verdadero ) {
            sistema _ fuera _ print ( "Ingrese su opcion (piedra, papel o tijera):" );
            String  opcionUsuario = escaner . línea siguiente (). a Minúsculas ();

            if ( opcionUsuario . es igual a ( "salir" )) {
                sistema _ fuera _ println ( "¡Hasta la próxima!" );
                romper ;
            }

            if (! opcionUsuario . equals ( "piedra" ) && ! opcionUsuario . equals ( "papel" ) && ! opcionUsuario . equals ( "tijera" )) {
                sistema _ fuera _ println ( "Opción inválida. Por favor ingrese piedra, papel o tijera." );
                continuar ;
            }

            int  opcionMaquina = random . siguienteInt ( 3 );
            String  opcionMaquinaStr = opciones [ opcionMaquina ];

            sistema _ fuera _ println ( "La maquina seleccionada" + opcionMaquinaStr );

            if ( opcionUsuario . es igual a ( opcionMaquinaStr )) {
                sistema _ fuera _ println ( "¡Empatar!" );
            } else  if (( opcionUsuario . es igual a ( "piedra" ) && opcionMaquinaStr . es igual a ( "tijera" )) ||
                       ( opcionUsuario . equals ( "papel" ) && opcionMaquinaStr . equals ( "piedra" )) ||
                       ( opcionUsuario . equals ( "tijera" ) && opcionMaquinaStr . equals ( "papel" ))) {
                sistema _ fuera _ println ( "¡Ganaste!" );
            } más {
                sistema _ fuera _ println ( "Perdiste!" );
            }
        }

        escáner _ cerrar ();
    }

}

package hundirLaFlota.src;


import java.util.Scanner;

public class juegoundirlaflota {

	@SuppressWarnings("resource")
    public static void main(String[] args) 
	{
		
		Scanner sc;
		tablero tablero;
		int x;
		int y;
		
		int pedirfila = 0;
		int pedircolumna = 0;
		int pedirdireccion = 0;
		
		boolean error;
		
		sc = new Scanner(System.in);
		//INICIALIZO TABLERO
		x = 10;
		y = 10;
		tablero = new tablero(x,y);
		
		//INICIO DE JUEGO//
		tablero.Explicacion();
		System.out.println("PULSA ENTER PARA JUGAR");
		sc.nextLine();
		
		
		tablero.DibujarTabla2();
		System.out.println();
		System.out.println();
		tablero.DibujarTabla1();
		System.out.println();
		System.out.println();
		
		//************TURNO JUGADOR 1 COLOCAR BARCOS************//
		System.out.println("Jugador 1 Coloca 2 barcos de 2 casillas");
		System.out.println("Barco 1");
		
		do {try{System.out.println("Fila:");
			pedirfila = sc.nextInt();
			if(pedirfila < 1 || pedirfila > 10)
			{error = true;}
			else
			{error = false;	}}
			catch(Exception err_error)
			{error=true;sc.nextLine();}
			}while(error == true);
		
		do {try{System.out.println("Columna:");
			pedircolumna = sc.nextInt();
			if(pedircolumna < 1 || pedircolumna > 10)
			{error = true;}
			else
			{error = false;	}}
			catch(Exception err_error)
			{error=true;sc.nextLine();}
			}while(error == true);
		
		do {try{System.out.println("Direccion(1-arriba, 2-izquierda, 3-abajo, 4-derecha):");
			pedirdireccion = sc.nextInt();
			if(pedirdireccion < 1 || pedirdireccion > 4)
			{error = true;}
			else
			{error = false;	}}
			catch(Exception err_error)
			{error=true;sc.nextLine();}
			}while(error == true);
		
		tablero.Colocarbarcos1(pedirfila, pedircolumna, 2, pedirdireccion);
		tablero.DibujarTabla2();
		System.out.println();
		System.out.println();
		tablero.DibujarTabla1();
		System.out.println();
		
		System.out.println("Barco 2");
		
		do {try{System.out.println("Fila:");
			pedirfila = sc.nextInt();
			if(pedirfila < 1 || pedirfila > 10)
			{error = true;}
			else
			{error = false;	}}
			catch(Exception err_error)
			{error=true;sc.nextLine();}
			}while(error == true);
	
		do {try{System.out.println("Columna:");
			pedircolumna = sc.nextInt();
			if(pedircolumna < 1 || pedircolumna > 10)
			{error = true;}
			else
			{error = false;	}}
			catch(Exception err_error)
			{error=true;sc.nextLine();}
			}while(error == true);
		
		do {try{System.out.println("Direccion(1-arriba, 2-izquierda, 3-abajo, 4-derecha):");
			pedirdireccion = sc.nextInt();
			if(pedirdireccion < 1 || pedirdireccion > 4)
			{error = true;}
			else
			{error = false;	}}
			catch(Exception err_error)
			{error=true;sc.nextLine();}
			}while(error == true);
	
		tablero.Colocarbarcos1(pedirfila, pedircolumna, 2, pedirdireccion);
		tablero.DibujarTabla2();
		System.out.println();
		System.out.println();
		tablero.DibujarTabla1();
		System.out.println();
		
		System.out.println("Coloca 2 barcos de 3 casillas");
		System.out.println("Barco 1");
		
		do {try{System.out.println("Fila:");
			pedirfila = sc.nextInt();
			if(pedirfila < 1 || pedirfila > 10)
			{error = true;}
			else
			{error = false;	}}
			catch(Exception err_error)
			{error=true;sc.nextLine();}
			}while(error == true);
	
		do {try{System.out.println("Columna:");
			pedircolumna = sc.nextInt();
			if(pedircolumna < 1 || pedircolumna > 10)
			{error = true;}
			else
			{error = false;	}}
			catch(Exception err_error)
			{error=true;sc.nextLine();}
			}while(error == true);
		
		do {try{System.out.println("Direccion(1-arriba, 2-izquierda, 3-abajo, 4-derecha):");
			pedirdireccion = sc.nextInt();
			if(pedirdireccion < 1 || pedirdireccion > 4)
			{error = true;}
			else
			{error = false;	}}
			catch(Exception err_error)
			{error=true;sc.nextLine();}
			}while(error == true);
	
		tablero.Colocarbarcos1(pedirfila, pedircolumna, 3, pedirdireccion);
		tablero.DibujarTabla2();
		System.out.println();
		System.out.println();
		tablero.DibujarTabla1();
		System.out.println();
		
		System.out.println("Barco 2");

		do {try{System.out.println("Fila:");
			pedirfila = sc.nextInt();
			if(pedirfila < 1 || pedirfila > 10)
			{error = true;}
			else
			{error = false;	}}
			catch(Exception err_error)
			{error=true;sc.nextLine();}
			}while(error == true);
	
		do {try{System.out.println("Columna:");
			pedircolumna = sc.nextInt();
			if(pedircolumna < 1 || pedircolumna > 10)
			{error = true;}
			else
			{error = false;	}}
			catch(Exception err_error)
			{error=true;sc.nextLine();}
			}while(error == true);
		
		do {try{System.out.println("Direccion(1-arriba, 2-izquierda, 3-abajo, 4-derecha):");
			pedirdireccion = sc.nextInt();
			if(pedirdireccion < 1 || pedirdireccion > 4)
			{error = true;}
			else
			{error = false;	}}
			catch(Exception err_error)
			{error=true;sc.nextLine();}
			}while(error == true);
	
		tablero.Colocarbarcos1(pedirfila, pedircolumna, 3, pedirdireccion);
		tablero.DibujarTabla2();
		System.out.println();
		System.out.println();
		tablero.DibujarTabla1();
		System.out.println();
		
		System.out.println("Coloca 1 barco de 4 casillas");

		do {try{System.out.println("Fila:");
			pedirfila = sc.nextInt();
			if(pedirfila < 1 || pedirfila > 10)
			{error = true;}
			else
			{error = false;	}}
			catch(Exception err_error)
			{error=true;sc.nextLine();}
			}while(error == true);
	
		do {try{System.out.println("Columna:");
			pedircolumna = sc.nextInt();
			if(pedircolumna < 1 || pedircolumna > 10)
			{error = true;}
			else
			{error = false;	}}
			catch(Exception err_error)
			{error=true;sc.nextLine();}
			}while(error == true);
		
		do {try{System.out.println("Direccion(1-arriba, 2-izquierda, 3-abajo, 4-derecha):");
			pedirdireccion = sc.nextInt();
			if(pedirdireccion < 1 || pedirdireccion > 4)
			{error = true;}
			else
			{error = false;	}}
			catch(Exception err_error)
			{error=true;sc.nextLine();}
			}while(error == true);
	
		tablero.Colocarbarcos1(pedirfila, pedircolumna, 4, pedirdireccion);
		tablero.DibujarTabla2();
		System.out.println();
		System.out.println();
		tablero.DibujarTabla1();
		System.out.println();
		
		System.out.println("Coloca 1 barco de 5 casillas");

		do {try{System.out.println("Fila:");
			pedirfila = sc.nextInt();
			if(pedirfila < 1 || pedirfila > 10)
			{error = true;}
			else
			{error = false;	}}
			catch(Exception err_error)
			{error=true;sc.nextLine();}
			}while(error == true);
	
		do {try{System.out.println("Columna:");
			pedircolumna = sc.nextInt();
			if(pedircolumna < 1 || pedircolumna > 10)
			{error = true;}
			else
			{error = false;	}}
			catch(Exception err_error)
			{error=true;sc.nextLine();}
			}while(error == true);
		
		do {try{System.out.println("Direccion(1-arriba, 2-izquierda, 3-abajo, 4-derecha):");
			pedirdireccion = sc.nextInt();
			if(pedirdireccion < 1 || pedirdireccion > 4)
			{error = true;}
			else
			{error = false;	}}
			catch(Exception err_error)
			{error=true;sc.nextLine();}
			}while(error == true);
	
		tablero.Colocarbarcos1(pedirfila, pedircolumna, 5, pedirdireccion);
		System.out.println();
		tablero.DibujarTabla2();
		System.out.println();
		System.out.println();
		tablero.DibujarTabla1();
		System.out.println();
	
		System.out.println("jUGADOR 1 PULSA ENTER PARA PASAR EL TURNO");
		sc.nextLine();sc.nextLine();
		System.out.println("Jugador 2 PULSA ENTER PARA JUGAR");
		sc.nextLine();
		
		
		tablero.DibujarTabla2_1();
		System.out.println();
		System.out.println();
		tablero.DibujarTabla1_2();
		System.out.println();
		System.out.println();
		
		//************TURNO JUGADOR 2 COLOCAR BARCOS************//
		System.out.println("Jugador 2 Coloca 2 barcos de 2 casillas");
		System.out.println("Barco 1");
		
		do {try{System.out.println("Fila:");
			pedirfila = sc.nextInt();
			if(pedirfila < 1 || pedirfila > 10)
			{error = true;}
			else
			{error = false;	}}
			catch(Exception err_error)
			{error=true;sc.nextLine();}
			}while(error == true);
	
		do {try{System.out.println("Columna:");
			pedircolumna = sc.nextInt();
			if(pedircolumna < 1 || pedircolumna > 10)
			{error = true;}
			else
			{error = false;	}}
			catch(Exception err_error)
			{error=true;sc.nextLine();}
			}while(error == true);
		
		do {try{System.out.println("Direccion(1-arriba, 2-izquierda, 3-abajo, 4-derecha):");
			pedirdireccion = sc.nextInt();
			if(pedirdireccion < 1 || pedirdireccion > 4)
			{error = true;}
			else
			{error = false;	}}
			catch(Exception err_error)
			{error=true;sc.nextLine();}
			}while(error == true);
	
		tablero.Colocarbarcos2(pedirfila, pedircolumna, 2, pedirdireccion);
		tablero.DibujarTabla2_1();
		System.out.println();
		System.out.println();
		tablero.DibujarTabla1_2();
		System.out.println();
		
		System.out.println("Barco 2");

		do {try{System.out.println("Fila:");
			pedirfila = sc.nextInt();
			if(pedirfila < 1 || pedirfila > 10)
			{error = true;}
			else
			{error = false;	}}
			catch(Exception err_error)
			{error=true;sc.nextLine();}
			}while(error == true);
		
		do {try{System.out.println("Columna:");
			pedircolumna = sc.nextInt();
			if(pedircolumna < 1 || pedircolumna > 10)
			{error = true;}
			else
			{error = false;	}}
			catch(Exception err_error)
			{error=true;sc.nextLine();}
			}while(error == true);
		
		do {try{System.out.println("Direccion(1-arriba, 2-izquierda, 3-abajo, 4-derecha):");
			pedirdireccion = sc.nextInt();
			if(pedirdireccion < 1 || pedirdireccion > 4)
			{error = true;}
			else
			{error = false;	}}
			catch(Exception err_error)
			{error=true;sc.nextLine();}
			}while(error == true);
	
		tablero.Colocarbarcos2(pedirfila, pedircolumna, 2, pedirdireccion);
		tablero.DibujarTabla2_1();
		System.out.println();
		System.out.println();
		tablero.DibujarTabla1_2();
		System.out.println();
		
		System.out.println("Coloca 2 barcos de 3 casillas");
		System.out.println("Barco 1");

		do {try{System.out.println("Fila:");
			pedirfila = sc.nextInt();
			if(pedirfila < 1 || pedirfila > 10)
			{error = true;}
			else
			{error = false;	}}
			catch(Exception err_error)
			{error=true;sc.nextLine();}
			}while(error == true);
	
		do {try{System.out.println("Columna:");
			pedircolumna = sc.nextInt();
			if(pedircolumna < 1 || pedircolumna > 10)
			{error = true;}
			else
			{error = false;	}}
			catch(Exception err_error)
			{error=true;sc.nextLine();}
			}while(error == true);
		
		do {try{System.out.println("Direccion(1-arriba, 2-izquierda, 3-abajo, 4-derecha):");
			pedirdireccion = sc.nextInt();
			if(pedirdireccion < 1 || pedirdireccion > 4)
			{error = true;}
			else
			{error = false;	}}
			catch(Exception err_error)
			{error=true;sc.nextLine();}
			}while(error == true);
	
		tablero.Colocarbarcos2(pedirfila, pedircolumna, 3, pedirdireccion);
		tablero.DibujarTabla2_1();
		System.out.println();
		System.out.println();
		tablero.DibujarTabla1_2();
		System.out.println();
		
		System.out.println("Barco 2");

		do {try{System.out.println("Fila:");
			pedirfila = sc.nextInt();
			if(pedirfila < 1 || pedirfila > 10)
			{error = true;}
			else
			{error = false;	}}
			catch(Exception err_error)
			{error=true;sc.nextLine();}
			}while(error == true);
	
		do {try{System.out.println("Columna:");
			pedircolumna = sc.nextInt();
			if(pedircolumna < 1 || pedircolumna > 10)
			{error = true;}
			else
			{error = false;	}}
			catch(Exception err_error)
			{error=true;sc.nextLine();}
			}while(error == true);
		
		do {try{System.out.println("Direccion(1-arriba, 2-izquierda, 3-abajo, 4-derecha):");
			pedirdireccion = sc.nextInt();
			if(pedirdireccion < 1 || pedirdireccion > 4)
			{error = true;}
			else
			{error = false;	}}
			catch(Exception err_error)
			{error=true;sc.nextLine();}
			}while(error == true);
	
		tablero.Colocarbarcos2(pedirfila, pedircolumna, 3, pedirdireccion);
		tablero.DibujarTabla2_1();
		System.out.println();
		System.out.println();
		tablero.DibujarTabla1_2();
		System.out.println();
		
		System.out.println("Coloca 1 barco de 4 casillas");

		do {try{System.out.println("Fila:");
			pedirfila = sc.nextInt();
			if(pedirfila < 1 || pedirfila > 10)
			{error = true;}
			else
			{error = false;	}}
			catch(Exception err_error)
			{error=true;sc.nextLine();}
			}while(error == true);
		
		do {try{System.out.println("Columna:");
			pedircolumna = sc.nextInt();
			if(pedircolumna < 1 || pedircolumna > 10)
			{error = true;}
			else
			{error = false;	}}
			catch(Exception err_error)
			{error=true;sc.nextLine();}
			}while(error == true);
		
		do {try{System.out.println("Direccion(1-arriba, 2-izquierda, 3-abajo, 4-derecha):");
			pedirdireccion = sc.nextInt();
			if(pedirdireccion < 1 || pedirdireccion > 4)
			{error = true;}
			else
			{error = false;	}}
			catch(Exception err_error)
			{error=true;sc.nextLine();}
			}while(error == true);
	
		tablero.Colocarbarcos2(pedirfila, pedircolumna, 4, pedirdireccion);
		tablero.DibujarTabla2_1();
		System.out.println();
		System.out.println();
		tablero.DibujarTabla1_2();
		System.out.println();
		
		System.out.println("Coloca 1 barco de 5 casillas");

		do {try{System.out.println("Fila:");
			pedirfila = sc.nextInt();
			if(pedirfila < 1 || pedirfila > 10)
			{error = true;}
			else
			{error = false;	}}
			catch(Exception err_error)
			{error=true;sc.nextLine();}
			}while(error == true);
	
		do {try{System.out.println("Columna:");
			pedircolumna = sc.nextInt();
			if(pedircolumna < 1 || pedircolumna > 10)
			{error = true;}
			else
			{error = false;	}}
			catch(Exception err_error)
			{error=true;sc.nextLine();}
			}while(error == true);
		
		do {try{System.out.println("Direccion(1-arriba, 2-izquierda, 3-abajo, 4-derecha):");
			pedirdireccion = sc.nextInt();
			if(pedirdireccion < 1 || pedirdireccion > 4)
			{error = true;}
			else
			{error = false;	}}
			catch(Exception err_error)
			{error=true;sc.nextLine();}
			}while(error == true);
	
		tablero.Colocarbarcos2(pedirfila, pedircolumna, 5, pedirdireccion);
		System.out.println();
		tablero.DibujarTabla2_1();
		System.out.println();
		System.out.println();
		tablero.DibujarTabla1_2();
		System.out.println();

			
		/****************JUEGO***************/
		//tablero.Fin1();
		//tablero.Fin2();
		
		
			do
			{
				System.out.println("PULSA ENTER PARA PASAR EL TURNO");
				sc.nextLine();sc.nextLine();
				System.out.println("Jugador 1 PULSA ENTER PARA JUGAR");
				sc.nextLine();
				//Jugador1 tira bomba
				tablero.DibujarTabla2();
				System.out.println();
				System.out.println();
				tablero.DibujarTabla1();
				System.out.println();
				System.out.println();
				System.out.println();
				System.out.println("Jugador 1. Tire una bomba");
				
				do {try{System.out.println("Fila:");
					pedirfila = sc.nextInt();
					if(pedirfila < 1 || pedirfila > 10)
					{error = true;}
					else
					{error = false;	}}
					catch(Exception err_error)
					{error=true;sc.nextLine();}
					}while(error == true);
			
				do {try{System.out.println("Columna:");
					pedircolumna = sc.nextInt();
					if(pedircolumna < 1 || pedircolumna > 10)
					{error = true;}
					else
					{error = false;	}}
					catch(Exception err_error)
					{error=true;sc.nextLine();}
					}while(error == true);
			
				tablero.TirarBomba1(pedirfila, pedircolumna);
				tablero.DibujarTabla2();
				System.out.println();
				System.out.println();
				tablero.DibujarTabla1();
				System.out.println();
			
			
			
			if(tablero.Fin1() == false)
			{

				System.out.println(" PULSA ENTER PARA PASAR EL TURNO");
				sc.nextLine();sc.nextLine();
				System.out.println("Jugador 2 PULSA ENTER PARA 	JUGAR");
				sc.nextLine();
			
				//Jugador2 Tira Bomba
				tablero.DibujarTabla2_1();
				System.out.println();
				System.out.println();
				tablero.DibujarTabla1_2();
				System.out.println();
				System.out.println();
				System.out.println();
				System.out.println("Jugador 2. Tire una bomba");
				
				do {try{System.out.println("Fila:");
					pedirfila = sc.nextInt();
					if(pedirfila < 1 || pedirfila > 10)
					{error = true;}
					else
					{error = false;	}}
					catch(Exception err_error)
					{error=true;sc.nextLine();}
					}while(error == true);
			
				do {try{System.out.println("Columna:");
					pedircolumna = sc.nextInt();
					if(pedircolumna < 1 || pedircolumna > 10)
					{error = true;}
					else
					{error = false;	}}
					catch(Exception err_error)
					{error=true;sc.nextLine();}
					}while(error == true);
				
				tablero.TirarBomba2(pedirfila, pedircolumna);
				tablero.DibujarTabla2_1();
				System.out.println();
				System.out.println();
				tablero.DibujarTabla1_2();
				System.out.println();
			}
		
					
			}while(tablero.Fin1() == false && tablero.Fin2() == false);
		
			if(tablero.Fin1() == true)
			{
				System.out.println("Gana jugador 1");
			}
			else
			{
				System.out.println("Gana jugador 2");
			}
		

	}

}



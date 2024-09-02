package hundirLaFlota.src;

public class tablero 
{

	private char	tabla1[][];
	private char	tabla2[][];
	private char	tabla1_2[][];
	private char	tabla2_1[][];
    
	public tablero(int x, int y)
	{
		this.tabla1 = new char[x][y];
		this.tabla2 = new char [x][y];
		this.tabla1_2 = new char [x][y];
		this.tabla2_1 = new char [x][y];
	}


	/******************DEFINIR FILA Y COLUMNAS*****************/
	public  int Getnumerofilas()
	{
		return this.tabla1.length;
	}
	public  int Getnumerocolumnas()
	{
		return this.tabla1[0].length;
	}
	

	/***********************DIBUJAR TABLEROS JUGADOR 1**********************/
	public void DibujarTabla2()
	{
		int x;
		int y;
		int casillero = 1;
		String casillero2 = "";
		System.out.print("    1    2    3    4    5    6    7    8    9   10");
		for(y = 0 ; y < this.Getnumerofilas(); y++)
		{
			System.out.println();
			if(casillero < 10)
			{
				casillero2 = " " + casillero;
			}
			else
			{
				casillero2= ""+casillero;
			}
			System.out.print(casillero2);
			casillero++;
			
			for(x = 0 ; x < this.Getnumerocolumnas(); x++)
			{
				if(tabla2[x][y] == '\u0000'|| tabla2[x][y] == 'x')
				{
					
					System.out.print("|   |");
				}
				else
				{
					System.out.print("| " + this.tabla2[x][y] + " |");
				}
			}	
		}	
				
	}
		
	public void DibujarTabla1()
	{
		int x;
		int y;
		int casillero = 1;
		String casillero2 = "";
		System.out.print("    1    2    3    4    5    6    7    8    9   10");
		for(y = 0 ; y < this.Getnumerofilas(); y++)
		{
			System.out.println();
			if(casillero < 10)
			{
				casillero2 = " " + casillero;
			}
			else
			{
				casillero2= ""+casillero;
			}
			System.out.print(casillero2);
			casillero++;
				
			for(x = 0 ; x < this.Getnumerocolumnas(); x++)
			{ 
				if(tabla1[x][y] == '\u0000')
				{
						
					System.out.print("|   |");
				}
				else
				{
					System.out.print("| " + this.tabla1[x][y] + " |");
				}
			}		
		}
	}
	/***********************DIBUJAR TABLEROS JUGADOR 1**********************/
	
	
	/***********************DIBUJAR TABLEROS JUGADOR 2**********************/
	public void DibujarTabla2_1()
	{
		int x;
		int y;
		int casillero = 1;
		String casillero2 = "";
		System.out.println("    1    2    3    4    5    6    7    8    9   10");
		for(y = 0 ; y < this.Getnumerofilas(); y++)
		{
			System.out.println();
			if(casillero < 10)
			{
				casillero2 = " " + casillero;
			}
			else
			{
				casillero2= ""+casillero;
			}
			System.out.print(casillero2);
			casillero++;
			
			for(x = 0 ; x < this.Getnumerocolumnas(); x++)
			{
				if(tabla2_1[x][y] == '\u0000' || tabla2_1[x][y] == 'x')
				{
					
					System.out.print("|   |");
				}
				else
				{
					System.out.print("| " + this.tabla2_1[x][y] + " |");
				}
			}	
		}	
				
	}
		
	public void DibujarTabla1_2()
	{
		int x;
		int y;
		int casillero = 1;
		String casillero2 = "";
		System.out.println("    1    2    3    4    5    6    7    8    9   10");
		for(y = 0 ; y < this.Getnumerofilas(); y++)
		{
			System.out.println();
			if(casillero < 10)
			{
				casillero2 = " " + casillero;
			}
			else
			{
				casillero2= ""+casillero;
			}
			System.out.print(casillero2);
			casillero++;
				
			for(x = 0 ; x < this.Getnumerocolumnas(); x++)
			{ 
				if(tabla1_2[x][y] == '\u0000')
				{
						
					System.out.print("|   |");
				}
				else
				{
					System.out.print("| " + this.tabla1_2[x][y] + " |");
				}
			}		
		}
	}
	/***********************DIBUJAR TABLEROS JUGADOR 2**********************/
	
	/**********************Dibujar barcos 1***********************************/
	
	public void Colocarbarcos1(int x, int y, int longitud, int direccion)
	{
		int i;
		int fila = x-1;
		int columna = y-1;
		int longitudb = longitud;
		
			switch (direccion)
		{
			case 1:
			{
				
				for(i=0; i<longitudb; i++)
				{
					while(this.tabla1[columna][fila]  == '\u0000')
					{
						this.tabla1[columna][fila] = 'x';
						this.tabla2_1[columna][fila] = 'x';
					}
					fila--;
				}
				break;
			}
			
			case 2:
			{
				for(i=0; i<longitudb; i++)
				{
					while(this.tabla1[columna][fila]  == '\u0000')
					{
						this.tabla1[columna][fila] = 'x';
						this.tabla2_1[columna][fila] = 'x';
					}
					columna--;
				}
				break;
			}
			
			case 3:
			{
				for(i=0; i<longitudb; i++)
				{
					while(this.tabla1[columna][fila]  == '\u0000')
					{
						this.tabla1[columna][fila] = 'x';
						this.tabla2_1[columna][fila] = 'x';
					}
					fila++;
				}
				break;
			}
			
			case 4:
			{
				for(i=0; i<longitudb; i++)
				{
					while(this.tabla1[columna][fila]  == '\u0000')
					{
						this.tabla1[columna][fila] = 'x';
						this.tabla2_1[columna][fila] = 'x';
					}
					columna++;
				}
				break;
			}
		}	
	}
	/**********************Dibujar barcos 1***********************************/
	
	/**********************Dibujar barcos 2***********************************/
	
	public void Colocarbarcos2(int x, int y, int longitud, int direccion)
	{
		int i;
		int fila = x-1;
		int columna = y-1;
		int longitudb = longitud;
		
			switch (direccion)
		{
			case 1:
			{
				
				for(i=0; i<longitudb; i++)
				{
					while(this.tabla1_2[columna][fila]  == '\u0000')
					{
						this.tabla1_2[columna][fila] = 'x';
						this.tabla2[columna][fila] = 'x';
					}
					fila--;
				}
				break;
			}
			
			case 2:
			{
				for(i=0; i<longitudb; i++)
				{
					while(this.tabla1_2[columna][fila]  == '\u0000')
					{
						this.tabla1_2[columna][fila] = 'x';
						this.tabla2[columna][fila] = 'x';
					}
					columna--;
				}
				break;
			}
			
			case 3:
			{
				for(i=0; i<longitudb; i++)
				{
					while(this.tabla1_2[columna][fila]  == '\u0000')
					{
						this.tabla1_2[columna][fila] = 'x';
						this.tabla2[columna][fila] = 'x';
					}
					fila++;
				}
				break;
			}
			
			case 4:
			{
				for(i=0; i<longitudb; i++)
				{
					while(this.tabla1_2[columna][fila]  == '\u0000')
					{
						this.tabla1_2[columna][fila] = 'x';
						this.tabla2[columna][fila] = 'x';
					}
					columna++;
				}
				break;
			}
		}
	}
	/**********************Dibujar barcos 2***********************************/
	
	
	/**********************Tirar bomba1***********************************/
	public void TirarBomba1(int x, int y)
	{
		if(this.tabla2[y-1][x-1] == 'X' || this.tabla2[y-1][x-1] == 'o')
		{
			System.out.println("Ya bombardeaste esa casilla! Suerte a la praxima ;)");
		}
		else
		{
			if(this.tabla2[y-1][x-1] == 'x')
			{
				System.out.println("Tocado!");
				this.tabla2[y-1][x-1] = 'X';
				this.tabla1_2[y-1][x-1] = 'T';
			}
			else
			{
				System.out.println("Agua!");
				this.tabla2[y-1][x-1] = 'o';
				this.tabla1_2[y-1][x-1] = 'O';
			}
		}
	}
	/**********************Tirar bomba1***********************************/
	
	/**********************Tirar bomba2***********************************/
	public void TirarBomba2(int x, int y)
	{
		if(this.tabla2_1[y-1][x-1] == 'X' || this.tabla2_1[y-1][x-1] == 'o')
		{
			System.out.println("Ya bombardeaste esa casilla! Suerte a la praxima ;)");
		}
		else
		{
			if(this.tabla2_1[y-1][x-1] == 'x')
			{
				System.out.println("Tocado!");
				this.tabla2_1[y-1][x-1] = 'X';
				this.tabla1[y-1][x-1] = 'T';
			}
			else
			{
				System.out.println("Agua!");
				this.tabla2_1[y-1][x-1] = 'o';
				this.tabla1[y-1][x-1] = 'O';
			}
		}
	}
	/**********************Tirar bomba2***********************************/
	
	/**********************FIN DE JUEGO***********************************/
	public boolean Fin1()
	{
		boolean fin = false;
		int contador = 0;
		int x;
		int y;
		
		for(x=0; x < this.Getnumerofilas(); x++)
		{
			for(y=0; y < this.Getnumerocolumnas(); y++)
			{
				if(this.tabla2[x][y] == 'X')
				{
					contador++;
				}
			}
			
			if(contador >= 19)
			{
				fin = true;
			}
			else
			{
				fin = false;
			}
		}
		
		
		return fin;
	}
	
	public boolean Fin2()
	{
		boolean fin = false;
		int contador = 0;
		int x;
		int y;
		
		for(x=0; x < this.Getnumerofilas(); x++)
		{
			for(y=0; y < this.Getnumerocolumnas(); y++)
			{
				if(this.tabla2_1[x][y] == 'X')
				{
					contador++;
				}
			}
			
			if(contador >= 19)
			{
				fin = true;
			}
			else
			{
				fin = false;
			}
		}
		
		
		return fin;
	}
	/*************************************************************************/
	/*************************************************************************/
	/*****************************Explicacion****************/
	public void Explicacion()
	{
		System.out.println("BIENVENIDOS AL HUNDIR LA FLOTA!");
		System.out.println("En la consola se monstraran 2 tablas,en la tabla de abajo");
		System.out.println("se mostrara tus barcos representados con x y la jugada que haya realizado el contario");
		System.out.println("una T si te ha tocado un barco (reemplaza una de tus x por T) o una O si");
		System.out.println("ha bombardeado el agua");
		System.out.println("En la de arriba se mostrara la zona que has bombardeado del rival con");
		System.out.println("X si le has tocado o con 'o' si diste al agua");
		System.out.println("Si eliges una casilla que ya hayas bombardeado perderás el turno, asi que cuidado");
		System.out.println("Para colocar los barcos debes escoger una casilla y darle una direccion para ");
		System.out.println("orientar al barco, la consola te avisara de que longitud es el barco que");
		System.out.println("estas colocando. Es importante evitar que los barcos se crucen (el juego esta incompelto)");
		System.out.println("Por eso hay que pensar antes la colocacion de los barcos, casilla y direccion, ten en cuenta");
		System.out.println(" que no puedes colocar un barco de 5 de longitud en la casilla 9,9 orientado a la derecha ya");
		System.out.println(" que se saldria de la cuadricula");
		System.out.println("una vez hayas terminado tu turno y empieze el del rival, no se permitira ver la pantalla");
		System.out.println("ya que estarias viendo los barcos del rival mientras juega y seria trampas");
		System.out.println("A disfrutar?!! :)");
		System.out.println();
	}
	
	
}




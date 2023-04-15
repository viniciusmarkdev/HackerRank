package Exerc�cios;

public class BrutterForceSolutionArray1Dgame {
	
	public static boolean canWin(int[] array, int leap){
       
		
		//Array devalores booleanos
        boolean[] attPosition = new boolean[array.length];
        
        //Se a celula tiver o valor de 1 o jogo n�o pode continuar	
        if(array[0]==1){
           
        	return false;
        	
        }else{
        	//A primeira celula � alcan�avel
        	
            attPosition[0] = true;
        }
        
        //Loop para percorrer o array
        for (int i= 0; i<array.length;i++){

        	
            if(array[i] == 0){
                //se chegarmos a esta c�lula, podemos us�-la 
            	//como um come�o e ver quais c�lulas podemos alcan�ar a partir dela.
            	
                if(attPosition[i]){
                   
                	int i1 = (i > leap) ? i - leap : 0;
                  
                    /*
                     * 
                     * indo para tr�s um passo de cada vez se encontrarmos uma c�lula com zero marcamos 
                     * como alcan��vel e ao mesmo tempo a usamos e pulamos uma cabe�a com um salto e se encontrar
                     * igual a zero marcamos como alcan��vel
                     * ,paramos em primeira c�lula com valor 1 ou na primeira c�lula que nos permite sair do jogo
                     * 
                     */
                    for (int j = i; j > i1; j--){
                    	
                        if(array[j] == 0) {
                        	
                            attPosition[j] = true;
                            
                            if(j+leap >=array.length ) {
                            	
                            	return true;
                            	
                            }
                            else if (array[j+leap]==0){
                                attPosition[j+leap] = true;
                            }
                        }else {
                            break;
                        }
                    }
                    int i2 = (i+leap + 2 < array.length)? i+leap+2: array.length;
                    /* We do the same thing as previous but going forward and for each position we try a leap and see if we could exit the game
                     ** we stop at the first cell with a value of 1 or the first cell that allow us to exit the game
                     */
                    for (int j = i; j < i2;j++){
                        if(array[j] == 0){
                            attPosition[j] = true;
                            if(j+leap >=array.length ) return true;
                            else if (array[j+leap]==0){
                                attPosition[j+leap] = true;
                            }
                        }else {
                            break;
                        }
                    }
                    if (i == array.length-1) return true;
                }
            }
        }
        // if we didn't exit the array successfully then we can't win the game
        return false;
    }
}

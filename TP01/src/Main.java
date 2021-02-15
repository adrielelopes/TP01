
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		int continuar;
		Scanner input = new Scanner(System.in);
		
		double[] jan = new double [31];
		double[] fev = new double [28];
		double[] mar = new double [31];
		double[] abr = new double [30];
		double[] mai = new double [31];
		double[] jun = new double [30];
		double[] jul = new double [31];
		double[] ago = new double [31];
		double[] set = new double [30];
		double[] out = new double [31];
		double[] nov = new double [30];
		double[] dez = new double [31];


		do {
			// Menu de opções 
			System.out.println("MENU");
			System.out.println("1. Entrada das temperaturas");
			System.out.println("2. Cálculo da temperatura média");
			System.out.println("3. Cálculo da temperatura mínima");
			System.out.println("4. Cálculo da temperatura máxima");
			System.out.println("5. Relatório meteorológico");
	
			// Ler escolha do menu de opções e guardar em um char
			char escolha = input.next().charAt(0);
			System.out.println(escolha);
			
			//Ler o mês e ano escolhidos
		    System.out.println("Digite o mês:");
		    int mes = input.nextInt();
			System.out.println("Digite o ano:");
			int ano = input.nextInt(); 
		    
			switch (escolha) {
				case '1':
				//chamar função 1
					System.out.println("***Entrada das Temperaturas***");
            		double soma = 0;
            		double media = 0;
            		double tmin = 10000;
            		double tmax = 0;
            		int i;
            		
            	if (mes == 1) {
            		for (i = 0; i < jan.length; i++){
            		       System.out.println("Dia " + (i+1));
            		       jan[i] = i + 3; //Casos de teste 
            		       System.out.println(jan[i]);
            		       soma = soma + jan[i];
            		       media = soma/jan.length; 
            		       if (jan[i] < tmin) {
            		           tmin = jan[i];
            		       }
            		       if (jan[i] > tmax) {
            		           tmax = jan[i];
            		       }
            		}
                    System.out.println("Ok, todos os dias foram preenchidos! ");					
            		System.out.println("A media é: " + media);
            		System.out.println("A temperatura mínima foi: " + tmin);
            		System.out.println("A temperatura máxima foi: " + tmax);
            		System.out.println(" ");
            				break;
            		    
            	}
            	
            	if (mes == 2) {
            		for (i = 0; i < fev.length; i++){
            		       System.out.println("Dia " + (i+1));
            		       fev[i] = input.nextDouble();
            		       soma = soma + fev[i];
            		       media = soma/fev.length; 
            		       if (fev[i] < tmin) {
            		           tmin = fev[i];
            		       }
            		       if (fev[i] > tmax) {
            		           tmax = fev[i];
            		       }
            		}
                    System.out.println("Ok, todos os dias foram preenchidos! ");					
            		System.out.println("A media é: " + media);
            		System.out.println("A temperatura mínima foi: " + tmin);
            		System.out.println("A temperatura máxima foi: " + tmax);
            		System.out.println(" ");
            				break;
            		    
            	}
            	
            	if (mes == 3) {
            		for (i = 0; i < mar.length; i++){
            		       System.out.println("Dia " + (i+1));
            		       mar[i] = input.nextDouble();
            		       soma = soma + mar[i];
            		       media = soma/mar.length; 
            		       if (mar[i] < tmin) {
            		           tmin = mar[i];
            		       }
            		       if (mar[i] > tmax) {
            		           tmax = mar[i];
            		       }
            		}
                    System.out.println("Ok, todos os dias foram preenchidos! ");					
            		System.out.println("A media é: " + media);
            		System.out.println("A temperatura mínima foi: " + tmin);
            		System.out.println("A temperatura máxima foi: " + tmax);
            		System.out.println(" ");
            				break;
            		    
            	}
            	
            	if (mes == 4) {
            		for (i = 0; i < abr.length; i++){
            		       System.out.println("Dia " + (i+1));
            		       abr[i] = input.nextDouble();
            		       soma = soma + abr[i];
            		       media = soma/abr.length; 
            		       if (abr[i] < tmin) {
            		           tmin = abr[i];
            		       }
            		       if (abr[i] > tmax) {
            		           tmax = abr[i];
            		       }
            		}
                    System.out.println("Ok, todos os dias foram preenchidos! ");					
            		System.out.println("A media é: " + media);
            		System.out.println("A temperatura mínima foi: " + tmin);
            		System.out.println("A temperatura máxima foi: " + tmax);
            		System.out.println(" ");
            				break;
            		    
            	}
            	
        	
        	if (mes == 5) {
        		for (i = 0; i < mai.length; i++){
        		       System.out.println("Dia " + (i+1));
        		       mai[i] = input.nextDouble();
        		       soma = soma + mai[i];
        		       media = soma/mai.length; 
        		       if (mai[i] < tmin) {
        		           tmin = mai[i];
        		       }
        		       if (mai[i] > tmax) {
        		           tmax = mai[i];
        		       }
        		}
                System.out.println("Ok, todos os dias foram preenchidos! ");					
        		System.out.println("A media é: " + media);
        		System.out.println("A temperatura mínima foi: " + tmin);
        		System.out.println("A temperatura máxima foi: " + tmax);
        		System.out.println(" ");
        				break;
        		    
        	}
        	
        	if (mes == 6) {
        		for (i = 0; i < jun.length; i++){
        		       System.out.println("Dia " + (i+1));
        		       jun[i] = input.nextDouble();
        		       soma = soma + jun[i];
        		       media = soma/jun.length; 
        		       if (jun[i] < tmin) {
        		           tmin = jun[i];
        		       }
        		       if (jun[i] > tmax) {
        		           tmax = jun[i];
        		       }
        		}
                System.out.println("Ok, todos os dias foram preenchidos! ");					
        		System.out.println("A media é: " + media);
        		System.out.println("A temperatura mínima foi: " + tmin);
        		System.out.println("A temperatura máxima foi: " + tmax);
        		System.out.println(" ");
        				break;
        		    
        	}
        	
        	if (mes == 7) {
        		for (i = 0; i < jul.length; i++){
        		       System.out.println("Dia " + (i+1));
        		       jul[i] = input.nextDouble();
        		       soma = soma + jul[i];
        		       media = soma/jul.length; 
        		       if (jul[i] < tmin) {
        		           tmin = jul[i];
        		       }
        		       if (jul[i] > tmax) {
        		           tmax = jul[i];
        		       }
        		}
                System.out.println("Ok, todos os dias foram preenchidos! ");					
        		System.out.println("A media é: " + media);
        		System.out.println("A temperatura mínima foi: " + tmin);
        		System.out.println("A temperatura máxima foi: " + tmax);
        		System.out.println(" ");
        				break;
        		    
        	}
        	
        	if (mes == 8) {
        		for (i = 0; i < ago.length; i++){
        		       System.out.println("Dia " + (i+1));
        		       ago[i] = input.nextDouble();
        		       soma = soma + ago[i];
        		       media = soma/ago.length; 
        		       if (ago[i] < tmin) {
        		           tmin = ago[i];
        		       }
        		       if (ago[i] > tmax) {
        		           tmax = ago[i];
        		       }
        		}
                System.out.println("Ok, todos os dias foram preenchidos! ");					
        		System.out.println("A media é: " + media);
        		System.out.println("A temperatura mínima foi: " + tmin);
        		System.out.println("A temperatura máxima foi: " + tmax);
        		System.out.println(" ");
        				break;
        		    
        	}
        	
        	if (mes == 9) {
        		for (i = 0; i < set.length; i++){
        		       System.out.println("Dia " + (i+1));
        		       set[i] = input.nextDouble();
        		       soma = soma + set[i];
        		       media = soma/set.length; 
        		       if (set[i] < tmin) {
        		           tmin = set[i];
        		       }
        		       if (set[i] > tmax) {
        		           tmax = set[i];
        		       }
        		}
                System.out.println("Ok, todos os dias foram preenchidos! ");					
        		System.out.println("A media é: " + media);
        		System.out.println("A temperatura mínima foi: " + tmin);
        		System.out.println("A temperatura máxima foi: " + tmax);
        		System.out.println(" ");
        				break;
        		    
        	}
        	
        	if (mes == 10) {
        		for (i = 0; i < out.length; i++){
        		       System.out.println("Dia " + (i+1));
        		       out[i] = input.nextDouble();
        		       soma = soma + out[i];
        		       media = soma/out.length; 
        		       if (out[i] < tmin) {
        		           tmin = out[i];
        		       }
        		       if (out[i] > tmax) {
        		           tmax = out[i];
        		       }
        		}
                System.out.println("Ok, todos os dias foram preenchidos! ");					
        		System.out.println("A media é: " + media);
        		System.out.println("A temperatura mínima foi: " + tmin);
        		System.out.println("A temperatura máxima foi: " + tmax);
        		System.out.println(" ");
        				break;
        		    
        	}
        	
        	
        	if (mes == 11) {
        		for (i = 0; i < nov.length; i++){
        		       System.out.println("Dia " + (i+1));
        		       nov[i] = input.nextDouble();
        		       soma = soma + nov[i];
        		       media = soma/nov.length; 
        		       if (nov[i] < tmin) {
        		           tmin = nov[i];
        		       }
        		       if (nov[i] > tmax) {
        		           tmax = nov[i];
        		       }
        		}
                System.out.println("Ok, todos os dias foram preenchidos! ");					
        		System.out.println("A media é: " + media);
        		System.out.println("A temperatura mínima foi: " + tmin);
        		System.out.println("A temperatura máxima foi: " + tmax);
        		System.out.println(" ");
        				break;
        		    
        	}
        	
        	
        	if (mes == 12) {
        		for (i = 0; i < dez.length; i++){
        		       System.out.println("Dia " + (i+1));
        		       dez[i] = input.nextDouble();
        		       soma = soma + dez[i];
        		       media = soma/dez.length; 
        		       if (dez[i] < tmin) {
        		           tmin = dez[i];
        		       }
        		       if (dez[i] > tmax) {
        		           tmax = dez[i];
        		       }
        		}
                System.out.println("Ok, todos os dias foram preenchidos! ");					
        		System.out.println("A media é: " + media);
        		System.out.println("A temperatura mínima foi: " + tmin);
        		System.out.println("A temperatura máxima foi: " + tmax);
        		System.out.println(" ");
        				break;
        		    
        	}
				case '2':
				//chamar função 2
					System.out.println("****Cálculo da temperatura média***");
					
				break;
				
				case '3':
				//chamar função 3
					System.out.println("***Cálculo da temperatura mínima***");
					
				break;
				
				case '4':
				//chamar função 4
					System.out.println("***Cálculo da temperatura máxima***");
					
				break;
				
				case '5':
				//chamar função 5
					System.out.println("Relatório meteorológico");
	
				break;
	
				default:
				System.out.println("Opção inválida!");
		}
		
		//Condição para continuar o programa ou sair
		System.out.println("Deseja continuar?");
		System.out.println("1. Sim\n2. Não");
		int conti = input.nextInt(); 
		continuar = conti;
			if (continuar == 2) {
				System.exit(0);
			}
	} while(continuar == 1); 
	
	
	
	
    // Função para retornar a temperatura média do mês e ano escolhido
	/*
	    public static void mediaTemperatura(double[]data) {
    	    double soma = 0;
            double media = 0;
    	    int i; 
    	    
    	    for (i = 0; i < vetor.length; i++){
                soma = soma + vetor[i];
                media = soma/vetor.length;
    	    }
	
	        System.out.println("A media é: " + media);
	    }
	
	*/
	}	



}
		
	














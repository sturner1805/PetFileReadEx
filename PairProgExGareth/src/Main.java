public class Main {

	static String a = "101010";
    static char [] arr = a.toCharArray();

    public static void main(String[]args){
    	writeLines(3, 6);
    }   

    	public static void writeLines(int height, int width){
    		horizontal(width);
    		for (int i = 0; i < height; i++){
    			if (i%2 == 0){
    				vertical(width);
    				horizontalReverse(width);
    			}else{
    				verticalReverse(width);
    				horizontal(width);
    			}
    		}
    	}

    	public static void horizontal(int width){
    		for(int i=0 ; i < arr.length ; i++){
    			System.out.print(arr[i]+" ");
    		}
    		for (int i=1 ; i < width ; i++){
    			if(i%2 != 0){
    				for (int j=arr.length-2 ; j >=0 ; j--){
    					System.out.print(arr[j]+" ");
    				}	
    			}else{
                	for (int j = 1; j < arr.length ; j++){
                		System.out.print(arr[j]+" ");
                	}
            	}
    		}
    		System.out.println();
    	}

    public static void horizontalReverse(int width){
        for(int i=arr.length - 1 ; i >= 0 ; i--){
            System.out.print(arr[i]+" ");
        }
        for (int i=1 ; i < width ; i++){
            if(i%2 == 0){
            	for (int j=arr.length-2 ; j >=0 ; j--){
            		System.out.print(arr[j]+" ");
            	}
            }else{
            	for (int j = 1; j < arr.length ; j++){
                    System.out.print(arr[j]+" ");
                }
            }
        }
        System.out.println();
    }

    public static void vertical(int width){
        String whiteSpace = " ";
        for(int i = 0 ; i < (arr.length -2) *2 ; i++){
            whiteSpace += " ";
        }
        for(int i = 1 ; i < arr.length - 1 ; i++){
            System.out.print(arr[i]);
            for (int j = 1 ; j < width + 1 ; j++){
                if(j%2 != 0){
                    System.out.print(whiteSpace + arr[(arr.length - i - 1)]);
                }else{
                    System.out.print(whiteSpace + arr[(i)]);
                }
            }
            System.out.println();
        }
    }

    public static void verticalReverse(int width){
        String whiteSpace = " ";
        for(int i = 0 ; i < (arr.length -2) *2 ; i++){
            whiteSpace += " ";
        }
        for(int i = 1 ; i < arr.length - 1 ; i++){
            System.out.print(arr[arr.length - i - 1]);
            for (int j = 1 ; j < width + 1 ; j++){
                if(j%2 == 0){
                    System.out.print(whiteSpace + arr[(arr.length - i - 1)]);
                }else{
                    System.out.print(whiteSpace + arr[(i)]);
                }
            }
            System.out.println();
        }
    }
}
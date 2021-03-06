//U10416022
public class BubbleSort{
	//data fields
	int[] bubble = new int[7];	
	//constructor
	BubbleSort(int[] bubble){
		this.bubble = bubble;
		setBubbleSort();
		setPrint();
	}
	
	//put the numbers in sequence 
	int X;
	public void setBubbleSort(){
		for(int i = 1; i < bubble.length; i++){
			for(int j = 0; j < bubble.length - i; j++){
				if(bubble[j] > bubble[j + 1]){
					X = bubble[j];
					bubble[j] = bubble[j + 1];
					bubble[j + 1] = X;
				}
			}
		}
	}
	
	//print out the result
	public void setPrint(){
		System.out.println("after bubble sort :");
		for(int i = 0; i < bubble.length; i++){
			System.out.print(bubble[i] + " ");
		}
	}
}

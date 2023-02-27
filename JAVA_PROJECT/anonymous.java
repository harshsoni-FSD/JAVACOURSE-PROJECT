// class Calc{

//     public int add(int nums[]){
//         int result=0;
//         for(int a:nums){
//             result=result+a;

//         }
//         return result;
//     }
// }

// public class anonymous {
//     public static void main(String[] args) {
//         Calc obj = new Calc();
//         int result = obj.add(new int[]{4,5,6,7});
//         System.out.println(result);
//     }
// }
// Anonymous Array:
class Demo 

    {

        public static void main(String args[])

        {

             int arr[] = {1, 2, 3, 4, 5};

            for ( int i = 0; i < arr.length - 2; ++i)

                 System.out.println(arr[i] + " ");

        } 

     }

class abs
{
 	public int add(int nums[])
	{
		int result=0;
		for(int n:nums)
		{
			result=result+n;
		}
		return result;
	}
}

public class anonymous{
	public static void main(String[] args){

	abs obj= new abs();
	int result=obj.add(new int[]{5,2,3,7,8,2});
	System.out.println(result);
	}
}





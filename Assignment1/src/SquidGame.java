import java.util.ArrayList;
public class SquidGame
{
    static ArrayList<ArrayList<Integer>> AllPossibleSubsets = new ArrayList<ArrayList<Integer>>();
    static ArrayList<Integer> Partition = new ArrayList<Integer>();
    
    
    static void AllPossibleSubsets(int n,int Start , int k)
    {
        if (k == 0) {
            AllPossibleSubsets.add(new ArrayList<>(Partition));
            return;
        }
        for (int i = Start; i <=n; i++)
        {
            Partition.add(i);
            AllPossibleSubsets(n, i+1 , k-1 );
            // System.out.print(Partition+" ");
            //Partition.clear();
            //Partition.removeAll(Partition);
            Partition.remove(Partition.size()-1);
            //System.out.print(Partition+" ");
        }
    }

    public static int CalculaterestofArray(int l[], int Start, int End)
    {
    	   int sum=0;
           int i = Start;
           int n=End;
           while (i<=n) {
           	 sum+=l[i];
           	 i++;
           }
           return sum;
    }

    public static String naive (int k,int []l) {
        int n = l.length;
        AllPossibleSubsets(n - 2, 0 , k - 1);

        int pos = 0 ;
        int res = 10000 ;
        for (int j = 0; j < AllPossibleSubsets.size(); j++) {
            ArrayList<Integer> temp = new ArrayList<Integer>();
            temp=AllPossibleSubsets.get(j);
            int sum = 0 ;
            int low = 0 ;
            int max = 0 ;
            for(int i = 0 ;  i<temp.size();i++) {
                int high = temp.get(i);
                sum = CalculaterestofArray(l,low,high);
                max = Math.max(max, sum);
                low = high+1 ;
            }
            
            sum = CalculaterestofArray(l,low,n-1);
            //System.out.print(sum+" ");
            max = Math.max(max,sum);
            if(max<=res) {
                res = max;
                pos = j;
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append(res);
        int j = 0 ;
        for(int i = 0 ; i<AllPossibleSubsets.get(pos).size();i++){
            int divide = AllPossibleSubsets.get(pos).get(i);
            sb.append(';');
            sb.append(l[j]);
            j++;
            while(j<=divide) {
                sb.append(',');
                sb.append(l[j]);
                j++;
            }
        }
        sb.append(';');
        while(j<n){
            sb.append(l[j]);
            if(j!=n-1)
                sb.append(',');
            j++;

        }
        AllPossibleSubsets = new ArrayList<>();
        Partition = new ArrayList<>();

        return sb.toString();
    }
    public static String efficient (int k, int[] l) {
    	int n=l.length;
    	int MinMax=MinMaxHelper(l,n,k);
        StringBuilder sb = new StringBuilder();
        sb.append(MinMax);
        sb.append(";");
    	if(k==n) {
    		for(int i = 0 ; i<n-1;i++) {
    			sb.append(l[i]);
    			sb.append(";");
    		}
    		sb.append(l[n-1]);
    	}
    	else {
    		int sum =0;
    		for (int e = 0 ; e<n-1;e++) {
    			sum+=l[e];
    			if (sum<MinMax) {
    				sb.append(l[e]);
    				if ((sum+l[e+1])<=MinMax) {
    					sb.append(",");
    				}
    				else if ((sum+l[e+1])>MinMax) {
    					sb.append(";");
    					sum=0;
    				}
    				else 
    					sb.append(";");
    			}
    			 else if (sum==MinMax) {
    				sb.append(l[e]);
    				sb.append(";");
    				sum=0;
    			    }
    	   
    	}
    		sb.append(l[n-1]);
    	}
    	return sb.toString();
    }
    static int MinMaxHelper(int[] l,int n, int k)
    {
        int EfficientArray[][] = new int[k+1][n+1];
        int M = 1;
        while(M<=n) {
            EfficientArray[1][M] = CalculaterestofArray(l, 0, M - 1);
            M++;
        }
        int K=1;
        while(K<=k) {
        	  EfficientArray[K][1] = l[0];
        	  K++;
        }
        for (int i = 2; i <= k; i++) { 
            for (int j = 2; j <= n; j++) {
                int MinMax = Integer.MAX_VALUE;
                for (int p = 1; p <= j; p++)
                    MinMax = GetMin(MinMax, Math.max(EfficientArray[i - 1][p],
                    		CalculaterestofArray(l, p, j - 1)));
                EfficientArray[i][j] = MinMax;
            }
        }
        return EfficientArray[k][n];
    }
    
    static int GetMin(int n1, int n2) {
    	int MinMax=Integer.MAX_VALUE;
    	if (n1<n2) {
    		MinMax=n1;
    	}
    	else if (n2<n1) {
    		MinMax=n2;
    	}
    	else {
    		MinMax=n1;
    	}
    	return MinMax;
    }
  
    public static void main(String[] args)
    {
        int k =3;
        int []l= {10,10,10,10};
        System.out.println(naive(k,l));
        System.out.print(efficient(k,l));
    }
}
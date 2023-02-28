import static org.junit.Assert.*;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)

public class SquidGameTests {
	
	int k1 = 1 ; 
	int[] l1 = {100,100,100,100}; 
	int k2 = 3 ;
	int [] l2 = {50,30,10,20,35,25,30,15,20,30,48,77,15,20,20};
	int k3 = 6 ;
	int [] l3 = {120,130,140,50,45,10,290,350,850,200,340,305,275,300,400,400,400,500,500,230,30,55,49,200,700};
	int k4 = 8 ;
	int [] l4 = {13,25,36,67,87,54,23,44,68,23,98,45,76,77,27,44,34,34,78,99,72,74,22,10,9,34,99,10,33,39};
	int k5 = 5 ; 
	int []l5 = {15,13,30,97,79,29,16,95,47,20,19,3,98,94,47,58,69,78,91,14,34,99,76,1,25,11,40,0,52,13};
	int k6 = 20 ; 
	int [] l6 = {38,171,191,197,160,177,143,30,25,11,12,5,78,180,53,17,109,134,122,183};
	int k7 = 9 ;
	int [] l7 = {281,50,120,252,152,17,87,123,141,141,93,73,137,128,181,192,106,240}; 
	int k8 = 7; 
	int [] l8 = {189,219,104,247,258,191,219,20,274,10,17,262,110,247,148,211,210,167,178,266,105,296,158,176,84,157,178,165,142,31,230,251,285,8,218,237,9,298,79,29};
	int k9 = 10 ;
	int [] l9 = {277,123,266,157,34,131,112,89,49,219,178,91,247,268,201,200,40,30,95,292,233,259,93,47,177,92,217,185,161,131};
	int k10 = 10 ;
	int [] l10 = {100,200,150,200,350,400,400,750,300,350,600,660,800,200,200,200,200,200,100,550,900,800,200,150,250,130,200,400,350,600};
	int k11 = 35 ;
	int [] l11 = {175,4,116,150,121,50,108,14,163,115,33,45,99,44,186,123,56,17,170,110,132,25,189,65,6,183,102,171,12,27,46,100,2,136,27,90,57,94,163,114,95,31,107,155,118,95,120,36,4,12,145,21,143,181,183,50,34,183,194,164,121,163,26,34,93,91,151,78,76,99,21,66,64,84,87,40,82,83,135,1,163,25,143,197,119,156,183,169,118,82,155,7,88,173,24,23,181,170,107,99,78,148,63,73,139,61,81,177,194,29,49,190,121,131,71,58,184,104,160,89,110,163,156,80,198,143,117,102,189,144,21,160,27,100,20,51,36,175,125,122,138,167,76,56,97,63,143,63,190,142};
	int k12 = 50 ; 
	int [] l12 = {66,193,110,125,194,94,166,32,67,121,102,24,21,82,121,153,64,174,17,115,55,193,140,17,199,137,62,151,118,25,183,47,167,166,61,152,98,74,44,108,39,66,130,13,171,14,120,155,147,13,130,124,197,195,111,81,15,64,91,8,23,93,10,139,185,174,160,133,167,62,164,188,42,116,51,160,159,57,168,22,173,82,137,129,51,96,149,118,167,113,97,114,0,42,98,42,149,68,156,54,30,153,33,60,192,17,86,181,39,133,159,85,155,79,139,76,45,36,58,20,179,55,10,63,71,12,193,199,142,125,53,121,4,12,95,199,108,198,7,88,165,144,8,142,73,65,116,179,119,188,162,121,160,136,91,21,22,181,37,159,57,198,167,9,171,93,19,161,43,71,33,77,159,134,120,194,50,141,31,137,13,163,162,23,25,143,32,175,83,44,57,62,161,81,69,2,17,184,136,144};
 	
	String s1 = "400;100,100,100,100" ;
	String s2 = "168;50,30,10,20,35;25,30,15,20,30,48;77,15,20,20" ;
	String s3 = "1230;120,130,140,50,45,10,290,350;850,200;340,305,275,300;400,400,400;500,500,230;30,55,49,200,700" ;
	String s4 = "215;13,25,36,67;87,54,23,44;68,23,98;45,76,77;27,44,34,34;78,99;72,74,22,10,9;34,99,10,33,39";
	String s5 = "316;15,13,30,97,79,29,16;95,47,20,19,3,98;94,47,58,69;78,91,14,34,99;76,1,25,11,40,0,52,13";
	String s6 = "197;38;171;191;197;160;177;143;30;25;11;12;5;78;180;53;17;109;134;122;183";
	String s7 = "372;281,50;120,252;152,17,87;123,141;141,93,73;137,128;181;192,106;240";
	String s8 = "1017;189,219,104,247,258;191,219,20,274,10,17,262;110,247,148,211,210;167,178,266,105,296;158,176,84,157,178,165;142,31,230,251,285,8;218,237,9,298,79,29";
	String s9 = "566;277,123;266,157;34,131,112,89,49;219,178,91;247,268;201,200,40,30,95;292,233;259,93,47;177,92,217;185,161,131";
	String s10 = "1400;100,200,150,200,350,400;400,750;300,350,600;660;800,200,200,200;200,200,100,550;900;800,200,150,250;130,200,400,350;600";
	String s11 = "508;175,4,116;150,121,50,108,14;163,115,33,45,99;44,186,123,56,17;170,110,132,25;189,65,6,183;102,171,12,27,46,100;2,136,27,90,57,94;163,114,95,31;107,155,118,95;120,36,4,12,145,21,143;181,183,50,34;183,194;164,121,163,26;34,93,91,151,78;76,99,21,66,64,84,87;40,82,83,135,1,163;25,143,197,119;156,183,169;118,82,155,7,88;173,24,23,181;170,107,99,78;148,63,73,139,61;81,177,194,29;49,190,121,131;71,58,184,104;160,89,110;163,156,80;198,143,117;102,189,144,21;160,27,100,20,51,36;175,125,122;138,167,76,56;97,63,143,63;190,142";
	String s12 = "468;66,193,110;125,194,94;166,32,67,121;102,24,21,82,121;153,64,174,17;115,55,193;140,17,199;137,62,151,118;25,183,47,167;166,61,152;98,74,44,108,39,66;130,13,171,14,120;155,147,13,130;124,197;195,111,81,15,64;91,8,23,93,10,139;185,174;160,133,167;62,164,188,42;116,51,160;159,57,168,22;173,82,137;129,51,96,149;118,167,113;97,114,0,42,98,42;149,68,156,54,30;153,33,60,192,17;86,181,39,133;159,85,155;79,139,76,45,36,58,20;179,55,10,63,71,12;193,199;142,125,53,121,4,12;95,199,108;198,7,88,165;144,8,142,73,65;116,179,119;188,162;121,160,136;91,21,22,181,37;159,57,198;167,9,171,93,19;161,43,71,33,77;159,134,120;194,50,141,31;137,13,163;162,23,25,143,32;175,83,44,57,62;161,81,69,2,17;184,136,144";
	
	@Test
	public void testn1() throws Exception {
		String solution = SquidGame.naive(k1,l1);
		solution = solution.replace(" ", "");
		assertTrue("The output partitions do not lead to optimal solution", checkSolution(k1,l1, solution,s1));
	}
	
	@Test
	public void testn2() throws Exception {
		String solution = SquidGame.naive(k2,l2);
		solution = solution.replace(" ", "");
		assertTrue("The output partitions do not lead to optimal solution", checkSolution(k2,l2, solution,s2));
	}

	@Test
	public void testn3() throws Exception {
		String solution = SquidGame.naive(k3,l3);
		solution = solution.replace(" ", "");
		assertTrue("The output partitions do not lead to optimal solution", checkSolution(k3,l3, solution,s3));
	}

	@Test
	public void testn4() throws Exception {
		String solution = SquidGame.naive(k4,l4);
		solution = solution.replace(" ", "");
		assertTrue("The output partitions do not lead to optimal solution", checkSolution(k4,l4, solution,s4));
	}

	@Test
	public void testn5() throws Exception {
		String solution = SquidGame.naive(k5,l5);
		solution = solution.replace(" ", "");
		assertTrue("The output partitions do not lead to optimal solution", checkSolution(k5,l5, solution,s5));
	}

	@Test
	public void testn6() throws Exception {
		String solution = SquidGame.naive(k6,l6);
		solution = solution.replace(" ", "");
		assertTrue("The output partitions do not lead to optimal solution", checkSolution(k6,l6, solution,s6));
	}

	@Test
	public void testn7() throws Exception {
		String solution = SquidGame.naive(k7,l7);
		solution = solution.replace(" ", "");
		assertTrue("The output partitions do not lead to optimal solution", checkSolution(k7,l7, solution,s7));
	}

	@Test
	public void testn8() throws Exception {
		String solution = SquidGame.naive(k8,l8);
		solution = solution.replace(" ", "");
		assertTrue("The output partitions do not lead to optimal solution", checkSolution(k8,l8, solution,s8));
	}
	
	@Test
	public void testn9() throws Exception {
		String solution = SquidGame.naive(k9,l9);
		solution = solution.replace(" ", "");
		assertTrue("The output partitions do not lead to optimal solution", checkSolution(k9,l9, solution,s9));
	}
	
	@Test
	public void testn10() throws Exception {
		String solution = SquidGame.naive(k10,l10);
		solution = solution.replace(" ", "");
		assertTrue("The output partitions do not lead to optimal solution", checkSolution(k10,l10, solution,s10));
	}

	@Test(timeout = 100)
	public void teste1() throws Exception {
		String solution = SquidGame.efficient(k1,l1);
		solution = solution.replace(" ", "");
		assertTrue("The output partitions do not lead to optimal solution", checkSolution(k1,l1, solution,s1));
	}

	@Test(timeout = 100)
	public void teste2() throws Exception {
		String solution = SquidGame.efficient(k2,l2);
		solution = solution.replace(" ", "");
		assertTrue("The output partitions do not lead to optimal solution", checkSolution(k2,l2, solution,s2));
	}

	@Test(timeout = 100)
	public void teste3() throws Exception {
		String solution = SquidGame.efficient(k3,l3);
		solution = solution.replace(" ", "");
		assertTrue("The output partitions do not lead to optimal solution", checkSolution(k3,l3, solution,s3));
	}

	@Test(timeout = 100)
	public void teste4() throws Exception {
		String solution = SquidGame.efficient(k4,l4);
		solution = solution.replace(" ", "");
		assertTrue("The output partitions do not lead to optimal solution", checkSolution(k4,l4, solution,s4));
	}

	@Test(timeout = 100)
	public void teste5() throws Exception {
		String solution = SquidGame.efficient(k5,l5);
		solution = solution.replace(" ", "");
		assertTrue("The output partitions do not lead to optimal solution", checkSolution(k5,l5, solution,s5));
	}

	@Test(timeout = 100)
	public void teste6() throws Exception {
		String solution = SquidGame.efficient(k6,l6);
		solution = solution.replace(" ", "");
		assertTrue("The output partitions do not lead to optimal solution", checkSolution(k6,l6, solution,s6));
	}

	@Test(timeout = 100)
	public void teste7() throws Exception {
		String solution = SquidGame.efficient(k7,l7);
		solution = solution.replace(" ", "");
		assertTrue("The output partitions do not lead to optimal solution", checkSolution(k7,l7, solution,s7));
	}

	@Test(timeout = 100)
	public void teste8() throws Exception {
		String solution = SquidGame.efficient(k8,l8);
		solution = solution.replace(" ", "");
		assertTrue("The output partitions do not lead to optimal solution", checkSolution(k8,l8, solution,s8));
	}

	@Test(timeout = 100)
	public void teste9() throws Exception {
		String solution = SquidGame.efficient(k9,l9);
		solution = solution.replace(" ", "");
		assertTrue("The output partitions do not lead to optimal solution", checkSolution(k9,l9, solution,s9));
	}

	@Test(timeout = 100)
	public void teste10() throws Exception {
		String solution = SquidGame.efficient(k10,l10);
		solution = solution.replace(" ", "");
		assertTrue("The output partitions do not lead to optimal solution", checkSolution(k10,l10, solution,s10));
	}
	
	@Test(timeout = 4000)
	public void teste11() throws Exception {
		String solution = SquidGame.efficient(k11,l11);
		solution = solution.replace(" ", "");
		assertTrue("The output partitions do not lead to optimal solution", checkSolution(k11,l11, solution,s11));
	}
	
	@Test(timeout = 5000)
	public void teste12() throws Exception {
		String solution = SquidGame.efficient(k12,l12);
		solution = solution.replace(" ", "");
		assertTrue("The output partitions do not lead to optimal solution", checkSolution(k12,l12, solution,s12));
	}
 
	private boolean checkSolution(int k,int []l, String solution,String desiredSol) {
		String [] solutionSplitted = solution.split(";");
		if(solutionSplitted.length != k+1)
			return false ; 
		String [] desiredSolutionSplitted = desiredSol.split(";") ;
		int desiredCost = Integer.parseInt(desiredSolutionSplitted[0]);
		boolean partitionsContainsOptimal = false ;
		if(Integer.parseInt(solutionSplitted[0]) != desiredCost)
			return false ; 
		int i = 0 ;  
		for(int partition = 1  ; partition <= k ; partition++) {
			String [] currentPartition = solutionSplitted[partition].split(",");
			int currentSum = 0 ; 
			int m = 0 ; 
			for(; m < currentPartition.length ; m++) {
				int currentVal = Integer.parseInt(currentPartition[m]);
				if(currentVal != l[m+i])
					return false ; 
				currentSum+= currentVal ; 
			}
			i+= m ; 
			if(currentSum == desiredCost)
				partitionsContainsOptimal = true ; 
			if(currentSum > desiredCost)
				return false ; 
		}
		return partitionsContainsOptimal ; 
		
	}

}

package com.reddit.programming.mario;


public class Tunables {
	public static float FactorA = 1f;
	public static float FactorB = 1f;
	public static float FactorC = 1f;
	public static float GIncrement = 1f;
	public static float DeadCost = 100000f;
	public static float FeetOnTheGroundBonus = 0f;
	public static int MaxBreadth = 50;
	public static float HurtCost = 5f;

	public static float PathFound = 0;
	
// old set
//  7007.975:[1.0,1.0,1.0,1000.0,4.0,1.0,1.0E10,1.0E10,0.0]	
//	15209.567:[1.3297342,0.99,1.0,990.0,4.0,1.0,9.9000003E9,9.9000003E9,0.0]

// set a
// 86571.93:[1.0,0.9999,0.99,999.9,4.04,1.0,1.0E10,1.0E10,0.0]
// 212977.38:[1.0,0.979901,0.99,989.8118,4.0804,1.02,9.9990006E9,1.0E10,-0.01]
// 395097.38:[1.0,0.9799,0.9999,980.00104,4.1821084,1.02,9.9000003E9,1.0E10,-0.0099]
//W206687.05:[1.0,0.9504,1.019899,1010.01,2.0,1.0298979,990.0,1010.0,-0.0099]
//W213017.7:[1.0,0.97919905,1.019899,9.889999,1.0301,1.02,9.889999,991000.0,-0.009801]

// set b
// 5781.1313:[1.0,0.9799,1.0661662,68.84948,5.0,1.02,100.0,1000.0,-0.61839205]

// set c

//W501915.6:[1.0,1.0,0.9620644,0.60162866,1000.0,1000.0,5.594521E-4,50.646908,1.1577977]
// 3883.2:[1.0,1.0,1.0,1.3977877,10.0,10.0,0.0,50.0,1.4354287]
// 3862.9:[1.0,1.2465067,1.0752265,1.4,10.0,10.0,0.0,50.0,1.3556814]
// 3881.5:[1.0,1.2258537,1.0752265,1.4,10.0,10.0,0.0,50.0,1.3556814]
//3854.9:[1.0,1.2258,0.6868117,1.3997444,10.0,10.0,0.0,47.277386,1.3556]

// set d CompetitionScore (trails:1)

//17467.0:[1.0,1.0,1.0,1.0,10.0,10.0,0.0,5.84851,1.0]
}

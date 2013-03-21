* Assignment: QuickInsertSort
** Student info:
   - Group name: Forever Alone
   - Name1: Martin Juul Petersen
   - Email1: mjup@itu.dk
   - Name2:
   - Email2:
   - Operating system: Windows 7
   - Processor: Intel Core i7-3610QM
   - Clock Speed: 2.3 GHz 
   - Computer desciption (if that makes sense, e.g., "2008 MacBook
     Pro", "Commodore 64", "Intel-based box I assembled myself", 
     etc.): Acer Aspire v3-771g - Prebuilt 'gamer' laptop
   - Compiler: Eclipse
   - Text editor / IDE: Eclipse

** Assignment info:
   Mark one of the following boxes with an X
   [X] Yes, to the best of our knowledge, everything works as it
   should. In particular, here is the test client that our code has
   passed:

   int N = 1000000;
		int T = 100;
		int[] data = new int[N];
		double[] times = new double[T];

   for( int i = 0; i < T; i++ )
		{
			for( int j = 0; j < data.length; j++ )
			{
				data[j] = StdRandom.uniform( N * 10 );
			}
			
			Stopwatch stopwatch = new Stopwatch();
			QuickInsertion.sort( data, 10 );
			times[i] = stopwatch.elapsedTime();
		}



   [ ] No, our solution does not work. (We will not get credit for this.)
   In particular, it sorts 

   .... (some numbers)

   to 

   .... (some numbers, not correctly sorted)


   - Total hours to complete the assignment (optional): ...


   RESULTS
   
   For each N, either complete the 7 lines (where it says ...) or
   remove the lines are write "Couldn't see a difference".

   N = 100:
   Couldn't see a difference. 

   N = 1000:
   Couldn't see a difference. 
   
   N = 10000:
   Couldn't see a difference. 

   N = 100000:
   Couldn't see a difference.

   N = 1000000:
   No cutoff: 
   mean running time: 0.15076999999999996
   standard deviation: 0.009678524597470338
   
   With cutoff = 10
   mean running time: 0.13668000000000005
   standard deviation: 0.009956349174717048
   improvement in percent: 10.3%

** Help
   List whatever help (if any) that you received, including help from
   TAs or fellow students. (Such help is allowed, but we want you to
   acknowledge it.)

   ...

** Comments
   List any other comments here. Feel free to provide any feedback on
   how much you learned from doing the assignment, and whether you
   enjoyed doing it. In particular, tell us how this exercise could be
   improved.
 
   ...
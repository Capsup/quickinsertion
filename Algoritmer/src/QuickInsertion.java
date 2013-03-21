import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class QuickInsertion
{
	private static class Insertion
	{
		public static void sort( int[] a, int lo, int hi )
		{
			// int N = a.length;

			for( int i = lo; i <= hi; i++ )
			{
				for( int j = i; j > 0 && a[j] < a[j - 1]; j-- )
				{
					exch( a, j, j - 1 );
				}
				assert ( isSorted( a, 0, i ) );
			}
			assert ( isSorted( a ) );
		}
	}

	public static void sort( int[] a, int cutoff )
	{
		StdRandom.shuffle( a );
		sort( a, 0, a.length - 1, cutoff );
	}

	private static void sort( int[] a, int lo, int hi, int cutoff )
	{
		if( hi <= lo + cutoff )
		{
			Insertion.sort( a, lo, hi );
			return;
		}

		int j = partition( a, lo, hi );
		sort( a, lo, j - 1, cutoff );
		sort( a, j + 1, hi, cutoff );

		assert ( isSorted( a, lo, hi ) );
	}

	private static int partition( int[] a, int lo, int hi )
	{
		int i = lo;
		int j = hi + 1;
		int v = a[lo];

		while( true )
		{
			while( a[++i] < v )
				if( i == hi )
					break;

			while( v < a[--j] )
				if( j == lo )
					break;

			if( i >= j )
				break;

			exch( a, i, j );
		}

		exch( a, lo, j );

		return j;
	}

	private static void exch( int[] a, int i, int j )
	{
		int swap = a[i];
		a[i] = a[j];
		a[j] = swap;
	}

	private static boolean isSorted( int[] a )
	{
		return( isSorted( a, 0, a.length - 1 ) );
	}

	private static boolean isSorted( int[] a, int lo, int hi )
	{
		for( int i = lo + 1; i <= hi; i++ )
		{
			if( a[i] < a[i - 1] )
				return false;
		}
		return true;
	}
	
	private static int[] loadFile( String path ) throws FileNotFoundException
	{
		File file = new File( path );
		
		if( !file.exists() )
			throw new FileNotFoundException();
		
		Scanner scanner = new Scanner( file );
		
		int i = 0;
		while( scanner.hasNextLine() )
		{
			scanner.nextLine();
			i++;
		}
		
		int[] data = new int[i];
		
		scanner = new Scanner( file );
		
		while( scanner.hasNextLine() )
		{
			data[--i] = Integer.parseInt( scanner.nextLine() );
		}
		
		return data;
	}

	public static void main( String[] args )
	{
		try
        {
			StdOut.print( "Input file path: \n" );
	        int[] data = loadFile( StdIn.readLine() );
	        StdOut.print( "Cutoff: \n" );
	        int cutoff = Integer.parseInt( StdIn.readLine() );
	        double[] times = new double[100];
	        
	        for( int i = 0; i < 100; i++ )
			{	
				Stopwatch stopwatch = new Stopwatch();
				QuickInsertion.sort( data, cutoff );
				times[i] = stopwatch.elapsedTime();
			}
        }
        catch( FileNotFoundException e )
        {
	        e.printStackTrace();
        }
	}
}

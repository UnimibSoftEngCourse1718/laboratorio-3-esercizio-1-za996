package it.unimib.quickstart;

import com.google.gson.Gson;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Test!" );
        Gson gson = new Gson();
        System.out.println(gson.toJson("Hello World!") );
    }
}

package hacker;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StockPrice {
    /*
     * Complete the function below.
     */
    static void openAndClosePrices(String firstDate, String lastDate, String weekDay) {
    	
    	DateTimeFormatter f = DateTimeFormatter.ofPattern("d-MMMM-yyyy");
    	LocalDate fromDate = LocalDate.parse(firstDate, f);
    	
    	LocalDate toDate = LocalDate.parse(lastDate, f);
    	
    	System.out.println("fromDate: "+fromDate);
    	System.out.println("toDate: "+toDate);
    	
    	List<LocalDate> range = Stream.iterate(fromDate, date -> date.plusDays(1))
    			.limit(ChronoUnit.DAYS.between(fromDate, toDate))
    			.filter( date -> date.getDayOfWeek()==DayOfWeek.valueOf(weekDay.toUpperCase()))
    			.collect(Collectors.toList());
    	
    	System.out.println("range: "+range);
    	
    	range.forEach(date->{
    		
    		String query_url = "https://jsonmock.hackerrank.com/api/stocks/search?key=";
            try {
            URL url = new URL(query_url);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setConnectTimeout(5000);
            conn.setRequestProperty("Content-Type", "application/json; charset=UTF-8");
            conn.setDoOutput(true);
            conn.setDoInput(true);
            conn.setRequestMethod("GET");
            
            System.out.println("--response code--"+conn.getResponseCode());
           
            // read the response
            InputStream inputStream = new BufferedInputStream(conn.getInputStream());
           
            String bms= convert(inputStream);
            System.out.println("jsonrpc---- "+bms);
            inputStream.close();
            conn.disconnect();
            } catch (Exception e) {
                e.printStackTrace();
            }
    		
    	});
    	


    }
	 
	    public static String convert(InputStream inputStream) throws IOException {
		 
	    	StringBuilder stringBuilder = new StringBuilder();
	           String line = null;
	    
	         try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream))) {    

	            while ((line = bufferedReader.readLine()) != null) {
	                    stringBuilder.append(line);
	                }
	            }
	        
	            return stringBuilder.toString();
		}

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String _firstDate;
        try {
            _firstDate = in.nextLine();
        } catch (Exception e) {
            _firstDate = null;
        }
        
        String _lastDate;
        try {
            _lastDate = in.nextLine();
        } catch (Exception e) {
            _lastDate = null;
        }
        
        String _weekDay;
        try {
            _weekDay = in.nextLine();
        } catch (Exception e) {
            _weekDay = null;
        }
        
        openAndClosePrices(_firstDate, _lastDate, _weekDay);
        
    }
}
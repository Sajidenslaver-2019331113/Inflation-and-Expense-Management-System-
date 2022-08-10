//package com.company;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;


public class Fetch {

    public static double ftc = 0.0;

    Fetch()
    {
        final String url =
                "https://tradingeconomics.com/bangladesh/inflation-cpi";

        try {
            final Document document = Jsoup.connect(url).get();

            double price1 = -9999999;
            double price2 = -9999999;
            for (Element row : document.select(
                    "table.table-hover tr")) {

                String previous =
                        row.select("td:nth-of-type(6)").text();
                String priceStr =
                        previous.replace("%", "");
                try{
                    double price = Double.parseDouble(priceStr);
                    if(price1 == -9999999){
                        price1 = price;
                    }
                    else{
                        price2 = price;
                    }
                }catch (Exception e){

                }

            }

            System.out.println( price1 + " " + price2);
            ftc = price2 - price1;
        }
        catch (Exception ex) {

        }


    }

}

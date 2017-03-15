package com.codeclan.winelist;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class WineListTest {

    WineList wineList;

    @Test
    public void checkWineListExists(){
        wineList = new WineList();
        Wine wineFound = wineList.getWineList().get(0);
        assertEquals("Merlot", wineFound.getName());
    }

    @Test
    public void testWinePrice(){
        wineList = new WineList();
        Wine wineFound = wineList.getWineList().get(0);
        String winePrice = wineFound.getPrice();
        String expectedPrice = "£4.0";
        assertEquals(expectedPrice, winePrice);
    }
}
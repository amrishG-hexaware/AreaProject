package com.amrish.area;
import java.util.Scanner;
import org.junit.Test;

public class areaTest{
@Test
public void testArea()
    {
      
        int r = 12;
        final float pi=3.14f;
        Area obj=new Area();
        float result=obj.areaOfCircle(r,pi);
        System.out.println("Area of circle:"+result);
    }            
}
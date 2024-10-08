/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;

import javax.swing.plaf.*;
import javax.swing.plaf.metal.*;
import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;
 
/**
 * This class describes a theme using "primary" colors.
 * You can change the colors to anything else you want.
 *
 * 1.9 07/26/04
 */
public class TestTheme extends DefaultMetalTheme {
 
    public String getName() { return "Toms"; }
 
    private final ColorUIResource primary1 = new ColorUIResource(225, 225, 81);
    private final ColorUIResource primary2 = new ColorUIResource(12, 12, 3);
    private final ColorUIResource primary3 = new ColorUIResource(228, 182, 79);
 
    protected ColorUIResource getPrimary1() { return primary1; }
    protected ColorUIResource getPrimary2() { return primary2; }
    protected ColorUIResource getPrimary3() { return primary3; }
}
 
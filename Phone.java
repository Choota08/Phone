/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package phone;

/**
 *
 * @author SMK TELKOM 35
 */
public interface Phone {
    int MAX_VOLUME =100;
    int MIN_VOLUME =0;
    
    void powerOn();
    void powerOff();
    void volumeUp();
    void volumeDown();
}

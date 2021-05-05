/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question8a;

/**
 *
 * @author S542052
 */
public class HouseFullException extends Exception {

    /**
     * Creates a new instance of <code>HouseFullException</code> without detail
     * message.
     */
    public HouseFullException() {
    }

    /**
     * Constructs an instance of <code>HouseFullException</code> with the
     * specified detail message.
     *
     * @param msg the detail message.
     */
    public HouseFullException(String msg) {
        super(msg);
    }
}

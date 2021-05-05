/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question01.Interface01;

/**
 *
 * @author Rohit Reddy Chandupatla
 */
public interface duration {
        String timetaken();

    default String myst(String name) {
        String str = name.substring(3);
        return str;
    }

}

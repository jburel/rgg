/*
 * VVerticalBox.java
 *
 * Created on 17. April 2007, 21:18
 */

package at.ac.arcs.rgg.element.verticalbox;

import at.ac.arcs.rgg.component.VisualComponent;

import javax.swing.*;


/**
 * @author Ilhami Visne
 */
public class VVerticalBox extends VisualComponent {

    private JComponent[][] swingComponents;


    /**
     * Creates a new instance of VVerticalBox
     */
    public VVerticalBox(JComponent[][] swingComponents) {
        this.swingComponents = swingComponents;
    }


    public JComponent[][] getSwingComponents() {
        return swingComponents;
    }

}

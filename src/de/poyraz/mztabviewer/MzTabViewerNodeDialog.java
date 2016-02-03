package de.poyraz.mztabviewer;

import org.knime.core.node.defaultnodesettings.DefaultNodeSettingsPane;
import org.knime.core.node.defaultnodesettings.DialogComponentNumber;
import org.knime.core.node.defaultnodesettings.SettingsModelIntegerBounded;

/**
 * <code>NodeDialog</code> for the "MzTabViewer" Node.
 * 
 *
 * This node dialog derives from {@link DefaultNodeSettingsPane} which allows
 * creation of a simple dialog with standard components. If you need a more 
 * complex dialog please derive directly from 
 * {@link org.knime.core.node.NodeDialogPane}.
 * 
 * @author Enes Poyraz
 */
public class MzTabViewerNodeDialog extends DefaultNodeSettingsPane {

    /**
     * New pane for configuring MzTabViewer node dialog.
     * This is just a suggestion to demonstrate possible default dialog
     * components.
     */
    protected MzTabViewerNodeDialog() {
        super();
        
        addDialogComponent(new DialogComponentNumber(
                new SettingsModelIntegerBounded(
                    MzTabViewerNodeModel.CFGKEY_COUNT,
                    MzTabViewerNodeModel.DEFAULT_COUNT,
                    Integer.MIN_VALUE, Integer.MAX_VALUE),
                    "Counter:", /*step*/ 1, /*componentwidth*/ 5));
                    
    }
}


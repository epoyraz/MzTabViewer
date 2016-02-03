package de.poyraz.mztabviewer;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.BoxLayout;
import javax.swing.JPanel;

import org.knime.core.node.NodeView;

import uk.ac.ebi.pride.toolsuite.mzgraph.MzGraphBrowser;
import uk.ac.ebi.pride.toolsuite.mzgraph.SpectrumBrowser;
import uk.ac.ebi.pride.toolsuite.mzgraph.chart.graph.SpectrumPanel;

/**
 * <code>NodeView</code> for the "MzTabViewer" Node.
 * 
 *
 * @author Enes Poyraz
 */
public class MzTabViewerNodeView extends NodeView<MzTabViewerNodeModel> {

    /**
     * Creates a new view.
     * 
     * @param nodeModel The model (class: {@link MzTabViewerNodeModel})
     */
    protected MzTabViewerNodeView(final MzTabViewerNodeModel nodeModel) {
        super(nodeModel);
        
        // TODO instantiate the components of the view here.
		JPanel container = new JPanel();
		container.setLayout(new GridLayout(3,1));
		container.setPreferredSize(new Dimension(1000, 800));
		
		
		MyPanel mypanel = new MyPanel();
        PanelTable paneltable = new PanelTable();
        SpectrumPanel mzGraphBrowser = new SpectrumPanel();
        mzGraphBrowser.paintGraph();

        paneltable.setPreferredSize(new Dimension(400,200));
        mypanel.setPreferredSize(new Dimension(400,200));
		
        container.add(paneltable);
        container.add(mypanel);
        container.add(mzGraphBrowser);
        container.setVisible(true);
        
        setComponent(container);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected void modelChanged() {

        // TODO retrieve the new model from your nodemodel and 
        // update the view.
        MzTabViewerNodeModel nodeModel = 
            (MzTabViewerNodeModel)getNodeModel();
        assert nodeModel != null;
        
        // be aware of a possibly not executed nodeModel! The data you retrieve
        // from your nodemodel could be null, emtpy, or invalid in any kind.
        
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected void onClose() {
    
        // TODO things to do when closing the view
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected void onOpen() {

        // TODO things to do when opening the view
    }

}


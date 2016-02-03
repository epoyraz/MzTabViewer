package de.poyraz.mztabviewer;

import org.knime.core.node.NodeDialogPane;
import org.knime.core.node.NodeFactory;
import org.knime.core.node.NodeView;

/**
 * <code>NodeFactory</code> for the "MzTabViewer" Node.
 * 
 *
 * @author Enes Poyraz
 */
public class MzTabViewerNodeFactory 
        extends NodeFactory<MzTabViewerNodeModel> {

    /**
     * {@inheritDoc}
     */
    @Override
    public MzTabViewerNodeModel createNodeModel() {
        return new MzTabViewerNodeModel();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public int getNrNodeViews() {
        return 1;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public NodeView<MzTabViewerNodeModel> createNodeView(final int viewIndex,
            final MzTabViewerNodeModel nodeModel) {
        return new MzTabViewerNodeView(nodeModel);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean hasDialog() {
        return true;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public NodeDialogPane createNodeDialogPane() {
        return new MzTabViewerNodeDialog();
    }

}


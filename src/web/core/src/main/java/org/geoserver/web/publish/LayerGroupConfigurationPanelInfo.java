package org.geoserver.web.publish;

import org.geoserver.catalog.LayerGroupInfo;

public class LayerGroupConfigurationPanelInfo extends PublishedConfigurationPanelInfo<LayerGroupInfo> {

    private static final long serialVersionUID = 8382295309912226673L;

    @Override
    public Class<LayerGroupInfo> getPublishedInfoClass() {
        return LayerGroupInfo.class;
    }

}

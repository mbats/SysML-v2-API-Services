package org.omg.sysml.metamodel;

import java.util.Collection;
import java.util.List;
import java.util.Set;

public interface FeatureValue extends FeatureMembership, MofObject {
    Feature getFeatureWithValue();

    BindingConnector getValueConnector();

    Expression getValue();
}
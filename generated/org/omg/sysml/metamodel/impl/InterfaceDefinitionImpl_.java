package org.omg.sysml.metamodel.impl;

import java.util.UUID;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import org.omg.sysml.metamodel.ActionUsage;
import org.omg.sysml.metamodel.ConstraintUsage;
import org.omg.sysml.metamodel.Element;
import org.omg.sysml.metamodel.Feature;
import org.omg.sysml.metamodel.FeatureMembership;
import org.omg.sysml.metamodel.Generalization;
import org.omg.sysml.metamodel.Import;
import org.omg.sysml.metamodel.Membership;
import org.omg.sysml.metamodel.PortUsage;
import org.omg.sysml.metamodel.Property;
import org.omg.sysml.metamodel.Relationship;
import org.omg.sysml.metamodel.StateUsage;
import org.omg.sysml.metamodel.Superclassing;
import org.omg.sysml.metamodel.TransitionUsage;
import org.omg.sysml.metamodel.Type;
import org.omg.sysml.metamodel.Usage;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(InterfaceDefinitionImpl.class)
public abstract class InterfaceDefinitionImpl_ extends org.omg.sysml.metamodel.impl.MofObjectImpl_ {

	public static volatile CollectionAttribute<InterfaceDefinitionImpl, PortUsage> ownedPort;
	public static volatile ListAttribute<InterfaceDefinitionImpl, Generalization> ownedGeneralization;
	public static volatile SingularAttribute<InterfaceDefinitionImpl, Boolean> isConjugated;
	public static volatile CollectionAttribute<InterfaceDefinitionImpl, StateUsage> ownedState;
	public static volatile CollectionAttribute<InterfaceDefinitionImpl, Element> source;
	public static volatile CollectionAttribute<InterfaceDefinitionImpl, Element> ownedRelatedElement;
	public static volatile CollectionAttribute<InterfaceDefinitionImpl, Superclassing> ownedSuperclassing;
	public static volatile ListAttribute<InterfaceDefinitionImpl, Membership> membership;
	public static volatile CollectionAttribute<InterfaceDefinitionImpl, ConstraintUsage> ownedConstraint;
	public static volatile CollectionAttribute<InterfaceDefinitionImpl, Feature> output;
	public static volatile CollectionAttribute<InterfaceDefinitionImpl, Type> relatedType;
	public static volatile CollectionAttribute<InterfaceDefinitionImpl, Feature> feature;
	public static volatile ListAttribute<InterfaceDefinitionImpl, Membership> inheritedMembership;
	public static volatile CollectionAttribute<InterfaceDefinitionImpl, Property> property;
	public static volatile CollectionAttribute<InterfaceDefinitionImpl, Feature> ownedEndFeature;
	public static volatile ListAttribute<InterfaceDefinitionImpl, Element> member;
	public static volatile ListAttribute<InterfaceDefinitionImpl, FeatureMembership> ownedFeatureMembership;
	public static volatile CollectionAttribute<InterfaceDefinitionImpl, TransitionUsage> ownedTransition;
	public static volatile CollectionAttribute<InterfaceDefinitionImpl, Feature> inheritedFeature;
	public static volatile SingularAttribute<InterfaceDefinitionImpl, Boolean> isSufficient;
	public static volatile CollectionAttribute<InterfaceDefinitionImpl, Property> ownedProperty;
	public static volatile SingularAttribute<InterfaceDefinitionImpl, UUID> identifier;
	public static volatile ListAttribute<InterfaceDefinitionImpl, Membership> importedMembership;
	public static volatile CollectionAttribute<InterfaceDefinitionImpl, Element> ownedElement;
	public static volatile CollectionAttribute<InterfaceDefinitionImpl, Feature> ownedFeature;
	public static volatile CollectionAttribute<InterfaceDefinitionImpl, Relationship> ownedRelationship;
	public static volatile ListAttribute<InterfaceDefinitionImpl, FeatureMembership> featureMembership;
	public static volatile CollectionAttribute<InterfaceDefinitionImpl, Feature> endFeature;
	public static volatile ListAttribute<InterfaceDefinitionImpl, Import> ownedImport;
	public static volatile SingularAttribute<InterfaceDefinitionImpl, Boolean> isAbstract;
	public static volatile CollectionAttribute<InterfaceDefinitionImpl, Feature> associationEnd;
	public static volatile CollectionAttribute<InterfaceDefinitionImpl, Element> target;
	public static volatile CollectionAttribute<InterfaceDefinitionImpl, PortUsage> interfaceEnd;
	public static volatile CollectionAttribute<InterfaceDefinitionImpl, Property> flowProperty;
	public static volatile CollectionAttribute<InterfaceDefinitionImpl, Feature> input;
	public static volatile CollectionAttribute<InterfaceDefinitionImpl, ActionUsage> ownedAction;
	public static volatile CollectionAttribute<InterfaceDefinitionImpl, Element> relatedElement;
	public static volatile SingularAttribute<InterfaceDefinitionImpl, String> name;
	public static volatile CollectionAttribute<InterfaceDefinitionImpl, Usage> ownedUsage;
	public static volatile ListAttribute<InterfaceDefinitionImpl, Element> ownedMember;
	public static volatile ListAttribute<InterfaceDefinitionImpl, Membership> ownedMembership;

	public static final String OWNED_PORT = "ownedPort";
	public static final String OWNED_GENERALIZATION = "ownedGeneralization";
	public static final String IS_CONJUGATED = "isConjugated";
	public static final String OWNED_STATE = "ownedState";
	public static final String SOURCE = "source";
	public static final String OWNED_RELATED_ELEMENT = "ownedRelatedElement";
	public static final String OWNED_SUPERCLASSING = "ownedSuperclassing";
	public static final String MEMBERSHIP = "membership";
	public static final String OWNED_CONSTRAINT = "ownedConstraint";
	public static final String OUTPUT = "output";
	public static final String RELATED_TYPE = "relatedType";
	public static final String FEATURE = "feature";
	public static final String INHERITED_MEMBERSHIP = "inheritedMembership";
	public static final String PROPERTY = "property";
	public static final String OWNED_END_FEATURE = "ownedEndFeature";
	public static final String MEMBER = "member";
	public static final String OWNED_FEATURE_MEMBERSHIP = "ownedFeatureMembership";
	public static final String OWNED_TRANSITION = "ownedTransition";
	public static final String INHERITED_FEATURE = "inheritedFeature";
	public static final String IS_SUFFICIENT = "isSufficient";
	public static final String OWNED_PROPERTY = "ownedProperty";
	public static final String IDENTIFIER = "identifier";
	public static final String IMPORTED_MEMBERSHIP = "importedMembership";
	public static final String OWNED_ELEMENT = "ownedElement";
	public static final String OWNED_FEATURE = "ownedFeature";
	public static final String OWNED_RELATIONSHIP = "ownedRelationship";
	public static final String FEATURE_MEMBERSHIP = "featureMembership";
	public static final String END_FEATURE = "endFeature";
	public static final String OWNED_IMPORT = "ownedImport";
	public static final String IS_ABSTRACT = "isAbstract";
	public static final String ASSOCIATION_END = "associationEnd";
	public static final String TARGET = "target";
	public static final String INTERFACE_END = "interfaceEnd";
	public static final String FLOW_PROPERTY = "flowProperty";
	public static final String INPUT = "input";
	public static final String OWNED_ACTION = "ownedAction";
	public static final String RELATED_ELEMENT = "relatedElement";
	public static final String NAME = "name";
	public static final String OWNED_USAGE = "ownedUsage";
	public static final String OWNED_MEMBER = "ownedMember";
	public static final String OWNED_MEMBERSHIP = "ownedMembership";

}

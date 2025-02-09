package org.omg.sysml.metamodel.impl;

import java.util.UUID;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import org.omg.sysml.metamodel.Annotation;
import org.omg.sysml.metamodel.Comment;
import org.omg.sysml.metamodel.Disjoining;
import org.omg.sysml.metamodel.Documentation;
import org.omg.sysml.metamodel.Element;
import org.omg.sysml.metamodel.Feature;
import org.omg.sysml.metamodel.FeatureMembership;
import org.omg.sysml.metamodel.Import;
import org.omg.sysml.metamodel.Membership;
import org.omg.sysml.metamodel.Relationship;
import org.omg.sysml.metamodel.Specialization;
import org.omg.sysml.metamodel.Subclassification;
import org.omg.sysml.metamodel.TextualRepresentation;
import org.omg.sysml.metamodel.Type;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(ClassifierImpl.class)
public abstract class ClassifierImpl_ extends org.omg.sysml.metamodel.impl.MofObjectImpl_ {

	public static volatile CollectionAttribute<ClassifierImpl, Type> disjointType;
	public static volatile SingularAttribute<ClassifierImpl, Boolean> isConjugated;
	public static volatile CollectionAttribute<ClassifierImpl, Disjoining> ownedDisjoining;
	public static volatile ListAttribute<ClassifierImpl, Membership> membership;
	public static volatile ListAttribute<ClassifierImpl, Feature> output;
	public static volatile ListAttribute<ClassifierImpl, Feature> feature;
	public static volatile ListAttribute<ClassifierImpl, Membership> inheritedMembership;
	public static volatile ListAttribute<ClassifierImpl, Element> member;
	public static volatile ListAttribute<ClassifierImpl, Feature> ownedEndFeature;
	public static volatile ListAttribute<ClassifierImpl, FeatureMembership> ownedFeatureMembership;
	public static volatile CollectionAttribute<ClassifierImpl, Subclassification> ownedSubclassification;
	public static volatile ListAttribute<ClassifierImpl, Feature> inheritedFeature;
	public static volatile SingularAttribute<ClassifierImpl, Boolean> isSufficient;
	public static volatile ListAttribute<ClassifierImpl, Comment> documentationComment;
	public static volatile SingularAttribute<ClassifierImpl, String> effectiveName;
	public static volatile SingularAttribute<ClassifierImpl, UUID> identifier;
	public static volatile ListAttribute<ClassifierImpl, Membership> importedMembership;
	public static volatile ListAttribute<ClassifierImpl, Annotation> ownedAnnotation;
	public static volatile ListAttribute<ClassifierImpl, Element> ownedElement;
	public static volatile ListAttribute<ClassifierImpl, Feature> ownedFeature;
	public static volatile ListAttribute<ClassifierImpl, Relationship> ownedRelationship;
	public static volatile SingularAttribute<ClassifierImpl, String> qualifiedName;
	public static volatile ListAttribute<ClassifierImpl, Documentation> documentation;
	public static volatile ListAttribute<ClassifierImpl, FeatureMembership> featureMembership;
	public static volatile ListAttribute<ClassifierImpl, Feature> endFeature;
	public static volatile ListAttribute<ClassifierImpl, Feature> directedFeature;
	public static volatile ListAttribute<ClassifierImpl, Import> ownedImport;
	public static volatile SingularAttribute<ClassifierImpl, Boolean> isAbstract;
	public static volatile ListAttribute<ClassifierImpl, Feature> input;
	public static volatile CollectionAttribute<ClassifierImpl, TextualRepresentation> ownedTextualRepresentation;
	public static volatile SingularAttribute<ClassifierImpl, String> humanId;
	public static volatile ListAttribute<ClassifierImpl, String> aliasId;
	public static volatile SingularAttribute<ClassifierImpl, String> name;
	public static volatile ListAttribute<ClassifierImpl, Specialization> ownedSpecialization;
	public static volatile ListAttribute<ClassifierImpl, Element> ownedMember;
	public static volatile ListAttribute<ClassifierImpl, Membership> ownedMembership;

	public static final String DISJOINT_TYPE = "disjointType";
	public static final String IS_CONJUGATED = "isConjugated";
	public static final String OWNED_DISJOINING = "ownedDisjoining";
	public static final String MEMBERSHIP = "membership";
	public static final String OUTPUT = "output";
	public static final String FEATURE = "feature";
	public static final String INHERITED_MEMBERSHIP = "inheritedMembership";
	public static final String MEMBER = "member";
	public static final String OWNED_END_FEATURE = "ownedEndFeature";
	public static final String OWNED_FEATURE_MEMBERSHIP = "ownedFeatureMembership";
	public static final String OWNED_SUBCLASSIFICATION = "ownedSubclassification";
	public static final String INHERITED_FEATURE = "inheritedFeature";
	public static final String IS_SUFFICIENT = "isSufficient";
	public static final String DOCUMENTATION_COMMENT = "documentationComment";
	public static final String EFFECTIVE_NAME = "effectiveName";
	public static final String IDENTIFIER = "identifier";
	public static final String IMPORTED_MEMBERSHIP = "importedMembership";
	public static final String OWNED_ANNOTATION = "ownedAnnotation";
	public static final String OWNED_ELEMENT = "ownedElement";
	public static final String OWNED_FEATURE = "ownedFeature";
	public static final String OWNED_RELATIONSHIP = "ownedRelationship";
	public static final String QUALIFIED_NAME = "qualifiedName";
	public static final String DOCUMENTATION = "documentation";
	public static final String FEATURE_MEMBERSHIP = "featureMembership";
	public static final String END_FEATURE = "endFeature";
	public static final String DIRECTED_FEATURE = "directedFeature";
	public static final String OWNED_IMPORT = "ownedImport";
	public static final String IS_ABSTRACT = "isAbstract";
	public static final String INPUT = "input";
	public static final String OWNED_TEXTUAL_REPRESENTATION = "ownedTextualRepresentation";
	public static final String HUMAN_ID = "humanId";
	public static final String ALIAS_ID = "aliasId";
	public static final String NAME = "name";
	public static final String OWNED_SPECIALIZATION = "ownedSpecialization";
	public static final String OWNED_MEMBER = "ownedMember";
	public static final String OWNED_MEMBERSHIP = "ownedMembership";

}


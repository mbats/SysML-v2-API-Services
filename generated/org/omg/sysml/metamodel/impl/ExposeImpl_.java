package org.omg.sysml.metamodel.impl;

import java.util.UUID;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import org.omg.sysml.metamodel.Annotation;
import org.omg.sysml.metamodel.Comment;
import org.omg.sysml.metamodel.Documentation;
import org.omg.sysml.metamodel.Element;
import org.omg.sysml.metamodel.Relationship;
import org.omg.sysml.metamodel.TextualRepresentation;
import org.omg.sysml.metamodel.VisibilityKind;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(ExposeImpl.class)
public abstract class ExposeImpl_ extends org.omg.sysml.metamodel.impl.MofObjectImpl_ {

	public static volatile SingularAttribute<ExposeImpl, UUID> identifier;
	public static volatile ListAttribute<ExposeImpl, Annotation> ownedAnnotation;
	public static volatile ListAttribute<ExposeImpl, Element> ownedElement;
	public static volatile SingularAttribute<ExposeImpl, String> importedMemberName;
	public static volatile SingularAttribute<ExposeImpl, VisibilityKind> visibility;
	public static volatile ListAttribute<ExposeImpl, Relationship> ownedRelationship;
	public static volatile SingularAttribute<ExposeImpl, String> qualifiedName;
	public static volatile ListAttribute<ExposeImpl, Documentation> documentation;
	public static volatile ListAttribute<ExposeImpl, Element> ownedRelatedElement;
	public static volatile ListAttribute<ExposeImpl, Element> source;
	public static volatile ListAttribute<ExposeImpl, Element> target;
	public static volatile SingularAttribute<ExposeImpl, Boolean> isRecursive;
	public static volatile CollectionAttribute<ExposeImpl, TextualRepresentation> ownedTextualRepresentation;
	public static volatile SingularAttribute<ExposeImpl, String> humanId;
	public static volatile ListAttribute<ExposeImpl, String> aliasId;
	public static volatile ListAttribute<ExposeImpl, Element> relatedElement;
	public static volatile SingularAttribute<ExposeImpl, String> name;
	public static volatile SingularAttribute<ExposeImpl, Boolean> isImportAll;
	public static volatile ListAttribute<ExposeImpl, Comment> documentationComment;
	public static volatile SingularAttribute<ExposeImpl, String> effectiveName;

	public static final String IDENTIFIER = "identifier";
	public static final String OWNED_ANNOTATION = "ownedAnnotation";
	public static final String OWNED_ELEMENT = "ownedElement";
	public static final String IMPORTED_MEMBER_NAME = "importedMemberName";
	public static final String VISIBILITY = "visibility";
	public static final String OWNED_RELATIONSHIP = "ownedRelationship";
	public static final String QUALIFIED_NAME = "qualifiedName";
	public static final String DOCUMENTATION = "documentation";
	public static final String OWNED_RELATED_ELEMENT = "ownedRelatedElement";
	public static final String SOURCE = "source";
	public static final String TARGET = "target";
	public static final String IS_RECURSIVE = "isRecursive";
	public static final String OWNED_TEXTUAL_REPRESENTATION = "ownedTextualRepresentation";
	public static final String HUMAN_ID = "humanId";
	public static final String ALIAS_ID = "aliasId";
	public static final String RELATED_ELEMENT = "relatedElement";
	public static final String NAME = "name";
	public static final String IS_IMPORT_ALL = "isImportAll";
	public static final String DOCUMENTATION_COMMENT = "documentationComment";
	public static final String EFFECTIVE_NAME = "effectiveName";

}


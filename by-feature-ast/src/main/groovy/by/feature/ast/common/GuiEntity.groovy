package by.feature.ast.common

import org.codehaus.groovy.transform.GroovyASTTransformationClass

import java.lang.annotation.ElementType
import java.lang.annotation.Retention
import java.lang.annotation.RetentionPolicy
import java.lang.annotation.Target


@Retention(RetentionPolicy.SOURCE)
@Target([ElementType.TYPE, ElementType.METHOD])
@GroovyASTTransformationClass(["by.feature.ast.common.GuiEntityASTTransformation"])
@interface GuiEntity {

}
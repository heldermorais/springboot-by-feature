package by.feature.ast.common

import groovy.transform.CompileStatic
import org.apache.catalina.util.ToStringUtil
import org.codehaus.groovy.ast.ASTNode
import org.codehaus.groovy.ast.ClassNode
import org.codehaus.groovy.ast.MethodNode
import org.codehaus.groovy.ast.ModuleNode
import org.codehaus.groovy.ast.builder.AstBuilder
import org.codehaus.groovy.ast.expr.ArgumentListExpression
import org.codehaus.groovy.ast.expr.ConstantExpression
import org.codehaus.groovy.ast.expr.MethodCallExpression
import org.codehaus.groovy.ast.expr.VariableExpression
import org.codehaus.groovy.ast.stmt.BlockStatement
import org.codehaus.groovy.ast.stmt.ExpressionStatement
import org.codehaus.groovy.ast.stmt.Statement
import org.codehaus.groovy.control.CompilePhase
import org.codehaus.groovy.control.SourceUnit
import org.codehaus.groovy.transform.ASTTransformation
import org.codehaus.groovy.transform.GroovyASTTransformation


@CompileStatic
@GroovyASTTransformation(phase = CompilePhase.SEMANTIC_ANALYSIS)
class GuiEntityASTTransformation implements ASTTransformation {

    @Override
    void visit(ASTNode[] nodes, SourceUnit source) {
        println " .... beginning visit"
        if ((nodes != null) && (nodes.length > 0)) {
            nodes.each {
                println " ... -> node : $it "

                if (it instanceof MethodNode){
                    MethodNode method = (MethodNode) it

                    def startMessage = createPrintlnAst("  ...Starting $method.name")
                    def endMessage   = createPrintlnAst("  ...Ending $method.name")

                    def existingStatements = ((BlockStatement) method.code).statements
                    existingStatements.add(0, startMessage)
                    existingStatements.add(endMessage)
                }

                if( it instanceof ModuleNode){
                    ModuleNode mn = (ModuleNode) it

                    println " found class ${it.getClass()} ${it.getMainClassName()} "

                    mn.getClasses().each { ClassNode classNode ->
                        println " found class ${classNode.getName()} "
                    }
                }

            }


        }
        println " .... finished visit"




    }

    private static Statement createPrintlnAst(String message) {



        new ExpressionStatement(

                new MethodCallExpression(
                        new VariableExpression("log"),
                        new ConstantExpression("info"),
                        //new ConstantExpression("println"),
                        new ArgumentListExpression(
                                new ConstantExpression(message)
                        )
                )

        )
    }


    protected xxx(){
//        new AstBuilder().buildFromSpec {
//            classNode(className, ClassNode.ACC_PUBLIC) {
//                classNode Object
//                interfaces { classNode GroovyObject }
//                mixins { }
//            }
//        }.first()
    }

}

package esperer.protoconfig.fieldvalues.javac

import com.sun.source.tree.VariableTree

interface TreeVisitor {
    fun visitVariable(variable: VariableTree)
}
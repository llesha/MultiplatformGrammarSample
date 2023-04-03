import com.github.h0tk3y.betterParse.grammar.Grammar
import com.github.h0tk3y.betterParse.parser.Parser

// works in Java module
class JavaGrammar(override val rootParser: Parser<Any>) : Grammar<Any>() {
    val a = ""
}
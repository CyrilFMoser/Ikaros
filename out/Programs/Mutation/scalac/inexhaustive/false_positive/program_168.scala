package Program_63 

object Test {
sealed trait T_A
case class CC_B(a: Char) extends T_A

val v_a: CC_B = null
val v_b: Int = v_a match{
  case CC_B('x') => 0 
}
}
// This is not matched: Pattern match is empty without constants
// Mutation information: 
// Deleted Pattern CC_A(0, 'x', CC_A(0, _, CC_A(_, _, _))) at position 4
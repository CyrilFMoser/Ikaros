package Program_31 

object Test {
sealed trait T_A
case class CC_A() extends T_A
case class CC_C(a: T_A) extends T_A

val v_a: CC_C = null
val v_b: Int = v_a match{
  case CC_C(CC_C(CC_A())) => 0 
}
}
// This is not matched: Pattern match is empty without constants
// Mutation information: 
// Deleted Pattern CC_A('x', ((_,_),CC_B(_, _))) at position 2
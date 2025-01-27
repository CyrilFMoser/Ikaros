package Program_31 

object Test {
sealed trait T_A
sealed trait T_B
case class CC_A(a: T_B, b: T_A, c: T_A) extends T_A
case class CC_C() extends T_A

val v_a: CC_A = null
val v_b: Int = v_a match{
  case CC_A(_, _, CC_A(_, _, _)) => 0 
}
}
// This is not matched: (CC_C Int Char (T_A Int Char))
// Mutation information: 
// Deleted Pattern CC_A(12, 'x', CC_A(_, _, _)) at position 4
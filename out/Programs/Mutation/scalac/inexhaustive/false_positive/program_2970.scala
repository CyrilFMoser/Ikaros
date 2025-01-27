package Program_28 

object Test {
sealed trait T_A[A]
case class CC_A[B](a: (Char,Int)) extends T_A[B]

val v_a: CC_A[Boolean] = null
val v_b: Int = v_a match{
  case CC_A((_,12)) => 0 
}
}
// This is not matched: (CC_B T_A)
// Mutation information: 
// Deleted Pattern CC_A(_, CC_A(_, _)) at position 4
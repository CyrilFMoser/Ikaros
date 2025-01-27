package Program_31 

object Test {
sealed trait T_A[A]
case class CC_A(a: Char) extends T_A[(Int,Boolean)]
case class CC_B(a: CC_A, b: T_A[CC_A]) extends T_A[(Int,Boolean)]

val v_a: T_A[(Int,Boolean)] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(CC_A('x'), _) => 1 
}
}
// This is not matched: (CC_A Wildcard Wildcard (T_A (Tuple Int Boolean)))
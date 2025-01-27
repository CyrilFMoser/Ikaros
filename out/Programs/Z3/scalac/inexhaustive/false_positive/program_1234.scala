package Program_31 

package Program_3 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D, E, F](a: Int, b: E) extends T_A[D, E]
case class CC_B[G]() extends T_A[G, (Int,Boolean)]

val v_a: T_A[Int, Int] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_A(_, 12) => 1 
  case CC_A(12, _) => 2 
  case CC_A(12, 12) => 3 
}
}
// This is not matched: (CC_A Int Int Boolean Int Int (T_A Int Int))
// This is not matched: (CC_A Wildcard Wildcard T_A)
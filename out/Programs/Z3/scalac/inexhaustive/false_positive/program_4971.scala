package Program_15 

package Program_0 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[D, C, E](a: T_A[D, E], b: T_B) extends T_A[C, D]
case class CC_B() extends T_B
case class CC_C(a: Char, b: Char, c: T_B) extends T_B
case class CC_D(a: Boolean) extends T_B

val v_a: T_A[CC_D, CC_D] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(_, _), CC_D(_)) => 0 
  case CC_A(CC_A(_, _), _) => 1 
  case CC_A(CC_A(_, _), CC_C(_, _, _)) => 2 
}
}
// This is not matched: (CC_A (CC_D T_B (T_A T_B T_B))
//      (CC_D T_B T_B)
//      T_B
//      Wildcard
//      Wildcard
//      (T_A (CC_D T_B T_B) (CC_D T_B (T_A T_B T_B))))
// This is not matched: (CC_A Wildcard T_A)
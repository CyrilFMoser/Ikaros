package Program_14 

package Program_12 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A[B](a: (Char,Boolean)) extends T_A
case class CC_B(a: (T_A,T_A), b: CC_A[T_A], c: CC_A[T_A]) extends T_A
case class CC_C(a: (T_A,(Int,Char)), b: T_B[T_A]) extends T_B[CC_B]
case class CC_D() extends T_B[CC_B]

val v_a: CC_C = null
val v_b: Int = v_a match{
  case CC_C((CC_B(_, _, _),(_,_)), _) => 0 
  case CC_C((CC_A(_),(_,_)), _) => 1 
}
}
// This is not matched: (CC_C (Tuple (CC_A T_A Wildcard T_A) Wildcard)
//      Wildcard
//      (T_B (CC_B T_A T_A T_A T_A)))
// This is not matched: (CC_A (CC_A Wildcard T_A) T_A)
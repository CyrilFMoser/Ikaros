package Program_15 

package Program_7 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: Int, b: T_A[C, C], c: T_B) extends T_A[T_A[T_B, T_B], (T_B,T_B)]

val v_a: T_A[T_A[T_B, T_B], (T_B,T_B)] = null
val v_b: Int = v_a match{
  case CC_A(12, _, _) => 0 
  case CC_A(_, _, _) => 1 
}
}
// This is not matched: (CC_A T_B Wildcard Wildcard Wildcard (T_A (T_A T_B T_B) (Tuple T_B T_B)))
// This is not matched: (CC_B Int (T_A Int))
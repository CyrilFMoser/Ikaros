package Program_31 

package Program_3 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: T_B, b: ((Int,Boolean),Int)) extends T_A[T_A[T_B, Int], C]
case class CC_B[D](a: Char, b: T_B) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_B(_, _) => 0 
  case CC_B('x', _) => 1 
}
}
// This is not matched: (CC_B T_B Wildcard Wildcard T_B)
// This is not matched: (CC_B Wildcard Wildcard (CC_C T_A) T_A)
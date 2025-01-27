package Program_31 

package Program_15 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A[B](a: T_A[B]) extends T_A[B]
case class CC_B(a: Boolean, b: (T_B,T_B), c: T_B) extends T_A[T_A[T_B]]
case class CC_C[C](a: T_A[C]) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_C(_) => 0 
  case CC_C(CC_B(_, _, _)) => 1 
}
}
// This is not matched: (CC_C T_B Wildcard T_B)
// This is not matched: (CC_C T_B Wildcard T_B)
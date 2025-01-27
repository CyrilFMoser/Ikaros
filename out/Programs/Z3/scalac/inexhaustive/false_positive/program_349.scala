package Program_31 

package Program_13 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A[B](a: T_A[B]) extends T_A[B]
case class CC_B[C](a: (T_B,T_B)) extends T_A[C]
case class CC_C[D](a: CC_B[D], b: D, c: T_A[T_B]) extends T_A[D]
case class CC_D(a: CC_B[(Char,Boolean)], b: CC_A[T_B]) extends T_B
case class CC_E[E]() extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_E() => 0 
  case CC_D(CC_B(_), _) => 1 
  case CC_D(CC_B(_), CC_A(_)) => 2 
}
}
// This is not matched: (CC_E T_B T_B)
// This is not matched: (CC_C Byte (T_A Byte))
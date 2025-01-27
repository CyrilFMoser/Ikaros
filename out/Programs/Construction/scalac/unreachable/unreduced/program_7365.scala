package Program_8 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A[B](a: B) extends T_A[(T_A[T_B],(T_B,T_B))]
case class CC_B(a: T_B, b: T_A[T_B]) extends T_A[(T_A[T_B],(T_B,T_B))]
case class CC_C(a: Char) extends T_A[(T_A[T_B],(T_B,T_B))]

val v_a: T_A[(T_A[T_B],(T_B,T_B))] = null
val v_b: Int = v_a match{
  case CC_B(_, _) => 0 
  case CC_C('x') => 1 
  case CC_C(_) => 2 
}
}
// This is not matched: CC_A(_)
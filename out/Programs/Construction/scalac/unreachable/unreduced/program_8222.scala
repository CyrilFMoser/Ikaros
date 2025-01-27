package Program_11 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: C, b: T_B) extends T_A[T_B, C]
case class CC_B(a: T_A[(T_B,T_B), T_A[T_B, T_B]]) extends T_A[T_B, T_A[T_B, T_A[T_B, (Byte,Boolean)]]]

val v_a: T_A[T_B, T_A[T_B, T_A[T_B, (Byte,Boolean)]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B(_) => 1 
}
}
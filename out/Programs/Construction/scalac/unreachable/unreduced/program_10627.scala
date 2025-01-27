package Program_31 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A(a: Int, b: T_B) extends T_A[(T_B,T_A[T_B, Char]), T_A[T_A[T_B, T_B], ((Boolean,Int),T_B)]]
case class CC_B(a: T_A[T_A[T_B, CC_A], T_A[(Int,Byte), T_B]]) extends T_B
case class CC_C(a: T_B) extends T_B
case class CC_D[C](a: C) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_B(_) => 0 
  case CC_D(_) => 1 
}
}
// This is not matched: CC_C(_)
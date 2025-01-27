package Program_7 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A(a: T_A[Boolean]) extends T_A[T_A[(T_B,Char)]]
case class CC_B(a: CC_A, b: T_A[T_B], c: Boolean) extends T_A[T_A[(T_B,Char)]]
case class CC_C(a: T_B) extends T_A[T_A[(T_B,Char)]]

val v_a: T_A[T_A[(T_B,Char)]] = null
val v_b: Int = v_a match{
  case CC_B(_, _, _) => 0 
  case CC_C(_) => 1 
}
}
// This is not matched: CC_A(_)
package Program_11 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A[C](a: T_B[C], b: T_B[C]) extends T_A[C]
case class CC_B(a: T_A[T_B[Int]], b: Int) extends T_B[T_A[(Char,Char)]]
case class CC_C(a: T_B[CC_B], b: CC_A[CC_B]) extends T_B[T_A[(Char,Char)]]
case class CC_D(a: Int) extends T_B[T_A[(Char,Char)]]

val v_a: T_B[T_A[(Char,Char)]] = null
val v_b: Int = v_a match{
  case CC_B(_, _) => 0 
  case CC_C(_, _) => 1 
}
}
// This is not matched: CC_D(_)
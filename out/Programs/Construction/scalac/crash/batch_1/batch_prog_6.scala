package Program_6 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A[C](a: T_A[C]) extends T_A[C]
case class CC_B(a: T_B[Int], b: CC_A[T_A[Byte]], c: T_B[CC_A[Char]]) extends T_A[T_A[(Char,Byte)]]

val v_a: T_A[T_A[(Char,Byte)]] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(_)) => 0 
  case CC_B(_, _, _) => 1 
}
}
// This is not matched: CC_A(CC_B(_, _, _))
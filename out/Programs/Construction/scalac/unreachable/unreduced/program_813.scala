package Program_30 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A(a: T_B[T_A[Char]], b: Byte, c: T_A[T_A[Boolean]]) extends T_A[T_B[T_B[(Char,Byte)]]]
case class CC_B[C](a: T_A[C]) extends T_A[C]
case class CC_C(a: CC_A, b: T_A[T_B[Boolean]], c: CC_B[CC_B[CC_A]]) extends T_B[Boolean]

val v_a: T_A[T_B[T_B[(Char,Byte)]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B(CC_B(_)) => 1 
}
}
// This is not matched: CC_B(CC_A(_, _, _))
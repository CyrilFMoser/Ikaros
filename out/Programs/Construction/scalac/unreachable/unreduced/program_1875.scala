package Program_21 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A(a: T_A[T_B[Byte]], b: T_A[T_B[Byte]]) extends T_A[T_B[Byte]]
case class CC_B(a: T_A[Int], b: T_A[T_A[Byte]], c: T_B[T_B[CC_A]]) extends T_A[T_B[Byte]]
case class CC_C(a: T_B[T_A[CC_A]], b: Byte, c: T_A[T_B[Byte]]) extends T_B[T_A[T_B[Byte]]]
case class CC_D(a: T_B[T_A[CC_C]]) extends T_B[T_A[T_B[Byte]]]

val v_a: CC_A = null
val v_b: Int = v_a match{
  case CC_A(CC_A(_, _), CC_A(_, _)) => 0 
  case CC_A(CC_A(_, _), CC_B(_, _, _)) => 1 
  case CC_A(CC_B(_, _, _), CC_A(_, _)) => 2 
}
}
// This is not matched: CC_A(CC_B(_, _, _), CC_B(_, _, _))
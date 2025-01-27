package Program_26 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A(a: T_B[T_A[Byte]], b: T_B[T_B[Int]]) extends T_A[T_B[T_B[Byte]]]
case class CC_B(a: T_B[CC_A]) extends T_A[T_B[T_B[Byte]]]
case class CC_C[C](a: C, b: (T_B[CC_B],Char)) extends T_B[C]
case class CC_D(a: Byte, b: T_B[Byte], c: T_A[CC_A]) extends T_B[T_B[CC_B]]
case class CC_E[D]() extends T_B[D]

val v_a: T_B[T_B[CC_B]] = null
val v_b: Int = v_a match{
  case CC_D(_, _, _) => 0 
  case CC_E() => 1 
}
}
// This is not matched: CC_C(_, _)
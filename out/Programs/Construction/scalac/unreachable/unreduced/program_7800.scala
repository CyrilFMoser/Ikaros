package Program_13 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: Byte, b: Int, c: T_B[Int, T_A]) extends T_A
case class CC_B(a: Boolean, b: T_B[T_A, Boolean]) extends T_A
case class CC_C[C](a: (T_A,T_B[T_A, CC_B]), b: T_A, c: T_B[C, C]) extends T_B[C, CC_A]
case class CC_D[D]() extends T_B[D, CC_A]
case class CC_E[E](a: E) extends T_B[E, CC_A]

val v_a: T_B[CC_A, CC_A] = null
val v_b: Int = v_a match{
  case CC_D() => 0 
  case CC_E(CC_A(_, _, _)) => 1 
}
}
// This is not matched: CC_C(_, _, _)
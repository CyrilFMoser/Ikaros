package Program_12 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_B[T_B[T_A, T_A], (T_A,T_A)], b: T_A, c: Byte) extends T_A
case class CC_B(a: Char, b: CC_A) extends T_A
case class CC_C() extends T_A
case class CC_D[C]() extends T_B[C, CC_B]
case class CC_E[D](a: Byte, b: D) extends T_B[D, CC_B]
case class CC_F[E, F](a: CC_D[T_A]) extends T_B[E, CC_B]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B(_, _) => 1 
  case CC_C() => 2 
}
}
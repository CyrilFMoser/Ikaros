package Program_29 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A() extends T_A
case class CC_B(a: CC_A, b: CC_A, c: T_B[T_A, T_B[T_A, CC_A]]) extends T_A
case class CC_C[C](a: C, b: T_B[C, C], c: C) extends T_A
case class CC_D[D](a: T_A, b: CC_B) extends T_B[D, T_B[Boolean, CC_A]]
case class CC_E() extends T_B[Byte, T_B[Boolean, CC_A]]
case class CC_F[E](a: CC_D[E], b: T_B[E, T_B[Boolean, CC_A]]) extends T_B[E, T_B[Boolean, CC_A]]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_, _, _) => 1 
  case CC_C(_, _, _) => 2 
}
}
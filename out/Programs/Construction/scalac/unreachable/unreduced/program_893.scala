package Program_17 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A() extends T_A
case class CC_B(a: CC_A, b: T_B[T_A, (CC_A,CC_A)]) extends T_A
case class CC_C(a: Int, b: (Char,CC_B)) extends T_A
case class CC_D[C](a: C, b: C) extends T_B[C, Byte]
case class CC_E(a: T_B[CC_C, (CC_A,CC_A)], b: CC_D[CC_C]) extends T_B[CC_C, Byte]
case class CC_F[D](a: T_B[D, T_B[D, D]], b: D, c: Boolean) extends T_B[D, T_B[D, D]]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_B(CC_A(), _) => 0 
  case CC_C(_, _) => 1 
}
}
// This is not matched: CC_A()
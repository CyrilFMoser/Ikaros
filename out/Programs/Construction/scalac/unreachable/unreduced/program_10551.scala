package Program_26 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_B[T_B[(Int,Boolean), T_A], (T_A,T_A)], b: T_B[Byte, Char]) extends T_A
case class CC_B(a: CC_A, b: CC_A, c: CC_A) extends T_A
case class CC_C(a: CC_B, b: Int) extends T_A
case class CC_D[C](a: CC_A, b: T_B[C, C]) extends T_B[(Char,CC_B), C]
case class CC_E[D](a: (CC_A,CC_C), b: Char) extends T_B[(Char,CC_B), D]

val v_a: T_B[(Char,CC_B), CC_A] = null
val v_b: Int = v_a match{
  case CC_D(CC_A(_, _), _) => 0 
  case CC_E(_, _) => 1 
}
}
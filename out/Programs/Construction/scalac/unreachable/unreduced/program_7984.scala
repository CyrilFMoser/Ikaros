package Program_20 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_A, b: T_B[T_A, Boolean]) extends T_A
case class CC_B(a: CC_A, b: T_B[Byte, CC_A]) extends T_A
case class CC_C[C](a: CC_B, b: T_B[C, C]) extends T_B[(Byte,CC_B), C]
case class CC_D[D](a: T_B[(Byte,CC_B), T_A], b: T_B[(Byte,CC_B), D]) extends T_B[(Byte,CC_B), D]

val v_a: CC_D[T_A] = null
val v_b: Int = v_a match{
  case CC_D(_, CC_C(_, _)) => 0 
  case CC_D(_, CC_D(_, _)) => 1 
}
}
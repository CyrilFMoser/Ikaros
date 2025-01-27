package Program_3 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_B[Byte, T_B[T_A, T_A]]) extends T_A
case class CC_B() extends T_A
case class CC_C(a: CC_A) extends T_A
case class CC_D(a: T_A) extends T_B[T_B[(Char,CC_B), T_B[CC_C, Int]], T_B[T_A, T_A]]
case class CC_E(a: T_A, b: Int) extends T_B[T_B[(Char,CC_B), T_B[CC_C, Int]], T_B[T_A, T_A]]
case class CC_F() extends T_B[T_B[(Char,CC_B), T_B[CC_C, Int]], T_B[T_A, T_A]]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B() => 1 
  case CC_C(CC_A(_)) => 2 
}
}
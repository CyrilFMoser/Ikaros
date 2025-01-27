package Program_7 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: Int, b: Byte) extends T_A
case class CC_B(a: T_A, b: Char, c: T_B[T_B[T_A, T_A], (CC_A,CC_A)]) extends T_A
case class CC_C(a: CC_B) extends T_A
case class CC_D[C]() extends T_B[C, T_B[C, C]]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(12, _) => 0 
  case CC_A(_, _) => 1 
  case CC_B(_, _, _) => 2 
  case CC_C(_) => 3 
}
}
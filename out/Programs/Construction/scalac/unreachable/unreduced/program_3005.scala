package Program_3 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A() extends T_A
case class CC_B(a: T_B[T_B[T_A, T_A], T_A], b: T_B[CC_A, T_B[T_A, CC_A]]) extends T_A
case class CC_C(a: Byte, b: CC_B, c: Char) extends T_A
case class CC_D[C](a: (T_B[CC_C, CC_A],CC_A), b: CC_C, c: C) extends T_B[C, CC_A]
case class CC_E(a: CC_A, b: Char) extends T_B[T_A, CC_A]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_, _) => 1 
  case CC_C(_, _, _) => 2 
}
}
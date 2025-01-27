package Program_18 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A() extends T_A
case class CC_B(a: Byte, b: T_B[T_B[Boolean, CC_A], Char]) extends T_A
case class CC_C(a: CC_A, b: T_B[T_A, T_A], c: CC_B) extends T_A
case class CC_D[C](a: T_A, b: CC_B) extends T_B[C, Boolean]
case class CC_E[D]() extends T_B[D, Boolean]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_, _) => 1 
}
}
// This is not matched: CC_C(CC_A(), _, CC_B(_, _))
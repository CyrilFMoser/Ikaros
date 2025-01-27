package Program_20 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A() extends T_A
case class CC_B(a: T_B[Byte, T_A]) extends T_A
case class CC_C[C](a: Char, b: Char, c: (CC_B,CC_A)) extends T_B[C, Boolean]
case class CC_D(a: T_B[CC_C[CC_B], Boolean], b: (CC_A,CC_C[CC_A])) extends T_B[CC_C[CC_B], Boolean]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_) => 1 
}
}
package Program_5 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: Byte, b: (Int,T_B[T_A, T_A])) extends T_A
case class CC_B() extends T_A
case class CC_C(a: CC_A, b: T_B[Int, Char]) extends T_A
case class CC_D(a: T_A) extends T_B[Int, T_B[CC_B, T_A]]
case class CC_E[C](a: C) extends T_B[T_B[C, CC_C], C]
case class CC_F(a: T_B[T_B[CC_D, (Int,Int)], CC_B], b: T_A) extends T_B[Int, T_B[CC_B, T_A]]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_B() => 0 
  case CC_C(CC_A(_, _), _) => 1 
}
}
// This is not matched: CC_A(_, _)
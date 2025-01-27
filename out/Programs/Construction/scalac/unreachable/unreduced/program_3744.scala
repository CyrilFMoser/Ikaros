package Program_6 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A() extends T_A
case class CC_B() extends T_A
case class CC_C() extends T_A
case class CC_D(a: (T_B[(Int,Byte), CC_B],T_A), b: CC_C, c: T_B[T_B[Byte, CC_C], Char]) extends T_B[Byte, Int]
case class CC_E[C]() extends T_B[C, T_B[Byte, Int]]
case class CC_F[D](a: T_B[Byte, Int], b: T_B[D, T_B[Byte, Int]]) extends T_B[D, T_B[Byte, Int]]

val v_a: T_B[CC_D, T_B[Byte, Int]] = null
val v_b: Int = v_a match{
  case CC_E() => 0 
  case CC_F(CC_D(_, _, _), CC_E()) => 1 
}
}
// This is not matched: CC_F(CC_D(_, _, _), CC_F(_, _))
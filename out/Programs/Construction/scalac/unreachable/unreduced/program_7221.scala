package Program_20 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_A, b: T_A) extends T_A
case class CC_B(a: Byte, b: T_A, c: T_B[Boolean, Char]) extends T_A
case class CC_C[C](a: CC_B, b: Byte, c: C) extends T_B[CC_B, C]
case class CC_D[D](a: D, b: (Byte,(CC_B,CC_A))) extends T_B[CC_B, D]

val v_a: CC_A = null
val v_b: Int = v_a match{
  case CC_A(_, CC_A(CC_A(_, _), CC_A(_, _))) => 0 
  case CC_A(_, CC_A(CC_B(_, _, _), CC_A(_, _))) => 1 
  case CC_A(_, CC_A(CC_B(_, _, _), CC_B(_, _, _))) => 2 
  case CC_A(_, CC_B(_, _, _)) => 3 
}
}
// This is not matched: CC_A(_, CC_A(CC_A(_, _), CC_B(_, _, _)))
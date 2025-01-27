package Program_3 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_A) extends T_A
case class CC_B(a: T_B[(Boolean,CC_A), T_A], b: CC_A, c: CC_A) extends T_A
case class CC_C[C](a: T_B[C, T_B[C, CC_B]]) extends T_B[C, CC_B]
case class CC_D[D](a: D, b: T_A) extends T_B[(Int,((Byte,Char),CC_B)), CC_B]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(CC_A(_)) => 0 
  case CC_A(CC_B(_, _, _)) => 1 
  case CC_B(_, _, _) => 2 
}
}
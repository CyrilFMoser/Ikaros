package Program_13 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: Char, b: T_B[T_A, T_B[T_A, T_A]]) extends T_A
case class CC_B(a: T_A) extends T_A
case class CC_C[C](a: CC_B) extends T_B[CC_A, C]
case class CC_D[D](a: Byte) extends T_B[CC_A, D]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B(CC_A(_, _)) => 1 
  case CC_B(CC_B(_)) => 2 
}
}
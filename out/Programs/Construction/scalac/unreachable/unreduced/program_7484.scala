package Program_10 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_B[Byte, T_A], b: T_B[(T_A,T_A), T_B[(Int,Char), T_A]]) extends T_A
case class CC_B() extends T_A
case class CC_C[C]() extends T_B[CC_B, C]
case class CC_D[D](a: Char) extends T_B[CC_B, D]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B() => 1 
}
}
package Program_22 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_A) extends T_A
case class CC_B(a: CC_A, b: T_B[CC_A, Int], c: Byte) extends T_A
case class CC_C[C]() extends T_B[CC_B, C]
case class CC_D[D](a: CC_B) extends T_B[CC_B, D]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(CC_A(_)) => 0 
  case CC_A(CC_B(_, _, _)) => 1 
  case CC_B(CC_A(CC_A(_)), _, _) => 2 
  case CC_B(CC_A(CC_B(_, _, _)), _, _) => 3 
}
}
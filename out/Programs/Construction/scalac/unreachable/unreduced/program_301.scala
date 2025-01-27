package Program_30 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_A) extends T_A
case class CC_B(a: CC_A, b: T_B[T_B[CC_A, Char], T_B[CC_A, CC_A]], c: T_A) extends T_A
case class CC_C[C](a: T_B[C, C], b: Byte) extends T_B[CC_B, C]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(CC_A(_)) => 0 
  case CC_A(CC_B(_, _, _)) => 1 
  case CC_B(_, _, _) => 2 
}
}
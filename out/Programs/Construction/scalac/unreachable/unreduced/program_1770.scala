package Program_2 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: Byte, b: T_A, c: T_A) extends T_A
case class CC_B(a: T_B[CC_A, CC_A]) extends T_A
case class CC_C[C]() extends T_B[Byte, CC_A]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(0, _, _) => 0 
  case CC_A(_, _, _) => 1 
  case CC_B(_) => 2 
}
}
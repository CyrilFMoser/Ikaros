package Program_30 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A() extends T_A
case class CC_B(a: T_A, b: T_A, c: T_B[Byte, T_A]) extends T_A
case class CC_C[C](a: C) extends T_B[C, T_B[CC_A, CC_B]]
case class CC_D() extends T_B[Int, T_B[CC_A, CC_B]]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(CC_A(), CC_A(), _) => 1 
  case CC_B(CC_B(_, _, _), CC_A(), _) => 2 
  case CC_B(CC_B(_, _, _), CC_B(_, _, _), _) => 3 
}
}
// This is not matched: CC_B(CC_A(), CC_B(_, _, _), _)
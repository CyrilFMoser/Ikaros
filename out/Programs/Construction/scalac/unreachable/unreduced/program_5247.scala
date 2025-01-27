package Program_3 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A() extends T_A[Int, T_B]
case class CC_B(a: T_B, b: Byte) extends T_A[Int, T_B]
case class CC_C(a: T_A[Int, T_B], b: T_B, c: T_B) extends T_B
case class CC_D(a: CC_C, b: T_A[CC_B, T_A[Int, T_B]]) extends T_B

val v_a: CC_B = null
val v_b: Int = v_a match{
  case CC_B(CC_C(CC_A(), _, CC_C(_, _, _)), _) => 0 
  case CC_B(CC_C(CC_A(), _, CC_D(_, _)), _) => 1 
  case CC_B(CC_C(CC_B(_, _), _, CC_C(_, _, _)), _) => 2 
  case CC_B(CC_C(CC_B(_, _), _, CC_D(_, _)), _) => 3 
  case CC_B(CC_D(_, _), _) => 4 
}
}
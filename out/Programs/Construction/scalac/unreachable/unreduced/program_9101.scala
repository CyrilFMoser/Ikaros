package Program_23 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A(a: T_A[T_B], b: Int, c: T_A[T_A[(Byte,Int)]]) extends T_A[T_B]
case class CC_B() extends T_A[T_B]
case class CC_C(a: CC_A) extends T_A[T_B]
case class CC_D() extends T_B
case class CC_E(a: Char) extends T_B
case class CC_F(a: T_B, b: Int) extends T_B

val v_a: T_A[T_B] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(CC_A(_, _, _), 12, _), _, _) => 0 
  case CC_A(CC_A(CC_B(), 12, _), _, _) => 1 
  case CC_A(CC_A(CC_C(_), 12, _), _, _) => 2 
  case CC_A(CC_A(CC_A(_, _, _), _, _), _, _) => 3 
  case CC_A(CC_A(CC_B(), _, _), _, _) => 4 
  case CC_A(CC_A(CC_C(_), _, _), _, _) => 5 
  case CC_A(CC_B(), _, _) => 6 
  case CC_A(CC_C(_), _, _) => 7 
  case CC_B() => 8 
  case CC_C(CC_A(CC_A(_, _, _), _, _)) => 9 
  case CC_C(CC_A(CC_B(), _, _)) => 10 
  case CC_C(CC_A(CC_C(_), _, _)) => 11 
}
}
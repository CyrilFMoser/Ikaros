package Program_19 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_A) extends T_A
case class CC_B(a: CC_A, b: T_B[T_B[CC_A, Byte], T_B[T_A, T_A]], c: T_B[T_B[CC_A, CC_A], CC_A]) extends T_A
case class CC_C(a: CC_B, b: T_A, c: T_B[Boolean, Boolean]) extends T_A
case class CC_D() extends T_B[Boolean, T_A]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(CC_A(CC_A(_))) => 0 
  case CC_A(CC_A(CC_B(_, _, _))) => 1 
  case CC_A(CC_A(CC_C(_, _, _))) => 2 
  case CC_A(CC_B(CC_A(_), _, _)) => 3 
  case CC_A(CC_C(_, _, _)) => 4 
  case CC_B(CC_A(_), _, _) => 5 
  case CC_C(_, _, _) => 6 
}
}
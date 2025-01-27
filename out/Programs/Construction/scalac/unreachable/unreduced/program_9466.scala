package Program_1 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A() extends T_A[Boolean]
case class CC_B(a: T_B, b: Int, c: T_B) extends T_A[Boolean]
case class CC_C(a: T_A[CC_B]) extends T_A[Boolean]
case class CC_D(a: CC_C, b: CC_C) extends T_B
case class CC_E(a: (T_A[(Boolean,Int)],Byte)) extends T_B
case class CC_F(a: CC_B, b: T_A[Boolean]) extends T_B

val v_a: T_A[Boolean] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(CC_D(CC_C(_), _), _, CC_D(CC_C(_), _)) => 1 
  case CC_B(CC_D(CC_C(_), _), _, CC_E(_)) => 2 
  case CC_B(CC_D(CC_C(_), _), _, CC_F(CC_B(_, _, _), CC_A())) => 3 
  case CC_B(CC_D(CC_C(_), _), _, CC_F(CC_B(_, _, _), CC_B(_, _, _))) => 4 
  case CC_B(CC_D(CC_C(_), _), _, CC_F(CC_B(_, _, _), CC_C(_))) => 5 
  case CC_B(CC_E(_), _, CC_D(CC_C(_), _)) => 6 
  case CC_B(CC_E(_), _, CC_E(_)) => 7 
  case CC_B(CC_E(_), _, CC_F(CC_B(_, _, _), CC_A())) => 8 
  case CC_B(CC_E(_), _, CC_F(CC_B(_, _, _), CC_B(_, _, _))) => 9 
  case CC_B(CC_E(_), _, CC_F(CC_B(_, _, _), CC_C(_))) => 10 
  case CC_B(CC_F(CC_B(_, _, _), _), _, CC_D(CC_C(_), _)) => 11 
  case CC_B(CC_F(CC_B(_, _, _), _), _, CC_E(_)) => 12 
  case CC_B(CC_F(CC_B(_, _, _), _), _, CC_F(CC_B(_, _, _), CC_A())) => 13 
  case CC_B(CC_F(CC_B(_, _, _), _), _, CC_F(CC_B(_, _, _), CC_B(_, _, _))) => 14 
  case CC_B(CC_F(CC_B(_, _, _), _), _, CC_F(CC_B(_, _, _), CC_C(_))) => 15 
  case CC_C(_) => 16 
}
}
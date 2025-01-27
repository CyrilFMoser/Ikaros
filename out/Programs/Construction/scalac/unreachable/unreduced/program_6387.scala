package Program_6 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A(a: T_B[Byte], b: Byte) extends T_A
case class CC_B(a: T_A) extends T_A
case class CC_C(a: T_A, b: T_A, c: CC_A) extends T_A
case class CC_D(a: CC_B, b: T_B[CC_A]) extends T_B[CC_B]
case class CC_E() extends T_B[CC_B]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(_, 0) => 0 
  case CC_A(_, _) => 1 
  case CC_B(CC_A(_, _)) => 2 
  case CC_B(CC_B(_)) => 3 
  case CC_B(CC_C(CC_A(_, _), _, CC_A(_, _))) => 4 
  case CC_B(CC_C(CC_B(_), _, CC_A(_, _))) => 5 
  case CC_B(CC_C(CC_C(_, _, _), _, CC_A(_, _))) => 6 
  case CC_C(CC_A(_, 0), _, CC_A(_, _)) => 7 
  case CC_C(CC_A(_, _), _, CC_A(_, _)) => 8 
  case CC_C(CC_B(CC_A(_, _)), _, CC_A(_, _)) => 9 
  case CC_C(CC_B(CC_B(_)), _, CC_A(_, _)) => 10 
  case CC_C(CC_B(CC_C(_, _, _)), _, CC_A(_, _)) => 11 
  case CC_C(CC_C(CC_A(_, _), CC_A(_, _), CC_A(_, _)), _, CC_A(_, _)) => 12 
  case CC_C(CC_C(CC_A(_, _), CC_B(_), CC_A(_, _)), _, CC_A(_, _)) => 13 
  case CC_C(CC_C(CC_A(_, _), CC_C(_, _, _), CC_A(_, _)), _, CC_A(_, _)) => 14 
  case CC_C(CC_C(CC_B(_), CC_A(_, _), CC_A(_, _)), _, CC_A(_, _)) => 15 
  case CC_C(CC_C(CC_B(_), CC_B(_), CC_A(_, _)), _, CC_A(_, _)) => 16 
  case CC_C(CC_C(CC_B(_), CC_C(_, _, _), CC_A(_, _)), _, CC_A(_, _)) => 17 
  case CC_C(CC_C(CC_C(_, _, _), CC_A(_, _), CC_A(_, _)), _, CC_A(_, _)) => 18 
  case CC_C(CC_C(CC_C(_, _, _), CC_B(_), CC_A(_, _)), _, CC_A(_, _)) => 19 
  case CC_C(CC_C(CC_C(_, _, _), CC_C(_, _, _), CC_A(_, _)), _, CC_A(_, _)) => 20 
}
}
package Program_3 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A(a: T_A, b: T_A) extends T_A
case class CC_B(a: T_A, b: CC_A, c: T_A) extends T_A
case class CC_C(a: Boolean) extends T_A
case class CC_D(a: T_A, b: CC_B, c: CC_B) extends T_B[CC_B]
case class CC_E(a: Byte, b: T_B[T_B[CC_B]]) extends T_B[CC_B]

val v_a: T_B[CC_B] = null
val v_b: Int = v_a match{
  case CC_D(CC_A(CC_A(_, _), CC_A(_, _)), _, CC_B(CC_A(_, _), CC_A(_, _), _)) => 0 
  case CC_D(CC_A(CC_B(_, _, _), CC_A(_, _)), _, CC_B(CC_A(_, _), CC_A(_, _), _)) => 1 
  case CC_D(CC_A(CC_C(_), CC_A(_, _)), _, CC_B(CC_A(_, _), CC_A(_, _), _)) => 2 
  case CC_D(CC_A(CC_A(_, _), CC_B(_, _, _)), _, CC_B(CC_A(_, _), CC_A(_, _), _)) => 3 
  case CC_D(CC_A(CC_B(_, _, _), CC_B(_, _, _)), _, CC_B(CC_A(_, _), CC_A(_, _), _)) => 4 
  case CC_D(CC_A(CC_C(_), CC_B(_, _, _)), _, CC_B(CC_A(_, _), CC_A(_, _), _)) => 5 
  case CC_D(CC_A(CC_A(_, _), CC_C(_)), _, CC_B(CC_A(_, _), CC_A(_, _), _)) => 6 
  case CC_D(CC_A(CC_B(_, _, _), CC_C(_)), _, CC_B(CC_A(_, _), CC_A(_, _), _)) => 7 
  case CC_D(CC_A(CC_C(_), CC_C(_)), _, CC_B(CC_A(_, _), CC_A(_, _), _)) => 8 
  case CC_D(CC_B(CC_A(_, _), _, _), _, CC_B(CC_A(_, _), CC_A(_, _), _)) => 9 
  case CC_D(CC_B(CC_B(_, _, _), _, _), _, CC_B(CC_A(_, _), CC_A(_, _), _)) => 10 
  case CC_D(CC_B(CC_C(_), _, _), _, CC_B(CC_A(_, _), CC_A(_, _), _)) => 11 
  case CC_D(CC_C(true), _, CC_B(CC_A(_, _), CC_A(_, _), _)) => 12 
  case CC_D(CC_C(false), _, CC_B(CC_A(_, _), CC_A(_, _), _)) => 13 
  case CC_D(CC_A(CC_A(_, _), CC_A(_, _)), _, CC_B(CC_B(_, _, _), CC_A(_, _), _)) => 14 
  case CC_D(CC_A(CC_B(_, _, _), CC_A(_, _)), _, CC_B(CC_B(_, _, _), CC_A(_, _), _)) => 15 
  case CC_D(CC_A(CC_C(_), CC_A(_, _)), _, CC_B(CC_B(_, _, _), CC_A(_, _), _)) => 16 
  case CC_D(CC_A(CC_A(_, _), CC_B(_, _, _)), _, CC_B(CC_B(_, _, _), CC_A(_, _), _)) => 17 
  case CC_D(CC_A(CC_B(_, _, _), CC_B(_, _, _)), _, CC_B(CC_B(_, _, _), CC_A(_, _), _)) => 18 
  case CC_D(CC_A(CC_C(_), CC_B(_, _, _)), _, CC_B(CC_B(_, _, _), CC_A(_, _), _)) => 19 
  case CC_D(CC_A(CC_A(_, _), CC_C(_)), _, CC_B(CC_B(_, _, _), CC_A(_, _), _)) => 20 
  case CC_D(CC_A(CC_B(_, _, _), CC_C(_)), _, CC_B(CC_B(_, _, _), CC_A(_, _), _)) => 21 
  case CC_D(CC_A(CC_C(_), CC_C(_)), _, CC_B(CC_B(_, _, _), CC_A(_, _), _)) => 22 
  case CC_D(CC_B(CC_A(_, _), _, _), _, CC_B(CC_B(_, _, _), CC_A(_, _), _)) => 23 
  case CC_D(CC_B(CC_B(_, _, _), _, _), _, CC_B(CC_B(_, _, _), CC_A(_, _), _)) => 24 
  case CC_D(CC_B(CC_C(_), _, _), _, CC_B(CC_B(_, _, _), CC_A(_, _), _)) => 25 
  case CC_D(CC_C(true), _, CC_B(CC_B(_, _, _), CC_A(_, _), _)) => 26 
  case CC_D(CC_C(false), _, CC_B(CC_B(_, _, _), CC_A(_, _), _)) => 27 
  case CC_D(CC_A(CC_A(_, _), CC_A(_, _)), _, CC_B(CC_C(_), CC_A(_, _), _)) => 28 
  case CC_D(CC_A(CC_B(_, _, _), CC_A(_, _)), _, CC_B(CC_C(_), CC_A(_, _), _)) => 29 
  case CC_D(CC_A(CC_C(_), CC_A(_, _)), _, CC_B(CC_C(_), CC_A(_, _), _)) => 30 
  case CC_D(CC_A(CC_A(_, _), CC_B(_, _, _)), _, CC_B(CC_C(_), CC_A(_, _), _)) => 31 
  case CC_D(CC_A(CC_B(_, _, _), CC_B(_, _, _)), _, CC_B(CC_C(_), CC_A(_, _), _)) => 32 
  case CC_D(CC_A(CC_C(_), CC_B(_, _, _)), _, CC_B(CC_C(_), CC_A(_, _), _)) => 33 
  case CC_D(CC_A(CC_A(_, _), CC_C(_)), _, CC_B(CC_C(_), CC_A(_, _), _)) => 34 
  case CC_D(CC_A(CC_B(_, _, _), CC_C(_)), _, CC_B(CC_C(_), CC_A(_, _), _)) => 35 
  case CC_D(CC_A(CC_C(_), CC_C(_)), _, CC_B(CC_C(_), CC_A(_, _), _)) => 36 
  case CC_D(CC_B(CC_A(_, _), _, _), _, CC_B(CC_C(_), CC_A(_, _), _)) => 37 
  case CC_D(CC_B(CC_B(_, _, _), _, _), _, CC_B(CC_C(_), CC_A(_, _), _)) => 38 
  case CC_D(CC_B(CC_C(_), _, _), _, CC_B(CC_C(_), CC_A(_, _), _)) => 39 
  case CC_D(CC_C(true), _, CC_B(CC_C(_), CC_A(_, _), _)) => 40 
  case CC_D(CC_C(false), _, CC_B(CC_C(_), CC_A(_, _), _)) => 41 
  case CC_E(_, _) => 42 
}
}
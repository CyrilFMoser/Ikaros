package Program_31 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A(a: T_B, b: Int) extends T_A[T_B]
case class CC_B(a: T_B, b: T_A[T_B], c: CC_A) extends T_A[T_B]
case class CC_C(a: T_A[Byte], b: T_A[Boolean]) extends T_B
case class CC_D(a: T_B, b: T_B, c: T_B) extends T_B
case class CC_E(a: CC_B) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_C(_, _) => 0 
  case CC_D(CC_C(_, _), CC_C(_, _), CC_C(_, _)) => 1 
  case CC_D(CC_C(_, _), CC_D(CC_C(_, _), _, _), CC_C(_, _)) => 2 
  case CC_D(CC_C(_, _), CC_D(CC_D(_, _, _), _, _), CC_C(_, _)) => 3 
  case CC_D(CC_C(_, _), CC_D(CC_E(_), _, _), CC_C(_, _)) => 4 
  case CC_D(CC_C(_, _), CC_E(CC_B(_, _, _)), CC_C(_, _)) => 5 
  case CC_D(CC_C(_, _), CC_C(_, _), CC_D(_, _, _)) => 6 
  case CC_D(CC_C(_, _), CC_D(CC_C(_, _), _, _), CC_D(_, _, _)) => 7 
  case CC_D(CC_C(_, _), CC_D(CC_D(_, _, _), _, _), CC_D(_, _, _)) => 8 
  case CC_D(CC_C(_, _), CC_D(CC_E(_), _, _), CC_D(_, _, _)) => 9 
  case CC_D(CC_C(_, _), CC_E(CC_B(_, _, _)), CC_D(_, _, _)) => 10 
  case CC_D(CC_C(_, _), CC_C(_, _), CC_E(_)) => 11 
  case CC_D(CC_C(_, _), CC_D(CC_C(_, _), _, _), CC_E(_)) => 12 
  case CC_D(CC_C(_, _), CC_D(CC_D(_, _, _), _, _), CC_E(_)) => 13 
  case CC_D(CC_C(_, _), CC_D(CC_E(_), _, _), CC_E(_)) => 14 
  case CC_D(CC_C(_, _), CC_E(CC_B(_, _, _)), CC_E(_)) => 15 
  case CC_D(CC_D(_, _, _), CC_C(_, _), CC_C(_, _)) => 16 
  case CC_D(CC_D(_, _, _), CC_D(CC_C(_, _), _, _), CC_C(_, _)) => 17 
  case CC_D(CC_D(_, _, _), CC_D(CC_D(_, _, _), _, _), CC_C(_, _)) => 18 
  case CC_D(CC_D(_, _, _), CC_D(CC_E(_), _, _), CC_C(_, _)) => 19 
  case CC_D(CC_D(_, _, _), CC_E(CC_B(_, _, _)), CC_C(_, _)) => 20 
  case CC_D(CC_D(_, _, _), CC_C(_, _), CC_D(_, _, _)) => 21 
  case CC_D(CC_D(_, _, _), CC_D(CC_C(_, _), _, _), CC_D(_, _, _)) => 22 
  case CC_D(CC_D(_, _, _), CC_D(CC_D(_, _, _), _, _), CC_D(_, _, _)) => 23 
  case CC_D(CC_D(_, _, _), CC_D(CC_E(_), _, _), CC_D(_, _, _)) => 24 
  case CC_D(CC_D(_, _, _), CC_E(CC_B(_, _, _)), CC_D(_, _, _)) => 25 
  case CC_D(CC_D(_, _, _), CC_C(_, _), CC_E(_)) => 26 
  case CC_D(CC_D(_, _, _), CC_D(CC_C(_, _), _, _), CC_E(_)) => 27 
  case CC_D(CC_D(_, _, _), CC_D(CC_D(_, _, _), _, _), CC_E(_)) => 28 
  case CC_D(CC_D(_, _, _), CC_D(CC_E(_), _, _), CC_E(_)) => 29 
  case CC_D(CC_D(_, _, _), CC_E(CC_B(_, _, _)), CC_E(_)) => 30 
  case CC_D(CC_E(CC_B(_, _, _)), CC_C(_, _), CC_C(_, _)) => 31 
  case CC_D(CC_E(CC_B(_, _, _)), CC_D(CC_C(_, _), _, _), CC_C(_, _)) => 32 
  case CC_D(CC_E(CC_B(_, _, _)), CC_D(CC_D(_, _, _), _, _), CC_C(_, _)) => 33 
  case CC_D(CC_E(CC_B(_, _, _)), CC_D(CC_E(_), _, _), CC_C(_, _)) => 34 
  case CC_D(CC_E(CC_B(_, _, _)), CC_E(CC_B(_, _, _)), CC_C(_, _)) => 35 
  case CC_D(CC_E(CC_B(_, _, _)), CC_C(_, _), CC_D(_, _, _)) => 36 
  case CC_D(CC_E(CC_B(_, _, _)), CC_D(CC_C(_, _), _, _), CC_D(_, _, _)) => 37 
  case CC_D(CC_E(CC_B(_, _, _)), CC_D(CC_D(_, _, _), _, _), CC_D(_, _, _)) => 38 
  case CC_D(CC_E(CC_B(_, _, _)), CC_D(CC_E(_), _, _), CC_D(_, _, _)) => 39 
  case CC_D(CC_E(CC_B(_, _, _)), CC_E(CC_B(_, _, _)), CC_D(_, _, _)) => 40 
  case CC_D(CC_E(CC_B(_, _, _)), CC_C(_, _), CC_E(_)) => 41 
  case CC_D(CC_E(CC_B(_, _, _)), CC_D(CC_C(_, _), _, _), CC_E(_)) => 42 
  case CC_D(CC_E(CC_B(_, _, _)), CC_D(CC_D(_, _, _), _, _), CC_E(_)) => 43 
  case CC_D(CC_E(CC_B(_, _, _)), CC_D(CC_E(_), _, _), CC_E(_)) => 44 
  case CC_D(CC_E(CC_B(_, _, _)), CC_E(CC_B(_, _, _)), CC_E(_)) => 45 
  case CC_E(_) => 46 
}
}
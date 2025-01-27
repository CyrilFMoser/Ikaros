package Program_4 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_A, b: T_A) extends T_A
case class CC_B(a: T_B[T_B[CC_A, CC_A], CC_A], b: T_B[(T_A,T_A), Int]) extends T_A
case class CC_C(a: T_A) extends T_A
case class CC_D[C](a: CC_A, b: C, c: Int) extends T_B[C, CC_C]

val v_a: CC_D[Int] = null
val v_b: Int = v_a match{
  case CC_D(CC_A(CC_A(_, _), CC_A(_, _)), 12, 12) => 0 
  case CC_D(CC_A(CC_A(_, _), CC_A(_, _)), _, 12) => 1 
  case CC_D(CC_A(CC_B(_, _), CC_A(_, _)), 12, 12) => 2 
  case CC_D(CC_A(CC_B(_, _), CC_A(_, _)), _, 12) => 3 
  case CC_D(CC_A(CC_C(_), CC_A(_, _)), 12, 12) => 4 
  case CC_D(CC_A(CC_C(_), CC_A(_, _)), _, 12) => 5 
  case CC_D(CC_A(CC_A(_, _), CC_B(_, _)), 12, 12) => 6 
  case CC_D(CC_A(CC_A(_, _), CC_B(_, _)), _, 12) => 7 
  case CC_D(CC_A(CC_B(_, _), CC_B(_, _)), 12, 12) => 8 
  case CC_D(CC_A(CC_B(_, _), CC_B(_, _)), _, 12) => 9 
  case CC_D(CC_A(CC_C(_), CC_B(_, _)), 12, 12) => 10 
  case CC_D(CC_A(CC_C(_), CC_B(_, _)), _, 12) => 11 
  case CC_D(CC_A(CC_A(_, _), CC_C(_)), 12, 12) => 12 
  case CC_D(CC_A(CC_A(_, _), CC_C(_)), _, 12) => 13 
  case CC_D(CC_A(CC_B(_, _), CC_C(_)), 12, 12) => 14 
  case CC_D(CC_A(CC_B(_, _), CC_C(_)), _, 12) => 15 
  case CC_D(CC_A(CC_C(_), CC_C(_)), 12, 12) => 16 
  case CC_D(CC_A(CC_C(_), CC_C(_)), _, 12) => 17 
  case CC_D(CC_A(CC_A(_, _), CC_A(_, _)), 12, _) => 18 
  case CC_D(CC_A(CC_A(_, _), CC_A(_, _)), _, _) => 19 
  case CC_D(CC_A(CC_B(_, _), CC_A(_, _)), 12, _) => 20 
  case CC_D(CC_A(CC_B(_, _), CC_A(_, _)), _, _) => 21 
  case CC_D(CC_A(CC_C(_), CC_A(_, _)), 12, _) => 22 
  case CC_D(CC_A(CC_C(_), CC_A(_, _)), _, _) => 23 
  case CC_D(CC_A(CC_A(_, _), CC_B(_, _)), 12, _) => 24 
  case CC_D(CC_A(CC_A(_, _), CC_B(_, _)), _, _) => 25 
  case CC_D(CC_A(CC_B(_, _), CC_B(_, _)), 12, _) => 26 
  case CC_D(CC_A(CC_B(_, _), CC_B(_, _)), _, _) => 27 
  case CC_D(CC_A(CC_C(_), CC_B(_, _)), 12, _) => 28 
  case CC_D(CC_A(CC_C(_), CC_B(_, _)), _, _) => 29 
  case CC_D(CC_A(CC_A(_, _), CC_C(_)), 12, _) => 30 
  case CC_D(CC_A(CC_A(_, _), CC_C(_)), _, _) => 31 
  case CC_D(CC_A(CC_B(_, _), CC_C(_)), 12, _) => 32 
  case CC_D(CC_A(CC_B(_, _), CC_C(_)), _, _) => 33 
  case CC_D(CC_A(CC_C(_), CC_C(_)), 12, _) => 34 
  case CC_D(CC_A(CC_C(_), CC_C(_)), _, _) => 35 
}
}
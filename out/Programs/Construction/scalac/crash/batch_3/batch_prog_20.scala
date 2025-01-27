package Program_20 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A(a: Char) extends T_A
case class CC_B(a: T_A, b: CC_A, c: CC_A) extends T_A
case class CC_C[B](a: T_B[B], b: B) extends T_B[B]
case class CC_D[C](a: T_B[C], b: T_A) extends T_B[C]

val v_a: T_B[CC_B] = null
val v_b: Int = v_a match{
  case CC_C(_, _) => 0 
  case CC_D(CC_C(_, _), CC_A(_)) => 1 
  case CC_D(CC_D(CC_C(_, _), CC_B(_, _, _)), CC_A(_)) => 2 
  case CC_D(CC_D(CC_D(_, _), CC_A(_)), CC_A(_)) => 3 
  case CC_D(CC_D(CC_D(_, _), CC_B(_, _, _)), CC_A(_)) => 4 
  case CC_D(CC_C(_, _), CC_B(CC_A(_), CC_A(_), CC_A(_))) => 5 
  case CC_D(CC_D(CC_C(_, _), CC_A(_)), CC_B(CC_A(_), CC_A(_), CC_A(_))) => 6 
  case CC_D(CC_D(CC_C(_, _), CC_B(_, _, _)), CC_B(CC_A(_), CC_A(_), CC_A(_))) => 7 
  case CC_D(CC_D(CC_D(_, _), CC_A(_)), CC_B(CC_A(_), CC_A(_), CC_A(_))) => 8 
  case CC_D(CC_D(CC_D(_, _), CC_B(_, _, _)), CC_B(CC_A(_), CC_A(_), CC_A(_))) => 9 
  case CC_D(CC_C(_, _), CC_B(CC_B(_, _, _), CC_A(_), CC_A(_))) => 10 
  case CC_D(CC_D(CC_C(_, _), CC_A(_)), CC_B(CC_B(_, _, _), CC_A(_), CC_A(_))) => 11 
  case CC_D(CC_D(CC_C(_, _), CC_B(_, _, _)), CC_B(CC_B(_, _, _), CC_A(_), CC_A(_))) => 12 
  case CC_D(CC_D(CC_D(_, _), CC_A(_)), CC_B(CC_B(_, _, _), CC_A(_), CC_A(_))) => 13 
  case CC_D(CC_D(CC_D(_, _), CC_B(_, _, _)), CC_B(CC_B(_, _, _), CC_A(_), CC_A(_))) => 14 
}
}
// This is not matched: CC_D(CC_D(CC_C(_, _), CC_A(_)), CC_A(_))
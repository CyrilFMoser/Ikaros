package Program_8 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A(a: Boolean) extends T_A[Boolean]
case class CC_B(a: CC_A, b: T_B[CC_A, T_A[Boolean]], c: T_A[T_B[CC_A, CC_A]]) extends T_A[Boolean]
case class CC_C(a: T_A[Boolean], b: Boolean) extends T_A[Boolean]
case class CC_D[E, D](a: CC_B, b: Int) extends T_B[E, D]

val v_a: T_A[Boolean] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(_, _, _) => 1 
  case CC_C(CC_A(_), true) => 2 
  case CC_C(CC_A(_), false) => 3 
  case CC_C(CC_B(_, _, _), true) => 4 
  case CC_C(CC_B(_, _, _), false) => 5 
  case CC_C(CC_C(CC_A(_), _), true) => 6 
  case CC_C(CC_C(CC_A(_), _), false) => 7 
  case CC_C(CC_C(CC_B(_, _, _), _), true) => 8 
  case CC_C(CC_C(CC_B(_, _, _), _), false) => 9 
  case CC_C(CC_C(CC_C(_, _), _), true) => 10 
  case CC_C(CC_C(CC_C(_, _), _), false) => 11 
}
}
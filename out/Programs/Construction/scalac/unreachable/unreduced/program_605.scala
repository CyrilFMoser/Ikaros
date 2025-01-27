package Program_1 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D](a: T_B[D], b: T_A[Boolean, D]) extends T_A[Boolean, D]
case class CC_B(a: Char, b: (T_B[Boolean],T_A[Boolean, Boolean])) extends T_B[Boolean]
case class CC_C(a: T_B[Boolean], b: CC_A[T_A[CC_B, CC_B]], c: T_A[T_B[Boolean], Int]) extends T_B[Boolean]
case class CC_D(a: CC_B, b: T_B[Boolean]) extends T_B[Boolean]

val v_a: T_B[Boolean] = null
val v_b: Int = v_a match{
  case CC_B(_, _) => 0 
  case CC_C(CC_B(_, _), CC_A(_, _), _) => 1 
  case CC_C(CC_C(_, _, _), CC_A(_, _), _) => 2 
  case CC_C(CC_D(_, _), CC_A(_, _), _) => 3 
  case CC_D(CC_B(_, _), CC_B(_, _)) => 4 
  case CC_D(CC_B(_, _), CC_C(_, _, _)) => 5 
  case CC_D(CC_B(_, _), CC_D(_, _)) => 6 
}
}
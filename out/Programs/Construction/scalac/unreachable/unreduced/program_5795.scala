package Program_22 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A[C]() extends T_A[C]
case class CC_B(a: T_B[Boolean], b: T_B[Boolean], c: T_B[CC_A[Boolean]]) extends T_B[Boolean]
case class CC_C(a: T_B[T_A[CC_B]]) extends T_B[Boolean]
case class CC_D() extends T_B[Boolean]

val v_a: T_B[Boolean] = null
val v_b: Int = v_a match{
  case CC_B(CC_B(_, _, _), CC_B(_, _, _), _) => 0 
  case CC_B(CC_C(_), CC_B(_, _, _), _) => 1 
  case CC_B(CC_D(), CC_B(_, _, _), _) => 2 
  case CC_B(CC_B(_, _, _), CC_C(_), _) => 3 
  case CC_B(CC_C(_), CC_C(_), _) => 4 
  case CC_B(CC_D(), CC_C(_), _) => 5 
  case CC_B(CC_B(_, _, _), CC_D(), _) => 6 
  case CC_B(CC_C(_), CC_D(), _) => 7 
  case CC_B(CC_D(), CC_D(), _) => 8 
  case CC_D() => 9 
}
}
// This is not matched: CC_C(_)
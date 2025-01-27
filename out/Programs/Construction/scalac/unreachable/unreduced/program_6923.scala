package Program_25 

object Test {
sealed trait T_A[A, B]
case class CC_A(a: T_A[Boolean, Boolean]) extends T_A[Boolean, Boolean]
case class CC_B() extends T_A[Boolean, Boolean]
case class CC_C(a: T_A[CC_A, CC_B], b: T_A[CC_A, CC_B], c: T_A[Boolean, CC_B]) extends T_A[Boolean, Boolean]

val v_a: T_A[Boolean, Boolean] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(CC_A(_))) => 0 
  case CC_A(CC_A(CC_B())) => 1 
  case CC_A(CC_A(CC_C(_, _, _))) => 2 
  case CC_A(CC_B()) => 3 
  case CC_A(CC_C(_, _, _)) => 4 
  case CC_B() => 5 
  case CC_C(_, _, _) => 6 
}
}
package Program_22 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A(a: T_A) extends T_A
case class CC_B(a: T_A, b: T_A, c: T_B[Boolean]) extends T_A
case class CC_C(a: CC_A) extends T_A
case class CC_D(a: T_B[CC_A], b: T_B[CC_A], c: (Boolean,T_B[Boolean])) extends T_B[CC_A]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(CC_A(CC_A(_))) => 0 
  case CC_A(CC_A(CC_B(_, _, _))) => 1 
  case CC_A(CC_A(CC_C(_))) => 2 
  case CC_A(CC_B(_, _, _)) => 3 
  case CC_A(CC_C(CC_A(_))) => 4 
  case CC_C(CC_A(CC_A(_))) => 5 
  case CC_C(CC_A(CC_B(_, _, _))) => 6 
  case CC_C(CC_A(CC_C(_))) => 7 
}
}
// This is not matched: CC_B(_, _, _)
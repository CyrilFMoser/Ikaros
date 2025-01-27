package Program_28 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A(a: T_B[T_B[T_A]]) extends T_A
case class CC_B(a: T_A, b: CC_A) extends T_A
case class CC_C(a: (CC_B,T_A), b: CC_A, c: ((CC_B,CC_B),Boolean)) extends T_A
case class CC_D(a: CC_C, b: CC_C) extends T_B[CC_B]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(CC_A(_), CC_A(_)) => 1 
  case CC_B(CC_B(CC_A(_), CC_A(_)), CC_A(_)) => 2 
  case CC_B(CC_B(CC_B(_, _), CC_A(_)), CC_A(_)) => 3 
  case CC_B(CC_C(_, _, _), CC_A(_)) => 4 
  case CC_C(_, _, _) => 5 
}
}
// This is not matched: CC_B(CC_B(CC_C(_, _, _), CC_A(_)), CC_A(_))
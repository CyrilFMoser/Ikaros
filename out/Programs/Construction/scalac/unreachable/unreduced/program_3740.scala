package Program_16 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A(a: T_A) extends T_A
case class CC_B(a: T_B[Int]) extends T_A
case class CC_C(a: T_B[T_B[CC_B]]) extends T_B[T_B[CC_B]]
case class CC_D(a: T_B[T_B[CC_B]], b: T_A, c: T_A) extends T_B[T_B[CC_B]]
case class CC_E() extends T_B[T_B[CC_B]]

val v_a: T_B[T_B[CC_B]] = null
val v_b: Int = v_a match{
  case CC_C(CC_C(CC_C(_))) => 0 
  case CC_C(CC_C(CC_D(_, _, _))) => 1 
  case CC_C(CC_C(CC_E())) => 2 
  case CC_C(CC_D(CC_C(_), _, CC_A(_))) => 3 
  case CC_C(CC_D(CC_E(), _, CC_A(_))) => 4 
  case CC_C(CC_D(CC_C(_), _, CC_B(_))) => 5 
  case CC_C(CC_D(CC_D(_, _, _), _, CC_B(_))) => 6 
  case CC_C(CC_D(CC_E(), _, CC_B(_))) => 7 
  case CC_C(CC_E()) => 8 
  case CC_D(CC_C(CC_C(_)), _, _) => 9 
  case CC_D(CC_C(CC_D(_, _, _)), _, _) => 10 
  case CC_D(CC_C(CC_E()), _, _) => 11 
  case CC_D(CC_D(_, _, _), _, _) => 12 
  case CC_D(CC_E(), _, _) => 13 
  case CC_E() => 14 
}
}
// This is not matched: CC_C(CC_D(CC_D(_, _, _), _, CC_A(_)))
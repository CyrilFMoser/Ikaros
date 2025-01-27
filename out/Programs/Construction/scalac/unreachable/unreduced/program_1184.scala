package Program_12 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A(a: T_A[T_A[T_B]]) extends T_A[T_B]
case class CC_B(a: T_A[T_B]) extends T_A[T_B]
case class CC_C(a: T_B, b: (CC_B,T_B), c: T_B) extends T_B
case class CC_D(a: T_B, b: Int) extends T_B
case class CC_E(a: CC_A) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_C(CC_C(_, _, _), _, CC_C(_, _, _)) => 0 
  case CC_C(CC_D(_, _), _, CC_C(_, _, _)) => 1 
  case CC_C(CC_E(_), _, CC_C(_, _, _)) => 2 
  case CC_C(CC_C(_, _, _), _, CC_D(_, _)) => 3 
  case CC_C(CC_D(_, _), _, CC_D(_, _)) => 4 
  case CC_C(CC_E(_), _, CC_D(_, _)) => 5 
  case CC_C(CC_C(_, _, _), _, CC_E(_)) => 6 
  case CC_C(CC_D(_, _), _, CC_E(_)) => 7 
  case CC_C(CC_E(_), _, CC_E(_)) => 8 
  case CC_D(_, _) => 9 
  case CC_E(CC_A(_)) => 10 
}
}
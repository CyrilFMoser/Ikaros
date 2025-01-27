package Program_26 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A(a: T_B[T_A], b: T_B[Int]) extends T_A
case class CC_B() extends T_A
case class CC_C(a: T_A, b: CC_A, c: T_B[T_B[CC_B]]) extends T_A
case class CC_D() extends T_B[T_A]
case class CC_E(a: T_A, b: T_B[Char]) extends T_B[T_A]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(CC_D(), _) => 0 
  case CC_A(CC_E(_, _), _) => 1 
  case CC_B() => 2 
  case CC_C(CC_A(CC_D(), _), _, _) => 3 
  case CC_C(CC_A(CC_E(_, _), _), _, _) => 4 
  case CC_C(CC_C(CC_A(_, _), CC_A(_, _), _), _, _) => 5 
  case CC_C(CC_C(CC_B(), CC_A(_, _), _), _, _) => 6 
  case CC_C(CC_C(CC_C(_, _, _), CC_A(_, _), _), _, _) => 7 
}
}
// This is not matched: CC_C(CC_B(), _, _)
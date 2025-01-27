package Program_6 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A(a: T_B) extends T_A[T_B]
case class CC_B(a: T_A[Char], b: T_A[T_B], c: Int) extends T_A[T_B]
case class CC_C(a: T_A[T_B], b: Int) extends T_A[T_B]
case class CC_D() extends T_B
case class CC_E(a: CC_A) extends T_B

val v_a: T_A[T_B] = null
val v_b: Int = v_a match{
  case CC_A(CC_D()) => 0 
  case CC_A(CC_E(CC_A(_))) => 1 
  case CC_B(_, CC_A(CC_D()), 12) => 2 
  case CC_B(_, CC_A(CC_D()), _) => 3 
  case CC_B(_, CC_A(CC_E(_)), 12) => 4 
  case CC_B(_, CC_A(CC_E(_)), _) => 5 
  case CC_B(_, CC_B(_, CC_A(_), _), 12) => 6 
  case CC_B(_, CC_B(_, CC_A(_), _), _) => 7 
  case CC_B(_, CC_B(_, CC_B(_, _, _), _), 12) => 8 
  case CC_B(_, CC_B(_, CC_B(_, _, _), _), _) => 9 
  case CC_B(_, CC_B(_, CC_C(_, _), _), 12) => 10 
  case CC_B(_, CC_B(_, CC_C(_, _), _), _) => 11 
  case CC_B(_, CC_C(CC_A(_), _), 12) => 12 
  case CC_B(_, CC_C(CC_A(_), _), _) => 13 
  case CC_B(_, CC_C(CC_B(_, _, _), _), 12) => 14 
  case CC_B(_, CC_C(CC_B(_, _, _), _), _) => 15 
  case CC_B(_, CC_C(CC_C(_, _), _), 12) => 16 
  case CC_B(_, CC_C(CC_C(_, _), _), _) => 17 
  case CC_C(_, _) => 18 
}
}
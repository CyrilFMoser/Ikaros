package Program_9 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_A, b: T_A, c: T_B[T_A, T_B[Char, T_A]]) extends T_A
case class CC_B(a: CC_A) extends T_A
case class CC_C(a: CC_A, b: T_B[T_B[Boolean, Int], T_A], c: CC_B) extends T_A
case class CC_D[C]() extends T_B[T_B[C, C], C]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(CC_A(_, _, _), _, _) => 0 
  case CC_A(CC_B(_), _, _) => 1 
  case CC_A(CC_C(CC_A(_, _, _), _, _), _, _) => 2 
  case CC_B(_) => 3 
  case CC_C(CC_A(CC_A(_, _, _), CC_A(_, _, _), _), _, CC_B(_)) => 4 
  case CC_C(CC_A(CC_A(_, _, _), CC_B(_), _), _, CC_B(_)) => 5 
  case CC_C(CC_A(CC_A(_, _, _), CC_C(_, _, _), _), _, CC_B(_)) => 6 
  case CC_C(CC_A(CC_B(_), CC_A(_, _, _), _), _, CC_B(_)) => 7 
  case CC_C(CC_A(CC_B(_), CC_B(_), _), _, CC_B(_)) => 8 
  case CC_C(CC_A(CC_B(_), CC_C(_, _, _), _), _, CC_B(_)) => 9 
  case CC_C(CC_A(CC_C(_, _, _), CC_A(_, _, _), _), _, CC_B(_)) => 10 
  case CC_C(CC_A(CC_C(_, _, _), CC_B(_), _), _, CC_B(_)) => 11 
  case CC_C(CC_A(CC_C(_, _, _), CC_C(_, _, _), _), _, CC_B(_)) => 12 
}
}
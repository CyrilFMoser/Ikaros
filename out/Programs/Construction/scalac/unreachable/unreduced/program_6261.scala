package Program_5 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A(a: T_A[T_A[T_B]], b: Int, c: T_B) extends T_A[T_A[T_B]]
case class CC_B(a: Boolean) extends T_A[T_A[T_B]]
case class CC_C(a: T_B, b: T_B, c: CC_B) extends T_B
case class CC_D() extends T_B
case class CC_E(a: T_A[T_B], b: CC_D) extends T_B

val v_a: T_A[T_A[T_B]] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(CC_A(_, _, _), 12, _), _, CC_C(_, _, _)) => 0 
  case CC_A(CC_A(CC_A(_, _, _), _, _), _, CC_C(_, _, _)) => 1 
  case CC_A(CC_A(CC_B(_), 12, _), _, CC_C(_, _, _)) => 2 
  case CC_A(CC_A(CC_B(_), _, _), _, CC_C(_, _, _)) => 3 
  case CC_A(CC_B(_), _, CC_C(_, _, _)) => 4 
  case CC_A(CC_A(CC_A(_, _, _), 12, _), _, CC_D()) => 5 
  case CC_A(CC_A(CC_A(_, _, _), _, _), _, CC_D()) => 6 
  case CC_A(CC_A(CC_B(_), 12, _), _, CC_D()) => 7 
  case CC_A(CC_A(CC_B(_), _, _), _, CC_D()) => 8 
  case CC_A(CC_B(_), _, CC_D()) => 9 
  case CC_A(CC_A(CC_A(_, _, _), 12, _), _, CC_E(_, _)) => 10 
  case CC_A(CC_A(CC_A(_, _, _), _, _), _, CC_E(_, _)) => 11 
  case CC_A(CC_A(CC_B(_), 12, _), _, CC_E(_, _)) => 12 
  case CC_A(CC_A(CC_B(_), _, _), _, CC_E(_, _)) => 13 
  case CC_A(CC_B(_), _, CC_E(_, _)) => 14 
  case CC_B(_) => 15 
}
}
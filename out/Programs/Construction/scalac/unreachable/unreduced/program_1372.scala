package Program_6 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A(a: T_A[T_A[T_B]], b: T_A[T_A[T_B]], c: T_B) extends T_A[T_A[T_B]]
case class CC_B(a: T_B) extends T_A[T_A[T_B]]
case class CC_C(a: CC_A, b: CC_B, c: T_A[CC_A]) extends T_A[T_A[T_B]]
case class CC_D(a: T_A[T_A[T_B]], b: (CC_A,CC_A)) extends T_B

val v_a: T_A[T_A[T_B]] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(_, _, _), CC_A(_, _, _), CC_D(_, _)) => 0 
  case CC_A(CC_B(_), CC_A(_, _, _), CC_D(_, _)) => 1 
  case CC_A(CC_C(_, _, _), CC_A(_, _, _), CC_D(_, _)) => 2 
  case CC_A(CC_A(_, _, _), CC_B(_), CC_D(_, _)) => 3 
  case CC_A(CC_B(_), CC_B(_), CC_D(_, _)) => 4 
  case CC_A(CC_C(_, _, _), CC_B(_), CC_D(_, _)) => 5 
  case CC_A(CC_A(_, _, _), CC_C(_, _, _), CC_D(_, _)) => 6 
  case CC_A(CC_B(_), CC_C(_, _, _), CC_D(_, _)) => 7 
  case CC_A(CC_C(_, _, _), CC_C(_, _, _), CC_D(_, _)) => 8 
  case CC_B(CC_D(_, _)) => 9 
  case CC_C(_, _, _) => 10 
}
}
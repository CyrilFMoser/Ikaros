package Program_22 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: T_B, b: T_A[C, C], c: T_A[T_B, C]) extends T_A[T_B, C]
case class CC_B(a: T_A[(T_B,T_B), T_A[T_B, T_B]], b: CC_A[T_A[T_B, Char]], c: T_B) extends T_A[T_B, T_B]
case class CC_C[D](a: Boolean, b: T_A[T_B, T_B]) extends T_A[CC_B, D]
case class CC_D(a: (CC_B,Boolean), b: (T_A[CC_B, CC_B],T_A[CC_B, T_B]), c: T_A[T_B, T_A[T_B, T_B]]) extends T_B
case class CC_E(a: CC_C[CC_D]) extends T_B

val v_a: T_A[T_B, T_B] = null
val v_b: Int = v_a match{
  case CC_A(CC_D(_, _, _), CC_A(_, _, _), CC_A(_, _, _)) => 0 
  case CC_A(CC_D(_, _, _), CC_A(_, _, _), CC_B(_, _, _)) => 1 
  case CC_A(CC_D(_, _, _), CC_B(_, _, _), CC_A(_, _, _)) => 2 
  case CC_A(CC_D(_, _, _), CC_B(_, _, _), CC_B(_, _, _)) => 3 
  case CC_A(CC_E(_), CC_A(_, _, _), CC_A(_, _, _)) => 4 
  case CC_A(CC_E(_), CC_A(_, _, _), CC_B(_, _, _)) => 5 
  case CC_A(CC_E(_), CC_B(_, _, _), CC_A(_, _, _)) => 6 
  case CC_B(_, _, CC_D(_, _, _)) => 7 
  case CC_B(_, _, CC_E(_)) => 8 
}
}
// This is not matched: CC_A(CC_E(_), CC_B(_, _, _), CC_B(_, _, _))
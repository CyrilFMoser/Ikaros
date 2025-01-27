package Program_0 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: T_B, b: C, c: T_B) extends T_A[C, T_A[Char, Int]]
case class CC_B[D](a: CC_A[D], b: T_B) extends T_A[D, T_A[Char, Int]]
case class CC_C(a: T_A[CC_B[T_B], T_B]) extends T_B
case class CC_D(a: Boolean, b: Byte, c: T_A[T_B, T_A[Char, Int]]) extends T_B
case class CC_E() extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_C(_) => 0 
  case CC_D(_, _, CC_A(CC_C(_), CC_C(_), _)) => 1 
  case CC_D(_, _, CC_A(CC_D(_, _, _), CC_C(_), _)) => 2 
  case CC_D(_, _, CC_A(CC_E(), CC_C(_), _)) => 3 
  case CC_D(_, _, CC_A(CC_C(_), CC_D(_, _, _), _)) => 4 
  case CC_D(_, _, CC_A(CC_D(_, _, _), CC_D(_, _, _), _)) => 5 
  case CC_D(_, _, CC_A(CC_E(), CC_D(_, _, _), _)) => 6 
  case CC_D(_, _, CC_A(CC_C(_), CC_E(), _)) => 7 
  case CC_D(_, _, CC_A(CC_E(), CC_E(), _)) => 8 
  case CC_D(_, _, CC_B(CC_A(_, _, _), CC_C(_))) => 9 
  case CC_D(_, _, CC_B(CC_A(_, _, _), CC_D(_, _, _))) => 10 
  case CC_D(_, _, CC_B(CC_A(_, _, _), CC_E())) => 11 
  case CC_E() => 12 
}
}
// This is not matched: CC_D(_, _, CC_A(CC_D(_, _, _), CC_E(), _))
package Program_0 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: T_A[T_B, C]) extends T_A[T_B, C]
case class CC_B[D](a: T_B) extends T_A[T_B, D]
case class CC_C(a: T_A[T_B, Char], b: T_A[CC_A[T_B], T_A[T_B, T_B]], c: CC_B[T_A[T_B, T_B]]) extends T_A[T_B, T_A[T_B, CC_A[T_B]]]
case class CC_D(a: (T_A[T_B, CC_C],Boolean), b: CC_C) extends T_B
case class CC_E() extends T_B
case class CC_F(a: Int) extends T_B

val v_a: T_A[T_B, Byte] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(_)) => 0 
  case CC_A(CC_B(CC_E())) => 1 
  case CC_A(CC_B(CC_F(_))) => 2 
  case CC_B(CC_D((_,_), CC_C(_, _, _))) => 3 
  case CC_B(CC_E()) => 4 
  case CC_B(CC_F(_)) => 5 
}
}
// This is not matched: CC_A(CC_B(CC_D(_, _)))
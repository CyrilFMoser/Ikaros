package Program_6 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D, E](a: T_B[E], b: Byte) extends T_A[D, E]
case class CC_B[F, G](a: T_A[F, T_B[F]], b: Boolean, c: T_A[F, G]) extends T_A[F, G]
case class CC_C(a: T_A[CC_B[Byte, Char], T_A[Char, Char]], b: Char, c: T_B[Char]) extends T_B[T_A[T_A[Byte, Byte], T_A[Char, Char]]]

val v_a: T_A[Byte, Int] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B(CC_A(_, _), _, CC_A(_, _)) => 1 
  case CC_B(CC_A(_, _), _, CC_B(CC_A(_, _), _, CC_A(_, _))) => 2 
  case CC_B(CC_A(_, _), _, CC_B(CC_B(_, _, _), _, CC_A(_, _))) => 3 
  case CC_B(CC_A(_, _), _, CC_B(CC_B(_, _, _), _, CC_B(_, _, _))) => 4 
  case CC_B(CC_B(_, _, _), _, CC_A(_, _)) => 5 
  case CC_B(CC_B(_, _, _), _, CC_B(CC_A(_, _), _, CC_A(_, _))) => 6 
  case CC_B(CC_B(_, _, _), _, CC_B(CC_A(_, _), _, CC_B(_, _, _))) => 7 
  case CC_B(CC_B(_, _, _), _, CC_B(CC_B(_, _, _), _, CC_A(_, _))) => 8 
  case CC_B(CC_B(_, _, _), _, CC_B(CC_B(_, _, _), _, CC_B(_, _, _))) => 9 
}
}
// This is not matched: CC_B(CC_A(_, _), _, CC_B(CC_A(_, _), _, CC_B(_, _, _)))
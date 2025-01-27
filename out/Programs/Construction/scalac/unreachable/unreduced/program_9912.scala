package Program_21 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D](a: Boolean, b: T_A[D], c: T_B[D, D]) extends T_A[D]
case class CC_B[E](a: Byte, b: (T_A[Int],(Char,Char)), c: T_A[E]) extends T_A[E]
case class CC_C[F](a: F, b: F, c: F) extends T_A[F]
case class CC_D[G](a: T_A[G], b: T_A[G]) extends T_B[G, (T_A[Char],Byte)]
case class CC_E[H](a: H) extends T_B[H, (T_A[Char],Byte)]

val v_a: T_A[Char] = null
val v_b: Int = v_a match{
  case CC_A(_, CC_A(_, CC_A(_, _, _), _), _) => 0 
  case CC_A(_, CC_A(_, CC_B(_, _, _), _), _) => 1 
  case CC_A(_, CC_A(_, CC_C(_, _, _), _), _) => 2 
  case CC_A(_, CC_B(_, _, _), _) => 3 
  case CC_A(_, CC_C('x', _, 'x'), _) => 4 
  case CC_A(_, CC_C(_, _, 'x'), _) => 5 
  case CC_A(_, CC_C('x', _, _), _) => 6 
  case CC_B(_, _, CC_A(_, _, _)) => 7 
  case CC_B(_, _, CC_B(0, (_,_), CC_A(_, _, _))) => 8 
  case CC_B(_, _, CC_B(_, (_,_), CC_A(_, _, _))) => 9 
  case CC_B(_, _, CC_B(0, (_,_), CC_B(_, _, _))) => 10 
  case CC_B(_, _, CC_B(_, (_,_), CC_B(_, _, _))) => 11 
  case CC_B(_, _, CC_B(0, (_,_), CC_C(_, _, _))) => 12 
  case CC_B(_, _, CC_B(_, (_,_), CC_C(_, _, _))) => 13 
  case CC_B(_, _, CC_C(_, _, _)) => 14 
  case CC_C(_, _, _) => 15 
}
}
// This is not matched: CC_A(_, CC_C(_, _, _), _)
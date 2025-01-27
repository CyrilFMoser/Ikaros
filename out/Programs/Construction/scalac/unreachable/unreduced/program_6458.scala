package Program_11 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, C], b: C, c: (T_A[(Boolean,Char), Char],T_A[Byte, Char])) extends T_A[C, T_A[C, C]]
case class CC_B[D](a: CC_A[D]) extends T_A[D, T_A[D, D]]
case class CC_C[E](a: E, b: T_A[E, T_A[E, E]], c: Int) extends T_A[E, T_A[E, E]]

val v_a: T_A[Char, T_A[Char, Char]] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B(CC_A(_, _, (_,_))) => 1 
  case CC_C(_, _, _) => 2 
}
}
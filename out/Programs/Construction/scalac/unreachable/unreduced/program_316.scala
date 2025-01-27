package Program_25 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, T_A[C, C]], b: C) extends T_A[C, T_A[C, C]]
case class CC_B[D](a: (T_A[Char, Byte],CC_A[Byte])) extends T_A[D, T_A[D, D]]
case class CC_C[E](a: E) extends T_A[E, T_A[E, E]]

val v_a: T_A[Char, T_A[Char, Char]] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(_, _), _) => 0 
  case CC_A(CC_B(_), _) => 1 
  case CC_B((_,_)) => 2 
  case CC_C(_) => 3 
}
}
// This is not matched: CC_A(CC_C(_), _)
package Program_20 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: Int, b: (T_A[Byte, Char],T_A[Boolean, Byte])) extends T_A[C, T_A[C, C]]
case class CC_B[D](a: T_A[CC_A[D], Char], b: T_A[D, T_A[D, D]]) extends T_A[D, T_A[D, D]]
case class CC_C[E]() extends T_A[E, T_A[E, E]]

val v_a: T_A[Boolean, T_A[Boolean, Boolean]] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B(_, CC_A(_, (_,_))) => 1 
  case CC_B(_, CC_B(_, CC_A(_, _))) => 2 
  case CC_B(_, CC_B(_, CC_B(_, _))) => 3 
  case CC_B(_, CC_C()) => 4 
  case CC_C() => 5 
}
}
// This is not matched: CC_B(_, CC_B(_, CC_C()))
package Program_5 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: Boolean, b: (Byte,T_A[(Boolean,Boolean), Byte]), c: C) extends T_A[C, T_A[C, C]]
case class CC_B[D](a: T_A[D, T_A[D, D]], b: CC_A[T_A[D, D]]) extends T_A[D, T_A[D, D]]
case class CC_C() extends T_A[CC_B[Char], T_A[CC_B[Char], CC_B[Char]]]

val v_a: T_A[Char, T_A[Char, Char]] = null
val v_b: Int = v_a match{
  case CC_A(_, (_,_), 'x') => 0 
  case CC_A(_, (_,_), _) => 1 
  case CC_B(_, _) => 2 
}
}
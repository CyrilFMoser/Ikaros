package Program_29 

object Test {
sealed trait T_A[A, B]
case class CC_A[C]() extends T_A[Byte, C]
case class CC_B[D](a: T_A[D, D], b: Char) extends T_A[Byte, D]
case class CC_C[E](a: (T_A[Byte, (Boolean,Byte)],T_A[Byte, Int]), b: T_A[Byte, T_A[Byte, CC_A[Char]]], c: T_A[E, E]) extends T_A[Byte, E]

val v_a: T_A[Byte, Boolean] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_, 'x') => 1 
  case CC_B(_, _) => 2 
  case CC_C(_, CC_B(_, _), _) => 3 
  case CC_C(_, CC_C((_,_), CC_A(), _), _) => 4 
  case CC_C(_, CC_C((_,_), CC_B(_, _), _), _) => 5 
  case CC_C(_, CC_C((_,_), CC_C(_, _, _), _), _) => 6 
}
}
// This is not matched: CC_C(_, CC_A(), _)
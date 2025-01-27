package Program_11 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: C, b: T_A[Byte, C], c: (T_A[Char, Byte],T_A[Byte, Boolean])) extends T_A[Byte, C]
case class CC_B[D](a: D, b: T_A[Byte, D]) extends T_A[Byte, D]

val v_a: T_A[Byte, Char] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B('x', CC_A(_, CC_A(_, _, _), (_,_))) => 1 
  case CC_B('x', CC_A(_, CC_B(_, _), (_,_))) => 2 
  case CC_B('x', CC_B(_, CC_A(_, _, _))) => 3 
  case CC_B('x', CC_B(_, CC_B(_, _))) => 4 
  case CC_B(_, CC_A(_, CC_B(_, _), (_,_))) => 5 
  case CC_B(_, CC_B(_, CC_A(_, _, _))) => 6 
  case CC_B(_, CC_B(_, CC_B(_, _))) => 7 
}
}
// This is not matched: CC_B(_, CC_A(_, CC_A(_, _, _), (_,_)))
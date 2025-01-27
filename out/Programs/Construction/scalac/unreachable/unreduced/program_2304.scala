package Program_25 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: T_B, b: T_A[C, C], c: T_A[C, T_A[C, C]]) extends T_A[C, T_A[C, C]]
case class CC_B[D](a: T_A[Boolean, T_A[Boolean, Boolean]]) extends T_A[D, T_A[D, D]]
case class CC_C[E]() extends T_A[E, T_A[E, E]]
case class CC_D(a: T_A[(Boolean,Boolean), T_A[(Boolean,Boolean), (Boolean,Boolean)]], b: T_A[Byte, CC_A[T_B]], c: T_A[Int, CC_C[T_B]]) extends T_B
case class CC_E(a: T_A[CC_B[(Char,Byte)], T_A[CC_B[(Char,Byte)], CC_B[(Char,Byte)]]]) extends T_B

val v_a: T_A[CC_E, T_A[CC_E, CC_E]] = null
val v_b: Int = v_a match{
  case CC_A(CC_D(CC_A(_, _, _), _, _), _, _) => 0 
  case CC_A(CC_D(CC_B(_), _, _), _, _) => 1 
  case CC_A(CC_D(CC_C(), _, _), _, _) => 2 
  case CC_A(CC_E(_), _, _) => 3 
  case CC_B(CC_A(CC_D(_, _, _), _, CC_A(_, _, _))) => 4 
  case CC_B(CC_A(CC_D(_, _, _), _, CC_B(_))) => 5 
  case CC_B(CC_A(CC_D(_, _, _), _, CC_C())) => 6 
  case CC_B(CC_A(CC_E(_), _, CC_A(_, _, _))) => 7 
  case CC_B(CC_A(CC_E(_), _, CC_B(_))) => 8 
  case CC_B(CC_A(CC_E(_), _, CC_C())) => 9 
  case CC_B(CC_B(_)) => 10 
  case CC_C() => 11 
}
}
// This is not matched: CC_B(CC_C())
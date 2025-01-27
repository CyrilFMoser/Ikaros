package Program_31 

package Program_6 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C, D, E](a: E, b: T_A[C, C]) extends T_A[D, C]
case class CC_B[G, F](a: T_B, b: CC_A[G, G, T_B]) extends T_A[G, F]
case class CC_C[I, H](a: (Char,Byte), b: CC_B[I, Byte]) extends T_A[I, H]

val v_a: T_A[T_B, Byte] = null
val v_b: Int = v_a match{
  case CC_B(_, _) => 0 
  case CC_A(_, CC_B(_, _)) => 1 
  case CC_A(_, CC_C(_, _)) => 2 
  case CC_A(_, _) => 3 
  case CC_C(_, CC_B(_, _)) => 4 
  case CC_C(('x',0), _) => 5 
  case CC_C((_,0), _) => 6 
}
}
// This is not matched: (CC_A Byte T_B T_B Wildcard Wildcard (T_A T_B Byte))
// This is not matched: (CC_C Wildcard Wildcard (T_B Char))
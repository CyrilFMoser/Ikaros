package Program_31 

object Test {
sealed trait T_A[A, B]
case class CC_A[E](a: E, b: T_A[E, E]) extends T_A[E, T_A[Byte, Boolean]]

val v_a: T_A[CC_A[(Char,Boolean)], T_A[Byte, Boolean]] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(('x',_), _), _) => 0 
}
}
// This is not matched: (CC_A (CC_A (Tuple Char Boolean) Boolean Boolean Boolean)
//      Wildcard
//      Wildcard
//      (T_A (CC_A (Tuple Char Boolean) Boolean Boolean Boolean)
//           (T_A Byte Boolean)))
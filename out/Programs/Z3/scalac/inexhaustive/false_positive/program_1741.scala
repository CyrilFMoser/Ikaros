package Program_31 

package Program_12 

object Test {
sealed trait T_A[A, B]
case class CC_A[D, C, E](a: T_A[E, Byte], b: T_A[E, D], c: T_A[C, C]) extends T_A[C, D]

val v_a: T_A[Char, Byte] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(_, _, _), _, CC_A(_, _, _)) => 0 
}
}
// This is not matched: (CC_A Byte
//      Char
//      (T_A Boolean Boolean)
//      Wildcard
//      Wildcard
//      Wildcard
//      (T_A Char Byte))
// This is not matched: (CC_A (T_A (T_A Int)) (T_A (T_A (T_A Int))))
package Program_15 

package Program_0 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A[B](a: (T_A,Boolean), b: Int, c: T_B[B]) extends T_A

val v_a: CC_A[Byte] = null
val v_b: Int = v_a match{
  case CC_A((CC_A(_, _, _),_), _, _) => 0 
  case CC_A((CC_A(_, _, _),_), 12, _) => 1 
}
}
// This is not matched: (CC_A Byte
//      (Tuple (CC_A T_A Wildcard Wildcard Wildcard T_A) Wildcard)
//      Wildcard
//      Wildcard
//      T_A)
// This is not matched: (CC_B Wildcard Wildcard T_A)
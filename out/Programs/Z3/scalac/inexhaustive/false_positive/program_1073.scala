package Program_29 

package Program_7 

object Test {
sealed trait T_A[A, B]
case class CC_A[D, C, E](a: T_A[E, C], b: C, c: T_A[D, E]) extends T_A[D, C]
case class CC_B[F](a: T_A[F, Char]) extends T_A[F, (Int,Int)]

val v_a: CC_A[Char, Boolean, Byte] = null
val v_b: Int = v_a match{
  case CC_A(_, _, CC_A(_, _, _)) => 0 
}
}
// This is not matched: (CC_A Char
//      Boolean
//      Byte
//      Wildcard
//      Wildcard
//      (CC_A Char Byte Boolean Wildcard Byte Wildcard (T_A Char Byte))
//      (T_A Char Boolean))
// This is not matched: Pattern match is empty without constants
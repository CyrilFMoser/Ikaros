package Program_31 

package Program_8 

object Test {
sealed trait T_A[A, B]
case class CC_A[C, D](a: T_A[C, D], b: (Int,Int)) extends T_A[(Int,Char), C]
case class CC_B[E, F](a: CC_A[F, E], b: T_A[E, E]) extends T_A[E, Byte]

val v_a: T_A[Char, Byte] = null
val v_b: Int = v_a match{
  case CC_B(CC_A(_, _), _) => 0 
}
}
// This is not matched: (CC_B Char
//      (CC_A Boolean Boolean (T_A Boolean Boolean) Boolean Boolean)
//      Wildcard
//      Wildcard
//      (T_A Char Byte))
// This is not matched: Pattern match is empty without constants
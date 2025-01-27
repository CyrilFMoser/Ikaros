package Program_31 

package Program_6 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D](a: (Int,Byte)) extends T_A[D, (Boolean,Byte)]
case class CC_B() extends T_A[T_B[Boolean], T_B[Char]]
case class CC_C[E](a: T_A[E, E], b: (CC_B,CC_B), c: T_A[E, E]) extends T_B[Char]
case class CC_D(a: CC_C[CC_B]) extends T_B[Char]

val v_a: CC_A[T_B[Char]] = null
val v_b: Int = v_a match{
  case CC_A((12,0)) => 0 
}
}
// This is not matched: Pattern match is empty without constants
// This is not matched: (CC_C (CC_E T_A) Wildcard (T_B (CC_E T_A) T_A))
package Program_27 

package Program_14 

object Test {
sealed trait T_A[A, B]
case class CC_A[D, C, E](a: T_A[E, E], b: C, c: T_A[D, D]) extends T_A[C, D]
case class CC_B[F, G](a: (T_A[Byte, Int],CC_A[Boolean, Boolean, Byte])) extends T_A[F, G]

val v_a: CC_B[Char, Char] = null
val v_b: Int = v_a match{
  case CC_B((CC_A(_, _, _),CC_A(_, _, _))) => 0 
}
}
// This is not matched: CC_B((CC_B(_),CC_A(_, _, _)))
// This is not matched: CC_A(CC_B())
package Program_14 

package Program_2 

object Test {
sealed trait T_A[A, B]
case class CC_A[D, C, E](a: T_A[C, D]) extends T_A[C, D]
case class CC_B[F]() extends T_A[T_A[Byte, Boolean], F]

val v_a: T_A[Byte, Byte] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
}
}
// This is not matched: (CC_A Byte Byte Boolean Wildcard (T_A Byte Byte))
// This is not matched: Pattern match is empty without constants
package Program_31 

package Program_12 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A[C, D]() extends T_A[C]
case class CC_B[E](a: T_A[E], b: E) extends T_B[E]
case class CC_C[F](a: CC_B[F]) extends T_B[F]
case class CC_D(a: T_B[Byte], b: T_B[Char]) extends T_B[Byte]

val v_a: T_A[Byte] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
}
}
// This is not matched: (CC_A Byte Boolean (T_A Byte))
// This is not matched: (CC_A T_A)
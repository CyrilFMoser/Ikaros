package Program_31 

package Program_6 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D]() extends T_A[T_B[Byte], T_A[Char, Char]]
case class CC_B() extends T_A[T_B[Byte], T_A[Char, Char]]
case class CC_C[E](a: E, b: Char) extends T_B[E]
case class CC_D[F](a: F) extends T_B[F]

val v_a: T_A[T_B[Byte], T_A[Char, Char]] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B() => 1 
}
}
// This is not matched: (CC_A Boolean (T_A (T_B Byte) (T_A Char Char)))
// This is not matched: (CC_C Wildcard T_A)
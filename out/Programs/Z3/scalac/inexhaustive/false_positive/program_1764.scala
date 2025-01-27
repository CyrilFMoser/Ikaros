package Program_31 

package Program_8 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E]() extends T_A[T_A[Char, Byte], E]
case class CC_B[F, G, H](a: T_A[G, G], b: Byte) extends T_B[F, G]

val v_a: T_B[Int, Int] = null
val v_b: Int = v_a match{
  case CC_B(_, _) => 0 
}
}
// This is not matched: (CC_B Int Int Boolean Wildcard Wildcard (T_B Int Int))
// This is not matched: (CC_C Wildcard Wildcard Wildcard T_A)
package Program_12 

package Program_3 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E]() extends T_A[E, T_B[E, E]]
case class CC_B[F, G, H](a: CC_A[G]) extends T_A[F, G]
case class CC_C[J, I](a: Byte, b: T_B[I, I], c: T_B[J, I]) extends T_B[I, J]
case class CC_D() extends T_B[CC_A[Char], T_A[Int, Int]]
case class CC_E[K](a: CC_A[K]) extends T_B[CC_B[CC_D, (Boolean,Int), CC_D], K]

val v_a: T_A[Boolean, T_B[Boolean, Boolean]] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(CC_A()) => 1 
}
}
// This is not matched: (CC_B Boolean
//      (T_B Boolean Boolean)
//      Boolean
//      Wildcard
//      (T_A Boolean (T_B Boolean Boolean)))
// This is not matched: (CC_A (CC_B Wildcard T_A) Wildcard (CC_B Wildcard T_A) T_A)
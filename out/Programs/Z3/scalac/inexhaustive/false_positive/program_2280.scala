package Program_30 

package Program_3 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A(a: T_B[Int, Int]) extends T_A[T_B[Char, Byte], (Boolean,Byte)]
case class CC_B[E, F](a: T_B[F, E], b: CC_A) extends T_B[T_B[E, E], E]
case class CC_C[G](a: G, b: ((Int,Byte),CC_A), c: CC_A) extends T_B[T_B[G, G], G]
case class CC_D[H, I, J](a: I) extends T_B[H, I]

val v_a: CC_D[Boolean, Int, Int] = null
val v_b: Int = v_a match{
  case CC_D(12) => 0 
}
}
// This is not matched: Pattern match is empty without constants
// This is not matched: (CC_C Char
//      Boolean
//      (CC_D Boolean Boolean Wildcard (T_B Boolean Boolean))
//      Wildcard
//      (T_B Boolean Char))
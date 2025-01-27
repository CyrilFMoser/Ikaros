package Program_31 

package Program_0 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E, F](a: F) extends T_A[F, E]
case class CC_B[H, G, I](a: Boolean, b: (Char,Int)) extends T_A[G, H]
case class CC_C[J, K](a: K, b: Byte) extends T_B[J, K]

val v_a: T_A[Int, Byte] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_A(12) => 1 
  case CC_B(_, _) => 2 
}
}
// This is not matched: (CC_B Byte Int Boolean Boolean (Tuple Wildcard Int) (T_A Int Byte))
// This is not matched: Pattern match is empty without constants
package Program_30 

package Program_14 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D](a: T_B[Int, D], b: Char) extends T_A[D]
case class CC_B[E, F](a: T_A[F], b: Boolean, c: E) extends T_A[E]
case class CC_C[H, G](a: G) extends T_B[H, G]

val v_a: T_A[Int] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B(CC_A(_, _), _, 12) => 1 
  case CC_B(_, _, _) => 2 
}
}
// This is not matched: (CC_B Int Boolean Wildcard Wildcard Wildcard (T_A Int))
// This is not matched: Pattern match is empty without constants
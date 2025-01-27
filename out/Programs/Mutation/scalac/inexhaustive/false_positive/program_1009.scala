package Program_63 

package Program_20 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A() extends T_A[Int]
case class CC_B[E, D, F]() extends T_B[D, E]
case class CC_C[G](a: G, b: T_A[Int], c: T_A[Int]) extends T_B[G, CC_A]
case class CC_D[H](a: CC_B[H, H, H], b: Char) extends T_B[H, CC_A]

val v_a: T_B[Boolean, Boolean] = null
val v_b: Int = v_a match{
  case CC_B() => 0 
}
}
// This is not matched: (CC_B Boolean Boolean Boolean (T_B Boolean Boolean))
// This is not matched: (CC_A Char Wildcard (T_A Char))
// Mutation information: 
// Deleted Pattern CC_A('x') at position 0
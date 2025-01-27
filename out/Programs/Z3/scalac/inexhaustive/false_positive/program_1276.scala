package Program_31 

package Program_7 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E, F]() extends T_A[E, T_A[Int, Char]]
case class CC_B(a: T_B[Int, Char], b: T_A[Int, Char], c: T_A[Byte, Byte]) extends T_A[T_B[Boolean, Int], T_A[Int, Char]]
case class CC_C[G](a: G, b: G, c: Byte) extends T_B[G, T_A[CC_B, CC_B]]

val v_a: T_A[T_B[Boolean, Int], T_A[Int, Char]] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_, _, _) => 1 
}
}
// This is not matched: (CC_A (T_B Boolean Int) Boolean (T_A (T_B Boolean Int) (T_A Int Char)))
// This is not matched: Pattern match is empty without constants
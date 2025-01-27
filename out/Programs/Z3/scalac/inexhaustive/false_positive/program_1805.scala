package Program_30 

package Program_12 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D, E, F]() extends T_A[E, D]
case class CC_B[G](a: T_A[G, G], b: T_A[G, G]) extends T_B[G]
case class CC_C[H](a: H, b: T_B[H], c: Char) extends T_B[CC_B[Byte]]

val v_a: CC_B[Int] = null
val v_b: Int = v_a match{
  case CC_B(_, CC_A()) => 0 
}
}
// This is not matched: (CC_B Int Wildcard (CC_A Int Int Boolean (T_A Int Int)) (T_B Int))
// This is not matched: (CC_A Int Wildcard Wildcard (T_A Int))
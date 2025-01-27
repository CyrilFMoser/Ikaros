package Program_15 

package Program_14 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E, F](a: E, b: T_A[E, F], c: T_B[E, E]) extends T_A[E, F]
case class CC_B[G, H](a: (Boolean,Int), b: ((Byte,Int),Boolean), c: H) extends T_A[H, G]
case class CC_C[I, J, K]() extends T_B[I, J]

val v_a: T_B[Boolean, Int] = null
val v_b: Int = v_a match{
  case CC_C() => 0 
}
}
// This is not matched: (CC_C Boolean Int Boolean (T_B Boolean Int))
// This is not matched: Pattern match is empty without constants
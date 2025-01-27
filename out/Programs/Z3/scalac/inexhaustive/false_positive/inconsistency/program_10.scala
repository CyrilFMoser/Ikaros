package Program_31 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[E](a: T_A[E, E], b: Char) extends T_A[E, Int]
case class CC_C[G]() extends T_A[G, Int]
case class CC_D() extends T_B
case class CC_E(a: CC_A[CC_D]) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_E(CC_A(_, 'x')) => 0 
  case CC_D() => 1 
}
}
// This is not matched: (CC_A Boolean Char (T_A Boolean Char))
package Program_63 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D]() extends T_A[D]
case class CC_B[E](a: T_B[E, E], b: T_A[E]) extends T_A[E]
case class CC_D[G]() extends T_B[CC_B[T_B[Int, Byte]], G]

val v_a: CC_B[Int] = null
val v_b: Int = v_a match{
  case CC_B(_, CC_B(_, _)) => 0 
}
}
// This is not matched: CC_B()
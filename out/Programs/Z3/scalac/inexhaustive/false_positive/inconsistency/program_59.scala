package Program_31 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[D]
case class CC_A[E](a: E) extends T_A[E, (Char,(Byte,Boolean))]
case class CC_C[G](a: T_A[G, Boolean], b: CC_A[G]) extends T_B[T_A[G, G]]

val v_a: T_B[T_A[Int, Int]] = null
val v_b: Int = v_a match{
  case CC_C(_, CC_A(12)) => 0 
}
}
// This is not matched: (CC_B Wildcard Wildcard T_A)
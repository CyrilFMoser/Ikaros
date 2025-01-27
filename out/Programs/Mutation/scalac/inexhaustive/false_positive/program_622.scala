package Program_54 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E](a: T_B[E, E], b: Char) extends T_A[E, Boolean]
case class CC_B() extends T_A[T_B[Char, Boolean], Boolean]
case class CC_D[G]() extends T_B[CC_A[CC_B], G]

val v_a: T_A[Char, Boolean] = null
val v_b: Int = v_a match{
  case CC_A(_, 'x') => 0 
}
}
// This is not matched: Pattern match is empty without constants
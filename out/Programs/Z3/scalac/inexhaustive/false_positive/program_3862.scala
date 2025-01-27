package Program_15 

package Program_4 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[E, D](a: T_B[D], b: T_A[Int, D], c: T_A[D, E]) extends T_A[D, E]
case class CC_B[F]() extends T_B[T_B[Char]]

val v_a: T_B[T_B[Char]] = null
val v_b: Int = v_a match{
  case CC_B() => 0 
}
}
// This is not matched: (CC_B Boolean (T_B (T_B Char)))
// This is not matched: Pattern match is empty without constants
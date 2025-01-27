package Program_29 

object Test {
sealed trait T_A[A, B]
case class CC_A[E](a: T_A[E, E], b: T_A[E, Int]) extends T_A[E, Int]
case class CC_B[F]() extends T_A[F, Int]

val v_a: CC_A[Char] = null
val v_b: Int = v_a match{
  case CC_A(_, CC_B()) => 0 
}
}
// This is not matched: Pattern match is empty without constants
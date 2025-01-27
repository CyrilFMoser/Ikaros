package Program_2 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[E, D](a: T_B[D], b: T_A[D, D], c: T_B[D]) extends T_A[E, D]
case class CC_B[F, G](a: T_A[G, F]) extends T_A[F, G]
case class CC_C(a: T_A[T_A[Char, Int], Char]) extends T_B[Boolean]

val v_a: T_A[Boolean, Char] = null
val v_b: Int = v_a match{
  case CC_A(_, CC_A(_, _, _), _) => 0 
  case CC_B(_) => 1 
}
}
// This is not matched: CC_A(_, CC_B(_), _)
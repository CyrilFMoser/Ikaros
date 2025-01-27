package Program_6 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E](a: T_A[E, E], b: T_A[E, Char], c: T_A[E, E]) extends T_A[E, Char]
case class CC_B[F]() extends T_A[F, Char]
case class CC_C[G](a: T_B[G, G]) extends T_A[G, Char]

val v_a: T_A[Int, Char] = null
val v_b: Int = v_a match{
  case CC_A(_, CC_A(_, _, _), _) => 0 
  case CC_A(_, CC_B(), _) => 1 
  case CC_B() => 2 
  case CC_C(_) => 3 
}
}
// This is not matched: CC_A(_, CC_C(_), _)
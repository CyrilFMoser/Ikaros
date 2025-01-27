package Program_19 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, T_A[C, Int]], b: C, c: T_A[C, T_A[C, Int]]) extends T_A[C, T_A[C, Int]]
case class CC_B[D](a: T_A[D, T_A[D, Int]], b: T_A[D, D]) extends T_A[D, T_A[D, Int]]
case class CC_C[E](a: (Char,(Int,Boolean))) extends T_A[E, T_A[E, Int]]

val v_a: T_A[Boolean, T_A[Boolean, Int]] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(_, _, CC_A(_, _, _)), _, _) => 0 
  case CC_A(CC_A(_, _, CC_B(_, _)), _, _) => 1 
  case CC_A(CC_A(_, _, CC_C(_)), _, _) => 2 
  case CC_A(CC_B(_, _), _, _) => 3 
  case CC_A(CC_C(_), _, _) => 4 
  case CC_B(_, _) => 5 
  case CC_C(_) => 6 
}
}
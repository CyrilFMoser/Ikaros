package Program_3 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D](a: T_A[D, T_B[D]], b: T_B[D]) extends T_A[D, T_B[D]]
case class CC_B[E]() extends T_A[E, T_B[E]]
case class CC_C[F](a: (CC_B[Boolean],CC_A[Boolean]), b: T_A[Byte, T_A[F, F]], c: T_A[F, T_B[F]]) extends T_A[F, T_B[F]]
case class CC_D[G]() extends T_B[G]

val v_a: T_A[Int, T_B[Int]] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B() => 1 
  case CC_C((CC_B(),CC_A(_, _)), _, CC_A(CC_A(_, _), CC_D())) => 2 
  case CC_C((CC_B(),CC_A(_, _)), _, CC_A(CC_B(), CC_D())) => 3 
  case CC_C((CC_B(),CC_A(_, _)), _, CC_A(CC_C(_, _, _), CC_D())) => 4 
  case CC_C((CC_B(),CC_A(_, _)), _, CC_B()) => 5 
}
}
// This is not matched: CC_C((CC_B(),CC_A(_, _)), _, CC_C((_,_), _, _))
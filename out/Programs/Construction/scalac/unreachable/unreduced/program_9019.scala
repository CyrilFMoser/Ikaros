package Program_29 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D](a: T_B[D, D], b: T_B[T_A[D], D], c: T_A[D]) extends T_A[D]
case class CC_B[E](a: (T_A[Byte],Boolean)) extends T_A[E]
case class CC_C[F](a: T_A[F], b: F, c: T_A[F]) extends T_A[F]
case class CC_D[G]() extends T_B[CC_A[Int], G]

val v_a: T_A[Int] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B((CC_A(_, _, _),true)) => 1 
  case CC_B((CC_A(_, _, _),false)) => 2 
  case CC_B((CC_B(_),true)) => 3 
  case CC_B((CC_B(_),false)) => 4 
  case CC_B((CC_C(_, _, _),true)) => 5 
  case CC_B((CC_C(_, _, _),false)) => 6 
  case CC_C(CC_A(_, _, CC_A(_, _, _)), _, _) => 7 
  case CC_C(CC_A(_, _, CC_B(_)), _, _) => 8 
  case CC_C(CC_A(_, _, CC_C(_, _, _)), _, _) => 9 
  case CC_C(CC_B((_,_)), _, _) => 10 
  case CC_C(CC_C(CC_A(_, _, _), _, _), _, _) => 11 
  case CC_C(CC_C(CC_B(_), _, _), _, _) => 12 
  case CC_C(CC_C(CC_C(_, _, _), _, _), _, _) => 13 
}
}
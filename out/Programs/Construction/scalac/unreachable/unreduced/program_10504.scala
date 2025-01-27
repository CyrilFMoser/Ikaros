package Program_31 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E](a: T_A[E, T_B[E, E]], b: T_A[E, T_B[E, E]], c: T_A[E, E]) extends T_A[E, T_B[E, E]]
case class CC_B[F](a: T_A[F, T_B[F, F]]) extends T_A[F, T_B[F, F]]
case class CC_C[G](a: Int, b: Char, c: (T_A[Boolean, Int],CC_B[Char])) extends T_B[G, T_A[CC_B[Boolean], T_A[Char, (Byte,Boolean)]]]
case class CC_D[H]() extends T_B[CC_C[Byte], H]

val v_a: T_A[Char, T_B[Char, Char]] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(_, _, _), _, _) => 0 
  case CC_A(CC_B(CC_A(_, _, _)), _, _) => 1 
  case CC_A(CC_B(CC_B(_)), _, _) => 2 
  case CC_B(CC_A(CC_A(_, _, _), CC_A(_, _, _), _)) => 3 
  case CC_B(CC_A(CC_A(_, _, _), CC_B(_), _)) => 4 
  case CC_B(CC_A(CC_B(_), CC_A(_, _, _), _)) => 5 
  case CC_B(CC_A(CC_B(_), CC_B(_), _)) => 6 
  case CC_B(CC_B(_)) => 7 
}
}
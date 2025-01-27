package Program_21 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D]() extends T_A[D, T_A[T_B[Char], T_A[Boolean, Char]]]
case class CC_B[E](a: T_B[E], b: T_B[E], c: T_B[E]) extends T_B[E]
case class CC_C[F](a: CC_A[F]) extends T_B[F]
case class CC_D[G](a: CC_B[CC_C[G]], b: T_A[G, G], c: G) extends T_B[G]

val v_a: T_B[Byte] = null
val v_b: Int = v_a match{
  case CC_B(_, _, CC_B(CC_B(_, _, _), _, CC_B(_, _, _))) => 0 
  case CC_B(_, _, CC_B(CC_C(_), _, CC_B(_, _, _))) => 1 
  case CC_B(_, _, CC_B(CC_D(_, _, _), _, CC_B(_, _, _))) => 2 
  case CC_B(_, _, CC_B(CC_B(_, _, _), _, CC_C(_))) => 3 
  case CC_B(_, _, CC_B(CC_C(_), _, CC_C(_))) => 4 
  case CC_B(_, _, CC_B(CC_D(_, _, _), _, CC_C(_))) => 5 
  case CC_B(_, _, CC_B(CC_B(_, _, _), _, CC_D(_, _, _))) => 6 
  case CC_B(_, _, CC_B(CC_C(_), _, CC_D(_, _, _))) => 7 
  case CC_B(_, _, CC_B(CC_D(_, _, _), _, CC_D(_, _, _))) => 8 
  case CC_B(_, _, CC_C(CC_A())) => 9 
  case CC_B(_, _, CC_D(CC_B(_, _, _), _, _)) => 10 
  case CC_C(_) => 11 
  case CC_D(CC_B(_, CC_B(_, _, _), _), _, _) => 12 
  case CC_D(CC_B(_, CC_C(_), _), _, _) => 13 
  case CC_D(CC_B(_, CC_D(_, _, _), _), _, _) => 14 
}
}
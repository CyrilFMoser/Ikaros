package Program_19 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D](a: T_B[D], b: T_A[D, D]) extends T_A[D, T_A[T_B[Char], Byte]]
case class CC_B[E](a: CC_A[E]) extends T_A[E, T_A[T_B[Char], Byte]]
case class CC_C[F](a: F, b: T_A[F, F], c: F) extends T_B[F]
case class CC_D(a: T_B[Char]) extends T_B[T_B[Boolean]]
case class CC_E[G](a: G, b: T_B[G]) extends T_B[G]

val v_a: T_B[T_B[T_B[Boolean]]] = null
val v_b: Int = v_a match{
  case CC_C(CC_C(_, _, _), _, CC_C(_, _, _)) => 0 
  case CC_C(CC_C(_, _, _), _, CC_D(_)) => 1 
  case CC_C(CC_C(_, _, _), _, CC_E(_, _)) => 2 
  case CC_C(CC_D(_), _, CC_C(_, _, _)) => 3 
  case CC_C(CC_D(_), _, CC_D(_)) => 4 
  case CC_C(CC_D(_), _, CC_E(_, _)) => 5 
  case CC_C(CC_E(_, _), _, CC_C(_, _, _)) => 6 
  case CC_C(CC_E(_, _), _, CC_D(_)) => 7 
  case CC_C(CC_E(_, _), _, CC_E(_, _)) => 8 
  case CC_E(CC_C(_, _, _), CC_C(_, _, _)) => 9 
  case CC_E(CC_D(_), CC_C(_, _, _)) => 10 
  case CC_E(CC_E(_, _), CC_C(_, _, _)) => 11 
  case CC_E(CC_C(_, _, _), CC_E(_, _)) => 12 
  case CC_E(CC_D(_), CC_E(_, _)) => 13 
  case CC_E(CC_E(_, _), CC_E(_, _)) => 14 
}
}
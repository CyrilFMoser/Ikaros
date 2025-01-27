package Program_3 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D](a: T_A[D, D]) extends T_A[D, T_A[D, D]]
case class CC_B[E](a: T_B[T_A[E, E]], b: E) extends T_B[E]
case class CC_C[F]() extends T_B[F]
case class CC_D[G](a: T_B[G]) extends T_B[G]

val v_a: T_B[Int] = null
val v_b: Int = v_a match{
  case CC_B(CC_B(CC_B(_, _), _), 12) => 0 
  case CC_B(CC_B(CC_C(), _), 12) => 1 
  case CC_B(CC_B(CC_D(_), _), 12) => 2 
  case CC_B(CC_C(), 12) => 3 
  case CC_B(CC_D(CC_B(_, _)), 12) => 4 
  case CC_B(CC_D(CC_C()), 12) => 5 
  case CC_B(CC_D(CC_D(_)), 12) => 6 
  case CC_B(CC_B(CC_B(_, _), _), _) => 7 
  case CC_B(CC_B(CC_C(), _), _) => 8 
  case CC_B(CC_B(CC_D(_), _), _) => 9 
  case CC_B(CC_C(), _) => 10 
  case CC_B(CC_D(CC_B(_, _)), _) => 11 
  case CC_B(CC_D(CC_C()), _) => 12 
  case CC_B(CC_D(CC_D(_)), _) => 13 
  case CC_C() => 14 
  case CC_D(CC_B(CC_B(_, _), _)) => 15 
  case CC_D(CC_B(CC_C(), _)) => 16 
  case CC_D(CC_B(CC_D(_), _)) => 17 
  case CC_D(CC_C()) => 18 
  case CC_D(CC_D(CC_B(_, _))) => 19 
  case CC_D(CC_D(CC_C())) => 20 
  case CC_D(CC_D(CC_D(_))) => 21 
}
}
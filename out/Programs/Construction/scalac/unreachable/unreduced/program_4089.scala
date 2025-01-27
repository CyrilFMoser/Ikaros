package Program_2 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: (T_A[Char, Byte],((Int,Boolean),Boolean))) extends T_A[T_A[Boolean, Boolean], C]
case class CC_B[D, E](a: T_A[T_A[Boolean, Boolean], E], b: E, c: (CC_A[Byte],Char)) extends T_A[T_A[Boolean, Boolean], D]
case class CC_C[F, G](a: CC_B[F, F], b: CC_A[G]) extends T_A[F, T_A[T_A[Boolean, Boolean], F]]

val v_a: T_A[T_A[Boolean, Boolean], Int] = null
val v_b: Int = v_a match{
  case CC_A((_,(_,_))) => 0 
  case CC_B(_, _, (CC_A(_),_)) => 1 
}
}
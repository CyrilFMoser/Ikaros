package Program_21 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D](a: Int, b: D, c: T_A[T_A[D, D], D]) extends T_A[T_A[D, D], D]
case class CC_B[E](a: E) extends T_A[T_A[E, E], E]
case class CC_C[F](a: ((Int,Int),(Int,Byte)), b: CC_B[F], c: T_B[F]) extends T_A[T_A[F, F], F]
case class CC_D[G](a: T_A[G, G]) extends T_B[G]

val v_a: T_A[T_A[Boolean, Boolean], Boolean] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_C((_,_), CC_B(_), CC_D(_)) => 1 
}
}
// This is not matched: CC_B(_)
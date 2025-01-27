package Program_13 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A[C](a: C, b: T_A) extends T_A
case class CC_B[D, E](a: T_B[D, CC_A[D]], b: CC_A[E], c: T_A) extends T_B[D, ((T_A,T_A),T_B[T_A, (Int,Boolean)])]
case class CC_C[F, G](a: CC_A[F], b: CC_A[F], c: CC_A[G]) extends T_B[F, ((T_A,T_A),T_B[T_A, (Int,Boolean)])]

val v_a: T_B[Boolean, ((T_A,T_A),T_B[T_A, (Int,Boolean)])] = null
val v_b: Int = v_a match{
  case CC_B(_, _, CC_A(_, _)) => 0 
  case CC_C(_, _, _) => 1 
}
}
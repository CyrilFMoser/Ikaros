package Program_2 

object Test {
sealed trait T_A[A, B]
case class CC_A[C, D](a: T_A[T_A[D, D], D]) extends T_A[T_A[C, C], C]
case class CC_B[E]() extends T_A[T_A[E, E], E]
case class CC_C[F, G](a: (Byte,T_A[Int, Char]), b: T_A[T_A[G, G], G], c: (CC_B[Boolean],Char)) extends T_A[T_A[F, F], F]

val v_a: T_A[T_A[Int, Int], Int] = null
val v_b: Int = v_a match{
  case CC_B() => 0 
  case CC_C((_,_), _, _) => 1 
}
}
// This is not matched: CC_A(_)
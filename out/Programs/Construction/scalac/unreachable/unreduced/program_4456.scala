package Program_25 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E](a: T_A[T_B[E, E], E]) extends T_A[T_B[E, E], E]
case class CC_B[F]() extends T_A[T_B[F, F], F]
case class CC_C[G](a: T_A[G, G], b: (CC_A[Byte],Char)) extends T_A[T_B[G, G], G]

val v_a: T_A[T_B[Byte, Byte], Byte] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(CC_A(_))) => 0 
  case CC_A(CC_A(CC_B())) => 1 
  case CC_A(CC_A(CC_C(_, _))) => 2 
  case CC_A(CC_B()) => 3 
  case CC_A(CC_C(_, (_,_))) => 4 
  case CC_B() => 5 
  case CC_C(_, (CC_A(_),_)) => 6 
}
}
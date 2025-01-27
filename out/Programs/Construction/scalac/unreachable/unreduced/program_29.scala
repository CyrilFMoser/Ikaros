package Program_1 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E]() extends T_A[T_A[T_A[Byte, Boolean], Int], E]
case class CC_B[F]() extends T_A[T_A[T_A[Byte, Boolean], Int], F]
case class CC_C[G](a: (CC_B[Boolean],T_A[(Byte,Boolean), Char])) extends T_A[T_A[T_A[Byte, Boolean], Int], G]

val v_a: T_A[T_A[T_A[Byte, Boolean], Int], Byte] = null
val v_b: Int = v_a match{
  case CC_B() => 0 
  case CC_C((_,_)) => 1 
}
}
// This is not matched: CC_A()
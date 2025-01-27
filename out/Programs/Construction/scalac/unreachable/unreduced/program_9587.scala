package Program_28 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C]() extends T_A[C, (Boolean,Boolean)]
case class CC_B[D, E]() extends T_A[D, (Boolean,Boolean)]
case class CC_C[F](a: T_A[F, F], b: Byte, c: T_A[F, (Boolean,Boolean)]) extends T_A[F, (Boolean,Boolean)]
case class CC_D(a: Int, b: (CC_A[T_B],T_A[T_B, T_B])) extends T_B

val v_a: T_A[Char, (Boolean,Boolean)] = null
val v_b: Int = v_a match{
  case CC_B() => 0 
  case CC_C(_, _, CC_A()) => 1 
  case CC_C(_, _, CC_B()) => 2 
  case CC_C(_, _, CC_C(_, _, _)) => 3 
}
}
// This is not matched: CC_A()
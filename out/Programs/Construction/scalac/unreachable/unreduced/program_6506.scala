package Program_21 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E]() extends T_A[T_A[E, E], E]
case class CC_B[G, F](a: G, b: (T_A[Int, Int],T_B[Int, Int]), c: T_B[G, G]) extends T_B[F, G]
case class CC_C[I, H]() extends T_B[H, I]

val v_a: T_B[Byte, Int] = null
val v_b: Int = v_a match{
  case CC_B(_, (_,CC_B(_, _, _)), CC_B(_, _, _)) => 0 
  case CC_B(_, (_,CC_B(_, _, _)), CC_C()) => 1 
  case CC_B(_, (_,CC_C()), CC_B(_, _, _)) => 2 
  case CC_B(_, (_,CC_C()), CC_C()) => 3 
  case CC_C() => 4 
}
}
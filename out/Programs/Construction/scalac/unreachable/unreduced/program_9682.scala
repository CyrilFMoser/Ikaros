package Program_1 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E](a: T_B[E, E], b: E) extends T_A[T_A[T_B[Boolean, Boolean], (Boolean,Byte)], E]
case class CC_B[F](a: (Int,T_A[Boolean, Boolean]), b: F, c: T_B[F, F]) extends T_B[F, T_A[F, F]]
case class CC_C[G]() extends T_B[G, T_A[G, G]]
case class CC_D[H]() extends T_B[H, Int]

val v_a: T_B[Char, T_A[Char, Char]] = null
val v_b: Int = v_a match{
  case CC_B((_,_), _, _) => 0 
  case CC_C() => 1 
}
}
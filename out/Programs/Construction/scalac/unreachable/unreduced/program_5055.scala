package Program_15 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E](a: T_A[E, T_B[E, E]]) extends T_A[E, T_A[T_A[Byte, Boolean], T_B[(Boolean,Int), Int]]]
case class CC_B[F]() extends T_A[F, T_A[T_A[Byte, Boolean], T_B[(Boolean,Int), Int]]]

val v_a: T_A[Char, T_A[T_A[Byte, Boolean], T_B[(Boolean,Int), Int]]] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B() => 1 
}
}
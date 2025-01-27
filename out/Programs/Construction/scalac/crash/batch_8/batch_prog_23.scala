package Program_23 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E]() extends T_A[E, T_B[T_A[E, E], Char]]
case class CC_B[F, G](a: T_A[G, F]) extends T_B[F, G]
case class CC_C() extends T_B[T_B[CC_A[Int], CC_A[Boolean]], CC_B[T_A[Char, Boolean], T_B[Char, Byte]]]
case class CC_D(a: Byte, b: ((CC_C,CC_C),T_A[CC_C, CC_C])) extends T_B[T_B[CC_A[Int], CC_A[Boolean]], CC_B[T_A[Char, Boolean], T_B[Char, Byte]]]

val v_a: T_A[Char, T_B[T_A[Char, Char], Char]] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
}
}
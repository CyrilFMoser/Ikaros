package Program_7 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E](a: T_B[E, E], b: T_A[E, E], c: Char) extends T_A[Byte, E]
case class CC_B[F]() extends T_A[Byte, F]
case class CC_C(a: CC_A[Char], b: Int) extends T_A[Byte, T_B[T_A[Byte, Char], CC_A[Int]]]
case class CC_D[H, G]() extends T_B[G, H]
case class CC_E[I, J]() extends T_B[I, J]

val v_a: T_A[Byte, Boolean] = null
val v_b: Int = v_a match{
  case CC_A(CC_D(), _, _) => 0 
  case CC_A(CC_E(), _, _) => 1 
  case CC_B() => 2 
}
}
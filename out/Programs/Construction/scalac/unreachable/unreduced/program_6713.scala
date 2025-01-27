package Program_1 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D](a: T_A[D, D]) extends T_A[T_B[T_A[(Char,Int), Char]], D]
case class CC_B[E](a: CC_A[E], b: CC_A[E]) extends T_A[T_B[T_A[Byte, Char]], E]
case class CC_C(a: (Boolean,CC_A[Boolean]), b: T_B[(Char,Char)]) extends T_A[T_B[T_A[(Char,Int), Char]], CC_B[T_B[Char]]]
case class CC_D[F](a: Byte, b: (Char,CC_A[CC_C])) extends T_B[F]
case class CC_E[G]() extends T_B[G]
case class CC_F[H](a: H) extends T_B[H]

val v_a: T_B[Byte] = null
val v_b: Int = v_a match{
  case CC_D(_, (_,CC_A(_))) => 0 
  case CC_E() => 1 
  case CC_F(_) => 2 
}
}
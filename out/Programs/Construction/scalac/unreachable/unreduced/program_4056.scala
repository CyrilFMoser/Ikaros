package Program_24 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A() extends T_A[T_B[T_B[Int, Boolean], T_A[Boolean, Char]], T_A[T_B[Char, Byte], T_B[Byte, Boolean]]]
case class CC_B(a: (T_A[Boolean, CC_A],CC_A), b: T_A[Byte, T_A[CC_A, CC_A]]) extends T_A[T_B[T_B[Int, Boolean], T_A[Boolean, Char]], T_A[T_B[Char, Byte], T_B[Byte, Boolean]]]
case class CC_C[E]() extends T_A[T_B[T_B[Int, Boolean], T_A[Boolean, Char]], T_A[T_B[Char, Byte], T_B[Byte, Boolean]]]
case class CC_D[G, F](a: CC_C[G]) extends T_B[F, G]
case class CC_E(a: CC_D[T_A[(Char,Char), CC_B], CC_D[CC_B, Byte]]) extends T_B[CC_C[CC_D[CC_B, CC_A]], T_A[CC_C[CC_A], CC_D[CC_B, Int]]]

val v_a: T_A[T_B[T_B[Int, Boolean], T_A[Boolean, Char]], T_A[T_B[Char, Byte], T_B[Byte, Boolean]]] = null
val v_b: Int = v_a match{
  case CC_B((_,CC_A()), _) => 0 
  case CC_C() => 1 
}
}
// This is not matched: CC_A()
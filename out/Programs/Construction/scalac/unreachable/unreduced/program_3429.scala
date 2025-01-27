package Program_13 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E](a: T_A[E, E]) extends T_A[E, T_A[E, T_A[E, E]]]
case class CC_B[F]() extends T_A[F, T_A[F, T_A[F, F]]]
case class CC_C(a: CC_B[T_A[(Boolean,Byte), Byte]], b: CC_A[T_A[Boolean, Int]]) extends T_A[T_A[CC_B[Int], CC_A[Char]], T_A[T_A[CC_B[Int], CC_A[Char]], T_A[T_A[CC_B[Int], CC_A[Char]], T_A[CC_B[Int], CC_A[Char]]]]]
case class CC_D() extends T_B[(CC_A[CC_C],CC_C), CC_A[T_B[CC_C, Byte]]]
case class CC_E() extends T_B[(CC_A[CC_C],CC_C), CC_A[T_B[CC_C, Byte]]]
case class CC_F(a: Byte, b: CC_E, c: CC_B[Byte]) extends T_B[(CC_A[CC_C],CC_C), CC_A[T_B[CC_C, Byte]]]

val v_a: T_A[Byte, T_A[Byte, T_A[Byte, Byte]]] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B() => 1 
}
}
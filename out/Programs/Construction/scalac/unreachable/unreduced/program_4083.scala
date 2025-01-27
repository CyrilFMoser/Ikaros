package Program_31 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D](a: D, b: Byte, c: T_B[D]) extends T_A[(T_A[Boolean, Boolean],T_A[Char, Boolean]), D]
case class CC_B(a: CC_A[T_A[Int, Char]], b: CC_A[CC_A[Char]], c: CC_A[T_A[Int, Boolean]]) extends T_A[(T_A[Boolean, Boolean],T_A[Char, Boolean]), T_B[Byte]]
case class CC_C[E](a: E, b: CC_B, c: (T_A[CC_B, Byte],CC_A[CC_B])) extends T_B[E]
case class CC_D() extends T_B[Char]
case class CC_E[F](a: Boolean, b: CC_B, c: F) extends T_B[F]

val v_a: T_B[Byte] = null
val v_b: Int = v_a match{
  case CC_C(_, CC_B(_, _, CC_A(_, _, _)), (_,CC_A(_, _, _))) => 0 
  case CC_E(_, _, _) => 1 
}
}
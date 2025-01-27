package Program_18 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A() extends T_A[T_B[Int, T_A[(Boolean,Char), Char]], T_A[Int, T_A[Char, Byte]]]
case class CC_B(a: T_B[T_B[CC_A, CC_A], T_B[CC_A, CC_A]], b: T_B[Boolean, Boolean], c: T_B[Byte, (Char,CC_A)]) extends T_A[T_B[Int, T_A[(Boolean,Char), Char]], T_A[Int, T_A[Char, Byte]]]
case class CC_C[E]() extends T_B[E, CC_B]
case class CC_D[F](a: CC_A, b: Boolean) extends T_B[F, CC_B]

val v_a: T_A[T_B[Int, T_A[(Boolean,Char), Char]], T_A[Int, T_A[Char, Byte]]] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_, _, _) => 1 
}
}
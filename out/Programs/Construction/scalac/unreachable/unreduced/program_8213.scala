package Program_24 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A(a: T_A[Int, T_A[Byte, Boolean]], b: Int) extends T_A[Int, T_B[(Boolean,Byte), T_A[Boolean, Byte]]]
case class CC_B(a: CC_A, b: CC_A, c: Int) extends T_A[T_A[CC_A, (CC_A,CC_A)], T_B[Char, T_B[CC_A, CC_A]]]
case class CC_C[E]() extends T_B[E, Boolean]
case class CC_D[F](a: T_A[F, T_B[F, F]], b: (T_B[Boolean, CC_B],T_A[CC_A, Int]), c: T_B[CC_B, Boolean]) extends T_B[F, Boolean]
case class CC_E[G, H]() extends T_B[G, H]

val v_a: T_B[CC_B, Boolean] = null
val v_b: Int = v_a match{
  case CC_D(_, _, _) => 0 
  case CC_E() => 1 
}
}
// This is not matched: CC_C()
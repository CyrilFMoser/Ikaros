package Program_12 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A(a: T_A[T_B[(Byte,Byte), Byte]], b: (Char,T_B[Byte, Char]), c: T_A[T_A[Boolean]]) extends T_A[T_A[T_B[Char, Boolean]]]
case class CC_B(a: CC_A, b: (CC_A,T_B[CC_A, CC_A])) extends T_A[T_A[T_B[Char, Boolean]]]
case class CC_C[E, D, F](a: T_A[D]) extends T_B[D, E]
case class CC_D[G](a: G, b: T_B[Byte, G], c: T_A[G]) extends T_B[Byte, G]
case class CC_E[H]() extends T_B[Byte, H]

val v_a: T_B[Byte, T_A[T_A[T_B[Char, Boolean]]]] = null
val v_b: Int = v_a match{
  case CC_C(_) => 0 
  case CC_D(_, _, _) => 1 
  case CC_E() => 2 
}
}
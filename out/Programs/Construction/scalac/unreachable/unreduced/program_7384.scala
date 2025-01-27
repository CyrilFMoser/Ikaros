package Program_11 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E, F](a: Int) extends T_A[F, E]
case class CC_B[G, H](a: H) extends T_A[H, G]
case class CC_C() extends T_B[CC_B[Char, T_B[Int, Byte]], Boolean]
case class CC_D(a: T_B[T_A[Byte, CC_C], T_A[CC_C, Char]], b: T_B[Char, T_A[Byte, Int]], c: CC_C) extends T_B[CC_B[Char, T_B[Int, Byte]], Boolean]
case class CC_E(a: Int, b: T_A[CC_B[CC_C, (Byte,Boolean)], CC_C], c: T_A[Byte, CC_A[CC_D, CC_C]]) extends T_B[CC_B[Char, T_B[Int, Byte]], Boolean]

val v_a: T_A[CC_D, T_B[CC_B[Char, T_B[Int, Byte]], Boolean]] = null
val v_b: Int = v_a match{
  case CC_A(12) => 0 
  case CC_A(_) => 1 
  case CC_B(CC_D(_, _, CC_C())) => 2 
}
}
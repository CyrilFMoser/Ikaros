package Program_26 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D, E]() extends T_A[D, E]
case class CC_B[G, F](a: T_A[T_A[F, G], F], b: F, c: T_A[F, G]) extends T_A[F, G]
case class CC_C(a: T_A[Int, T_A[Int, Boolean]], b: T_B[T_A[(Boolean,Boolean), Int]], c: T_B[CC_A[Char, (Char,Int)]]) extends T_B[CC_A[Byte, Char]]
case class CC_D() extends T_B[CC_A[T_A[CC_C, Char], Char]]
case class CC_E(a: T_B[(Byte,CC_C)]) extends T_B[CC_A[Byte, Char]]

val v_a: T_A[CC_E, Int] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_, CC_E(_), CC_A()) => 1 
  case CC_B(_, CC_E(_), CC_B(_, CC_E(_), CC_A())) => 2 
  case CC_B(_, CC_E(_), CC_B(_, CC_E(_), CC_B(_, _, _))) => 3 
}
}
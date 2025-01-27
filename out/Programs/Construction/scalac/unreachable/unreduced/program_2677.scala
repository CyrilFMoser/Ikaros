package Program_28 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E]() extends T_A[Char, E]
case class CC_B(a: T_A[Int, CC_A[Int]], b: Int, c: T_B[Char, Char]) extends T_A[Char, Int]
case class CC_C() extends T_A[Char, Int]
case class CC_D[F](a: T_A[F, F], b: Byte, c: Int) extends T_B[(Byte,CC_C), F]
case class CC_E[G, H](a: H, b: (T_A[Char, CC_B],Char)) extends T_B[H, G]

val v_a: T_B[(Byte,CC_C), CC_B] = null
val v_b: Int = v_a match{
  case CC_D(_, _, _) => 0 
  case CC_E(_, (CC_A(),_)) => 1 
}
}
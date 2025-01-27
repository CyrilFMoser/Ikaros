package Program_3 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[E, D](a: Byte, b: T_B[(Char,Boolean)]) extends T_A[D, E]
case class CC_B[G, F]() extends T_A[G, F]
case class CC_C[H, I](a: T_B[H], b: Boolean) extends T_A[H, I]
case class CC_D(a: T_A[T_A[Boolean, Boolean], (Char,(Int,Char))], b: T_A[Char, CC_C[Int, Boolean]], c: T_A[T_B[Byte], T_A[Char, Int]]) extends T_B[T_A[Char, T_A[Char, Boolean]]]
case class CC_E() extends T_B[T_A[Char, T_A[Char, Boolean]]]
case class CC_F(a: T_A[(CC_D,CC_D), CC_D], b: CC_C[CC_C[CC_D, CC_E], Int], c: CC_D) extends T_B[T_A[Char, T_A[Char, Boolean]]]

val v_a: T_A[CC_D, Char] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B() => 1 
  case CC_C(_, _) => 2 
}
}
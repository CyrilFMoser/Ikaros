package Program_20 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E]() extends T_A[T_B[T_B[Byte, Byte], T_B[Int, Int]], E]
case class CC_B[G, F](a: T_B[G, G]) extends T_A[F, G]
case class CC_C[H](a: (Boolean,CC_B[(Byte,Int), (Char,Char)])) extends T_A[T_B[T_B[Byte, Byte], T_B[Int, Int]], H]
case class CC_D(a: Int, b: CC_A[CC_A[(Char,Int)]]) extends T_B[CC_C[T_A[Char, Byte]], Boolean]
case class CC_E[I]() extends T_B[I, Boolean]
case class CC_F(a: CC_C[T_A[CC_D, CC_D]], b: CC_C[CC_A[CC_D]], c: T_A[CC_E[(Int,Char)], T_A[CC_D, CC_D]]) extends T_B[CC_C[T_A[Char, Byte]], Boolean]

val v_a: T_A[T_B[T_B[Byte, Byte], T_B[Int, Int]], CC_F] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_) => 1 
  case CC_C((_,CC_B(_))) => 2 
}
}
package Program_28 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E](a: T_A[E, T_A[E, E]], b: E, c: T_B[E, Int]) extends T_A[T_B[T_A[Int, Char], T_A[Byte, Byte]], E]
case class CC_B[F, G]() extends T_A[G, F]
case class CC_C[H](a: (CC_B[Char, Char],CC_B[Int, Char])) extends T_A[T_B[T_A[Int, Char], T_A[Byte, Byte]], H]
case class CC_D[I]() extends T_B[CC_C[CC_B[Char, Int]], I]
case class CC_E[J](a: J, b: (T_A[(Char,Int), Byte],T_A[Byte, (Char,Char)])) extends T_B[CC_C[CC_B[Char, Int]], J]

val v_a: T_A[T_B[T_A[Int, Char], T_A[Byte, Byte]], Boolean] = null
val v_b: Int = v_a match{
  case CC_A(CC_B(), _, _) => 0 
  case CC_B() => 1 
}
}
// This is not matched: CC_C((CC_B(),CC_B()))
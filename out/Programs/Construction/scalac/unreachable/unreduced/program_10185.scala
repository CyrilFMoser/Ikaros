package Program_0 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E, F]() extends T_A[F, E]
case class CC_B[H, G]() extends T_A[G, H]
case class CC_C[J, I](a: Int, b: T_B[I, J], c: T_A[J, I]) extends T_A[J, I]
case class CC_D(a: CC_B[CC_C[(Char,Byte), Boolean], CC_B[Int, Byte]], b: CC_A[CC_B[Int, Int], T_B[Int, Boolean]], c: Char) extends T_B[Char, CC_C[T_A[Char, (Int,Byte)], CC_C[Int, Char]]]

val v_a: T_A[Boolean, Char] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_C(_, _, CC_A()) => 1 
  case CC_C(_, _, CC_B()) => 2 
  case CC_C(_, _, CC_C(12, _, CC_A())) => 3 
  case CC_C(_, _, CC_C(_, _, CC_A())) => 4 
  case CC_C(_, _, CC_C(12, _, CC_B())) => 5 
  case CC_C(_, _, CC_C(_, _, CC_B())) => 6 
  case CC_C(_, _, CC_C(12, _, CC_C(_, _, _))) => 7 
  case CC_C(_, _, CC_C(_, _, CC_C(_, _, _))) => 8 
}
}
// This is not matched: CC_B()
package Program_6 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[E, D](a: T_A[D, T_A[E, D]]) extends T_A[D, E]
case class CC_B[G, F](a: F, b: F, c: T_B[Char]) extends T_A[G, F]
case class CC_C[H](a: CC_A[H, H]) extends T_A[Char, H]
case class CC_D(a: T_B[T_A[Boolean, Int]], b: T_A[(Char,Char), T_A[Char, Byte]], c: T_A[(Boolean,Int), Byte]) extends T_B[CC_C[CC_C[Byte]]]
case class CC_E(a: T_A[T_A[Boolean, CC_D], (Int,CC_D)]) extends T_B[CC_C[CC_C[Byte]]]

val v_a: T_A[Char, Int] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(CC_A(_))) => 0 
  case CC_A(CC_A(CC_B(_, _, _))) => 1 
  case CC_A(CC_A(CC_C(_))) => 2 
  case CC_A(CC_B(_, _, _)) => 3 
  case CC_A(CC_C(CC_A(_))) => 4 
  case CC_B(_, _, _) => 5 
  case CC_C(CC_A(CC_A(_))) => 6 
  case CC_C(CC_A(CC_B(_, _, _))) => 7 
}
}
package Program_18 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A(a: T_A[T_A[(Byte,Byte)]], b: T_B[T_A[Char], T_B[Char, Boolean]]) extends T_A[T_A[T_B[Byte, Int]]]
case class CC_B[D](a: CC_A) extends T_A[T_A[T_B[Byte, Int]]]
case class CC_C(a: T_A[CC_B[(Int,Byte)]], b: T_A[CC_B[CC_A]], c: CC_A) extends T_A[T_A[T_B[Byte, Int]]]
case class CC_D[E, F]() extends T_B[E, F]
case class CC_E[G, H](a: T_B[H, G], b: CC_B[G]) extends T_B[H, G]
case class CC_F[J, I]() extends T_B[I, J]

val v_a: T_B[Char, Char] = null
val v_b: Int = v_a match{
  case CC_D() => 0 
  case CC_E(CC_D(), CC_B(CC_A(_, _))) => 1 
  case CC_E(CC_E(_, _), CC_B(CC_A(_, _))) => 2 
  case CC_F() => 3 
}
}
// This is not matched: CC_E(CC_F(), CC_B(CC_A(_, _)))
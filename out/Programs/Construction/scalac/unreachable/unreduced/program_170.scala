package Program_29 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[E, D](a: T_A[D, (Int,Boolean)], b: T_A[E, E]) extends T_A[E, D]
case class CC_B[F, G](a: T_B[F], b: G, c: Byte) extends T_A[G, F]
case class CC_C[H, I](a: T_B[Boolean], b: (T_A[Char, Int],T_A[Int, Boolean])) extends T_A[I, H]
case class CC_D(a: T_A[T_A[Char, Int], (Char,Byte)], b: T_A[(Byte,Int), T_A[Byte, Byte]]) extends T_B[(CC_A[Char, Int],T_A[Byte, Int])]
case class CC_E(a: T_A[Boolean, CC_D], b: CC_B[T_B[CC_D], CC_D], c: T_B[CC_D]) extends T_B[(CC_A[Char, Int],T_A[Byte, Int])]
case class CC_F(a: T_A[Int, Char]) extends T_B[(CC_A[Char, Int],T_A[Byte, Int])]

val v_a: CC_A[Boolean, Char] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(_, _), CC_A(_, _)) => 0 
  case CC_A(CC_A(_, _), CC_B(_, _, _)) => 1 
  case CC_A(CC_A(_, _), CC_C(_, _)) => 2 
  case CC_A(CC_B(_, _, _), CC_A(_, _)) => 3 
  case CC_A(CC_B(_, _, _), CC_B(_, _, _)) => 4 
  case CC_A(CC_C(_, _), CC_A(_, _)) => 5 
  case CC_A(CC_C(_, _), CC_B(_, _, _)) => 6 
  case CC_A(CC_C(_, _), CC_C(_, _)) => 7 
}
}
// This is not matched: CC_A(CC_B(_, _, _), CC_C(_, _))
package Program_23 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A(a: T_A[T_A[Int, Int], Char], b: Byte) extends T_A[T_A[(Char,Char), T_B[Byte, (Char,Byte)]], T_A[Boolean, T_A[Byte, Char]]]
case class CC_B(a: T_B[Int, T_A[CC_A, Byte]]) extends T_A[T_A[(Char,Char), T_B[Byte, (Char,Byte)]], T_A[Boolean, T_A[Byte, Char]]]
case class CC_C[F, E, G]() extends T_B[E, F]
case class CC_D[I, H]() extends T_B[I, H]

val v_a: T_A[T_A[(Char,Char), T_B[Byte, (Char,Byte)]], T_A[Boolean, T_A[Byte, Char]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B(CC_C()) => 1 
  case CC_B(CC_D()) => 2 
}
}
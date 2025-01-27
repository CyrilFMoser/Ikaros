package Program_20 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E](a: Byte, b: E, c: E) extends T_A[(T_B[Int, Int],T_B[Byte, Char]), E]
case class CC_B[F](a: Char, b: (T_B[Byte, Byte],(Char,Byte)), c: CC_A[F]) extends T_A[(T_B[Int, Int],T_B[Byte, Char]), F]
case class CC_C(a: Byte) extends T_A[(T_B[Int, Int],T_B[Byte, Char]), Byte]
case class CC_D[G, H](a: T_B[H, H], b: T_A[G, G], c: T_B[G, G]) extends T_B[H, G]

val v_a: T_A[(T_B[Int, Int],T_B[Byte, Char]), Int] = null
val v_b: Int = v_a match{
  case CC_A(0, _, 12) => 0 
  case CC_A(_, _, 12) => 1 
  case CC_A(0, _, _) => 2 
  case CC_A(_, _, _) => 3 
  case CC_B('x', (CC_D(_, _, _),(_,_)), _) => 4 
  case CC_B(_, (CC_D(_, _, _),(_,_)), _) => 5 
}
}
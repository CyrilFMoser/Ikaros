package Program_6 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[F, E](a: (Int,T_A[Boolean, Int])) extends T_A[F, E]
case class CC_B[G, H](a: T_B[H, G], b: H, c: Boolean) extends T_A[H, G]
case class CC_C[I](a: Int) extends T_A[I, CC_A[(Int,Boolean), T_B[(Byte,Byte), Int]]]
case class CC_D[J](a: CC_A[J, CC_A[J, J]], b: CC_B[J, J], c: Char) extends T_B[J, CC_C[J]]

val v_a: T_A[Char, Int] = null
val v_b: Int = v_a match{
  case CC_A((12,CC_A(_))) => 0 
  case CC_A((12,CC_B(_, _, _))) => 1 
  case CC_A((_,CC_A(_))) => 2 
  case CC_A((_,CC_B(_, _, _))) => 3 
  case CC_B(_, _, _) => 4 
}
}
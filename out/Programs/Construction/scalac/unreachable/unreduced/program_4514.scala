package Program_19 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E](a: E, b: T_A[E, T_A[E, E]], c: T_B[E, E]) extends T_A[E, (T_B[Char, Byte],T_B[Int, Byte])]
case class CC_B[F, G](a: CC_A[F], b: G, c: CC_A[G]) extends T_A[F, (T_B[Char, Byte],T_B[Int, Byte])]
case class CC_C() extends T_A[CC_A[CC_A[Int]], (T_B[Char, Byte],T_B[Int, Byte])]
case class CC_D[H, I](a: CC_B[I, H]) extends T_B[I, H]
case class CC_E[K, J](a: (CC_D[CC_C, Char],T_B[CC_C, CC_C]), b: CC_D[J, K]) extends T_B[J, K]
case class CC_F(a: CC_B[CC_C, T_B[Char, Char]], b: CC_D[CC_E[CC_C, CC_C], Char]) extends T_B[CC_D[CC_E[Int, CC_C], T_B[(Int,Byte), CC_C]], Char]

val v_a: T_A[T_B[CC_D[CC_E[Int, CC_C], T_B[(Int,Byte), CC_C]], Char], (T_B[Char, Byte],T_B[Int, Byte])] = null
val v_b: Int = v_a match{
  case CC_A(_, _, CC_D(CC_B(_, _, _))) => 0 
  case CC_A(_, _, CC_E((_,_), CC_D(_))) => 1 
  case CC_B(_, _, _) => 2 
}
}
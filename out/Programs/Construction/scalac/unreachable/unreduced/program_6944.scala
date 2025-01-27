package Program_6 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E](a: T_B[E, E], b: T_A[E, E], c: T_B[E, E]) extends T_A[T_B[T_A[Int, Byte], Char], E]
case class CC_B[F, G](a: (Boolean,T_A[Byte, Byte]), b: T_B[G, G]) extends T_A[G, F]
case class CC_C[H, I]() extends T_A[H, I]
case class CC_D[J](a: T_B[J, J]) extends T_B[J, CC_C[CC_A[Char], CC_A[(Boolean,Int)]]]
case class CC_E(a: T_A[CC_D[Char], T_B[(Boolean,Boolean), Int]]) extends T_B[T_B[CC_C[(Boolean,Byte), Int], CC_D[Byte]], CC_C[CC_A[Char], CC_A[(Boolean,Int)]]]

val v_a: CC_E = null
val v_b: Int = v_a match{
  case CC_E(CC_B((_,_), _)) => 0 
  case CC_E(CC_C()) => 1 
}
}
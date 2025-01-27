package Program_11 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E](a: T_A[E, E], b: E, c: T_B[E, E]) extends T_A[T_A[(Boolean,Int), T_A[(Int,Byte), Int]], E]
case class CC_B() extends T_A[T_A[(Boolean,Int), T_A[(Int,Byte), Int]], CC_A[T_A[Int, (Int,Int)]]]
case class CC_C[F](a: T_B[F, F], b: T_A[CC_B, F], c: CC_B) extends T_B[F, T_B[T_A[CC_B, CC_B], T_A[CC_B, CC_B]]]
case class CC_D[G](a: Boolean, b: T_A[G, CC_B], c: Boolean) extends T_B[G, T_B[T_A[CC_B, CC_B], T_A[CC_B, CC_B]]]

val v_a: T_B[T_A[T_A[(Boolean,Int), T_A[(Int,Byte), Int]], CC_A[T_A[Int, (Int,Int)]]], T_B[T_A[CC_B, CC_B], T_A[CC_B, CC_B]]] = null
val v_b: Int = v_a match{
  case CC_D(_, _, _) => 0 
}
}
// This is not matched: CC_C(_, _, CC_B())
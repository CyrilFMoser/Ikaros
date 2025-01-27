package Program_13 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E, F](a: F, b: Int) extends T_A[T_A[T_B[Byte, Byte], T_B[Byte, (Boolean,Int)]], E]
case class CC_B[G](a: T_A[G, T_B[G, Char]], b: G, c: G) extends T_A[T_A[T_B[Byte, Byte], T_B[Byte, (Boolean,Int)]], G]
case class CC_C[I, H]() extends T_B[H, I]
case class CC_D[J](a: T_A[J, J], b: Boolean, c: T_A[J, J]) extends T_B[J, (CC_B[Int],(Char,Char))]
case class CC_E[L, K](a: CC_B[L], b: L, c: CC_B[L]) extends T_B[L, K]

val v_a: T_B[Int, (CC_B[Int],(Char,Char))] = null
val v_b: Int = v_a match{
  case CC_C() => 0 
  case CC_D(_, _, _) => 1 
}
}
// This is not matched: CC_E(_, _, CC_B(_, _, _))
package Program_25 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E](a: T_A[E, E]) extends T_A[E, (T_B[Int, Char],T_B[Int, Int])]
case class CC_B[F](a: F) extends T_A[F, (T_B[Int, Char],T_B[Int, Int])]
case class CC_C[G]() extends T_A[G, (T_B[Int, Char],T_B[Int, Int])]
case class CC_D[H](a: H, b: T_A[H, H]) extends T_B[H, CC_C[((Char,Int),(Int,Byte))]]
case class CC_E[I]() extends T_B[I, CC_C[((Char,Int),(Int,Byte))]]

val v_a: T_A[Int, (T_B[Int, Char],T_B[Int, Int])] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_C() => 1 
}
}
// This is not matched: CC_B(_)
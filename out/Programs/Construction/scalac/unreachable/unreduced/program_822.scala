package Program_9 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[E, D]() extends T_A[E, D]
case class CC_B[F, G](a: T_B[G], b: Int, c: CC_A[F, F]) extends T_A[T_A[CC_A[Int, Byte], T_A[Boolean, (Char,Boolean)]], F]
case class CC_C[I, H](a: T_B[H], b: T_B[I]) extends T_A[I, H]
case class CC_D(a: (CC_C[Char, Int],T_A[(Int,Boolean), (Byte,Int)])) extends T_B[CC_A[T_B[Boolean], Char]]
case class CC_E(a: T_A[(Boolean,CC_D), Int], b: CC_A[CC_C[CC_D, CC_D], T_B[CC_D]], c: T_A[T_A[Int, CC_D], T_B[CC_D]]) extends T_B[CC_A[T_B[Boolean], Char]]
case class CC_F(a: T_A[(CC_D,CC_E), CC_C[Char, (Int,Boolean)]], b: CC_D) extends T_B[CC_A[T_B[Boolean], Char]]

val v_a: T_A[T_A[CC_A[Int, Byte], T_A[Boolean, (Char,Boolean)]], Byte] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_C(_, _) => 1 
}
}
// This is not matched: CC_B(_, _, _)
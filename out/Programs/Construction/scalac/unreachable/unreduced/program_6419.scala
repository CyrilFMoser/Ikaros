package Program_28 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E](a: E) extends T_A[T_B[T_B[Int, Int], Boolean], E]
case class CC_B[F](a: (T_B[Boolean, Boolean],CC_A[Char]), b: Int) extends T_A[T_B[T_B[Int, Int], Boolean], F]
case class CC_C[G](a: CC_A[G], b: G, c: G) extends T_A[T_B[T_B[Int, Int], Boolean], G]
case class CC_D[H, I](a: T_A[I, T_A[Char, I]]) extends T_B[I, H]
case class CC_E(a: CC_D[(Boolean,Int), CC_C[Int]]) extends T_B[(Int,T_A[Int, Byte]), T_A[Char, (Byte,Byte)]]
case class CC_F(a: CC_E) extends T_B[(Int,T_A[Int, Byte]), T_A[Char, (Byte,Byte)]]

val v_a: T_A[T_B[T_B[Int, Int], Boolean], T_B[(Int,T_A[Int, Byte]), T_A[Char, (Byte,Byte)]]] = null
val v_b: Int = v_a match{
  case CC_A(CC_D(_)) => 0 
  case CC_A(CC_E(CC_D(_))) => 1 
  case CC_A(CC_F(_)) => 2 
  case CC_B(_, _) => 3 
  case CC_C(_, _, _) => 4 
}
}
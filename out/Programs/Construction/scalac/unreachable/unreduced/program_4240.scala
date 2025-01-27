package Program_22 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A() extends T_A[T_A[T_B[Int, Boolean], Char], T_B[T_A[Byte, Int], ((Int,Char),Char)]]
case class CC_B(a: T_B[T_A[CC_A, Boolean], Boolean], b: CC_A) extends T_A[T_A[T_B[Int, Boolean], Char], T_B[T_A[Byte, Int], ((Int,Char),Char)]]
case class CC_C[F, E](a: (Int,T_B[CC_A, CC_A])) extends T_B[F, E]
case class CC_D[H, G](a: T_A[H, G], b: T_A[G, CC_C[G, H]]) extends T_B[G, H]

val v_a: T_A[T_A[T_B[Int, Boolean], Char], T_B[T_A[Byte, Int], ((Int,Char),Char)]] = null
val v_b: Int = v_a match{
  case CC_B(CC_C(_), _) => 0 
  case CC_B(CC_D(_, _), _) => 1 
}
}
// This is not matched: CC_A()
package Program_30 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A(a: T_B[(Boolean,Byte), Boolean], b: T_A[Int, Byte]) extends T_A[T_B[Byte, Int], Int]
case class CC_C[F, E]() extends T_B[F, E]
case class CC_D[H, G]() extends T_B[H, G]

val v_a: T_A[T_B[Byte, Int], Int] = null
val v_b: Int = v_a match{
  case CC_A(CC_D(), _) => 0 
}
}
// This is not matched: (CC_B T_A)
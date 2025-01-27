package Program_8 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, C]) extends T_A[T_A[(Int,Byte), Int], C]
case class CC_B[D, E](a: Byte) extends T_A[T_A[(Int,Byte), Int], D]
case class CC_C[F]() extends T_A[T_A[(Int,Byte), Int], F]

val v_a: T_A[T_A[(Int,Byte), Int], Int] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(_) => 1 
}
}
// This is not matched: CC_C()
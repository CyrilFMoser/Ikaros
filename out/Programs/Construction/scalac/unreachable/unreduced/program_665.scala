package Program_9 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: T_A[C, C]) extends T_A[C, T_A[Byte, (T_B,T_B)]]
case class CC_B(a: T_B, b: CC_A[T_A[Int, Int]], c: T_B) extends T_A[(CC_A[T_B],T_B), T_A[Byte, (T_B,T_B)]]
case class CC_C[D](a: T_B) extends T_A[D, Int]

val v_a: T_A[(CC_A[T_B],T_B), T_A[Byte, (T_B,T_B)]] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(_, _, _) => 1 
}
}
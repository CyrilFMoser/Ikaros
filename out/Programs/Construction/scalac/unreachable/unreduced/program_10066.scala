package Program_13 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D](a: T_B[D], b: T_B[D]) extends T_A[T_A[T_A[Int, Byte], Byte], D]
case class CC_B[E]() extends T_A[T_A[T_A[Int, Byte], Byte], E]
case class CC_C[F]() extends T_B[F]
case class CC_D(a: T_A[CC_A[Int], CC_B[Int]]) extends T_B[CC_C[CC_B[(Int,Int)]]]
case class CC_E(a: CC_C[CC_D]) extends T_B[CC_C[CC_B[(Int,Int)]]]

val v_a: T_B[CC_C[CC_B[(Int,Int)]]] = null
val v_b: Int = v_a match{
  case CC_C() => 0 
  case CC_D(_) => 1 
  case CC_E(_) => 2 
}
}
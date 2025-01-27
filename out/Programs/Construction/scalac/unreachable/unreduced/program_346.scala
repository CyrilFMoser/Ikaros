package Program_31 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E, F]() extends T_A[E, F]
case class CC_B[H, G]() extends T_A[H, G]
case class CC_C[I, J](a: I, b: (T_A[Boolean, Boolean],CC_A[Byte, Char]), c: T_A[I, I]) extends T_A[I, T_A[T_A[Boolean, Boolean], T_A[Char, (Boolean,Boolean)]]]
case class CC_D[K](a: T_B[T_A[K, K], K], b: K) extends T_B[K, T_B[K, K]]
case class CC_E[L](a: L) extends T_B[L, T_B[L, L]]

val v_a: T_B[Int, T_B[Int, Int]] = null
val v_b: Int = v_a match{
  case CC_D(_, _) => 0 
  case CC_E(_) => 1 
}
}
package Program_14 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E](a: E, b: Boolean) extends T_A[T_A[T_A[Boolean, Boolean], (Int,Byte)], E]
case class CC_B[G, F](a: T_B[G, F], b: T_B[(Int,Boolean), F]) extends T_B[G, F]
case class CC_C[H, I](a: T_A[H, I]) extends T_B[I, H]

val v_a: T_B[Int, Int] = null
val v_b: Int = v_a match{
  case CC_B(CC_B(CC_B(_, _), _), _) => 0 
  case CC_B(CC_B(CC_C(_), _), _) => 1 
  case CC_B(CC_C(_), _) => 2 
  case CC_C(_) => 3 
}
}
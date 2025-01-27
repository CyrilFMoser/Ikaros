package Program_7 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E]() extends T_A[T_A[(Char,Boolean), (Int,Boolean)], E]
case class CC_B[F](a: T_A[F, F], b: F) extends T_B[Int, F]

val v_a: T_B[Int, Int] = null
val v_b: Int = v_a match{
  case CC_B(_, 12) => 0 
}
}
// This is not matched: (CC_A Byte Boolean (T_A Byte))
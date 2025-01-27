package Program_17 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E](a: T_A[E, E]) extends T_A[T_A[Int, T_B[Boolean, Boolean]], E]
case class CC_B[F]() extends T_A[T_A[Int, T_B[Boolean, Boolean]], F]
case class CC_C[G](a: T_B[T_A[G, Int], CC_A[Boolean]], b: Byte) extends T_A[T_A[Int, T_B[Boolean, Boolean]], G]
case class CC_D() extends T_B[Byte, T_A[CC_C[Boolean], T_A[Byte, Byte]]]

val v_a: T_A[T_A[Int, T_B[Boolean, Boolean]], Char] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B() => 1 
  case CC_C(_, _) => 2 
}
}
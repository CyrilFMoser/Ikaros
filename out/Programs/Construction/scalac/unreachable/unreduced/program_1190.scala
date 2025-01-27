package Program_7 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E](a: Int, b: E) extends T_A[T_A[(Boolean,Char), T_B[Boolean, Int]], E]
case class CC_B[F, G](a: T_A[F, G]) extends T_A[T_A[(Boolean,Char), T_B[Boolean, Int]], F]

val v_a: T_A[T_A[(Boolean,Char), T_B[Boolean, Int]], Char] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B(_) => 1 
}
}
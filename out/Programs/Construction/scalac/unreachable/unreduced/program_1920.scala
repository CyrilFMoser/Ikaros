package Program_21 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E](a: T_A[E, T_A[E, Int]], b: T_B[E, E]) extends T_A[T_A[T_A[Boolean, Char], T_B[(Int,Byte), Byte]], E]
case class CC_B[F](a: T_B[F, F]) extends T_A[T_A[T_A[Boolean, Char], T_B[(Int,Byte), Byte]], F]

val v_a: T_A[T_A[T_A[Boolean, Char], T_B[(Int,Byte), Byte]], Int] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B(_) => 1 
}
}
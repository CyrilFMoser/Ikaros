package Program_25 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A(a: Int, b: T_A[T_A[Int, Byte], T_B[Byte, Byte]]) extends T_A[T_A[T_B[Boolean, Boolean], T_B[Int, Boolean]], T_B[(Byte,Boolean), Boolean]]
case class CC_B() extends T_A[T_A[T_B[Boolean, Boolean], T_B[Int, Boolean]], T_B[(Byte,Boolean), Boolean]]
case class CC_C[E](a: CC_B, b: CC_A, c: T_B[E, T_A[E, E]]) extends T_B[E, T_A[E, E]]

val v_a: T_A[T_A[T_B[Boolean, Boolean], T_B[Int, Boolean]], T_B[(Byte,Boolean), Boolean]] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B() => 1 
}
}
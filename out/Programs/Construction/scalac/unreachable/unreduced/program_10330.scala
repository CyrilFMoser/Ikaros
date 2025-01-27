package Program_12 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E]() extends T_A[T_A[T_A[Boolean, Boolean], T_A[Int, (Byte,Boolean)]], E]
case class CC_B[F](a: T_B[F, F], b: T_A[T_B[F, F], F], c: T_A[F, CC_A[F]]) extends T_A[T_A[T_A[Boolean, Boolean], T_A[Int, (Byte,Boolean)]], F]
case class CC_C[G](a: CC_A[G], b: Char) extends T_A[T_A[T_A[Boolean, Boolean], T_A[Int, (Byte,Boolean)]], G]

val v_a: T_A[T_A[T_A[Boolean, Boolean], T_A[Int, (Byte,Boolean)]], Char] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_, _, _) => 1 
  case CC_C(CC_A(), _) => 2 
}
}
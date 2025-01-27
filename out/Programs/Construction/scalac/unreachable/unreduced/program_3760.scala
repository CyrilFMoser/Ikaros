package Program_13 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E]() extends T_A[(T_A[(Char,Boolean), Boolean],T_B[Byte, Boolean]), E]
case class CC_B[F](a: T_A[F, Boolean], b: T_A[F, F]) extends T_A[(T_A[(Char,Boolean), Boolean],T_B[Byte, Boolean]), F]
case class CC_C(a: T_B[T_B[(Int,Char), Boolean], CC_A[Byte]], b: T_B[CC_B[Byte], T_A[Boolean, (Char,Boolean)]]) extends T_A[CC_A[CC_B[Byte]], CC_B[CC_A[Boolean]]]

val v_a: T_A[(T_A[(Char,Boolean), Boolean],T_B[Byte, Boolean]), Int] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_, _) => 1 
}
}
package Program_13 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E]() extends T_A[T_A[T_B[Char, Int], T_B[Char, Char]], E]
case class CC_B[F](a: T_B[F, F], b: CC_A[F], c: T_A[F, F]) extends T_A[T_A[T_B[Char, Int], T_B[Char, Char]], F]
case class CC_C(a: (T_B[Int, Char],CC_B[Byte]), b: T_A[CC_A[Boolean], ((Boolean,Boolean),Boolean)]) extends T_B[CC_B[Int], T_A[CC_B[Int], T_A[Char, Boolean]]]
case class CC_D(a: CC_C, b: Boolean, c: CC_A[T_B[Byte, CC_C]]) extends T_B[CC_B[Int], T_A[CC_B[Int], T_A[Char, Boolean]]]

val v_a: T_A[T_A[T_B[Char, Int], T_B[Char, Char]], CC_C] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_, CC_A(), _) => 1 
}
}
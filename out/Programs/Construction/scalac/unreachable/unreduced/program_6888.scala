package Program_19 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D](a: T_A[D, (Byte,Boolean)]) extends T_A[(Boolean,T_B[Int]), D]
case class CC_B[E]() extends T_B[E]
case class CC_C(a: CC_B[T_A[Char, Char]], b: T_A[T_B[Boolean], T_B[Byte]]) extends T_B[Boolean]

val v_a: T_B[Boolean] = null
val v_b: Int = v_a match{
  case CC_B() => 0 
  case CC_C(CC_B(), _) => 1 
}
}
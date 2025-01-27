package Program_25 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A(a: Char, b: T_B[Byte, ((Char,Char),Char)]) extends T_A[T_B[T_A[Boolean], T_A[Char]]]
case class CC_B[D](a: T_A[D], b: T_B[D, D]) extends T_B[CC_A, D]
case class CC_C[E]() extends T_B[CC_A, E]

val v_a: T_B[CC_A, T_A[T_B[T_A[Boolean], T_A[Char]]]] = null
val v_b: Int = v_a match{
  case CC_B(_, _) => 0 
  case CC_C() => 1 
}
}
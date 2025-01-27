package Program_3 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[T_A[C, C], C], b: Int) extends T_A[C, Char]
case class CC_B[D]() extends T_A[D, Char]
case class CC_C[E]() extends T_A[E, Char]

val v_a: T_A[Byte, Char] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B() => 1 
  case CC_C() => 2 
}
}
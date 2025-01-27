package Program_23 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D](a: Int) extends T_A[D]
case class CC_B(a: T_B[T_A[Char], T_A[Byte]], b: T_A[T_A[Byte]]) extends T_A[(T_A[Byte],Char)]
case class CC_C() extends T_A[(T_A[Byte],Char)]
case class CC_D[E](a: E) extends T_B[Int, E]

val v_a: T_A[(T_A[Byte],Char)] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(_, CC_A(_)) => 1 
  case CC_C() => 2 
}
}
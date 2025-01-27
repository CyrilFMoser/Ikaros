package Program_27 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: Byte) extends T_A[T_A[(Boolean,Char), T_A[Int, Byte]], C]
case class CC_B[D]() extends T_A[T_A[(Boolean,Char), T_A[Int, Byte]], D]
case class CC_C[E](a: T_A[E, E]) extends T_A[T_A[(Boolean,Char), T_A[Int, Byte]], E]

val v_a: T_A[T_A[(Boolean,Char), T_A[Int, Byte]], Byte] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B() => 1 
  case CC_C(_) => 2 
}
}
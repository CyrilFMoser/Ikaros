package Program_3 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A() extends T_A[Int]
case class CC_B[D](a: CC_A) extends T_B[T_A[T_A[CC_A]], D]
case class CC_C[E](a: T_A[T_B[CC_A, E]], b: Byte) extends T_B[T_A[T_A[CC_A]], E]

val v_a: T_B[T_A[T_A[CC_A]], Char] = null
val v_b: Int = v_a match{
  case CC_B(CC_A()) => 0 
  case CC_C(_, 0) => 1 
  case CC_C(_, _) => 2 
}
}
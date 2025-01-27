package Program_10 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: C) extends T_A[T_A[Boolean, T_A[Char, Int]], C]
case class CC_B[D](a: T_A[D, D], b: D) extends T_A[T_A[Boolean, T_A[Char, Int]], D]
case class CC_C[E]() extends T_A[T_A[Boolean, T_A[Char, Int]], E]

val v_a: T_A[T_A[Boolean, T_A[Char, Int]], Byte] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(_, _) => 1 
  case CC_C() => 2 
}
}
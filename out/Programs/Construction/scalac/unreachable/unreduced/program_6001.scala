package Program_28 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E](a: T_B[E, E], b: T_A[E, E], c: E) extends T_A[T_B[(Byte,Char), T_A[Byte, Int]], E]
case class CC_B[F]() extends T_A[T_B[(Byte,Char), T_A[Byte, Int]], F]

val v_a: T_A[T_B[(Byte,Char), T_A[Byte, Int]], Byte] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B() => 1 
}
}
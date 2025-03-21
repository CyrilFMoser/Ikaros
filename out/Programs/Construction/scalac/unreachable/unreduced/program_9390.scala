package Program_23 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, C], b: C, c: C) extends T_A[T_A[C, C], C]
case class CC_B[D](a: Byte) extends T_A[T_A[D, D], D]
case class CC_C() extends T_A[T_A[Char, Char], Char]

val v_a: T_A[T_A[Byte, Byte], Byte] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B(_) => 1 
}
}
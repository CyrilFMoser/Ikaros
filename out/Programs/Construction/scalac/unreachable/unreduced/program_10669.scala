package Program_16 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: C) extends T_A[T_A[C, C], C]
case class CC_B[D](a: D, b: T_A[D, D], c: D) extends T_A[T_A[D, D], D]

val v_a: T_A[T_A[Byte, Byte], Byte] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(0, _, _) => 1 
  case CC_B(_, _, _) => 2 
}
}
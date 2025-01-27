package Program_23 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D](a: T_B[D], b: Int, c: Byte) extends T_A[D, T_B[D]]
case class CC_B[E]() extends T_A[E, T_B[E]]
case class CC_C(a: CC_A[(Int,Byte)]) extends T_B[Byte]

val v_a: T_A[T_B[Byte], T_B[T_B[Byte]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B() => 1 
}
}
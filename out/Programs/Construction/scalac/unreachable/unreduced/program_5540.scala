package Program_17 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D](a: T_B[D]) extends T_A[T_B[T_B[Int]], D]
case class CC_B() extends T_B[T_A[T_A[Byte, Byte], T_A[Byte, Boolean]]]
case class CC_C(a: Boolean, b: Byte, c: T_B[CC_B]) extends T_B[T_A[T_A[Byte, Byte], T_A[Byte, Boolean]]]

val v_a: T_B[T_A[T_A[Byte, Byte], T_A[Byte, Boolean]]] = null
val v_b: Int = v_a match{
  case CC_B() => 0 
  case CC_C(_, _, _) => 1 
}
}
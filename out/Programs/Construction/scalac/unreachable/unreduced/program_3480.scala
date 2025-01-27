package Program_6 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, C], b: T_A[C, C]) extends T_A[C, Byte]
case class CC_B[D](a: D, b: CC_A[D]) extends T_A[D, Char]
case class CC_C(a: (Byte,CC_A[Byte]), b: (Char,T_A[Byte, Byte])) extends T_A[T_A[T_A[Int, Byte], Byte], Byte]

val v_a: T_A[T_A[T_A[Int, Byte], Byte], Byte] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_C((_,CC_A(_, _)), _) => 1 
}
}
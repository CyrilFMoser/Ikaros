package Program_22 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: C, b: T_A[T_A[C, Byte], C], c: T_A[C, Byte]) extends T_A[C, Byte]
case class CC_B(a: T_A[T_A[Int, Byte], Byte]) extends T_A[T_A[T_A[Boolean, Byte], Byte], Byte]
case class CC_C[D](a: Char, b: D, c: CC_B) extends T_A[D, Byte]

val v_a: T_A[Char, Byte] = null
val v_b: Int = v_a match{
  case CC_A(_, _, CC_A(_, _, _)) => 0 
  case CC_A(_, _, CC_C(_, _, _)) => 1 
  case CC_C(_, _, _) => 2 
}
}
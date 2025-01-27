package Program_24 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: Char, b: Byte, c: T_A[C, C]) extends T_A[T_A[C, T_A[C, C]], C]
case class CC_B(a: CC_A[T_A[Char, Byte]], b: CC_A[CC_A[Int]]) extends T_A[T_A[Byte, T_A[Byte, Byte]], Byte]
case class CC_C[D](a: D, b: T_A[D, D], c: CC_B) extends T_A[T_A[Byte, T_A[Byte, Byte]], Byte]

val v_a: T_A[T_A[Byte, T_A[Byte, Byte]], Byte] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B(_, _) => 1 
  case CC_C(_, _, CC_B(CC_A(_, _, _), CC_A(_, _, _))) => 2 
}
}
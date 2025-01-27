package Program_1 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: C, b: T_A[C, C]) extends T_A[T_A[C, T_A[C, Boolean]], C]
case class CC_B(a: CC_A[T_A[Byte, Boolean]], b: T_A[Int, T_A[Char, (Char,Char)]]) extends T_A[Boolean, CC_A[T_A[Int, Byte]]]
case class CC_C[D](a: D, b: D) extends T_A[T_A[D, T_A[D, Boolean]], D]

val v_a: T_A[T_A[Byte, T_A[Byte, Boolean]], Byte] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_C(_, _) => 1 
}
}
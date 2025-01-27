package Program_14 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, C], b: T_A[C, C]) extends T_A[T_A[T_A[Boolean, Int], T_A[Char, Byte]], C]
case class CC_B[D](a: Int, b: Char) extends T_A[T_A[T_A[Boolean, Int], T_A[Char, Byte]], D]

val v_a: T_A[T_A[T_A[Boolean, Int], T_A[Char, Byte]], Char] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B(_, _) => 1 
}
}
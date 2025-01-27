package Program_20 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: Boolean, b: T_A[Char, C], c: T_A[C, C]) extends T_A[C, T_A[C, Byte]]
case class CC_B(a: T_B) extends T_A[T_A[T_B, T_A[T_B, Byte]], T_A[T_A[T_B, T_A[T_B, Byte]], Byte]]

val v_a: T_A[T_A[T_B, T_A[T_B, Byte]], T_A[T_A[T_B, T_A[T_B, Byte]], Byte]] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B(_) => 1 
}
}
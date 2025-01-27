package Program_8 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: C) extends T_A[T_A[Boolean, T_A[Char, Byte]], C]
case class CC_B[D](a: T_A[D, D]) extends T_A[T_A[Boolean, T_A[Char, Byte]], D]

val v_a: T_A[T_A[Boolean, T_A[Char, Byte]], Boolean] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(_) => 1 
}
}
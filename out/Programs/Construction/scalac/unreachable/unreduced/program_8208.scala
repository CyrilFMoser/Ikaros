package Program_9 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: C, b: T_A[C, C]) extends T_A[C, Boolean]
case class CC_B(a: T_A[T_A[Int, Boolean], Boolean], b: T_A[(Int,Char), Boolean], c: CC_A[CC_A[Byte]]) extends T_A[T_A[(Byte,Int), T_A[Char, Boolean]], Boolean]

val v_a: T_A[T_A[(Byte,Int), T_A[Char, Boolean]], Boolean] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B(_, _, _) => 1 
}
}
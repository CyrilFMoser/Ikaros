package Program_0 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A[C](a: T_A[T_A[T_A[Byte]]], b: T_A[C]) extends T_A[C]
case class CC_B() extends T_B[T_B[T_A[(Char,Int)]]]

val v_a: T_B[T_B[T_A[(Char,Int)]]] = null
val v_b: Int = v_a match{
  case CC_B() => 0 
}
}
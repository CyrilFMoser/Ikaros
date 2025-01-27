package Program_3 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D](a: T_B[D, D], b: T_A[D], c: T_B[D, D]) extends T_A[T_B[(Char,Int), Boolean]]
case class CC_B(a: T_A[T_A[Int]], b: CC_A[T_B[Char, Char]]) extends T_A[T_B[(Char,Int), Boolean]]

val v_a: T_A[T_B[(Char,Int), Boolean]] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B(_, _) => 1 
}
}
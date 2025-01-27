package Program_21 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A(a: Boolean, b: T_A[T_A[Byte, Char], T_A[(Int,Char), Byte]]) extends T_A[T_A[Char, T_A[Int, Char]], T_A[T_B[Int], T_B[Boolean]]]
case class CC_B() extends T_A[T_A[Char, T_A[Int, Char]], T_A[T_B[Int], T_B[Boolean]]]

val v_a: T_A[T_A[Char, T_A[Int, Char]], T_A[T_B[Int], T_B[Boolean]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B() => 1 
}
}
package Program_10 

object Test {
sealed trait T_A[A, B]
case class CC_A(a: Int, b: T_A[T_A[Char, Int], T_A[Byte, Int]]) extends T_A[Int, T_A[T_A[Char, Byte], T_A[Boolean, Boolean]]]
case class CC_B() extends T_A[Int, T_A[T_A[Char, Byte], T_A[Boolean, Boolean]]]

val v_a: T_A[Int, T_A[T_A[Char, Byte], T_A[Boolean, Boolean]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B() => 1 
}
}
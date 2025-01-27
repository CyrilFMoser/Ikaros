package Program_13 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: Char) extends T_A[C, T_A[Char, T_A[Int, Byte]]]
case class CC_B[D](a: T_A[D, D]) extends T_A[D, T_A[Char, T_A[Int, Byte]]]

val v_a: T_A[Boolean, T_A[Char, T_A[Int, Byte]]] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(_) => 1 
}
}
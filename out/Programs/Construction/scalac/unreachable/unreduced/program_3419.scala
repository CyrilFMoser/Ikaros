package Program_22 

object Test {
sealed trait T_A[A, B]
case class CC_A(a: T_A[T_A[Byte, Int], T_A[Boolean, Byte]]) extends T_A[T_A[Boolean, T_A[Boolean, Int]], T_A[Int, T_A[Char, Boolean]]]
case class CC_B(a: CC_A) extends T_A[T_A[Boolean, T_A[Boolean, Int]], T_A[Int, T_A[Char, Boolean]]]

val v_a: T_A[T_A[Boolean, T_A[Boolean, Int]], T_A[Int, T_A[Char, Boolean]]] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(_) => 1 
}
}
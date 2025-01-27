package Program_26 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, C]) extends T_A[C, T_A[Byte, T_A[Boolean, Int]]]
case class CC_B[D](a: D) extends T_A[D, T_A[Byte, T_A[Boolean, Int]]]

val v_a: T_A[Int, T_A[Byte, T_A[Boolean, Int]]] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(_) => 1 
}
}
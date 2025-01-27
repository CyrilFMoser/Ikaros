package Program_17 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, C], b: T_A[C, C], c: T_A[C, Int]) extends T_A[C, (T_A[Boolean, Int],T_A[Byte, Byte])]
case class CC_B(a: CC_A[Byte], b: Boolean) extends T_A[Int, (T_A[Boolean, Int],T_A[Byte, Byte])]

val v_a: T_A[Int, (T_A[Boolean, Int],T_A[Byte, Byte])] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B(_, true) => 1 
  case CC_B(_, false) => 2 
}
}
package Program_15 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A[C](a: Boolean, b: T_B[C], c: T_A[C]) extends T_A[C]
case class CC_B[D](a: Byte) extends T_A[D]
case class CC_C(a: ((Boolean,Char),T_A[Int]), b: Int, c: T_A[T_A[Byte]]) extends T_B[CC_B[CC_B[Byte]]]

val v_a: T_A[Byte] = null
val v_b: Int = v_a match{
  case CC_A(_, _, CC_A(_, _, _)) => 0 
  case CC_A(_, _, CC_B(_)) => 1 
  case CC_B(_) => 2 
}
}
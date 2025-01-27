package Program_18 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A[C](a: T_A[C], b: Byte, c: T_B[C]) extends T_A[C]
case class CC_B[D](a: D, b: Byte) extends T_B[CC_A[(Byte,Char)]]
case class CC_C(a: (T_A[Boolean],T_A[Char]), b: (T_A[Char],T_A[Boolean]), c: CC_B[CC_A[Byte]]) extends T_B[CC_A[(Byte,Char)]]
case class CC_D(a: CC_B[CC_C], b: CC_A[CC_C]) extends T_B[T_A[Int]]

val v_a: T_B[CC_A[(Byte,Char)]] = null
val v_b: Int = v_a match{
  case CC_B(_, 0) => 0 
  case CC_B(_, _) => 1 
  case CC_C((CC_A(_, _, _),CC_A(_, _, _)), (CC_A(_, _, _),CC_A(_, _, _)), CC_B(_, _)) => 2 
}
}
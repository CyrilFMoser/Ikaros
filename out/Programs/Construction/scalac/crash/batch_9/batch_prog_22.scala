package Program_22 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D](a: (T_A[Int],T_B[Int, Char]), b: T_B[T_A[D], D], c: D) extends T_A[D]
case class CC_B(a: T_A[Byte], b: T_A[CC_A[Int]]) extends T_A[T_A[(Boolean,Byte)]]

val v_a: T_A[T_A[(Boolean,Byte)]] = null
val v_b: Int = v_a match{
  case CC_A((CC_A(_, _, _),_), _, CC_A(_, _, _)) => 0 
}
}
// This is not matched: CC_B(_, CC_A(_, _, _))
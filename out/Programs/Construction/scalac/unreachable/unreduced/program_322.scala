package Program_30 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A(a: T_A[(Int,Byte)], b: T_A[Byte]) extends T_A[T_A[T_B[Int]]]
case class CC_B(a: T_B[T_B[CC_A]]) extends T_B[((CC_A,CC_A),CC_A)]
case class CC_C(a: Int) extends T_B[((CC_A,CC_A),CC_A)]

val v_a: T_B[((CC_A,CC_A),CC_A)] = null
val v_b: Int = v_a match{
  case CC_B(_) => 0 
  case CC_C(_) => 1 
}
}
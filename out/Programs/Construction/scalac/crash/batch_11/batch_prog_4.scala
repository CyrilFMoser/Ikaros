package Program_4 

object Test {
sealed trait T_A[A]
case class CC_A[B](a: T_A[B], b: T_A[B]) extends T_A[(T_A[Byte],Byte)]
case class CC_B[C](a: ((Boolean,Int),T_A[Char]), b: (T_A[Int],T_A[Int])) extends T_A[C]

val v_a: T_A[Boolean] = null
val v_b: Int = v_a match{
  case CC_B(_, (CC_B(_, _),CC_B(_, _))) => 0 
}
}
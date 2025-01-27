package Program_19 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A() extends T_A[(T_A[Boolean],T_B[Int])]
case class CC_B(a: (T_A[(Byte,Int)],T_B[CC_A]), b: Boolean) extends T_A[(T_A[Boolean],T_B[Int])]
case class CC_C[C](a: CC_B, b: T_A[C], c: T_A[C]) extends T_B[C]

val v_a: T_A[(T_A[Boolean],T_B[Int])] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B((_,CC_C(_, _, _)), _) => 1 
}
}
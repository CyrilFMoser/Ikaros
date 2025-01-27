package Program_2 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A(a: T_A[T_A[Int]], b: Boolean, c: T_A[T_A[Int]]) extends T_A[T_A[Int]]
case class CC_B() extends T_B[(T_A[CC_A],T_A[Boolean])]
case class CC_C(a: T_B[Byte], b: CC_A) extends T_B[(T_A[CC_A],T_A[Boolean])]

val v_a: T_B[(T_A[CC_A],T_A[Boolean])] = null
val v_b: Int = v_a match{
  case CC_B() => 0 
  case CC_C(_, CC_A(_, _, _)) => 1 
}
}
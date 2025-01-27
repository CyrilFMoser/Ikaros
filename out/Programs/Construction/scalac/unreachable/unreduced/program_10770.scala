package Program_19 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A[C](a: Byte, b: C, c: T_B[C]) extends T_A[C]
case class CC_B(a: T_B[Boolean]) extends T_B[(CC_A[Int],T_A[Int])]
case class CC_C(a: T_A[T_B[CC_B]], b: CC_A[T_A[CC_B]]) extends T_B[(CC_A[Int],T_A[Int])]
case class CC_D() extends T_B[(CC_A[Int],T_A[Int])]

val v_a: T_B[(CC_A[Int],T_A[Int])] = null
val v_b: Int = v_a match{
  case CC_B(_) => 0 
  case CC_C(_, CC_A(_, CC_A(_, _, _), _)) => 1 
  case CC_D() => 2 
}
}
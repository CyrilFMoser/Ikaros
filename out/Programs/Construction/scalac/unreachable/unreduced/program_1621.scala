package Program_23 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A[C](a: T_B[C], b: T_A[C], c: Boolean) extends T_A[C]
case class CC_B[D]() extends T_A[D]
case class CC_C() extends T_B[(CC_A[Byte],T_A[Int])]
case class CC_D() extends T_B[T_B[CC_A[CC_C]]]
case class CC_E(a: ((CC_C,CC_C),(CC_C,CC_D)), b: CC_B[(CC_C,CC_D)]) extends T_B[T_B[CC_A[CC_C]]]

val v_a: T_A[Int] = null
val v_b: Int = v_a match{
  case CC_A(_, CC_A(_, _, _), _) => 0 
  case CC_A(_, CC_B(), _) => 1 
  case CC_B() => 2 
}
}
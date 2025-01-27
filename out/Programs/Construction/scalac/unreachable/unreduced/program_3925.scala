package Program_31 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A(a: T_A[T_B[Byte]], b: T_A[Int]) extends T_A[T_A[T_A[Boolean]]]
case class CC_B(a: CC_A) extends T_A[T_A[T_A[Boolean]]]
case class CC_C() extends T_A[T_A[T_A[Boolean]]]
case class CC_D() extends T_B[(CC_C,T_A[CC_C])]
case class CC_E() extends T_B[(CC_C,T_A[CC_C])]

val v_a: T_A[T_A[T_A[Boolean]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B(_) => 1 
  case CC_C() => 2 
}
}
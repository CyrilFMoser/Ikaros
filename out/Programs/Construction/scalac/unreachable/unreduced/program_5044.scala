package Program_14 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A(a: T_B[(Byte,Boolean)], b: Char) extends T_A[T_B[T_B[Boolean]]]
case class CC_B[C]() extends T_A[T_B[T_B[Boolean]]]
case class CC_C(a: CC_A) extends T_B[CC_B[T_A[CC_A]]]
case class CC_D(a: T_A[CC_A], b: Byte, c: CC_A) extends T_B[CC_B[T_A[CC_A]]]
case class CC_E() extends T_B[CC_B[T_A[CC_A]]]

val v_a: T_A[T_B[T_B[Boolean]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B() => 1 
}
}
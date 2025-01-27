package Program_14 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A(a: T_A, b: T_A, c: T_B[T_B[T_A]]) extends T_A
case class CC_B() extends T_A
case class CC_C(a: CC_A) extends T_B[T_B[T_B[CC_B]]]
case class CC_D(a: T_A) extends T_B[T_B[T_B[CC_B]]]

val v_a: T_B[T_B[T_B[CC_B]]] = null
val v_b: Int = v_a match{
  case CC_C(CC_A(_, _, _)) => 0 
  case CC_D(_) => 1 
}
}
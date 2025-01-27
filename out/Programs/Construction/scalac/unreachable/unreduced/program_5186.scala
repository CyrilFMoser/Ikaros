package Program_11 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A[B]() extends T_A
case class CC_B() extends T_A
case class CC_C(a: CC_B) extends T_B[CC_A[CC_A[T_A]]]
case class CC_D(a: T_B[(T_A,CC_B)], b: T_A) extends T_B[CC_A[CC_A[T_A]]]
case class CC_E() extends T_B[CC_A[CC_A[T_A]]]

val v_a: T_B[CC_A[CC_A[T_A]]] = null
val v_b: Int = v_a match{
  case CC_C(CC_B()) => 0 
  case CC_D(_, CC_A()) => 1 
  case CC_D(_, CC_B()) => 2 
  case CC_E() => 3 
}
}
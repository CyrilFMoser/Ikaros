package Program_28 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A() extends T_A[T_A[T_A[T_B]]]
case class CC_B(a: T_A[T_A[CC_A]], b: T_B, c: T_B) extends T_A[T_A[T_A[T_B]]]
case class CC_C() extends T_B
case class CC_D(a: T_B) extends T_B

val v_a: T_A[T_A[T_A[T_B]]] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_, CC_C(), _) => 1 
  case CC_B(_, CC_D(CC_C()), _) => 2 
  case CC_B(_, CC_D(CC_D(_)), _) => 3 
}
}
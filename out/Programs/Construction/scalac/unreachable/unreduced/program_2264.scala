package Program_15 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_B[T_A, T_B[T_A, Boolean]], b: T_B[T_A, T_A]) extends T_A
case class CC_B() extends T_A
case class CC_C(a: CC_A) extends T_B[T_B[T_A, CC_B], T_B[CC_B, (Byte,CC_A)]]
case class CC_D(a: (CC_A,(T_A,CC_C)), b: Boolean) extends T_B[T_B[T_A, CC_B], T_B[CC_B, (Byte,CC_A)]]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B() => 1 
}
}
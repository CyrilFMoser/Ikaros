package Program_2 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A(a: Char) extends T_A[(T_A[T_B],T_A[T_B])]
case class CC_B(a: CC_A) extends T_B
case class CC_C() extends T_B
case class CC_D(a: T_A[T_A[Char]], b: (CC_C,T_A[CC_A]), c: T_A[(Byte,CC_A)]) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_B(CC_A(_)) => 0 
  case CC_C() => 1 
  case CC_D(_, _, _) => 2 
}
}
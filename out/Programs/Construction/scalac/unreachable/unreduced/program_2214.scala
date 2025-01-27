package Program_14 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_B[T_A, T_B[T_A, T_A]]) extends T_A
case class CC_B[C]() extends T_B[(T_A,T_B[CC_A, T_A]), C]
case class CC_C(a: CC_A, b: CC_A, c: CC_A) extends T_B[(T_A,T_B[CC_A, T_A]), CC_B[(T_A,T_A)]]

val v_a: T_B[(T_A,T_B[CC_A, T_A]), CC_B[(T_A,T_A)]] = null
val v_b: Int = v_a match{
  case CC_B() => 0 
  case CC_C(CC_A(_), _, _) => 1 
}
}
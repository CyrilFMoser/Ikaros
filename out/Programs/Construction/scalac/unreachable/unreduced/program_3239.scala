package Program_30 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A(a: T_A, b: ((T_A,T_A),T_B[Boolean])) extends T_A
case class CC_B(a: T_A, b: T_A, c: Char) extends T_A
case class CC_C() extends T_B[CC_B]
case class CC_D(a: T_B[T_B[T_A]], b: T_B[Char]) extends T_B[CC_B]

val v_a: T_B[CC_B] = null
val v_b: Int = v_a match{
  case CC_C() => 0 
  case CC_D(_, _) => 1 
}
}
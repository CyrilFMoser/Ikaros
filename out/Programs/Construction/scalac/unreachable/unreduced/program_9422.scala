package Program_6 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_A, b: T_B[T_B[T_A, T_A], (T_A,T_A)], c: T_B[T_B[Boolean, T_A], T_B[T_A, (Int,Boolean)]]) extends T_A
case class CC_B(a: T_B[T_A, Byte]) extends T_A
case class CC_C() extends T_B[CC_B, CC_B]
case class CC_D(a: Int, b: CC_B, c: CC_A) extends T_B[CC_B, CC_B]
case class CC_E[C]() extends T_B[T_B[CC_B, CC_B], C]

val v_a: T_B[CC_B, CC_B] = null
val v_b: Int = v_a match{
  case CC_C() => 0 
  case CC_D(_, _, CC_A(_, _, _)) => 1 
}
}
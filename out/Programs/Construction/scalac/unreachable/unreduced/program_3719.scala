package Program_27 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A(a: T_B[T_B[(Boolean,Boolean)]]) extends T_A[Char, T_B[Byte]]
case class CC_B(a: T_B[Int]) extends T_B[(CC_A,(CC_A,CC_A))]
case class CC_C() extends T_B[(CC_A,(CC_A,CC_A))]
case class CC_D(a: CC_B, b: Int) extends T_B[(CC_A,(CC_A,CC_A))]

val v_a: T_B[(CC_A,(CC_A,CC_A))] = null
val v_b: Int = v_a match{
  case CC_B(_) => 0 
  case CC_C() => 1 
  case CC_D(_, _) => 2 
}
}
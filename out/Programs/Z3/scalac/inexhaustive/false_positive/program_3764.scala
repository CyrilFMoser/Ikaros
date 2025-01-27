package Program_14 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A(a: T_B[Byte], b: T_B[T_A], c: T_A) extends T_A
case class CC_B() extends T_A
case class CC_C() extends T_B[(CC_B,CC_B)]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_B() => 0 
  case CC_A(_, _, CC_B()) => 1 
}
}
// This is not matched: (CC_A Int Wildcard Wildcard (T_A T_B Int))
package Program_15 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A(a: T_B) extends T_A[Char]
case class CC_B(a: Byte) extends T_B
case class CC_C() extends T_B
case class CC_D(a: T_A[CC_C], b: (CC_A,(CC_B,CC_A)), c: CC_A) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_B(0) => 0 
  case CC_B(_) => 1 
  case CC_C() => 2 
  case CC_D(_, _, CC_A(_)) => 3 
}
}
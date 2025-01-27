package Program_30 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A() extends T_A
case class CC_B(a: T_B[Int], b: T_B[T_A], c: CC_A) extends T_A
case class CC_C(a: T_B[CC_B], b: T_A) extends T_A
case class CC_D(a: CC_B, b: CC_A) extends T_B[(CC_B,Char)]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_C(_, _) => 1 
}
}
// This is not matched: CC_B(_, _, CC_A())
package Program_31 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A() extends T_A
case class CC_B(a: T_B[CC_A], b: Int) extends T_B[T_A]

val v_a: T_B[T_A] = null
val v_b: Int = v_a match{
  case CC_B(_, 12) => 0 
}
}
// This is not matched: (CC_A Byte Wildcard (T_A Byte))
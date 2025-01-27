package Program_12 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A() extends T_A
case class CC_B(a: T_B[((Boolean,Byte),CC_A)], b: Boolean) extends T_A
case class CC_C(a: Char, b: T_B[T_B[CC_A]], c: T_B[CC_A]) extends T_A
case class CC_D(a: CC_B, b: (CC_B,T_A)) extends T_B[Boolean]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_, true) => 1 
  case CC_B(_, false) => 2 
}
}
// This is not matched: CC_C(_, _, _)
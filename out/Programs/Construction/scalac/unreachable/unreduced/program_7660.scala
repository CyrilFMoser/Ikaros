package Program_8 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: Byte, b: Char) extends T_A
case class CC_B() extends T_A
case class CC_C(a: T_B[T_B[CC_A, T_A], CC_A], b: (CC_B,Boolean)) extends T_A
case class CC_D(a: T_B[((Byte,Byte),CC_A), CC_A], b: CC_B, c: Char) extends T_B[Byte, CC_B]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_C(_, (CC_B(),_)) => 1 
}
}
// This is not matched: CC_B()
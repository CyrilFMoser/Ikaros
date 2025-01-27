package Program_20 

object Test {
sealed trait T_A
sealed trait T_B
case class CC_A(a: Byte, b: T_B, c: T_B) extends T_A
case class CC_B(a: CC_A, b: (T_A,T_B), c: CC_A) extends T_A
case class CC_C() extends T_A
case class CC_D(a: CC_C, b: CC_B) extends T_B

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B(CC_A(_, CC_D(_, _), CC_D(_, _)), (CC_B(_, _, _),CC_D(_, _)), CC_A(_, _, _)) => 1 
  case CC_B(CC_A(_, CC_D(_, _), CC_D(_, _)), (CC_C(),CC_D(_, _)), CC_A(_, _, _)) => 2 
  case CC_C() => 3 
}
}
// This is not matched: CC_B(CC_A(_, CC_D(_, _), CC_D(_, _)), (CC_A(_, _, _),CC_D(_, _)), CC_A(_, _, _))
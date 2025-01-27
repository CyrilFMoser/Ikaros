package Program_31 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A() extends T_A
case class CC_B(a: T_A) extends T_A
case class CC_C(a: ((Char,Boolean),CC_B), b: T_B[CC_A]) extends T_A
case class CC_D() extends T_B[T_B[CC_B]]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_) => 1 
  case CC_C((_,CC_B(CC_C(_, _))), _) => 2 
}
}
// This is not matched: Pattern match is empty without constants
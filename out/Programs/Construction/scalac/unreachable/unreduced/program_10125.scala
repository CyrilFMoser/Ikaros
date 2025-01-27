package Program_6 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A() extends T_A
case class CC_B(a: T_B[T_B[T_A]], b: T_B[Char], c: T_B[T_B[(Byte,Byte)]]) extends T_A
case class CC_C() extends T_B[T_B[T_B[CC_A]]]
case class CC_D[B](a: T_A, b: CC_C, c: B) extends T_B[T_B[T_B[CC_A]]]
case class CC_E(a: T_A) extends T_B[T_B[T_B[CC_A]]]

val v_a: T_B[T_B[T_B[CC_A]]] = null
val v_b: Int = v_a match{
  case CC_D(CC_A(), CC_C(), _) => 0 
  case CC_D(CC_B(_, _, _), CC_C(), _) => 1 
  case CC_E(CC_A()) => 2 
  case CC_E(CC_B(_, _, _)) => 3 
}
}
// This is not matched: CC_C()
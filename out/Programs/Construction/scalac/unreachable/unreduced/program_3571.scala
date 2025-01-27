package Program_31 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A(a: Byte, b: Int) extends T_A
case class CC_B(a: T_B[Byte]) extends T_A
case class CC_C(a: T_B[CC_B], b: CC_A) extends T_B[T_A]
case class CC_D(a: CC_C, b: (T_B[CC_A],Char)) extends T_B[T_A]
case class CC_E(a: CC_D) extends T_B[T_A]

val v_a: T_B[T_A] = null
val v_b: Int = v_a match{
  case CC_C(_, CC_A(_, 12)) => 0 
  case CC_C(_, CC_A(_, _)) => 1 
  case CC_D(_, _) => 2 
  case CC_E(CC_D(_, (_,_))) => 3 
}
}
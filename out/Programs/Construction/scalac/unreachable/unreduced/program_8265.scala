package Program_7 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A(a: T_A, b: Byte) extends T_A
case class CC_B(a: T_B[CC_A], b: T_A) extends T_A
case class CC_C(a: T_B[Byte], b: CC_A) extends T_A
case class CC_D(a: Char) extends T_B[T_B[CC_A]]
case class CC_E(a: T_B[(CC_B,(Int,Int))], b: CC_C, c: CC_D) extends T_B[(T_A,CC_B)]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(CC_A(_, _), _) => 0 
  case CC_A(CC_B(_, CC_A(_, _)), _) => 1 
  case CC_A(CC_B(_, CC_B(_, _)), _) => 2 
  case CC_A(CC_B(_, CC_C(_, _)), _) => 3 
  case CC_B(_, _) => 4 
  case CC_C(_, CC_A(CC_A(_, _), _)) => 5 
  case CC_C(_, CC_A(CC_B(_, _), _)) => 6 
  case CC_C(_, CC_A(CC_C(_, _), _)) => 7 
}
}
// This is not matched: CC_A(CC_C(_, CC_A(_, _)), _)
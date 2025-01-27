package Program_4 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A() extends T_A
case class CC_B[C](a: T_B[C, C], b: T_B[Byte, C], c: C) extends T_B[Byte, C]
case class CC_C[D](a: T_B[Byte, D], b: D) extends T_B[Byte, D]

val v_a: T_B[Byte, T_A] = null
val v_b: Int = v_a match{
  case CC_B(_, CC_B(_, CC_B(_, _, _), _), _) => 0 
  case CC_B(_, CC_B(_, CC_C(_, _), _), _) => 1 
  case CC_B(_, CC_C(_, CC_A()), _) => 2 
  case CC_C(CC_B(_, _, _), _) => 3 
  case CC_C(CC_C(_, CC_A()), _) => 4 
}
}
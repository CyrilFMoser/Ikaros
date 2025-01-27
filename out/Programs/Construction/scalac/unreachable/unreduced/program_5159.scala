package Program_15 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_A, b: T_B[((Byte,Int),T_A), Byte], c: T_A) extends T_A
case class CC_B(a: Char) extends T_A
case class CC_C[C]() extends T_B[C, CC_A]
case class CC_D[D](a: T_B[D, CC_A], b: T_A, c: T_B[D, CC_A]) extends T_B[D, CC_A]

val v_a: T_B[CC_B, CC_A] = null
val v_b: Int = v_a match{
  case CC_C() => 0 
  case CC_D(_, CC_A(CC_A(_, _, _), _, CC_A(_, _, _)), _) => 1 
  case CC_D(_, CC_A(CC_A(_, _, _), _, CC_B(_)), _) => 2 
  case CC_D(_, CC_A(CC_B(_), _, CC_A(_, _, _)), _) => 3 
  case CC_D(_, CC_A(CC_B(_), _, CC_B(_)), _) => 4 
  case CC_D(_, CC_B(_), _) => 5 
}
}
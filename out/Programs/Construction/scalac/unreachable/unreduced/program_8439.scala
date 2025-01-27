package Program_30 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_B[Boolean, (T_A,Byte)], b: T_A) extends T_A
case class CC_B(a: Byte, b: CC_A, c: Boolean) extends T_A
case class CC_C[C](a: T_A) extends T_B[Int, C]
case class CC_D[D]() extends T_B[D, CC_A]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(_, CC_A(_, _)) => 0 
  case CC_A(_, CC_B(_, _, _)) => 1 
  case CC_B(_, _, _) => 2 
}
}
package Program_8 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_B[Byte, T_A], b: Byte) extends T_A
case class CC_B[D, C](a: T_B[D, D], b: T_A) extends T_B[C, D]

val v_a: T_B[Int, T_A] = null
val v_b: Int = v_a match{
  case CC_B(CC_B(_, _), _) => 0 
}
}
package Program_29 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_B[T_B[T_A, Byte], T_A], b: Boolean) extends T_A
case class CC_B[C](a: T_B[C, C]) extends T_B[(Byte,T_B[Int, Int]), C]
case class CC_C[D](a: CC_A) extends T_B[(Byte,T_B[Int, Int]), D]

val v_a: T_B[(Byte,T_B[Int, Int]), Byte] = null
val v_b: Int = v_a match{
  case CC_B(_) => 0 
  case CC_C(_) => 1 
}
}
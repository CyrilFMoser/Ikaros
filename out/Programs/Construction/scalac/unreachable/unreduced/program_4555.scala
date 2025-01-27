package Program_4 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: Byte) extends T_A
case class CC_B[C](a: T_B[C, C], b: C) extends T_B[T_B[CC_A, T_A], C]
case class CC_C[D]() extends T_B[T_B[CC_A, T_A], D]

val v_a: T_B[T_B[CC_A, T_A], Byte] = null
val v_b: Int = v_a match{
  case CC_B(_, 0) => 0 
  case CC_B(_, _) => 1 
  case CC_C() => 2 
}
}
package Program_30 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_B[(Byte,T_A), Char], b: Boolean) extends T_A
case class CC_B(a: T_B[CC_A, T_A], b: T_B[T_A, T_B[T_A, T_A]], c: (T_B[T_A, T_A],T_A)) extends T_B[CC_A, T_A]

val v_a: T_B[CC_A, T_A] = null
val v_b: Int = v_a match{
  case CC_B(_, _, _) => 0 
}
}
package Program_16 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_B[T_A, T_B[T_A, Char]], b: T_B[Boolean, Byte]) extends T_A
case class CC_B(a: T_B[CC_A, (Byte,T_A)], b: T_B[T_A, T_B[Boolean, Byte]]) extends T_A
case class CC_C(a: Int) extends T_A
case class CC_D[C](a: (T_A,T_A), b: (Byte,Byte)) extends T_B[C, Boolean]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B(_, _) => 1 
  case CC_C(_) => 2 
}
}
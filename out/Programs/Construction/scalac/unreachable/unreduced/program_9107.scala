package Program_17 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: Int, b: T_A, c: T_B[T_A, T_B[T_A, T_A]]) extends T_A
case class CC_B() extends T_A
case class CC_C(a: Int, b: T_B[CC_A, (CC_A,Byte)], c: CC_B) extends T_A
case class CC_D[C](a: T_B[C, Byte]) extends T_B[C, Byte]
case class CC_E[D](a: (Int,T_B[T_A, T_A])) extends T_B[D, Byte]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B() => 1 
  case CC_C(_, _, _) => 2 
}
}
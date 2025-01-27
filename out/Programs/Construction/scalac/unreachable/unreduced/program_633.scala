package Program_25 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A() extends T_A
case class CC_B(a: T_B[T_B[T_A, CC_A], (CC_A,(Byte,Byte))], b: T_B[CC_A, T_B[T_A, CC_A]]) extends T_A
case class CC_C(a: CC_A, b: Boolean, c: (T_A,Boolean)) extends T_A
case class CC_D(a: (T_A,CC_C), b: Byte) extends T_B[Int, T_B[T_B[CC_C, CC_A], (CC_C,Char)]]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_, _) => 1 
  case CC_C(_, _, _) => 2 
}
}
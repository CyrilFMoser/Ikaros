package Program_21 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_B[(T_A,(Boolean,Byte)), T_A], b: T_A, c: T_B[T_A, T_B[Char, T_A]]) extends T_A
case class CC_B[C]() extends T_A
case class CC_C(a: T_A, b: T_A) extends T_B[Byte, CC_B[T_B[Byte, T_A]]]

val v_a: T_B[Byte, CC_B[T_B[Byte, T_A]]] = null
val v_b: Int = v_a match{
  case CC_C(CC_A(_, _, _), _) => 0 
  case CC_C(CC_B(), _) => 1 
}
}
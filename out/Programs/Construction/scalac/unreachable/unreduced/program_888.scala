package Program_19 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_A, b: T_A) extends T_A
case class CC_B(a: Byte) extends T_A
case class CC_C(a: (CC_B,CC_A), b: T_B[T_B[Int, (Byte,Byte)], T_B[CC_B, CC_B]]) extends T_A
case class CC_D[C](a: CC_A, b: (T_B[CC_A, CC_C],T_A), c: T_B[CC_B, C]) extends T_B[CC_B, C]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(CC_A(_, _), _) => 0 
  case CC_A(CC_B(_), _) => 1 
  case CC_A(CC_C(_, _), _) => 2 
  case CC_B(0) => 3 
  case CC_B(_) => 4 
  case CC_C(_, _) => 5 
}
}
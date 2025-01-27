package Program_27 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A(a: T_B, b: (Boolean,T_A[T_B, T_B])) extends T_A[T_B, Byte]
case class CC_B(a: Char, b: Int) extends T_B
case class CC_C(a: CC_A, b: (CC_A,T_A[CC_A, CC_B])) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_B(_, _) => 0 
  case CC_C(CC_A(_, _), (CC_A(_, _),_)) => 1 
}
}
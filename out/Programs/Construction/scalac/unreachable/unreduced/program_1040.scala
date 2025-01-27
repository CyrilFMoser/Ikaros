package Program_31 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_A, b: T_B[T_B[Byte, Byte], T_A]) extends T_A
case class CC_B(a: CC_A, b: Boolean) extends T_A
case class CC_C(a: Byte) extends T_A
case class CC_D[C](a: (T_B[CC_B, CC_B],CC_C), b: CC_B) extends T_B[T_B[T_A, CC_C], C]
case class CC_E[D](a: CC_C, b: D, c: D) extends T_B[T_B[T_A, CC_C], D]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(CC_A(_, _), _) => 0 
  case CC_A(CC_B(_, _), _) => 1 
  case CC_A(CC_C(_), _) => 2 
  case CC_B(CC_A(_, _), _) => 3 
  case CC_C(_) => 4 
}
}
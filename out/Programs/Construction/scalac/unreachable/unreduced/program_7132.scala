package Program_25 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: T_A[T_A[C, C], C], b: T_B) extends T_A[T_A[C, C], C]
case class CC_B[D](a: T_B, b: T_A[D, D], c: D) extends T_A[T_A[D, D], D]
case class CC_C(a: CC_B[Int], b: CC_B[CC_B[T_B]]) extends T_B
case class CC_D(a: T_B) extends T_B
case class CC_E(a: T_B, b: T_A[T_A[(CC_C,(Byte,Char)), (CC_C,(Byte,Char))], (CC_C,(Byte,Char))], c: CC_D) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_C(CC_B(CC_C(_, _), _, _), _) => 0 
  case CC_C(CC_B(CC_D(_), _, _), _) => 1 
  case CC_C(CC_B(CC_E(_, _, _), _, _), _) => 2 
  case CC_D(CC_C(_, CC_B(_, _, _))) => 3 
  case CC_D(CC_D(_)) => 4 
  case CC_D(CC_E(_, _, _)) => 5 
  case CC_E(_, _, _) => 6 
}
}
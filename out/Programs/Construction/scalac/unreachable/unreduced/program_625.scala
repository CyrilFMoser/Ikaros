package Program_2 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: T_A[T_B, C], b: T_A[C, C], c: T_A[T_B, C]) extends T_A[T_B, C]
case class CC_B(a: T_B) extends T_B
case class CC_C(a: T_A[CC_A[Boolean], T_A[T_B, CC_B]], b: T_A[T_B, T_A[T_B, Byte]], c: T_A[T_B, (T_B,(Byte,Char))]) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_B(CC_B(_)) => 0 
  case CC_B(CC_C(_, _, _)) => 1 
  case CC_C(_, CC_A(_, _, _), CC_A(_, _, _)) => 2 
}
}
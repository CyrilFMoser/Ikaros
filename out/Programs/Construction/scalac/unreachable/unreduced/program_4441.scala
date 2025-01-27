package Program_28 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A(a: T_B) extends T_A[T_A[T_A[T_B, T_B], T_A[T_B, Int]], T_A[Byte, T_B]]
case class CC_B(a: T_A[T_A[T_B, Boolean], (CC_A,(Byte,Byte))], b: Boolean, c: T_A[Char, ((Byte,Char),(Byte,Int))]) extends T_B
case class CC_C(a: CC_A) extends T_B

val v_a: T_A[T_A[T_A[T_B, T_B], T_A[T_B, Int]], T_A[Byte, T_B]] = null
val v_b: Int = v_a match{
  case CC_A(CC_B(_, _, _)) => 0 
  case CC_A(CC_C(_)) => 1 
}
}
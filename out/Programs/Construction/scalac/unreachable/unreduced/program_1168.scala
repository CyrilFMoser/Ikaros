package Program_30 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, C]) extends T_A[T_A[T_A[Boolean, Int], (Byte,Char)], C]
case class CC_B[D](a: D) extends T_A[T_A[T_A[Boolean, Int], (Byte,Char)], D]
case class CC_C(a: (CC_A[Byte],Boolean)) extends T_A[T_A[T_A[Boolean, Int], (Byte,Char)], CC_B[T_A[Byte, Boolean]]]

val v_a: T_A[T_A[T_A[Boolean, Int], (Byte,Char)], Boolean] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(true) => 1 
  case CC_B(false) => 2 
}
}
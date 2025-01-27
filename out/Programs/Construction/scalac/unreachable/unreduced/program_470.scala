package Program_27 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A(a: T_A[T_B[(Int,Char)]], b: T_A[Byte]) extends T_A[T_A[T_B[Boolean]]]
case class CC_B(a: Boolean, b: Char) extends T_A[T_A[T_B[Boolean]]]
case class CC_C(a: CC_B) extends T_A[T_A[T_B[Boolean]]]

val v_a: T_A[T_A[T_B[Boolean]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B(_, _) => 1 
  case CC_C(_) => 2 
}
}
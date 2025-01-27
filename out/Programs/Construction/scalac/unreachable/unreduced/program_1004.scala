package Program_12 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A(a: T_A[T_B], b: T_A[(Byte,T_B)], c: T_B) extends T_A[Boolean]
case class CC_B(a: T_A[T_A[Boolean]], b: (T_B,T_A[Char]), c: T_A[Boolean]) extends T_A[T_A[Boolean]]
case class CC_C(a: T_A[T_A[CC_A]]) extends T_B
case class CC_D() extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_C(_) => 0 
  case CC_D() => 1 
}
}
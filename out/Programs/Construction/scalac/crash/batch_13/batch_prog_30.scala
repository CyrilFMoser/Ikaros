package Program_30 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A(a: T_B[T_B[(Byte,Byte)]]) extends T_A[T_B[Boolean], T_A[T_B[Int], Byte]]
case class CC_B(a: Boolean, b: CC_A) extends T_A[T_B[Boolean], T_A[T_B[Int], Byte]]
case class CC_C(a: CC_A, b: (T_A[CC_B, (Byte,Boolean)],T_A[CC_B, Byte])) extends T_B[T_B[T_B[CC_B]]]

val v_a: CC_A = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
}
}
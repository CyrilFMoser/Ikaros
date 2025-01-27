package Program_22 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D](a: T_A[D, T_A[D, D]], b: T_A[D, T_A[D, D]], c: D) extends T_A[D, T_A[D, D]]
case class CC_B(a: Boolean, b: T_A[T_A[Int, Boolean], (Boolean,Byte)]) extends T_B[T_A[Boolean, T_A[Boolean, Boolean]]]
case class CC_C(a: Boolean, b: T_A[T_B[CC_B], T_A[T_B[CC_B], T_B[CC_B]]]) extends T_B[CC_B]
case class CC_D() extends T_B[T_A[Boolean, T_A[Boolean, Boolean]]]

val v_a: T_B[T_A[Boolean, T_A[Boolean, Boolean]]] = null
val v_b: Int = v_a match{
  case CC_B(_, _) => 0 
  case CC_D() => 1 
}
}
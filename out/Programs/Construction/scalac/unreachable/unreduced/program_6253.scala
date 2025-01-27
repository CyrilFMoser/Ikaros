package Program_6 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A(a: T_B[T_B[Char, Char], (Int,Byte)]) extends T_A[T_B[T_B[Boolean, Boolean], T_A[Boolean]]]
case class CC_B() extends T_A[T_B[T_B[Boolean, Boolean], T_A[Boolean]]]
case class CC_C[D](a: T_B[T_A[CC_B], D], b: Boolean) extends T_B[T_A[CC_B], D]

val v_a: T_A[T_B[T_B[Boolean, Boolean], T_A[Boolean]]] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B() => 1 
}
}
package Program_31 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D](a: T_B[D, D], b: D) extends T_A[D]
case class CC_B() extends T_A[T_A[Byte]]
case class CC_C[E](a: T_B[E, Boolean]) extends T_B[E, Boolean]

val v_a: T_A[T_A[Byte]] = null
val v_b: Int = v_a match{
  case CC_A(_, CC_A(_, _)) => 0 
  case CC_B() => 1 
}
}
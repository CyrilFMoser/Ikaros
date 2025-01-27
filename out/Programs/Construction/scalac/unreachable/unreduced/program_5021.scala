package Program_25 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[(Int,(Boolean,Boolean)), C]) extends T_A[T_A[T_A[Byte, Boolean], T_A[Boolean, Byte]], C]
case class CC_B[D]() extends T_A[T_A[T_A[Byte, Boolean], T_A[Boolean, Byte]], D]

val v_a: T_A[T_A[T_A[Byte, Boolean], T_A[Boolean, Byte]], Boolean] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B() => 1 
}
}
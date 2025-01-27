package Program_26 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A(a: T_A[(Int,Boolean)], b: T_A[T_B[Byte]], c: T_B[T_A[Byte]]) extends T_A[T_A[T_A[Byte]]]
case class CC_B() extends T_A[T_A[T_A[Byte]]]
case class CC_C(a: CC_A) extends T_A[T_A[T_A[Byte]]]
case class CC_D[C](a: T_A[T_B[C]], b: CC_A) extends T_B[C]
case class CC_E[D](a: D) extends T_B[D]

val v_a: T_B[Boolean] = null
val v_b: Int = v_a match{
  case CC_D(_, CC_A(_, _, _)) => 0 
  case CC_E(true) => 1 
  case CC_E(false) => 2 
}
}
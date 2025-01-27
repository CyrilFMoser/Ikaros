package Program_31 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A(a: Byte, b: T_B[T_A[Boolean]], c: T_B[T_B[Boolean]]) extends T_A[Boolean]
case class CC_B(a: T_A[T_B[Char]]) extends T_A[Boolean]
case class CC_C[C](a: T_A[Boolean], b: T_B[C]) extends T_B[C]
case class CC_D(a: T_A[Boolean], b: T_A[T_B[CC_B]], c: Int) extends T_B[Boolean]
case class CC_E(a: T_A[Boolean], b: ((CC_B,(Int,Boolean)),T_B[Boolean]), c: T_B[CC_B]) extends T_B[Boolean]

val v_a: T_A[Boolean] = null
val v_b: Int = v_a match{
  case CC_A(_, CC_C(_, CC_C(_, _)), CC_C(_, CC_C(_, _))) => 0 
  case CC_B(_) => 1 
}
}
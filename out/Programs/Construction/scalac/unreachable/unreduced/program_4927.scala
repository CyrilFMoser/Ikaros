package Program_26 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A[C](a: T_B[C], b: Char) extends T_A[C]
case class CC_B[D](a: D, b: D, c: D) extends T_A[D]
case class CC_C(a: Char, b: T_A[CC_A[Byte]], c: CC_B[Int]) extends T_B[T_A[T_A[Int]]]
case class CC_D(a: CC_A[T_A[CC_C]]) extends T_B[Byte]
case class CC_E(a: Boolean, b: T_B[Byte], c: T_B[Byte]) extends T_B[Byte]

val v_a: T_B[Byte] = null
val v_b: Int = v_a match{
  case CC_D(CC_A(_, 'x')) => 0 
  case CC_E(_, _, CC_D(CC_A(_, _))) => 1 
  case CC_E(_, _, CC_E(_, CC_D(_), CC_D(_))) => 2 
  case CC_E(_, _, CC_E(_, CC_D(_), CC_E(_, _, _))) => 3 
  case CC_E(_, _, CC_E(_, CC_E(_, _, _), CC_D(_))) => 4 
  case CC_E(_, _, CC_E(_, CC_E(_, _, _), CC_E(_, _, _))) => 5 
}
}
// This is not matched: CC_D(CC_A(_, _))
package Program_4 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A(a: T_B[T_B[Int]]) extends T_A[T_A[T_B[Byte]]]
case class CC_B(a: T_B[CC_A], b: T_B[Boolean]) extends T_A[T_A[T_B[Byte]]]
case class CC_C(a: Boolean) extends T_A[T_A[T_B[Byte]]]
case class CC_D(a: T_A[T_B[CC_C]], b: CC_C, c: CC_B) extends T_B[T_B[CC_A]]
case class CC_E(a: T_A[T_A[Boolean]], b: CC_A) extends T_B[T_B[CC_A]]
case class CC_F(a: T_B[T_B[CC_A]], b: Byte, c: T_B[T_B[CC_A]]) extends T_B[T_B[CC_A]]

val v_a: T_B[T_B[CC_A]] = null
val v_b: Int = v_a match{
  case CC_E(_, _) => 0 
  case CC_F(_, _, _) => 1 
}
}
// This is not matched: CC_D(_, CC_C(_), CC_B(_, _))
package Program_18 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A(a: T_B[T_B[Boolean]], b: T_A[Int]) extends T_A[T_A[T_B[(Boolean,Boolean)]]]
case class CC_B(a: T_A[CC_A], b: CC_A, c: Byte) extends T_A[T_A[T_B[(Boolean,Boolean)]]]
case class CC_C[C](a: CC_B) extends T_A[C]
case class CC_D() extends T_B[T_A[T_B[Int]]]
case class CC_E(a: CC_A) extends T_B[T_A[T_B[Int]]]

val v_a: T_A[T_A[T_B[(Boolean,Boolean)]]] = null
val v_b: Int = v_a match{
  case CC_A(_, CC_C(_)) => 0 
  case CC_B(_, _, _) => 1 
  case CC_C(_) => 2 
}
}
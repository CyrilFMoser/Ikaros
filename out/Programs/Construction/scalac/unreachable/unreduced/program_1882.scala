package Program_10 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A(a: Boolean) extends T_A[T_B[T_A[Int], Boolean]]
case class CC_B(a: T_B[T_A[CC_A], CC_A], b: Int) extends T_A[CC_A]
case class CC_C[E, D]() extends T_B[E, D]
case class CC_D(a: Int, b: T_A[T_A[CC_A]]) extends T_B[(CC_A,T_A[CC_A]), CC_A]
case class CC_E(a: Boolean, b: T_A[CC_A], c: CC_A) extends T_B[(CC_A,T_A[CC_A]), CC_A]

val v_a: T_B[(CC_A,T_A[CC_A]), CC_A] = null
val v_b: Int = v_a match{
  case CC_D(_, _) => 0 
  case CC_E(_, CC_B(CC_C(), 12), CC_A(_)) => 1 
  case CC_E(_, CC_B(CC_C(), _), CC_A(_)) => 2 
}
}
// This is not matched: CC_C()
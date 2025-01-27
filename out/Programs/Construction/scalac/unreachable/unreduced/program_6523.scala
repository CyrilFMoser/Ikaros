package Program_26 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A() extends T_A[Int]
case class CC_B(a: T_B[CC_A], b: T_A[Int]) extends T_A[Int]
case class CC_C(a: CC_A, b: T_A[T_A[(Char,Boolean)]]) extends T_A[Int]

val v_a: T_A[Int] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_, CC_A()) => 1 
  case CC_B(_, CC_B(_, _)) => 2 
  case CC_C(CC_A(), _) => 3 
}
}
// This is not matched: CC_B(_, CC_C(CC_A(), _))
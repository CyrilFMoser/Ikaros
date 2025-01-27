package Program_29 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A(a: T_A[T_B]) extends T_A[T_A[T_A[T_B]]]
case class CC_B(a: CC_A, b: T_A[Int]) extends T_A[Int]
case class CC_C() extends T_A[Int]
case class CC_D(a: (Boolean,T_A[Char]), b: CC_A) extends T_B
case class CC_E() extends T_B

val v_a: T_A[Int] = null
val v_b: Int = v_a match{
  case CC_B(_, CC_B(CC_A(_), _)) => 0 
  case CC_B(_, CC_C()) => 1 
  case CC_C() => 2 
}
}
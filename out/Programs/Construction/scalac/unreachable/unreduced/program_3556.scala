package Program_13 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A() extends T_A[T_B[T_B[Int]]]
case class CC_B(a: T_A[T_B[CC_A]]) extends T_B[CC_A]
case class CC_C() extends T_B[CC_A]
case class CC_D[C](a: T_B[CC_A], b: CC_C, c: C) extends T_B[C]

val v_a: T_B[CC_A] = null
val v_b: Int = v_a match{
  case CC_B(_) => 0 
  case CC_C() => 1 
  case CC_D(CC_B(_), CC_C(), CC_A()) => 2 
  case CC_D(CC_C(), CC_C(), CC_A()) => 3 
  case CC_D(CC_D(_, _, _), CC_C(), CC_A()) => 4 
}
}
package Program_30 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A() extends T_A[Int]
case class CC_B(a: T_B[T_A[Int], T_B[CC_A, Char]], b: CC_A) extends T_A[Int]
case class CC_C() extends T_A[Int]
case class CC_D[D](a: D, b: CC_C, c: D) extends T_B[T_B[D, (CC_A,CC_C)], D]

val v_a: T_A[Int] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_, CC_A()) => 1 
}
}
// This is not matched: CC_C()
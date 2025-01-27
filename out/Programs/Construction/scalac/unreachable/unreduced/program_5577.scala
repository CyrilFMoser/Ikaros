package Program_0 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A() extends T_A[Int]
case class CC_B(a: T_A[Int], b: (Int,T_A[CC_A]), c: Boolean) extends T_A[Int]
case class CC_C() extends T_B[T_A[Int]]
case class CC_D() extends T_B[T_A[Int]]
case class CC_E(a: T_A[T_B[(Int,Boolean)]]) extends T_B[T_A[Int]]

val v_a: T_A[Int] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(CC_B(_, (_,_), true), _, _) => 1 
  case CC_B(CC_B(_, (_,_), false), _, _) => 2 
}
}
// This is not matched: CC_B(CC_A(), _, _)
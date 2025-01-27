package Program_9 

object Test {
sealed trait T_A[A, B]
case class CC_A[C]() extends T_A[T_A[C, C], C]
case class CC_B[D]() extends T_A[D, T_A[Boolean, T_A[Boolean, Int]]]
case class CC_C(a: Boolean, b: T_A[CC_B[Boolean], Boolean]) extends T_A[T_A[(CC_A[Char],Int), (CC_A[Char],Int)], (CC_A[Char],Int)]

val v_a: T_A[T_A[(CC_A[Char],Int), (CC_A[Char],Int)], (CC_A[Char],Int)] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_C(_, _) => 1 
}
}
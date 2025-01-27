package Program_14 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: Int) extends T_A
case class CC_B[C]() extends T_B[T_B[CC_A, T_A], C]
case class CC_C() extends T_B[T_B[CC_A, T_A], T_B[T_A, Int]]
case class CC_D[D](a: D) extends T_B[T_B[CC_A, T_A], D]

val v_a: T_B[T_B[CC_A, T_A], T_B[T_A, Int]] = null
val v_b: Int = v_a match{
  case CC_C() => 0 
  case CC_D(_) => 1 
}
}
// This is not matched: CC_B()
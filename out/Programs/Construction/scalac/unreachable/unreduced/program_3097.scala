package Program_22 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A[C]() extends T_A
case class CC_B(a: T_B[CC_A[T_A], Int], b: Boolean, c: T_A) extends T_A
case class CC_C[D]() extends T_B[D, CC_A[T_A]]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_, _, _) => 1 
}
}
package Program_22 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: Boolean) extends T_A
case class CC_B(a: T_B[T_A, T_A], b: CC_A, c: Int) extends T_A
case class CC_C[C](a: C, b: T_A, c: CC_A) extends T_B[C, (T_B[T_A, CC_B],CC_A)]
case class CC_D[D](a: (CC_C[(Int,Boolean)],Int), b: T_B[D, D]) extends T_B[D, (T_B[T_A, CC_B],CC_A)]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(true) => 0 
  case CC_A(false) => 1 
  case CC_B(_, _, _) => 2 
}
}
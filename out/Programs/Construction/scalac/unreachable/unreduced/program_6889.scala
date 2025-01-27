package Program_0 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A() extends T_A
case class CC_B(a: T_A, b: T_B[T_A, T_A], c: T_B[T_B[T_A, CC_A], T_A]) extends T_A
case class CC_C[C](a: T_B[Int, CC_A], b: (T_A,(Int,CC_A)), c: CC_B) extends T_B[Int, CC_A]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(CC_A(), _, _) => 1 
  case CC_B(CC_B(CC_A(), _, _), _, _) => 2 
  case CC_B(CC_B(CC_B(_, _, _), _, _), _, _) => 3 
}
}
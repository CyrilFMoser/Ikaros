package Program_24 

object Test {
sealed trait T_A[A]
case class CC_A[B]() extends T_A[B]
case class CC_B[C](a: T_A[C], b: T_A[C], c: T_A[T_A[Boolean]]) extends T_A[C]

val v_a: T_A[Boolean] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(CC_A(), CC_A(), _) => 1 
  case CC_B(CC_A(), CC_B(_, _, _), _) => 2 
  case CC_B(CC_B(_, _, _), CC_A(), _) => 3 
  case CC_B(CC_B(_, _, _), CC_B(_, _, _), _) => 4 
}
}
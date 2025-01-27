package Program_11 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A() extends T_A[T_B]
case class CC_B(a: T_A[T_B], b: T_A[T_B], c: T_A[Byte]) extends T_A[T_B]
case class CC_C(a: CC_B, b: T_A[Int], c: CC_B) extends T_A[T_B]

val v_a: T_A[T_B] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(CC_A(), _, _) => 1 
  case CC_B(CC_B(CC_A(), _, _), _, _) => 2 
  case CC_B(CC_B(CC_B(_, _, _), _, _), _, _) => 3 
  case CC_B(CC_C(CC_B(_, _, _), _, CC_B(_, _, _)), _, _) => 4 
  case CC_C(CC_B(_, _, _), _, CC_B(CC_A(), _, _)) => 5 
  case CC_C(CC_B(_, _, _), _, CC_B(CC_B(_, _, _), _, _)) => 6 
  case CC_C(CC_B(_, _, _), _, CC_B(CC_C(_, _, _), _, _)) => 7 
}
}
// This is not matched: CC_B(CC_B(CC_C(_, _, _), _, _), _, _)
package Program_22 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A[C]() extends T_A[Byte]
case class CC_B(a: T_A[Byte], b: T_A[(Int,Int)], c: T_B[T_A[Byte]]) extends T_A[Byte]
case class CC_C(a: CC_B, b: CC_B) extends T_A[Byte]

val v_a: T_A[Byte] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_, _, _) => 1 
  case CC_C(CC_B(_, _, _), CC_B(CC_B(_, _, _), _, _)) => 2 
  case CC_C(CC_B(_, _, _), CC_B(CC_C(_, _), _, _)) => 3 
}
}
// This is not matched: CC_C(CC_B(_, _, _), CC_B(CC_A(), _, _))
package Program_31 

object Test {
sealed trait T_A[A, B]
case class CC_A[C]() extends T_A[C, Byte]
case class CC_B[D](a: T_A[D, Byte], b: T_A[D, D]) extends T_A[D, Byte]

val v_a: T_A[Int, Byte] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(CC_A(), _) => 1 
}
}
// This is not matched: Pattern match is empty without constants
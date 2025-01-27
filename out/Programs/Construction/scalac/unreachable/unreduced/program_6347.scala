package Program_18 

object Test {
sealed trait T_A[A, B]
case class CC_A[C]() extends T_A[C, Byte]
case class CC_B[D](a: T_A[D, D]) extends T_A[D, Byte]

val v_a: T_A[Int, Byte] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_) => 1 
}
}
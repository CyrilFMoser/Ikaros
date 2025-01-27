package Program_7 

object Test {
sealed trait T_A[A, B]
case class CC_A() extends T_A[Boolean, Byte]
case class CC_B[C](a: T_A[C, T_A[C, C]], b: CC_A, c: CC_A) extends T_A[Boolean, Byte]

val v_a: T_A[Boolean, Byte] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_, _, _) => 1 
}
}
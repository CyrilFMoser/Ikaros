package Program_12 

object Test {
sealed trait T_A[A]
case class CC_A[B](a: T_A[B], b: B, c: T_A[T_A[T_A[(Byte,Boolean)]]]) extends T_A[B]

val v_a: T_A[Byte] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
}
}
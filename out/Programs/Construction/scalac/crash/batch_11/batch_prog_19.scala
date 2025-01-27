package Program_19 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: T_B, b: T_A[T_B, C], c: C) extends T_A[T_B, C]

val v_a: T_A[T_B, Byte] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
}
}
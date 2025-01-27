package Program_16 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: C) extends T_A[T_A[T_A[Char, Byte], Char], C]

val v_a: T_A[T_A[T_A[Char, Byte], Char], Byte] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
}
}
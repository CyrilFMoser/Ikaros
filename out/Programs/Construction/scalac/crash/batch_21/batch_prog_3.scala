package Program_3 

object Test {
sealed trait T_A[A, B]
case class CC_A[C]() extends T_A[T_A[T_A[Int, Byte], T_A[Int, Char]], C]

val v_a: T_A[T_A[T_A[Int, Byte], T_A[Int, Char]], Char] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
}
}
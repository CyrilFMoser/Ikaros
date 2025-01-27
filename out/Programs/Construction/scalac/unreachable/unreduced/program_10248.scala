package Program_31 

object Test {
sealed trait T_A[A, B]
case class CC_A[C]() extends T_A[T_A[Int, (Boolean,(Byte,Byte))], C]
case class CC_B[D](a: CC_A[D], b: T_A[D, D], c: CC_A[D]) extends T_A[T_A[Int, (Boolean,(Byte,Byte))], D]

val v_a: T_A[T_A[Int, (Boolean,(Byte,Byte))], Char] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_, _, _) => 1 
}
}
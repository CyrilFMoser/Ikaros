package Program_6 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, C], b: T_A[C, C], c: T_A[C, C]) extends T_A[C, (Byte,T_A[Boolean, Char])]
case class CC_B[D](a: CC_A[D], b: D) extends T_A[D, (Byte,T_A[Boolean, Char])]
case class CC_C[E, F]() extends T_A[E, (Byte,T_A[Boolean, Char])]

val v_a: T_A[Int, (Byte,T_A[Boolean, Char])] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B(CC_A(_, _, _), _) => 1 
  case CC_C() => 2 
}
}
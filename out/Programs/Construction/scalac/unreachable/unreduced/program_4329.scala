package Program_16 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: C, b: T_A[C, C], c: C) extends T_A[Byte, C]
case class CC_B() extends T_A[Byte, CC_A[T_A[Int, Char]]]

val v_a: T_A[Byte, CC_A[T_A[Int, Char]]] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(_, _, _), _, CC_A(_, _, _)) => 0 
  case CC_B() => 1 
}
}
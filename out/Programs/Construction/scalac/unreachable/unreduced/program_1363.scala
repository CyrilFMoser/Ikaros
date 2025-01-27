package Program_8 

object Test {
sealed trait T_A[A, B]
case class CC_A() extends T_A[T_A[Char, Char], Byte]
case class CC_B(a: T_A[CC_A, T_A[CC_A, CC_A]], b: T_A[(CC_A,Boolean), Byte]) extends T_A[T_A[Char, Char], Byte]

val v_a: T_A[T_A[Char, Char], Byte] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_, _) => 1 
}
}
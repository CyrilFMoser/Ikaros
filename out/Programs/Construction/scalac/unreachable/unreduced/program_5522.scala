package Program_6 

object Test {
sealed trait T_A[A, B]
case class CC_A(a: T_A[T_A[Byte, Int], T_A[Boolean, Int]]) extends T_A[(Char,Char), Byte]
case class CC_B(a: CC_A, b: T_A[(CC_A,CC_A), CC_A]) extends T_A[(Char,Char), Byte]
case class CC_C() extends T_A[(Char,Char), Byte]

val v_a: T_A[(Char,Char), Byte] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(_, _) => 1 
  case CC_C() => 2 
}
}
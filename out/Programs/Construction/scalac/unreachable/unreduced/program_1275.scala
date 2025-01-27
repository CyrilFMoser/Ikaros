package Program_16 

object Test {
sealed trait T_A[A, B]
case class CC_A(a: (T_A[Int, Boolean],Char), b: T_A[T_A[Char, Char], T_A[Char, Char]]) extends T_A[(Byte,T_A[Boolean, (Byte,Boolean)]), T_A[T_A[Byte, Char], T_A[Byte, Int]]]
case class CC_B() extends T_A[(Byte,T_A[Boolean, (Byte,Boolean)]), T_A[T_A[Byte, Char], T_A[Byte, Int]]]

val v_a: T_A[(Byte,T_A[Boolean, (Byte,Boolean)]), T_A[T_A[Byte, Char], T_A[Byte, Int]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B() => 1 
}
}
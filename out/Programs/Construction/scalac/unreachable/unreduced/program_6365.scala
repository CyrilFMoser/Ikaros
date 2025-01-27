package Program_5 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A() extends T_A[((Boolean,Int),T_B[Boolean, Int]), T_B[T_B[Char, Int], T_A[Byte, Char]]]
case class CC_B(a: T_A[CC_A, (CC_A,CC_A)], b: T_B[Int, T_B[CC_A, (Char,Byte)]]) extends T_A[((Boolean,Int),T_B[Boolean, Int]), T_B[T_B[Char, Int], T_A[Byte, Char]]]

val v_a: T_A[((Boolean,Int),T_B[Boolean, Int]), T_B[T_B[Char, Int], T_A[Byte, Char]]] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_, _) => 1 
}
}
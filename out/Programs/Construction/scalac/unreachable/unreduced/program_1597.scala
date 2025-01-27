package Program_6 

object Test {
sealed trait T_A[A, B]
case class CC_A[C]() extends T_A[C, T_A[(Byte,Byte), T_A[Boolean, Char]]]
case class CC_B[D](a: D, b: T_A[D, D]) extends T_A[D, T_A[(Byte,Byte), T_A[Boolean, Char]]]
case class CC_C() extends T_A[Char, Char]

val v_a: T_A[CC_C, T_A[(Byte,Byte), T_A[Boolean, Char]]] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_, _) => 1 
}
}
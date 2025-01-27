package Program_21 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D]() extends T_A[D]
case class CC_B(a: Int, b: T_B[T_B[Char, (Byte,Byte)], T_A[Byte]], c: T_A[T_A[Char]]) extends T_B[Byte, T_B[(Byte,Int), T_B[Boolean, Byte]]]
case class CC_C(a: Char) extends T_B[Byte, T_B[(Byte,Int), T_B[Boolean, Byte]]]
case class CC_D() extends T_B[Byte, T_B[(Byte,Int), T_B[Boolean, Byte]]]

val v_a: T_B[Byte, T_B[(Byte,Int), T_B[Boolean, Byte]]] = null
val v_b: Int = v_a match{
  case CC_B(_, _, _) => 0 
  case CC_C(_) => 1 
  case CC_D() => 2 
}
}
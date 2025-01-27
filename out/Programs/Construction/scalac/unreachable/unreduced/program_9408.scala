package Program_7 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A(a: T_B[T_B[Boolean, Byte], T_B[(Int,Char), Boolean]]) extends T_A[T_A[T_B[(Byte,Byte), Boolean]]]
case class CC_B(a: Int) extends T_A[T_A[T_B[(Byte,Byte), Boolean]]]
case class CC_C(a: CC_B, b: Char) extends T_A[T_A[T_B[(Byte,Byte), Boolean]]]
case class CC_D[D](a: T_B[(Char,CC_A), D]) extends T_B[(Char,CC_A), D]
case class CC_E[E](a: E, b: E, c: CC_C) extends T_B[(Char,CC_A), E]

val v_a: T_A[T_A[T_B[(Byte,Byte), Boolean]]] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(_) => 1 
  case CC_C(_, _) => 2 
}
}
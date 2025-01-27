package Program_18 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D](a: Byte, b: T_A[D]) extends T_A[T_B[T_B[(Char,Int), Char], T_A[Byte]]]
case class CC_B(a: T_B[CC_A[Boolean], Boolean], b: CC_A[T_B[Boolean, Boolean]], c: T_A[T_B[Byte, Boolean]]) extends T_A[T_B[T_B[(Char,Int), Char], T_A[Byte]]]
case class CC_C(a: CC_B, b: (CC_B,(CC_B,(Char,Byte)))) extends T_A[T_B[T_B[(Char,Int), Char], T_A[Byte]]]

val v_a: T_A[T_B[T_B[(Char,Int), Char], T_A[Byte]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B(_, _, _) => 1 
  case CC_C(_, _) => 2 
}
}
package Program_18 

object Test {
sealed trait T_A[A, B]
case class CC_A(a: T_A[T_A[Boolean, (Byte,Byte)], Char], b: (T_A[(Char,Char), Char],Int), c: T_A[T_A[Int, Char], Boolean]) extends T_A[Char, T_A[T_A[Byte, Char], T_A[Byte, Int]]]
case class CC_B() extends T_A[Char, T_A[T_A[Byte, Char], T_A[Byte, Int]]]

val v_a: T_A[Char, T_A[T_A[Byte, Char], T_A[Byte, Int]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B() => 1 
}
}
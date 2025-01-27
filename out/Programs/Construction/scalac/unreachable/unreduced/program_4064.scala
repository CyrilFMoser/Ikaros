package Program_7 

object Test {
sealed trait T_A[A, B]
case class CC_A() extends T_A[T_A[Boolean, T_A[Char, Char]], T_A[T_A[Boolean, Byte], T_A[Int, Int]]]
case class CC_B(a: T_A[CC_A, (Char,CC_A)], b: T_A[CC_A, Byte]) extends T_A[T_A[Boolean, T_A[Char, Char]], T_A[T_A[Boolean, Byte], T_A[Int, Int]]]

val v_a: T_A[T_A[Boolean, T_A[Char, Char]], T_A[T_A[Boolean, Byte], T_A[Int, Int]]] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_, _) => 1 
}
}
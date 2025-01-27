package Program_29 

object Test {
sealed trait T_A[A, B]
case class CC_A() extends T_A[T_A[T_A[Char, Byte], Byte], T_A[T_A[Char, Char], T_A[Boolean, Byte]]]
case class CC_B(a: (T_A[CC_A, CC_A],CC_A)) extends T_A[T_A[T_A[Char, Byte], Byte], T_A[T_A[Char, Char], T_A[Boolean, Byte]]]

val v_a: T_A[T_A[T_A[Char, Byte], Byte], T_A[T_A[Char, Char], T_A[Boolean, Byte]]] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B((_,CC_A())) => 1 
}
}